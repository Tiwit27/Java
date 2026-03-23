package P2;

public class C extends P1.B{
    private static String CPrivate = "C private";
    protected static String CProtected = "C protected";
    static String CPrivatePackage = "C private package"; //modyfikator domyślny (nie ma odpowiednika w kodzie)
    public static String CPublic = "C public";

    public static void metodaC() {
        System.out.println(CPrivate);
        System.out.println(CProtected);
        System.out.println(CPrivatePackage);
        System.out.println(CPublic);
    }
}
