package button.direktory6.first;


import java.util.Scanner;

public class FirstApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Ваше имя: " + name + "   Ваш возраст: " + age);
    }
}


