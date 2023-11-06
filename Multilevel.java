class Barrow{
  void display (){
    System.out.println ("I am had account in sbi");
  }}
class Union extends Barrow{
  void sleep (){
    System.out.println ("i had account in union");
  }}
class Icici extends Union{
  void stand () {
    System.out.println ("i had no account in icici");}}
class Axis extends Icici{
  void read () {
    System.out.println ("i had no account in axis");
  }}
public class Multilevel{
  public static void main (String[]args) {
    Axis a = new Axis ();
      a.read ();
      a.sleep ();
      a.display ();
      a.stand ();
  }}
