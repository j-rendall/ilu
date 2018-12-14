public class driver {

    public static void main(String[] args) {
        int[] array;
        StopWatch sw = new StopWatch();

        System.out.println("Reversed Array");
        System.out.println("Select sort");
        int count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.reversedArray(s);
            Sorts.selectSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.reversedArray(s);
                sw.start();
                Sorts.selectSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Bubble sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.reversedArray(s);
            Sorts.bubbleSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.reversedArray(s);
                sw.start();
                Sorts.bubbleSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Insert sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.reversedArray(s);
            Sorts.insertSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.reversedArray(s);
                sw.start();
                Sorts.insertSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Merge sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.reversedArray(s);
            Sorts.mergeSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.reversedArray(s);
                sw.start();
                Sorts.mergeSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Quick sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.reversedArray(s);
            Sorts.quickSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.reversedArray(s);
                sw.start();
                Sorts.quickSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }


        //Large Break


        System.out.println("Randomized Array");
        System.out.println("Select sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.randomizedArray(s);
            Sorts.selectSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.randomizedArray(s);
                sw.start();
                Sorts.selectSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Bubble sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.randomizedArray(s);
            Sorts.bubbleSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.randomizedArray(s);
                sw.start();
                Sorts.bubbleSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Insert sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.randomizedArray(s);
            Sorts.insertSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.randomizedArray(s);
                sw.start();
                Sorts.insertSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Merge sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.randomizedArray(s);
            Sorts.mergeSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.randomizedArray(s);
                sw.start();
                Sorts.mergeSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Quick sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.randomizedArray(s);
            Sorts.quickSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.randomizedArray(s);
                sw.start();
                Sorts.quickSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }


        //Large Break


        System.out.println("Few Unique Array");
        System.out.println("Select sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.fewUniqueArray(s);
            Sorts.selectSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.fewUniqueArray(s);
                sw.start();
                Sorts.selectSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Bubble sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.fewUniqueArray(s);
            Sorts.bubbleSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.fewUniqueArray(s);
                sw.start();
                Sorts.bubbleSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Insert sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.fewUniqueArray(s);
            Sorts.insertSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.fewUniqueArray(s);
                sw.start();
                Sorts.insertSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Merge sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.fewUniqueArray(s);
            Sorts.mergeSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.fewUniqueArray(s);
                sw.start();
                Sorts.mergeSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Quick sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.fewUniqueArray(s);
            Sorts.quickSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.fewUniqueArray(s);
                sw.start();
                Sorts.quickSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }


        //Large Break


        System.out.println("Nearly Sorted Array");
        System.out.println("Select sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.nearlySortedArray(s);
            Sorts.selectSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.nearlySortedArray(s);
                sw.start();
                Sorts.selectSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Bubble sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.nearlySortedArray(s);
            Sorts.bubbleSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.nearlySortedArray(s);
                sw.start();
                Sorts.bubbleSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Insert sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.nearlySortedArray(s);
            Sorts.insertSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.nearlySortedArray(s);
                sw.start();
                Sorts.insertSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Merge sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.nearlySortedArray(s);
            Sorts.mergeSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.nearlySortedArray(s);
                sw.start();
                Sorts.mergeSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }

        //Break

        System.out.println("Quick sort");
        count = 1;
        for (int s=10; s<=100000; s*=10) {
            int avtime=0;
            array = ArrayGen.nearlySortedArray(s);
            Sorts.quickSort(array);
            for (int z=0; z<10; z++) {
                array = ArrayGen.nearlySortedArray(s);
                sw.start();
                Sorts.quickSort(array);
                sw.stop();
                avtime+=sw.getElapsedTime();
            }
            double average=avtime/10.0;
            System.out.println("size 10^" + count + ":" + average);
            count++;
        }
    }
}