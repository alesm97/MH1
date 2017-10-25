package multi13;

public class Student implements Runnable{

    String name;
    ClassRoom classRoom;

    public Student(String name, ClassRoom classRoom) {
        this.name = name;
        this.classRoom = classRoom;
    }


    @Override
    public void run() {
        classRoom.pickPc();
    }
}
