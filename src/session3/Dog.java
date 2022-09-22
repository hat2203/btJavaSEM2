package session3;

public class Dog extends Animal{//Dog ke thua tu cha la Animal
    //id, name, run la super c cha <=> đối tượng ngầm định c lớp cha bên trong lớp con
    public int year;

    public Dog() {

    }

    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    public void eat(){
        super.run();
        System.out.println("Eat...");
    }

    public void run(){
        super.run();//hàm run bên Animal chạy
        System.out.println("Dog run...");
    }
}
