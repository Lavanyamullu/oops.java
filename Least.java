import java.util.*;
class Employ{
    int id;
    String name;
Employ(int id, String name) {
        this.id = id;
        this.name = name;
    }
@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
public class Least {
    public static void main(String[] args) {
        Employ e = new Employ(1, "lavanya");
        Employ e1 = new Employ(2, "ram");
        List<Employ> l = new ArrayList<Employ>();
        l.add(e);
        l.add(e1);
        for (Employ p : l) {
            System.out.println(p);
        }
    }
}