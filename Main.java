public class Main {
    public static void main(String[] args){
        Hewan[] daftarHewan = new Hewan[]{
            new Anjing("Doggo", 5, "Daging", 4),
            new Kucing("Kitty", 3, "Ikan", 4),
            new Tikus("Mickey", 2, "Keju", 4), 

            new Ikan("Nemo", 1, "Plankton", 20),    
            new Hiu("Jaws", 7, "Ikan", 50), 
            new Paus("Willy", 10, "Plankton", 100), 

            new Burung("Tweety", 2, "Biji-bijian", 15),
            new Elang("Eagle", 4, "Daging", 25),
            new Bebek("Daffy", 3, "Ikan", 20)
        };

        for(Hewan hewan : daftarHewan){
            System.out.println("Jenis Hewan: " + hewan.getClass().getSimpleName());
           
            System.out.println(hewan.printData());
            System.out.print("Suara: " + hewan.sound());
            System.out.println("-------------------------");
        }
    }
}
