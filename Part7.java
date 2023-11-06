import java.util.*;
class Student21{
int marks;
String name;
Student21(int marks,String name){
    this.marks=marks;
    this.name=name;
}
 public String toString(){
        return name + " has scored " + marks + " marks";
    }
}
public class Part7
{
	public static void main(String[] args) {
		Student21 e=new Student21(50,"manju");
		System.out.println(e);
	}
}
