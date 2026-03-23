package P1;

public class B extends A{
    private static String BPrivate = "B private";
    protected static String BProtected = "B protected";
    static String BPrivatePackage = "B private package"; //modyfikator domyślny (nie ma odpowiednika w kodzie)
    public static String BPublic = "B public";

    public static void metodaB() {
        System.out.println(BPrivate);
        System.out.println(BProtected);
        System.out.println(BPrivatePackage);
        System.out.println(BPublic);
    }

}
