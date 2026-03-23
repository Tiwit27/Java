public class Osoba {
    private String Imie;
    private String Nazwisko;

    public Osoba(String imie, String nazwisko) {
        Imie = imie;
        Nazwisko = nazwisko;
    }

    public void PrzedstawSie()
    {
        System.out.println(Imie + " " + Nazwisko);
    }
}
