import java.util.Arrays;

public class driver {

    public static void main(String[] args) {
        int[] array;
        StopWatch sw = new StopWatch();
        System.out.println("Nearly Sorted");

        System.out.println("Select sort");
        int selavtime1=0;
        int selavtime2=0;
        int selavtime3=0;
        int selavtime4=0;
        int selavtime5=0;

        array = ArrayGen.nearlySortedArray(10);
        Sorts.selectSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10);
            sw.start();
            Sorts.selectSort(array);
            sw.stop();
            selavtime1+=sw.getElapsedTime();
        }
        double selaverage1=selavtime1/10.0;
        System.out.println("size 10^1:" + selaverage1);
        array = ArrayGen.nearlySortedArray(100);
        Sorts.selectSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100);
            sw.start();
            Sorts.selectSort(array);
            sw.stop();
            selavtime2+=sw.getElapsedTime();
        }
        int selaverage2=selavtime2/10;
        System.out.println("size 10^2:" + selaverage2);
        array = ArrayGen.nearlySortedArray(1000);
        Sorts.selectSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(1000);
            sw.start();
            Sorts.selectSort(array);
            sw.stop();
            selavtime3+=sw.getElapsedTime();
        }
        int selaverage3=selavtime3/10;
        System.out.println("size 10^3:" + selaverage3);
        array = ArrayGen.nearlySortedArray(10000);
        Sorts.selectSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10000);
            sw.start();
            Sorts.selectSort(array);
            sw.stop();
            selavtime4+=sw.getElapsedTime();
        }
        int selaverage4=selavtime4/10;
        System.out.println("size 10^4:" + selaverage4);
        array = ArrayGen.nearlySortedArray(100000);
        Sorts.selectSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100000);
            sw.start();
            Sorts.selectSort(array);
            sw.stop();
            selavtime5+=sw.getElapsedTime();
        }
        int selaverage5=selavtime5/10;
        System.out.println("size 10^5:" + selaverage5);

        //Break

        System.out.println("Bubble sort");
        int bubavtime1=0;
        int bubavtime2=0;
        int bubavtime3=0;
        int bubavtime4=0;
        int bubavtime5=0;

        array = ArrayGen.nearlySortedArray(10);
        Sorts.bubbleSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10);
            sw.start();
            Sorts.bubbleSort(array);
            sw.stop();
            bubavtime1+=sw.getElapsedTime();
        }
        double bubaverage1=bubavtime1/10.0;
        System.out.println("size 10^1:" + bubaverage1);
        array = ArrayGen.nearlySortedArray(100);
        Sorts.bubbleSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100);
            sw.start();
            Sorts.bubbleSort(array);
            sw.stop();
            bubavtime2+=sw.getElapsedTime();
        }
        int bubaverage2=bubavtime2/10;
        System.out.println("size 10^2:" + bubaverage2);
        array = ArrayGen.nearlySortedArray(1000);
        Sorts.bubbleSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(1000);
            sw.start();
            Sorts.bubbleSort(array);
            sw.stop();
            bubavtime3+=sw.getElapsedTime();
        }
        int bubaverage3=bubavtime3/10;
        System.out.println("size 10^3:" + bubaverage3);
        array = ArrayGen.nearlySortedArray(10000);
        Sorts.bubbleSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10000);
            sw.start();
            Sorts.bubbleSort(array);
            sw.stop();
            bubavtime4+=sw.getElapsedTime();
        }
        int bubaverage4=bubavtime4/10;
        System.out.println("size 10^4:" + bubaverage4);
        array = ArrayGen.nearlySortedArray(100000);
        Sorts.bubbleSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100000);
            sw.start();
            Sorts.bubbleSort(array);
            sw.stop();
            bubavtime5+=sw.getElapsedTime();
        }
        int bubaverage5=bubavtime5/10;
        System.out.println("size 10^5:" + bubaverage5);

        //break

        System.out.println("Insert sort");
        int inavtime1=0;
        int inavtime2=0;
        int inavtime3=0;
        int inavtime4=0;
        int inavtime5=0;

        array = ArrayGen.nearlySortedArray(10);
        Sorts.insertSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10);
            sw.start();
            Sorts.insertSort(array);
            sw.stop();
            inavtime1+=sw.getElapsedTime();
        }
        double inaverage1=inavtime1/10.0;
        System.out.println("size 10^1:" + inaverage1);
        array = ArrayGen.nearlySortedArray(100);
        Sorts.insertSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100);
            sw.start();
            Sorts.insertSort(array);
            sw.stop();
            inavtime2+=sw.getElapsedTime();
        }
        int inaverage2=inavtime2/10;
        System.out.println("size 10^2:" + inaverage2);
        array = ArrayGen.nearlySortedArray(1000);
        Sorts.insertSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(1000);
            sw.start();
            Sorts.insertSort(array);
            sw.stop();
            inavtime3+=sw.getElapsedTime();
        }
        int inaverage3=inavtime3/10;
        System.out.println("size 10^3:" + inaverage3);
        array = ArrayGen.nearlySortedArray(10000);
        Sorts.insertSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10000);
            sw.start();
            Sorts.insertSort(array);
            sw.stop();
            inavtime4+=sw.getElapsedTime();
        }
        int inaverage4=inavtime4/10;
        System.out.println("size 10^4:" + inaverage4);
        array = ArrayGen.nearlySortedArray(100000);
        Sorts.insertSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100000);
            sw.start();
            Sorts.insertSort(array);
            sw.stop();
            inavtime5+=sw.getElapsedTime();
        }
        int inaverage5=inavtime5/10;
        System.out.println("size 10^5:" + inaverage5);

        //Break

        System.out.println("Merge sort");
        int meravtime1=0;
        int meravtime2=0;
        int meravtime3=0;
        int meravtime4=0;
        int meravtime5=0;

        array = ArrayGen.nearlySortedArray(10);
        Sorts.mergeSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10);
            sw.start();
            Sorts.mergeSort(array);
            sw.stop();
            meravtime1+=sw.getElapsedTime();
        }
        double meraverage1=meravtime1/10.0;
        System.out.println("size 10^1:" + meraverage1);
        array = ArrayGen.nearlySortedArray(100);
        Sorts.mergeSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100);
            sw.start();
            Sorts.mergeSort(array);
            sw.stop();
            meravtime2+=sw.getElapsedTime();
        }
        int meraverage2=meravtime2/10;
        System.out.println("size 10^2:" + meraverage2);
        array = ArrayGen.nearlySortedArray(1000);
        Sorts.mergeSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(1000);
            sw.start();
            Sorts.mergeSort(array);
            sw.stop();
            meravtime3+=sw.getElapsedTime();
        }
        int meraverage3=meravtime3/10;
        System.out.println("size 10^3:" + meraverage3);
        array = ArrayGen.nearlySortedArray(10000);
        Sorts.mergeSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10000);
            sw.start();
            Sorts.mergeSort(array);
            sw.stop();
            meravtime4+=sw.getElapsedTime();
        }
        int meraverage4=meravtime4/10;
        System.out.println("size 10^4:" + meraverage4);
        array = ArrayGen.nearlySortedArray(100000);
        Sorts.mergeSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100000);
            sw.start();
            Sorts.mergeSort(array);
            sw.stop();
            meravtime5+=sw.getElapsedTime();
        }
        int meraverage5=meravtime5/10;
        System.out.println("size 10^5:" + meraverage5);

        //Break

        System.out.println("Quick sort");
        int qavtime1=0;
        int qavtime2=0;
        int qavtime3=0;
        int qavtime4=0;
        int qavtime5=0;

        array = ArrayGen.nearlySortedArray(10);
        Sorts.quickSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10);
            sw.start();
            Sorts.quickSort(array);
            sw.stop();
            qavtime1+=sw.getElapsedTime();
        }
        double qaverage1=qavtime1/10.0;
        System.out.println("size 10^1:" + qaverage1);
        array = ArrayGen.nearlySortedArray(100);
        Sorts.quickSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100);
            sw.start();
            Sorts.quickSort(array);
            sw.stop();
            qavtime2+=sw.getElapsedTime();
        }
        int qaverage2=qavtime2/10;
        System.out.println("size 10^2:" + qaverage2);
        array = ArrayGen.nearlySortedArray(1000);
        Sorts.quickSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(1000);
            sw.start();
            Sorts.quickSort(array);
            sw.stop();
            qavtime3+=sw.getElapsedTime();
        }
        int qaverage3=qavtime3/10;
        System.out.println("size 10^3:" + qaverage3);
        array = ArrayGen.nearlySortedArray(10000);
        Sorts.quickSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(10000);
            sw.start();
            Sorts.quickSort(array);
            sw.stop();
            qavtime4+=sw.getElapsedTime();
        }
        int qaverage4=qavtime4/10;
        System.out.println("size 10^4:" + qaverage4);
        array = ArrayGen.nearlySortedArray(100000);
        Sorts.quickSort(array);
        for (int z=0; z<10; z++) {
            array = ArrayGen.nearlySortedArray(100000);
            sw.start();
            Sorts.quickSort(array);
            sw.stop();
            qavtime5+=sw.getElapsedTime();
        }
        int qaverage5=qavtime5/10;
        System.out.println("size 10^5:" + qaverage5);
    }
}