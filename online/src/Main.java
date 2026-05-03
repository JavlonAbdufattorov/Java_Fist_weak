package online.src;

import java.time.temporal.Temporal;
import java.util.Scanner;

import Week_5_6_7.fist_task.exercize.Book;
import online.src.a.Just2;
import oop_exersize.lesson2.com.pdp.online.task.three.ClassRoom;
import oop_exersize.lesson2.com.pdp.online.task.three.Teacher;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Dog();
        // animal.name = "QQ";
        // Animal animal2 = animal;
        
        // animal2.name = "ww";
        // System.out.println(animal.name);
        // System.out.println(animal2.name);
        // animal2.sound();
        // animal.sound();
        Scanner scan = new Scanner(System.in);
        while (true) {
            int operating = scan.nextInt();
            switch (operating) {
                case 1:
                    Teacher teacher = new Teacher(scan.next(), scan.next(), scan.nextInt(),scan.nextInt(), scan.nextBoolean());
                    ClassRoom room = new ClassRoom(teacher, null, operating);
                    break;
            
                default:
                    break;
            }
        }
        
    }
}
