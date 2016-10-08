package Handler;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */
public class Handler {
    public static void ShellSort(double[] array) {
        int inner, outer;
        double temp;

        int h = 1;
        if(array == null)   return;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
