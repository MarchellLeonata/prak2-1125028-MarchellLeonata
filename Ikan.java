public class Ikan extends HewanLaut {
    public Ikan(String nama, int age, String food, int depth) {
        super(nama, age, food, depth);
    }

    @Override
    public void sound() {
        System.out.println("Blub Blub");
    }
    
}
