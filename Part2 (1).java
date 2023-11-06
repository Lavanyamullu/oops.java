import java.util.*;
class Employee2 implements Comparable<Employee2>{
    int id;
    String name;
    int salary;
    Employee2(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
   public String toString() {
    return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
    @Override
    public int compareTo(Employee2 o) {
        return o.salary-this.salary;
      //return this.salary-o.salary;
    }
}
public class Part2
{
	public static void main(String[] args) {
		PriorityQueue<Employee2> a=new PriorityQueue<Employee2>();
		Employee2 e=new Employee2(12,"lavanya",10000);
		Employee2 e1=new Employee2(40,"ram",20000);
		Employee2 e2=new Employee2(67,"padma",30000);
		a.add(e);
		a.add(e1);
		a.add(e2);
		for(Employee2 s:a){
		System.out.println(s);
		}
		}
}