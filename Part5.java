import java.util.*;
class Employee21{
int id;
String name;
int salary;
Employee21(int id,String name,int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
}
 public String toString(){
        return "Employee[id" + id+" ,name"+name+" salary"+salary+"]";
    }
}
class sortbysalary implements Comparator<Employee21>{
    public int compare(Employee21 o1,Employee21 o2){
        return o2.salary-o1.salary;
    }}
public class Part5
{
	public static void main(String[] args) {
		PriorityQueue<Employee21> a = new PriorityQueue<>(new sortbysalary());
		Employee21 e=new Employee21(12,"lavanya",30000);
		Employee21 e1=new Employee21(67,"ram",40000);
		Employee21 e2=new Employee21(56,"padma",50000);
		a.add(e);
		a.add(e1);
		a.add(e2);
    System.out.println("Highest salary");
		for(Employee21 l:a){
		System.out.println(l);
	}
    int lowerBound = 20000;
        int upperBound = 30000;
        TreeSet<Employee21> a1 = new TreeSet<>(new sortbysalary());
        a1.add(e);
        a1.add(e1);
        a1.add(e2);

        System.out.println("Employees with salaries between " + lowerBound + " and " + upperBound + ":");
        for (Employee21 l : a1) {
            if (l.salary >= lowerBound && l.salary <= upperBound) {
                System.out.println(l);
            }
        }
  }
}