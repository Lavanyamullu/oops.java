import java.util.*;
class Employee12{
int id;
String name;
Employee12(int id,String name){
    this.id=id;
    this.name=name;
}
 public String toString(){
        return "Employee[id" + id+" ,name"+name+"]";
    }
}
class sortbyname implements Comparator<Employee12>{
    public int compare(Employee12 o1,Employee12 o2){
        return o2.name.compareTo(o1.name);
    }}
public class Part4
{
	public static void main(String[] args) {
		PriorityQueue<Employee12> a = new PriorityQueue<>(new sortbyname());
		Employee12 e=new Employee12(12,"lavanya");
		Employee12 e1=new Employee12(67,"ram");
		Employee12 e2=new Employee12(56,"padma");
		a.add(e);
		a.add(e1);
		a.add(e2);
		for(Employee12 l:a){
		System.out.println(l);
	}}
}