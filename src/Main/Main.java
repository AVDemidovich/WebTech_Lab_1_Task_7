package Main;

import Handler.Handler;

public class Main {

    public static void main(String[] args) {
        double [] A = {55,3,0,2,4,1,0,5,2,3,1,4,13};
        Handler.ShellSort(A);
        for (double elm: A) {
            System.out.print(" " + elm);
        }
    }
}
