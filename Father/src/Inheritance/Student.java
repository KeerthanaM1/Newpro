package Inheritance;

public class Student {
	public void StudentDetail(String Name) {
		System.out.println(Name);
	}
	public void StudentDetail(int age) {
		System.out.println(age);
}
	public void StudenDetail(float Salary){
		System.out.println(Salary);

	}
	public static void main(String[]args) {
	 Student obj=new Student();
	 obj.StudentDetail("Keerthi");
	 obj.StudentDetail(22);
	 obj.StudenDetail(20000.f);
	}

}
