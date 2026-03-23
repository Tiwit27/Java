public abstract class Zwierze {
    public abstract void DajGlos();

    public abstract void Pokarm();

    public void KimJestem()
    {
        System.out.println("Jestem zwierzęciem typu " + this.getClass().getName());
    }

    public abstract void Pozytek();

    public void CzyUdomowione()
    {
        System.out.println("Jestem zwierzęciem udomowionym");
    }
}
