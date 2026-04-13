import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[][] tablica = new int[3][4];
        int[][] tablica1 = new int[3][];
        tablica1[0] = new int[3];
        tablica1[1] = new int[4];
        tablica1[2] = new int[5];
//        wypelnij(tablica);
//        wyswietl2(tablica);
//        tablicaTrojkatna(90);
        int[][][] tablica2 = new int[3][4][5];
        wypelnij(tablica2);
        wyswietl(tablica2);
    }

    public static void wyswietl(int[][] tab)
    {
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void wyswietl2(int[][] tab)
    {
        for (var t : tab) {
            for(var el : t)
            {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static void wyswietl(int[][][] tab)
    {
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++)
            {
                for(int z = 0; z < tab[i].length; z++)
                {
                    System.out.print(tab[i][j][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void wypelnij(int[][] tab)
    {
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++)
            {
                tab[i][j] = r.nextInt(25);
            }
        }
    }
    public static void wypelnij(int[][][] tab)
    {
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++)
            {
                for(int z = 0; z < tab[i].length; z++)
                {
                    tab[i][j][z] = r.nextInt(25);
                }
            }
        }
    }
    //napisz metodę która tworzy i wyświetla tablicę trójkątną o liczbie wierszy podanej przez użytkownika
    public static void tablicaTrojkatna(int n) {
        for (int j = 0; j <= n; j++)
        {
            for (int z = 0; z < n-j; z++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("1");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
