import java.util.*;

class Cricket {
    String name;
    int score;
    int age;

    Cricket(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "name='" + name +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}

public class More {
    public static void main(String[] args) {
        List<Cricket> cricketList = new ArrayList<>();
        cricketList.add(new Cricket("Player A", 120, 25));
        cricketList.add(new Cricket("Player B", 80, 30));
        cricketList.add(new Cricket("Player C", 150, 22));

        // Sort by score using a comparator
        Collections.sort(cricketList, Comparator.comparingInt(Cricket::getScore).reversed());

        System.out.println("Sorted by Score:");
        cricketList.forEach(System.out::println);

        System.out.println();

        // Sort by age using a comparator
        Collections.sort(cricketList, Comparator.comparingInt(Cricket::getAge));

        System.out.println("Sorted by Age:");
        cricketList.forEach(System.out::println);
    }
}
