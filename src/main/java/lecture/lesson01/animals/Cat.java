package lecture.lesson01.animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("mew-mew");
    }
}
