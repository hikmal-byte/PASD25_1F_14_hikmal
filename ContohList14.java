import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList14 {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("4");
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
    }
}