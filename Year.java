import java.util.*;
class Movie{
String name;
int year;
int ratings;
 Movie(String name,int year,int ratings){
    this.name=name;
    this.year=year;
    this.ratings=ratings;
     
 }
public String toString(){
    return "Name: "+name+"Rating: "+ratings+"Year: "+year;
}}
class desyear implements Comparator<Movie>{//step 1
//@Override
public int compare(Movie m1, Movie m2) {
        return m2.year - m1.year; // Compare in descending order
    }}
public class Year{
	public static void main(String[] args) {
	    Movie m1=new Movie("RRR",5,2021);
		Movie m2=new Movie("Baby",3,2003);
		Movie m3=new Movie("KGF",4,2022);
		Movie m4=new Movie("Ram",5,2023);
		Movie m5=new Movie("Sita",3,2021);
		PriorityQueue<Movie> q=new PriorityQueue<>(new desyear());
		q.add(m1);
		q.add(m2);
		q.add(m3);
		q.add(m4);
		q.add(m5);
		System.out.println("Descending order");
		System.out.println(q);
		}}