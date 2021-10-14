package HomeWork;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println ("Введите 10 музыкальных групп или исполнителей, которые вам нравятся: ");
        String phrase1 = x.nextLine();
        String phrase2 = x.nextLine();
        String phrase3 = x.nextLine();
        String phrase4 = x.nextLine();
        String phrase5 = x.nextLine();
        String phrase6 = x.nextLine();
        String phrase7 = x.nextLine();
        String phrase8 = x.nextLine();
        String phrase9 = x.nextLine();
        String phrase10 = x.nextLine();
        System.out.print("Ваш список готов :" + phrase1 + phrase2 + phrase3 + phrase4 + phrase5 + phrase6 + phrase7 + phrase8 + phrase9 + phrase10 );
    }
}