package sorters.algorithms.bubblepackage;

import sorters.algorithms.Sorting;

public abstract class  BubbleSort extends Sorting {

    public BubbleSort(int[] array){
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                check(j);
            }
        }
    }
    protected abstract void check(int j);
}
