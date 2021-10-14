package HomeWork;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println ("Введите ваш номер телефона начиная с 0+код+номер: ");
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        int num3 = x.nextInt();
        int num4 = x.nextInt();
        int num5 = x.nextInt();
        int num6 = x.nextInt();
        int num7 = x.nextInt();
        int num8 = x.nextInt();
        int num9 = x.nextInt();
        int num10 = x.nextInt();
        System.out.print("Проверьте правильность написания номера :" + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10 );
    }
}
