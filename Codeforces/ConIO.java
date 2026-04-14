package Codeforces;

import java.io.Console;

public class ConIO {
    public static void main(String[] args) {
    Console console = System.console();
    String name = console.readLine("Введите имя: ");
    System.out.println(name);
    }
}
