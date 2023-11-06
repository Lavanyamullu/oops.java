class Dog
  {
    String name="pinky";
    int age=2;
    String color="white";
    void sleep()
    {
      System.out.println(name);
      System.out.println(age);
      System.out.println(color);
    }
    void bark()
    {
      System.out.println("The dog bark bow bow");
    }
  }
public class Main
{
  public static void main(String[] args){
    Dog d=new Dog();
    d.sleep();
    d.bark();
  }
}