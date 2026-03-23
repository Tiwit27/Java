import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> lista = new ArrayList<>();
//        LinkedList<Integer> lista2 = new LinkedList<>();
//        List<Integer> lista3 = new ArrayList<>();
//        List<Integer> lista4 = new LinkedList<>();
//        lista.add(2);
//        lista2.add(2);
//        lista3.add(2);
//        lista4.add(2);

//        Zwierze pies1 = new Pies();
//        Zwierze kot1 = new Kot();
//
//        pies1.DajGlos();
//        kot1.DajGlos();
//        ((Pies)pies1).Pozytek();
//        ((Kot)kot1).Pozytek();

        ArrayList<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Pies());
        zwierzeta.add(new Kot());
        zwierzeta.add(new Pies());
        zwierzeta.add(new Kot());

        for (var zwierze : zwierzeta)
        {
            zwierze.KimJestem();
            zwierze.DajGlos();
            zwierze.Pokarm();
            zwierze.Pozytek();
        }
    }
}