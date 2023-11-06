import java.util.*;
class Sudden{
    String name;
    String id;
    String age;
    String salary;
    Sudden(String name,String id,String age,String salary){
        name=name;
        id=id;
        age=age;
        salary=salary;
    }
}
public class World{
	public static void main(String[] args) {
	     Scanner r=new Scanner(System.in);
	    System.out.println("Enter Student name");
	    String name=r.nextLine();
	    System.out.println("Enter Student id");
	    String id=r.nextLine();
	    System.out.println("Enter Student age");
	    String age=r.nextLine();
	    System.out.println("Enter Student salary");
	    String salary=r.nextLine();
		List<String> s=new ArrayList<>();
		s.add(name);
		s.add(id);
		s.add(age);
		s.add(salary);
		System.out.println("First way using for loop");
		for(int i=0;i<s.size();i++){
		    System.out.println(s.get(i));}
		System.out.println("second way using for each loop");
		for(String i:s){
		    System.out.println(i);}
		System.out.println("using while loop");
		int i=0;
		while(i<s.size()){
		    System.out.println(s.get(i));
		    i++;}
		System.out.println("using do while loop");
		int a=0;
		do{
		  System.out.println(s.get(a));
		  a++;
		}while(a<s.size());
		System.out.println("using iterator interface");
		Iterator<String> b=s.iterator();//forward direction
		while(b.hasNext()){//boolean
		    System.out.println(b.next());
    }}}
