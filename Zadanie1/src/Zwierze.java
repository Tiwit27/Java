public interface Zwierze {
    void DajGlos();

    void Pokarm();

    default void KimJestem()
    {
        System.out.println("Jestem zwierzęciem typu " + this.getClass().getName());
    }

    void Pozytek();

    default void CzyUdomowione()
    {
        System.out.println("Jestem zwierzęciem udomowionym");
    }
}
