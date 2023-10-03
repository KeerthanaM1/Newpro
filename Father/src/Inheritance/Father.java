package Inheritance;

public class Father extends Grandfather{
	public void business() {
		System.out.println("Banking");
	}
	public void vehicles() {
		System.out.println("car");
	}
	public void city() {
		System.out.println("Coimbatore");
	}
	public static void main(String[]args) {
		Father obj=new Father();
		obj.business();
		obj.vehicles();
		obj.city();
	}

}



