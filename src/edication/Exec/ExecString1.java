package edication.Exec;

import java.util.Scanner;

public class ExecString1 {

    public static void start() {
        System.out.println("Введіть своє повідомлення: ");
        String message = new Scanner(System.in).nextLine();

        System.out.println("Символи до крапки: " + beforeDot(message));
        System.out.println("У повідомленні " + checkSpace(message) + " пробіли.");


    }

    private static int checkSpace(String message) {
        int spaces = 0;
        int spaceIndex = 0;


        while (spaceIndex != -1) {
            int length = message.toCharArray().length;
            spaceIndex = message.indexOf(" ");
            if (spaceIndex != -1) {
                message = message.substring(spaceIndex + 1, length);
                spaces++;
            }
        }


        return spaces;
    }

    private static String beforeDot(String message) {
        int dot = message.indexOf(".");
        String beforDot = "Немає";
        if (dot != -1) {
            beforDot = message.substring(0, dot);
        }
        return beforDot;
    }
}

