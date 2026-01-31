package weak2.code;

public class Answer {
    public static void main(String[] args) {
        //Задача 1
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Гипотенуза: " + c); // 5.0
        //задача 2 
        double num = 7.89;
        
        System.out.println("Исходное: " + num);
        System.out.println("Округление вверх: " + Math.ceil(num));
        System.out.println("Округление вниз: " + Math.floor(num));
        System.out.println("Ближайшее целое: " + Math.round(num));
        //Task 3

        double radius = 5.0;
        
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        
        System.out.printf("Площадь: %.2f\n", area);
        System.out.printf("Длина окружности: %.2f\n", circumference);
        // task 4
        double x1 = 1.0, y1 = 2.0;
        double x2 = 4.0, y2 = 6.0;
        
        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        
        System.out.printf("Расстояние: %.2f\n", distance);
        //task 6
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        
        System.out.println("Кость 1: " + dice1);
        System.out.println("Кость 2: " + dice2);
        System.out.println("Сумма: " + (dice1 + dice2));
    
    }

}
