package edication.Exec.LetterGame6;

import java.util.Scanner;

public class Start {
    public static void start() {
        menu();
    }

    private static void menu(){
        boolean active;
        System.out.println("Введіть вибір \n" +
                "\n 1. Зіграти гру" +
                "\n 2. Завершити гру");
        int scanner = new Scanner(System.in).nextInt();
//        while (active)
        switch (scanner){
            case 1:
                active = true;
                System.out.println("Гра почалась");
                break;
            case 2:
                System.out.println("Кінець, гарного дня");
                active = false;
                break;
        }
    }

    private static void game(){

    }
}