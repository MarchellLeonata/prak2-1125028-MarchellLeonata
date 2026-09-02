public abstract class HewanDarat extends Hewan{
    private int jumlahKaki;
    public HewanDarat(String nama, int age, String food, int jumlahKaki){
        super(nama, age, food);
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public void move(){
        System.out.println("Hewan darat bergerak dengan berjalan atau berlari.");
    }

    @Override
    public String printData(){
        return super.printData() + "\nJumlah Kaki: " + jumlahKaki;
    }
}