public class Pies extends Zwierze {
    public void DajGlos()
    {
        System.out.println("Hau Hau");
    }

    public void Pokarm()
    {
        System.out.println("Psia karma");
    }

    public void KimJestem()
    {
        super.KimJestem();
        System.out.println("Jestem Psem");
    }

    public void Pozytek()
    {
        System.out.println("Pilnuje domu");
    }
}
