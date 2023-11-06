import java.util.*;
class Movie1{
    int year;
    int cost;
    Movie1(int year,int cost){
        this.year=year;
        this.cost=cost;
    }
    public String toString(){
        return "movie[year" + year+" ,cost"+cost+"]";
    }
}
class sortbyyear implements Comparator<Movie1>{
    public int compare(Movie1 o1,Movie1 o2){
        return o1.year-o2.year;
    }
}
class sortbycost implements Comparator<Movie1>{
    public int compare(Movie1 o1,Movie1 o2){
        return o1.cost-o2.cost;
    }
}
public class Part8
{
	public static void main(String[] args) {
	    Movie1 m=new Movie1(2021,100);
	    Movie1 m1=new Movie1(2022,300);
	    Movie1 m2=new Movie1(2023,400);
	    sortbyyear i=new sortbyyear();
	    System.out.println("sort by year");
	    TreeSet<Movie1> t=new TreeSet<Movie1>(i);
	    t.add(m);
	    t.add(m1);
	    t.add(m2);
	    for(Movie1 r:t){
		System.out.println(r);
	    }
	    sortbycost a=new sortbycost();
	    System.out.println("Sort by cost");
	    TreeSet<Movie1> t1=new TreeSet<Movie1>(a);
	    t1.add(m);
	    t1.add(m1);
	    t1.add(m2);
	    for(Movie1 b:t1){
		System.out.println(b);
	    }
	}
}