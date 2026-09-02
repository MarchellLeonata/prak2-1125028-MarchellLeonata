public class Hiu extends HewanLaut {
    public Hiu(String nama, int age, String food, int depth) {
        super(nama, age, food, depth);
    }

    @Override
    public void sound() {
        System.out.println("Grrr Grrr");
    }
}
