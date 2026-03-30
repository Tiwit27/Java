import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Zwierze> zwierzeta = new LinkedList<>();
        zwierzeta.add(new Pies());
        zwierzeta.add(new Kot());
        zwierzeta.add(new Wilk());
        zwierzeta.add(new Pies());
        zwierzeta.add(new Kot());
        zwierzeta.add(new Wilk());

        for (var zwierze : zwierzeta)
        {
            zwierze.KimJestem();
            zwierze.DajGlos();
            zwierze.Pokarm();
            zwierze.Pozytek();
            zwierze.CzyUdomowione();
            System.out.println("------------------");
        }
    }
}