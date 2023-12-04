public class BuildFirProduct  {

    private static Product p = new Product();

    public static void unit1(Unit1 unit1) {
        p.u1 = unit1;
    }

    public static void unit2(Unit2 unit2) {
        p.u2 = unit2;
    }
    
    public static void unit3(Unit3 unit3) {
       p.u3 = unit3;
    }

    public static Product composite() {
     return p;
    }

}
