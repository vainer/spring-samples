package vainer.tutorial.springs.springs.quoter;

public class ProfilingController implements ProfilingControllerMBean {

	private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
