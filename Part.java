import java.util.*;
class Employee1 implements Comparable<Employee1>{
    int id;
    String name;
    Employee1(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "Employee[id" + id+" ,name"+name+"]";
    }
    @Override
    public int compareTo(Employee1 O) {
        return this.id-O.id;
      //return O.id-this.id;
    }
}
public class Part
{
	public static void main(String[] args) {
		System.out.println("Array dequeue");
		PriorityQueue<Employee1> a = new PriorityQueue<Employee1>();
		Employee1 e=new Employee1(12,"lavanya");
		Employee1 e1=new Employee1(40,"ram");
		Employee1 e2=new Employee1(67,"padma");
		a.add(e);
		a.add(e1);
		a.add(e2);
		System.out.println(a);
		
	}
}
