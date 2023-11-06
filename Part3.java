import java.util.*;
class Student2{
    int id;
    int age;
    Student2(int id,int age){
        this.id=id;
        this.age=age;
    }
    public String toString(){
        return "student[id" + id+" ,name"+age+"]";
    }
}
class sortbyid implements Comparator<Student2>{
    public int compare(Student2 o1,Student2 o2){
        return o1.id-o2.id;
     // return o2.age-o1.age;
    }
}
class sortbyage implements Comparator<Student2>{
    public int compare(Student2 o1,Student2 o2){
        return o1.age-o2.age;
      //return o2.age-o1.age;
    }
}
public class Part3
{
	public static void main(String[] args) {
	    Student2 s=new Student2(1,40);
	    Student2 s1=new Student2(2,14);
	    Student2 s2=new Student2(3,45);
	    sortbyid i=new sortbyid();
	    TreeSet<Student2> t=new TreeSet<Student2>(i);
	    t.add(s);
	    t.add(s1);
	    t.add(s2);
	    for(Student2 r:t){
		System.out.println(r);
	    }
	    sortbyage a=new sortbyage();
	    TreeSet<Student2> t1=new TreeSet<Student2>(a);
	    t1.add(s);
	    t1.add(s1);
	    t1.add(s2);
	    for(Student2 b:t1){
		System.out.println(b);
	    }
	}
}