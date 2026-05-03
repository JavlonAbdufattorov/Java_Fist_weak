package oop_exersize.lesson2.com.pdp.online.task.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassRoom[] rooms = new ClassRoom[10];
        int roomCount = 0;

        System.out.println("=== ClassRoom Management ===");
        System.out.println("1 - Xona yaratish");
        System.out.println("2 - Barcha xonalarni ko'rish");
        System.out.println("0 - Chiqish");

        while (true) {
            System.out.print("\nAmalni tanlang: ");
            int op = scan.nextInt();

            switch (op) {
                case 1 -> {
                    // --- O'qituvchi ma'lumotlari ---
                    System.out.println("\n-- O'qituvchi ma'lumotlari --");
                    System.out.print("Ism: ");
                    String tName = scan.next();
                    System.out.print("Familiya: ");
                    String tSecond = scan.next();
                    System.out.print("Telefon: ");
                    int tPhone = scan.nextInt();
                    System.out.print("Yosh: ");
                    int tAge = scan.nextInt();
                    System.out.print("Erkakmi? (true/false): ");
                    boolean tMale = scan.nextBoolean();

                    Teacher teacher = new Teacher(tName, tSecond, tPhone, tAge, tMale);

                    // --- Xona raqami ---
                    System.out.print("\nXona raqami: ");
                    int roomNumber = scan.nextInt();

                    // --- Studentlar ---
                    System.out.print("Nechta student?: ");
                    int count = scan.nextInt();
                    Student[] students = new Student[count];

                    for (int i = 0; i < count; i++) {
                        System.out.println("\n-- Student " + (i + 1) + " --");
                        System.out.print("Ism: ");
                        String sName = scan.next();
                        System.out.print("Familiya: ");
                        String sSecond = scan.next();
                        System.out.print("Telefon: ");
                        int sPhone = scan.nextInt();
                        System.out.print("Yosh: ");
                        int sAge = scan.nextInt();
                        System.out.print("Erkakmi? (true/false): ");
                        boolean sMale = scan.nextBoolean();
                        System.out.print("Guruh raqami: ");
                        int group = scan.nextInt();

                        students[i] = new Student(sName, sSecond, sPhone, sAge, sMale, group);
                    }

                    rooms[roomCount++] = new ClassRoom(teacher, students, roomNumber);
                    System.out.println("\n✓ Xona #" + roomNumber + " muvaffaqiyatli yaratildi!");
                }

                case 2 -> {
                    if (roomCount == 0) {
                        System.out.println("Hozircha xonalar yo'q.");
                        break;
                    }
                    System.out.println("\n========== BARCHA XONALAR ==========");
                    for (int i = 0; i < roomCount; i++) {
                        ClassRoom r = rooms[i];
                        System.out.println("\nXona raqami : " + r.getRoomNumber());
                        System.out.println("O'qituvchi  : " + r.getTeacher().toString());
                        System.out.println("Studentlar soni: " + r.getStudentCount());
                        for (Student s : r.getStudent()) {
                            System.out.println("  -> " + s.toString()
                                + " | Guruh: " + s.getStudentGruop());
                        }
                        System.out.println("-------------------------------------");
                    }
                }

                case 0 -> {
                    System.out.println("Dastur tugatildi.");
                    return;
                }

                default -> System.out.println("Noto'g'ri amal. Qaytadan tering.");
            }
        }
    }
}