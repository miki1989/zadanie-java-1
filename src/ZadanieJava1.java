public class ZadanieJava1 {
    public static void main(String[] args) {
        System.out.println("Uczę");
        System.out.println("się");
        System.out.println("programowania");
        System.out.println("i");
        System.out.println("commitowania");

        System.out.println();
        System.out.println("Próba obliczeń");
        int x = 8;
        int y = 10;
        int z;
        z = x*y;
        System.out.println(z);

        System.out.println();
        System.out.println("Kolejna próba");
        double a = 6.0;
        double b = 4.0;
        System.out.println(a/b);

        System.out.println();
        System.out.println("Próba pętli:");
        int i;
        for(i = 100; i > 0; i-= 20 )
        {
            System.out.print(i + " ");
        }
    }
}
