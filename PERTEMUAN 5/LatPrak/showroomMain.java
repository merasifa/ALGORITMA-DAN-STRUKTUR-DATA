public class showroomMain {
    public static void main(String[] args) {
            showroom[] list = {
                new showroom("BMW", "M2 Coupe", 2016, 6816, 728),
                new showroom("Ford", "Fiesta ST", 2014, 3921, 575),
                new showroom("Nissan", "370Z", 2009, 4360, 657),
                new showroom("Subaru", "BRZ", 2014, 4058, 609),
                new showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new showroom("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new showroom("Toyota", "86/GT86", 2014, 4180, 609),
                new showroom("Volkswagen", "Golf GTI", 2014, 4180, 631)
            };

        int topA = list[0].topA(list, 0, list.length -1);
        int minA = list[0].minA(list, 0, list.length -1);


        double rata = list[0].rata(list);
        System.out.println("TOP ACCELERATION TERTINGGI: "+topA);
        System.out.println("TOP ACCELERATION TERENDAH: "+minA);
        System.out.println("RATA RATA TOP POWER: "+rata);
    }
}
