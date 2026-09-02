public class Burung extends hewanUdara{
    public Burung(String nama, int age, String food, int wingSpan){
        super(nama, age, food, wingSpan);
    }

    @Override
    public void sound(){
        System.out.println("Cuit Cuit");
    }
    
}
