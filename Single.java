class Animal{
  void food(){
    System.out.println("Animals eat food");
  }
}
  class Rabbit extends Animal{
    void grass(){
      System.out.println("rabbit eat grass");
    }
  }
public class Single{
  public static void main(String[] args){
    Rabbit r=new Rabbit();
    r.grass();
    r.food();
  }
}