package cepapp.diagram.status;

public class CepAppStatus {
	private static String activeCepApp;
	private static String domainName;
	private static String generatedAppPath;
	
	public static String getActiveCepApp() {
		return activeCepApp;
	}

	public static void setActiveCepApp(String activeCepApp) {
		CepAppStatus.activeCepApp = activeCepApp;
	}

	public static String getDomainName() {
		return domainName;
	}

	public static void setDomainName(String domainName) {
		CepAppStatus.domainName = domainName;
	}

	public static String getGeneratedAppPath() {
		return generatedAppPath;
	}

	public static void setGeneratedAppPath(String generatedAppPath) {
		CepAppStatus.generatedAppPath = generatedAppPath;
	}
}
