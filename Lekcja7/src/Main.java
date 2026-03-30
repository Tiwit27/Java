import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Tablice jednowymiarowe
//        int[] tab = new int[5];
//        int[] tab2 = new int[]{1,2,3,4,5};
//        System.out.println(tab2.length);
//        try
//        {
//            tab2[7] = 5;
//        }
//        catch (ArrayIndexOutOfBoundsException exception)
//        {
//            System.out.println("Przekroczony zakres tablicy " + exception.getMessage());
//        }
//        wyswietl(tab2);

        int[] tab3 = new int[]{1,2,3,4};
        int[] tab4 = new int[]{1,2,3};
        int[] tab5 = tab4;
        System.out.println(tab4 == tab3);
        System.out.println(tab4.equals(tab3));

        System.out.println(Arrays.binarySearch(tab3, 5));

    }
    public static void wyswietl(int[] tab)
    {
        for(int i : tab)
        {
            System.out.print(i + " ");
        }
    }
}