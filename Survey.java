import java.util.*;
public class Survey {
    public static void main(String[] args) {
        System.out.println("State:Andhrapradesh");
        Map<String, Float> m= new HashMap<>();
        m.put("Population", 90702478.0f);
        m.put("MalePercentage", 50.17f);
        m.put("FemalePercentage", 49.83f);
        m.put("Religion_Hindu", 88.46f);
        m.put("Religion_Muslim", 9.56f);
        m.put("Religion_Christian", 1.34f);
        m.put("LiteracyRate", 67.02f);
        m.put("VotingPercentage", 49.95f);
        m.put("GovernmentLandArea", 3287469.0f);
        m.put("GovernmentLandPercentage", 4.96f);
        m.put("GDP", 1201736.0f);
        m.put("SexRatio", 993.0f);
        m.put("lokshabha seats",25.0f);
        m.put("Rajyashabha seats",11.0f);
        List<String> districts = new ArrayList<>();
        districts.add("Srikakulam");
        districts.add("Vizianagaram");
        districts.add("Manyam");
        districts.add("Alluri Seetaramaraju");
        districts.add("Visakhapatnam");
        districts.add("Anakapalli");
        districts.add("Kakinada");
        districts.add("Konaseema");
        districts.add("East Godavari");
        districts.add("West Godavari");
        districts.add("Eluru");
        districts.add("Machilipatnam");
        districts.add("NTR Krishna");
        districts.add("Guntur");
        districts.add("Bapatla");
        districts.add("Palnadu");
        districts.add("Prakasam");
        districts.add("Sri Pottisriramulu Nellore");
        districts.add("Kurnool");
        districts.add("Nandyal");
        districts.add("Ananthapuram");
        districts.add("Sri Satyasai");
        districts.add("YSR Kadapa");
        districts.add("Annamayya");
        districts.add("Chittoor");
        districts.add("Sri Balaji");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an attribute to retrieve (e.g., Population, Religion_Hindu, districts):");
        String a = sc.nextLine();
        switch (a) {
            case "Population":
            case "MalePercentage":
            case "FemalePercentage":
            case "Religion_Hindu":
            case "Religion_Muslim":
            case "Religion_Christian":
            case "LiteracyRate":
            case "VotingPercentage":
            case "GovernmentLandArea":
            case "GovernmentLandPercentage":
            case "GDP":
            case "SexRatio":
            case "lokshabha seats":
            case "Rajyashabha seats":
        if (m.containsKey(a)) {
                    System.out.println(a + ": " + m.get(a));
                } else {
                    System.out.println("Attribute not found.");
                }
                break;
           case "districts":
                System.out.println("Districts:");
                for (String d : districts) {
                    System.out.println(d);
                }
                break;
            default:
                System.out.println("Invalid attribute.");
        }
    }
}
