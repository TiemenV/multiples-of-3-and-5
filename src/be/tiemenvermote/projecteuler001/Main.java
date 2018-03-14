package be.tiemenvermote.projecteuler001;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }


    private void run() {
        Calculator c = new Calculator(1000);
        List<Integer> multiples = c.getMultiples();
        long sum = 0;
        for(int m : multiples) sum += m;
        System.out.printf("sum=%d",sum);

    }
}