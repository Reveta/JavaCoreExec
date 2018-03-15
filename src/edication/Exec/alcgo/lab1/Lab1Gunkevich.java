package edication.Exec.alcgo.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1Gunkevich {

    static List<Integer> list = new ArrayList<>();
    static List<List<Integer>> lites = new ArrayList<>();

    public static int writeConsole() {
        int a;
        a = new Scanner(System.in).nextInt();

        return a;
    }

    public static List<Integer> split(int s) {
    List<Integer> lockalAnswer = new ArrayList<>();

        for (int i = 2; i < s; i++) {
            List<Integer> ins = new ArrayList<>();
            if (s % i == 0) {
                lockalAnswer.add(i);
                lockalAnswer.addAll(split(s/i));
                break;
            }
        }
        return lockalAnswer;
    }

    public static int minList(List<Integer> list) {
        int answer;
        if (list.get(0) != null) {
            answer = list.get(0);
            return answer;
        }
        return 0;
    }

    public static void view(int a) {
        System.out.println(a);
    }

    public static void viewList(List<Integer> list) {

        for (int num : list) {
            System.out.println(num);
        }
    }
}
