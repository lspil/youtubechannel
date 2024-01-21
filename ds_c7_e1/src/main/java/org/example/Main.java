package org.example;

public class Main {

    public static void main(String[] args) {
        int [] input = {3,2,7,1,8,4};

        quicksort(input, 0, input.length - 1);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    static void quicksort(int [] input, int low, int high) {
        if (low < high) {
            int pi = partition(input, low, high);

            quicksort(input, low, pi);
            quicksort(input, pi + 1, high);
        }
    }

    static int partition(int [] input, int low, int high) {    // Hoare
        // i = 3, j = 3
        // 3,2,7,1,8,4
        // 1,2,7,3,8,4
        // 1,2,3,7,8,4

        int pivot = input[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (input[i] < pivot);

            do {
                j--;
            } while (input[j] > pivot);

            if (j <= i) {
                return j;
            }

            int aux = input[i];
            input[i] = input[j];
            input[j] = aux;
        }
    }

//    static int partition(int [] input, int low, int high) {  // Lomuto
//        // i = 2
//        // 3,2,7,1,8,4
//        // 3,2,7,1,8,4
//        // 3,2,1,7,8,4
//        // 3,2,1,4,8,7
//        int pivot = input[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (input[j] < pivot) {
//               i++;
//
//               int aux = input[i];
//               input[i] = input[j];
//               input[j] = aux;
//            }
//        }
//
//        int aux = input[i + 1];
//        input[i + 1] = input[high];
//        input[high] = aux;
//
//        return i + 1;
//    }

}


