import java.util.*;
class Students {
    private int id;
    private String name;
public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
public int getId() {
        return id;
    }
public String getName() {
        return name;
    }
public String toString() {
        return this.name + " " + this.id + " ";
    }
}
class NameComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return s2.getName().compareTo(s1.getName());
    }
}
public class None{
    public static void main(String[] args) {
        TreeMap<Students, Integer> t = new TreeMap<>(new NameComparator());
        t.put(new Students(1, "Ali"), 30);
        t.put(new Students(2, "ram"), 25);
        t.put(new Students(3, "Cherry"), 28);
        t.put(new Students(4, "Don"), 32);
        for (Students s : t.keySet()) {
            System.out.println(s.getName() + " (ID: " + s.getId() + "): " + t.get(s));
        }
    }
}