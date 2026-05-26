public class AppExamenU3 {
    public static void main(String[] args) {
        ExaU3 exaU3 = new ExaU3();
        exaU3.m1(100);
        System.out.println("M1:"+100);
        exaU3.m1(300);
        System.out.println("M1:"+300);
        exaU3.m1(500);
        System.out.println("M1:"+500);
        exaU3.m1(700);
        System.out.println("M1:"+700);
        exaU3.m1(900);
        System.out.println("M1:"+900);

        System.out.println("************************");

        System.out.println("M2:"+exaU3.m2());
        System.out.println("M2:"+exaU3.m2());
        System.out.println("M2:"+exaU3.m2());
        System.out.println("M2:"+exaU3.m2());
        System.out.println("M2:"+exaU3.m2());

        if(exaU3.m2()==-1){
            System.out.println("M2: No hay elementos");
        }

    }
}
