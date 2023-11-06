import java.util.*;
class Employee10 extends Exception{
    String message;
    Employee10(String message){
        super(message);
        this.message=message;
    }
}
public class Custtom{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.nextLine();
        System.out.println("Enter id");
        String id=s.nextLine();
        System.out.println("Enter age");
        String age=s.nextLine();
        try{
            if(name=="lavanya" ||id=="1234" || age=="20");
            throw new Employee10("matching");
        }
        catch(Employee10 e){
            System.out.println(e.message);
        }
    }
}