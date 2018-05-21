package springmvcMaven;

public class HelloWorldSpringBean {
	private String hello;

	public String getHello() {

		return hello;

	}

	public void setHello(String hello) {

		this.hello = hello;

	}

	public void show() {

		System.out.println("--message--" + getHello());

	}
}
