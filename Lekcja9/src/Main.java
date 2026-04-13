import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(2);
        System.out.println(lista1);
        Iterator<Integer> it = lista1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        lista1.remove(1);
        lista1.remove((Object)1);
        System.out.println(lista1);




        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        System.out.println(lista2);
        ListIterator<Integer> it2 = lista2.listIterator(lista2.size());
        while(it2.hasPrevious())
        {
            System.out.println(it2.previous());
        }
        lista2.remove(1);
        lista2.remove((Object)1);
        System.out.println(lista2);
        lista2.trimToSize();


        List<Integer> lista3 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        List<Double> lista4 = new LinkedList<>(Arrays.asList(1.1,2.1,3.1,4.1,5.1,6.0));
        List<String> lista5 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));


        wyswietl(lista3);
        wyswietl(lista4);
        wyswietl(lista5);
    }

    public static <T> void wyswietl(List<T> list)
    {
        for(var el : list)
        {
            System.out.println(el);
        }
    }
}
