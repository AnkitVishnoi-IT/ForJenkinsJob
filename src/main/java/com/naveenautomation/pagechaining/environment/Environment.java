package com.naveenautomation.pagechaining.environment;

public enum Environment {

	DEV("https://naveenautomationlabsdev.com/opencart/index.php?route=common/home"),
	STAGE("https://naveenautomationlabsstage.com/opencart/index.php?route=common/home"),
	PROD("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	String envUrl;

	Environment(String envUrl) {
		this.envUrl = envUrl;
	}

	public String getEnvUrl() {
		return envUrl;
	}
	
	

}
