class Automobiles{
    void roadtax(){
        System.out.println("Every automobiles had different taxes");
    }}
class Car extends Automobiles{
    void roadtax(){
        System.out.println("Car had a 10% roadtax");
    }}
class Bike extends Automobiles{
    void roadtax(){
        System.out.println("Bike had a 5% roadtax");
    }}
    class Cycle extends Automobiles{
    void roadtax(){
        System.out.println("Car had a 0% roadtax");
    }}
public class Method{
	public static void main(String[] args) {
		System.out.println("Methodoverriding");
	    Car c=new Car();//preference to child class
		c.roadtax();
	}
}
