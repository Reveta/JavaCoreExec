package edication.Exec.alcgo.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1Ver2Gunkevich {

    public static List<Integer> answerList = new ArrayList<>();

    public static int writeConsole() {

        int a;
        a = new Scanner(System.in).nextInt();

        return a;

    }

    public static List<Integer> split(int a) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                answerList.add(i);
                split(a/i);
              break;
            }
        }        return integerList;
    }
    public  static void viewList(List<Integer> list){

        for (int i:list) {
            System.out.println(i);
        }

    }

}