public class Tikus extends HewanDarat{
    public Tikus(String nama, int age, String food, int jumlahKaki){
        super(nama, age, food, jumlahKaki);
    }

    @Override
    public void sound(){
        System.out.println("Cit Cit");
    }
}