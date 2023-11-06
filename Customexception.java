import java.util.*;
class Invalidage extends Exception{
    String age;
    Invalidage(String age){
        super(age);
        this.age=age;
    }}
class Invalidpin extends Exception{
    String pin;
    Invalidpin(String pin){
        super(pin);
        this.pin=pin;
    }}
class Productnotavailable extends Exception{
    String product;
    Productnotavailable(String product){
        super(product);
        this.product=product;
    }}    
public class Customexception{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		String age=s.next();
		System.out.println("Enter pin");
		String pin=s.next();
		System.out.println("Enter product");
		String product=s.next();
		try{
		    if(age=="18"){
		        throw new Invalidage("Your age is eligible for voting");
		            }
      else{
        throw new Invalidage("Not Eligible for voting");
      }
    }
		    catch(Invalidage e){
		        System.out.println(e.getMessage());
		    }
		    try{
		        if(pin!="12345"){
		            throw new Invalidpin("you are enter incorrect pin");
		        }
          else{
            System.out.println("your pin is correct");
          }
        }
		    catch(Invalidpin e){
		        System.out.println(e.getMessage());
		    }
	    try{
	        if(product!="clothes"){
	            throw new Productnotavailable("your searching product is not there");
	        }
        else{
          System.out.println("please, seach for another product");
        }
      }
	        catch(Productnotavailable e){
	            System.out.println(e.getMessage());
	        }
	}}