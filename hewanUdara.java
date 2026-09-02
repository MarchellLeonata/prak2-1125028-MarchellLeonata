public abstract class hewanUdara extends Hewan {
    private int wingSpan;

    public hewanUdara(String nama, int age, String food, int wingSpan) {
        super(nama, age, food);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }  

    @Override
    public String printData() {
        return super.printData() + "\nWing Span: " + wingSpan;
    }

}
