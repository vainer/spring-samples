package vainer.tutorial.springs.springs.quoter;

import java.lang.reflect.Field;
import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

public class InjecrRandomIntBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		Field[] fields = bean.getClass().getDeclaredFields();
		for (Field field : fields) {
			InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
			if (annotation != null) {
				int min = annotation.min();
				int max = annotation.max();
				Random random = new Random();
				int nu = min + random.nextInt(max - min);
				field.setAccessible(true);
				ReflectionUtils.setField(field, bean, nu);
			}	
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		return bean;
	}

}
