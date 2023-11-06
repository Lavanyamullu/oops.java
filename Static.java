class Student{
    Student()
    {
        System.out.println("constructor block can be executed");
    }
    static{
        System.out.println("static block can be executed");
    }
}
public class Static
{
	public static void main(String[] args) {
		Student s=new Student();
			Student s1=new Student();
	}
}
