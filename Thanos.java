import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Thanos {

    public static Comparator<Hero> comparator = new Comparator<Hero>() {
        @Override
        public int compare(Hero orig, Hero compare) {
            return orig.getName().compareTo(compare.getName());
        }
    };

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        TreeMap<Hero,Flower> party = new TreeMap<>(comparator);
        party.put(hulk,rose);
        party.put(thor,rose);
        party.put(scarletWitch,rose);
        party.put(vision,tulip);
        party.put(captainAmerica,lily);
        party.put(doctorStrange,violet);
        party.put(blackWidow,violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        String strFlower="begonia";
        //String contain= party.containsValue(strFlower) ? "contain" : "not contain";
        //System.out.printf(strFlower+ " is %s contained in the party.\n",contain);
        System.out.println(party.containsValue(strFlower));
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        party.forEach((hero, flower ) -> System.out.println(/*hero.getName()+" "+*/flower.getName()+".") );
    }
}