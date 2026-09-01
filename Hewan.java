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

    public abstract void sound();

    public void printData(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + age); 
        System.out.println("Makanan: " + food);
    }

    public abstract class HewanDarat extends Hewan {
       private  int numberOfLegs;
        
        public HewanDarat(String nama, int age, String food, int numberOfLegs) {
            super(nama, age, food);
            this.numberOfLegs = numberOfLegs;
        }

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public void setNumberOfLegs(int numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
        }

        public void move(){
            System.out.println("Bergerak di darat dengan "+ numberOfLegs + "kaki");
        }
        
        @override
        public void printData(){
            super.printData();
            System.out.println("Jumlah Kaki: " + numberOfLegs);
        }


        public abstract class anjing extends HewanDarat{
            public anjing(String nama, int age, String food, int numberOfLegs){
                super(nama, age, food, numberOfLegs);
            }

            @override
            public void sound(){
                System.out.println("Guk guk");
            }

            public abstract class kucing extends HewanDarat{
                public kucing(String nama, int age, String food, int numberOfLegs){
                    super(nama, age, food, numberOfLegs);
                }

                @override
                public void sound(){
                    System.out.println("Meong meong");
                }
            }
        }   
    }
}

