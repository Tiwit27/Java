public class Pracownik extends Osoba {
    private String Stanowisko;
    private String Wykrztalcenie;

    public Pracownik(String imie, String nazwisko, String stanowisko, String wykrztalcenie) {
        super(imie, nazwisko);
        Stanowisko = stanowisko;
        Wykrztalcenie = wykrztalcenie;
    }

    public void PrzedstawSie()
    {
        super.PrzedstawSie();
        System.out.println(Stanowisko + " " + Wykrztalcenie);
    }
}
