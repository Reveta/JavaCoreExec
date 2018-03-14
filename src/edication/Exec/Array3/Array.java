package edication.Exec.Array3;

public class Array {

    public static int[] creatArray(int i){
        int array[] = new int [i];
        for (int j = 0; j < i; j++) {
            array[j] = j;
        }

        return array;
    }

    public static double[] plusTen(int[] array){
        final int length = array.length;
        double arr[] = new double[length];
        for (int z = 0; z < length; z++) {
            arr[z] = array[z];
        }

        for (int i = 0; i < length; i++) {
            arr[i] = arr[i]/100*110;
        }

        return arr;
    }

    public static String soutArray(double array[]){
        String toString = null;
        for (int i = 0; i < array.length; i++) {
            toString = toString/* != null? toString : " " */+ "\n " + "Елемент: " + i + " = " + array[i] ;
        }

        return toString;
    }
}
