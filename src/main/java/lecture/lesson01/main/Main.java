package lecture.lesson01.main;

import lecture.lesson01.animals.Animal;
import lecture.lesson01.animals.Cat;
import lecture.lesson01.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = Dog.homeDoge("Tuzik",3);
        System.out.println(animal.getName());
        animal.voice();
        animal =new Cat("s",5);
        animal.voice();

        Animal b = new Animal("ssd",2) {
            @Override
            public void voice() {
                System.out.println("Asd");
            }
        };
        b.voice();

    }
}
