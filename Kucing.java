public class Kucing extends HewanDarat{
    public Kucing(String nama, int age, String food, int jumlahKaki){
        super(nama, age, food, jumlahKaki);
    }

    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
    
}
