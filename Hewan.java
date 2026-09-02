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
    public void setAge(int age){
        this.age = age;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public abstract String sound();

    public String printData(){
        return "Nama: " + nama + "\nUmur: " + age + "\nMakanan: " + food;
    }
}



