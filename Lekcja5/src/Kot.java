public class Kot extends Zwierze{
    public void DajGlos()
    {
        System.out.println("Miau Miau");
    }

    public void Pokarm()
    {
        System.out.println("Kocia karma");
    }

    public void KimJestem()
    {
        super.KimJestem();
        System.out.println("Jestem Kotem");
    }

    public void Pozytek()
    {
        System.out.println("Łowie myszy");
    }
}
