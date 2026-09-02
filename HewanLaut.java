public abstract class HewanLaut extends Hewan {
    private int depth;

    public HewanLaut(String nama, int age, String food, int depth) {
        super(nama, age, food);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String printData() {
        return super.printData() + "\nKedalaman: " + depth;
    }
}
