package edication.Exec.Epam1;

import edication.Exec.Array3.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExes{

//    public static void soutArray(int[] array) {
//        String name = "=Hello world=";
//        System.out.println(name.replaceAll("=", ""));
//    }

    public static void soutArray(int[] array) {
        int first = 0;
        int second = 0;

        int indF = 0;
        int indS = 0;
        for (int i = 0; i < array.length; i++) {
            int thisis = array[i];
            if (thisis > first) {
                second = first;
                indS = indF;
                first = thisis;
                indF = i;
            }
        }
        System.out.println(first + " index = " + indF);
        System.out.println(second + " index = " + indS);
    }

//    public static void soutArray(int[] array)  {
//
//        List list = Arrays.asList(array);
//        ArrayList<int[]> arrayList = new ArrayList<>(list);
//
//        int first = 0;
//        int second = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) > first) {
//                second = first;
//                first = arrayList.get(i);
//            }
//            System.out.println(first + " " + arrayList.indexOf(first));
//            System.out.println(second + " " + arrayList.indexOf(second));
//
//        }
//    }
}
