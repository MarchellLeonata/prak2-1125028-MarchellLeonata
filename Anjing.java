public class Anjing extends HewanDarat{
    public Anjing(String nama, int age, String food, int jumlahKaki){
        super(nama, age, food, jumlahKaki);
    }

    @Override
    public void sound(){
        System.out.println("Guk Guk");
    }
}