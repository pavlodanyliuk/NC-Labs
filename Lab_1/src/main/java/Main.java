import analyzer.Analyzer;
import exel.ExelWriter;
import fillers.Filler;
import sorters.SortsContainer;
import sorters.algorithms.Sorting;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 8, -5, 75, 12, 45, 1, 79, -10, 0 , 2, 0,12};
//        SortsContainer.bubbleDirectSort(arr);
//        SortsContainer.bubbleReverseSort(arr);
//        SortsContainer.mergeSort(arr);
//        SortsContainer.quickSort(arr);
//        SortsContainer.shellSort(arr);
//        SortsContainer.arraysSort(arr);
//        SortsContainer.ordinarySort(arr);
//

//        int[] arr1 = Filler.genSortedArray(10,0,20);
//        int[] arr2 = annotations.Filler.genSortedArrayWithX(10,0,20);
//        int[] arr3 = annotations.Filler.genRevSortedArray(10,0,20);
//        int[] arr4 = annotations.Filler.genRandomArray(10,0,20);
//
//        printArray(arr1);
//        printArray(arr2);
//        printArray(arr3);
//        printArray(arr4);

        File file = new File("/home/roland/exel/stats.xlsx");
        new ExelWriter(Analyzer.analyze(), Analyzer.getLenOfArrays()).writeStats(file);




//        Method meth = null;
//        try {
//            meth = Filler.class.getMethod("genRandomArray", int.class, int.class, int.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        int[] i = meth.invoke(10,0, 10)


    }

    private static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
