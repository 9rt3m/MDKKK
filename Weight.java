import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свое имя: ");
        String name = in.nextLine();
        System.out.println("Введите свой возраст: ");
        float age = in.nextInt();
        System.out.println("Введите свой вес(кг): ");
        float width = in.nextInt();
        System.out.println();
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);
        System.out.println("Ваш вес(кг): " + width);

    }
}