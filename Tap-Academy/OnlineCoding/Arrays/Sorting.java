package OnlineCoding.Arrays;


// Bubble sort
class Sorting1{
    static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Initial Array:" + a[i]);
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    System.out.println("Before Swapping:" + a[j]);
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    System.out.println("After Swapping:" + a[j]);
                }
            }
            System.out.println();
            System.out.print("Resultant Array:" + a[i]);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int a[] = { 3, 2, 7, 5, 9 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


class Sorting2 {
    static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int a[] = { 9, 7, 3, 5, 1 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}

class Sorting3 {

    static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_i]) {
                    min_i = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_i];
            a[min_i] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = { 3, 2, 7, 5, 9 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}