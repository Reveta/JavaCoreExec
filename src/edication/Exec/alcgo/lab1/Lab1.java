package edication.Exec.alcgo.lab1;

import javax.xml.crypto.Data;
import java.util.*;

public class Lab1 {

    public static void start() {
//        while (true){
//            itsTime();
//        }
//
               soutAnsw(sortListOfNum(start(scanNum())));
    }


    private static long scanNum() {
        System.out.println("Enter your number;");
        return new Scanner(System.in).nextLong();
    }

    private static List<Long> start(long number) {
        List<Long> answer = new ArrayList<>();

        for (long i = 2; i <= number; i++) {

            if (itsTime())
            {System.out.println("Process is working on: " + i/(number/100) + "% \n" + i + "/" + number);}
            if (number % i == 0) {
                System.out.println("Process level up! 100%");
                answer.add(i);
                answer.addAll(start(number / i));
                break;
            }
        }
        return answer;
    }

    private static boolean itsTime(){
        int timeA = new Date().getMinutes();
        String time = String.valueOf(timeA);
        int bool = Integer.valueOf(time.substring(1));

        return bool == 0 || bool == 5;
    }

    private static List<long[]> sortListOfNum(List<Long> list) {
        List<Long> answer = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();
        treeSet.addAll(list);
        answer.addAll(treeSet);

        List<long[]> newAns = new ArrayList<>();


        for (long anAnswer : answer) {
            long value = anAnswer;
            long[] array = {0, 0};
            array[0] = value;

            for (long aList : list) {
                if (value == aList) {
                    array[1] = array[1] + 1;
                }
            }
            newAns.add(array);
        }

        return newAns;
    }

    private static void soutAnsw(List<long[]> list) {
        System.out.println("Answer: \n");
        for (long[] num:list) {
            System.out.println(num[0] + "*" + num[1]);
        }
    }
}

