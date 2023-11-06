import java.util.*;
class Student1 implements Comparable<Student1>{
    int id;
    String name;
    int salary;
    Student1(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
   public String toString() {
    return "student[id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
    @Override
    public int compareTo(Student1 o) {
        return this.name.compareTo(o.name);
    }
}
public class Part1
{
	public static void main(String[] args) {
		PriorityQueue<Student1> a=new PriorityQueue<Student1>();
		Student1 e=new Student1(12,"lavanya",10000);
		Student1 e1=new Student1(40,"ram",20000);
		Student1 e2=new Student1(67,"padma",30000);
		a.add(e);
		a.add(e1);
		a.add(e2);
		for(Student1 s:a){
		System.out.println(s);
		}
	}
}