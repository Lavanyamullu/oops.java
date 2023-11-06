import java.util.*;
class Shopping{
private String name;
private double price;
   Shopping(String name,double price){
    this.name=name;
    this.price=price;
  }
  public String getName(){
    return name;

  }
  public void setName(String name){
    this.name=name;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public double getPrice(){
    return price;
  }
  public String toString(){
    return name+"  "+price;
  }
}
class Shop{
  ArrayList<Shopping> a=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  public void add(Shopping s){
    a.add(s);
  }
  public void display(){
    for(Shopping p:a){
    System.out.println("Name:"+p.getName());
    System.out.println("price:"+p.getPrice());
    }

  }
  public void remove(){
    System.out.println("enter the item to remove");
    String name=sc.nextLine();
    a.remove(name);
  }

}
public class Shopmall{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Shop sp=new Shop();
    System.out.println("enter the name");
    String name=sc.nextLine();
    System.out.println("enter the price");
    double price=sc.nextDouble();
    Shopping s=new Shopping(name,price);
    sp.add(s);
    sp.display();
    sp.remove();
  } 
}