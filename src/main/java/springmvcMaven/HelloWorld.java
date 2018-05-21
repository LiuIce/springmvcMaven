package springmvcMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorld {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/helloWorld.xml");

		HelloWorldSpringBean helloWorldSpringBean = (HelloWorldSpringBean) ctx.getBean("myHelloWorld");

		helloWorldSpringBean.show();

	}
}
