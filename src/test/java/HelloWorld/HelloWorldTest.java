package HelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSysHello() {
		HelloWorld helloWorld = new HelloWorld();
		assertSame("Hello World.", helloWorld.sysHello("eng"));
	}

}
