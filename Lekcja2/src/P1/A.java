package P1;

public class A {
    private static String APrivate = "A private";
    protected static String AProtected = "A protected";
    static String APrivatePackage = "A private package"; //modyfikator domyślny (nie ma odpowiednika w kodzie)
    public static String APublic = "A public";

    public static void metodaA() {
        System.out.println(APrivate);
        System.out.println(AProtected);
        System.out.println(APrivatePackage);
        System.out.println(APublic);
    }
}
