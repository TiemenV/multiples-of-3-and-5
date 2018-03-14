package be.tiemenvermote.projecteuler001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    boolean[] array;

    public Calculator(int limit) {
        array = new boolean[limit+1];
        Arrays.fill(array, true);
        array[0] = false;
        array[1] = false;
        array[2] = false;
        performSieve();
    }

    private void performSieve() {
        for(int i = 3; i<array.length; i++) {
            array[i] = isMultiple(i);
        }
    }

    public boolean isMultiple(int i) {
        return (i%3==0)||(i%5==0);
    }

    public List<Integer> getMultiples() {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++) {
            if (isMultiple(i)) {
                list.add(i);
            }
        }
        return list;

    }
}
