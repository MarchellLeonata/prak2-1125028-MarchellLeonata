public class Bebek extends hewanUdara{
    public Bebek(String nama, int age, String food, int wingSpan){
        super(nama, age, food, wingSpan);
    }

    @Override
    public void sound(){
        System.out.println("Kwek Kwek");
    }
}
