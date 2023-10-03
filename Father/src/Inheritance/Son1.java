package Inheritance;

public class Son1 extends Father{
	public void education() {
		System.out.println("Mca");
	}
	public void vehicle() {
		System.out.println("Bike");
	}
	public void city() {
		System.out.println("Chennai");
	}
	public static void main(String[]args) {
		Son1 obj= new Son1();
		obj.education();
		obj.Property();
		obj.vehicle();
		obj.city();
		obj.business();
		obj.vehicles();
	}


}
