package practiceDataDrivenTesting;

import org.testng.annotations.Test;

public class ReadRunTimeMavenParameterTest {
	
	@Test
	public void runtimeParameterTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("Env Data==>URL==>"+URL);
		System.out.println("browser Data==>URL==>"+BROWSER);
		System.out.println("username Data==>URL==>"+USERNAME);
		System.out.println("password Data==>URL==>"+PASSWORD);
	}

}
