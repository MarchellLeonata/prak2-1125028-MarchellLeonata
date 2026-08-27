public abstract class Hewan{
    private String nama;
    private int age;
    private String food;

    public Hewan(String nama, int age, String food) {
        this.nama = nama;
        this.age = age;
        this.food = food;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getAge(){
        return age;
    }

}

