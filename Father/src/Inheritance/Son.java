package Inheritance;

public class Son extends Father {
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
		Son obj=new Son();
		obj.education();
		obj.Property();
		obj.vehicle();
		obj.city();
		obj.business();
		obj.vehicles();
	}

}
