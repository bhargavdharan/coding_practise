import java.util.Scanner;
import java.util.Arrays;

// program-1
// ---- COMPOUND INTEREST

class CompoundInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principal amount     : P => \t");
        float p;
        p = scan.nextFloat();
        System.out.print("Enter Annual Interest Rate : R => \t");
        float r;
        r = scan.nextFloat();
        System.out.print("Enter Time Invested        : T => \t");
        float t;
        t = scan.nextFloat();
        System.out.print("Enter No of time interest is compounded : n => \t");
        float n;
        n = scan.nextFloat();
        scan.close();

        float amount;
        amount = (float)p * (float)(Math.pow((1 + r / 100), (n * t)));
        float cInterest;
        cInterest = (float)amount - p;

        System.out.print("Compound Interest is :\t " + cInterest);

    }
}

// output
// nter principal amount     : P =>       10
// Enter Annual Interest Rate : R =>       20
// Enter Time Invested        : T =>       2
// Enter No of time interest is compounded : n =>  1
// Compound Interest is :   4.4000006

// program-2
// ---- Count elements
class CountE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("No of elements:\t");
        int n;
        n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Element at index " + i + " :\t");
            a[i] = scan.nextInt();
        }
        System.out.println("No. of elements in array is :\t "+a.length);
    }
}

// output

// No of elements: 5
// Element at index 0 :    23
// Element at index 1 :    22
// Element at index 2 :    15
// Element at index 3 :    9
// Element at index 4 :    2
// No. of elements in array is :    5

// program-3
// -----Count No.of Non-Zero elements

class NonZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        System.out.println();
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[pos] = a[i];
                pos++;
            }
        }
        while (pos < a.length) {
            a[pos] = 0;
            pos++;
        }
        System.out.println("Resulted Array:\t" + Arrays.toString(a));
        System.out.println();
    }
}

// output
// 5
// 23 22 0 9 2
// Created Array:  [23, 22, 0, 9, 2]
// 
// Resulted Array: [23, 22, 9, 2, 0]

class NonZero2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nonZero = 0;
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        System.out.println("length:\t" + a.length);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                nonZero++;
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();
        System.out.println("length of non-Zero elements:\t" + nonZero);
    }
}

// output
// 5
// 23 22 0 9 2
// Created Array:  [23, 22, 0, 9, 2]
// 
// 23 22 9 2 
// Resulted Array: [23, 22, 0, 9, 2]

// program-4
// -------Even or odd
class EorO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int even = 0, odd = 0;
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("No of even elements:\t"+even);
        System.out.println("No of odd elements:\t"+odd);
    }
}

// output
// 5
// 1 2 3 4 5
// Created Array:  [1, 2, 3, 4, 5]

// No of even elements:    2
// No of odd elements:     3

// program-5
// --- largest number in an array
class Largest {
    
    static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t"+Arrays.toString(a));
        System.out.println();
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted Array:\t" + Arrays.toString(a));

        System.out.println("Largest Element in the Array:\t"+a[n-1]);

    }
}

// output
// 5
// 23 22 15 9 2
// Created Array:  [23, 22, 15, 9, 2]

// 2 9 15 22 23 
// Sorted Array:   [2, 9, 15, 22, 23]
// Largest Element in the Array:   23

// program 6
class ArraySum {
    static void Sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        System.out.println("Sum of elements:\t"+sum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        System.out.print("Sum of elements" + " ");
        Sum(a);

    }
}

// output
// 8
// 23 22 15 9 2 1 3 20
// Created Array:  [23, 22, 15, 9, 2, 1, 3, 20]
// Sum of elements Sum of elements:        95

// program-7
class ArrayProduct {
    static void Mul(int a[]) {
        int mul = 1;
        for (int i = 0; i < a.length; i++) {
            mul = a[i] * mul;
        }
        System.out.println("product of elements:\t" + mul);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        Mul(a);

    }
}

// output
// 4
// 23 2 15 5
// Created Array:  [23, 2, 15, 5]
// product of elements:    3450

// program-8
// ---- sum of even elements
class EvenSum {
    static void SumOfEven(int a[]) {
        int even = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even = a[i] + even;
            }
        }
        System.out.println("Sum of Even elements:\t" + even);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        SumOfEven(a);

    }
}

// output
// 8
// 2 9 32 1 78 3 7 2
// Created Array:  [2, 9, 32, 1, 78, 3, 7, 2]
// Sum of Even elements:   114

class OddSum {
    static void SumOfOdd(int a[]) {
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odd = a[i] + odd;
            }
        }
        System.out.println("Sum of Odd elements:\t" + odd);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        SumOfOdd(a);

    }
}

// output
// 8
// 2 9 32 1 78 3 7 2
// Created Array:  [2, 9, 32, 1, 78, 3, 7, 2]
// Sum of Odd elements:    20

class DiffEvenSum {
    static void Diff(int a[]) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odd = a[i] + odd;
            } else {
                even = a[i] + even;
            }
        }
        System.out.println("Sum of Even elements:\t" + even);
        System.out.println("Sum of Odd elements:\t" + odd);
        int diff = even - odd;
        System.out.println("Difference between even and odd:\t" + diff);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        Diff(a);

    }
}

// output
// 8
// 2 9 32 1 78 3 7 2
// Created Array:  [2, 9, 32, 1, 78, 3, 7, 2]
// Sum of Even elements:   114
// Sum of Odd elements:    20
// Difference between even and odd:        94

// program-11
// ----- Find the second largest in array
class SecondLargest {
    static void Second(int a[]) {
        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        System.out.println("Second Largest Number:\t" + secondLargest);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(a));
        System.out.println();
        Second(a);
    }
}

// output
// 8
// 2 9 32 1 78 3 7 2
// Created Array:  [2, 9, 32, 1, 78, 3, 7, 2]
// 
// Second Largest Number:  32

class secondSmallest {
    public static void small(int arr[]) {
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("smallest number:\t" + smallest);
        System.out.println("Second smallest number:\t" + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        small(arr);
    }
}

// output
// 5 10 23 15 9 2

// Created Array:[10,23,15,9,2]
// smallest number:2
// Second smallest number:9

// program-12

class ArrayIndex {
    public static int findIndex(int arr[], int k) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == k) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        System.out.println(findIndex(arr, k));
    }
}
// output
// 5 
// 23 22 15 9 2
// 3
// -1

// problem-13

class ArrayIndexSorted {
    public static int findIndex(int arr[], int k) {
        Arrays.sort(arr);
        System.out.println("Sorted Array:\t" + Arrays.toString(arr));
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == k) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int k = scan.nextInt();
        System.out.println(findIndex(arr, k));
    }
}

// output
// 5
// 23 22 15 9 2
// Created Array:  [23, 22, 15, 9, 2]
// 9
// Sorted Array:   [2, 9, 15, 22, 23]
// 1

// problem-14 Smallest number
class SmallestNum {
    public static void smallNum(int arr[]) {
        int minVal = arr[0];
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        smallNum(arr);
    }
}

// output
// 5
// 23 22 15 9 2
// Created Array:  [23, 22, 15, 9, 2]
// 2

// problem-15 AscendingArray

class AscendArr {
    public static void Ascend(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        Ascend(arr);
        System.out.println("Ascending order Array:\t" + Arrays.toString(arr));
    }
}
// output
// 5
// 23 22 15 9 2
// Created Array:  [23, 22, 15, 9, 2]
// Ascending order Array:  [2, 9, 15, 22, 23]

// problem-16 DescendingArray

class DescendArr {
    public static void Descend(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        Descend(arr);
        System.out.println("Descending order Array:\t" + Arrays.toString(arr));
    }
}

// output
// 5
// 23 22 15 9 2
// Created Array:  [23, 22, 15, 9, 2]
// Descending order Array: [23, 22, 15, 9, 2]

// program-17 mergeSort
class MergeSort {

    public static void merge(int arr1[], int arr2[], int len1, int len2, int mergeArr[]) {
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (arr2[j] > arr1[i]) {
                mergeArr[k++] = arr2[j++];
            } else {
                mergeArr[k++] = arr1[i++];
            }
        }

        while (i < len1) {
            mergeArr[k++] = arr1[i++];
        }
        while (j < len2) {
            mergeArr[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Created 1st Array:\t" + Arrays.toString(arr1));
        int arr2[] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.println("Created 1st Array:\t" + Arrays.toString(arr2));
        int len1 = arr1.length;
        int len2 = arr2.length;
        int mergeArr[] = new int[m + n];

        merge(arr1, arr2, len1, len2, mergeArr);

        System.out.println("After merging....");

        for (int i = 0; i < len1 + len2; i++) {
            System.out.print(mergeArr[i] + " ");
        }

    }
}

// output
// 4 4
// 78 43 8 2
// Created 1st Array:      [78, 43, 8, 2]
// 321 122 99 81
// Created 1st Array:      [321, 122, 99, 81]
// After merging....
// 321 122 99 81 78 43 8 2 

// program-18 copy elements array
class CopyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int cArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        cArr = arr;
        // cArr[0]++;
        System.out.println("Contents of copy array:");
        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i] + " ");
        }
        System.out.println();
    }
}

// output
// 5
// 13 24 36 47 68
// Created Array:  [13, 24, 36, 47, 68]
// Contents of copy array:
// 13 24 36 47 68 

// program-19

class SquareArray {
    public static void arraySquare(int arr[]) {
        int sArr[] = new int[arr.length];
        sArr = arr;
        System.out.println("Resulted Array:\t");
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i] * sArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        System.out.println();
        arraySquare(arr);
    }
}

// output
// 5
// 1 2 3 4 5
// Created Array:  [1, 2, 3, 4, 5]
// 
// Resulted Array:
// 1 4 9 16 25 

// program-20

class LargestIndex {
    public static int indexFinder(int arr[]) {
        int largestNum = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        while (index < arr.length) {
            if (arr[index] == largestNum) {
                return index;
            } else {
                index = index + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        System.out.println();
        int res = indexFinder(arr);
        System.out.println(res);

    }
}

// output
// 5
// 23 45 9 123 2
// Created Array:  [23, 45, 9, 123, 2]
// 
// 3






//=======================================================================================================================
//=======================================================================================================================
//=======================================================================================================================

/// program to find ceil of an sorted Array

// ar ---> [19,23,46,61,71,88,92]
// ceil(56) = 56        floor(56) = 56
// ceil(68) = 71        floor(68) = 61
// ceil(71) = 71        floor(72) = 72
// ceil(90) = 92        floor(90) = 88
// ceil(105) = does not exist    floor(105) = 92

class CeilSA {
    public static int ceil(int arr[], int key) {
        
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
                // low = low;
            } else {
                low = mid + 1;
                // high = high;
            }
        }
        if (low <= 0) {
            return arr[low];
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int key = scan.nextInt();
        System.out.println(ceil(arr, key));
    }
}

// output
// 7
// 19 23 56 61 72 88 92
// Created Array:  [19, 23, 56, 61, 72, 88, 92]
// 68
// 72


/// program to find floor of an sorted Array

class FloorSA {
    public static int floor(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
                // low = low;
            } else {
                low = mid + 1;
                // high = high;
            }
        }
        if (high >= 0) {
            return arr[high];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int key = scan.nextInt();
        System.out.println(floor(arr, key));
    }
}

// output
// 7
// 19 23 56 61 72 88 92
// Created Array:  [19, 23, 56, 61, 72, 88, 92]
// 68
// 61


///---------------------------
// program to find first and last position of an array

class FirstNLast {
    public static int[] SearchRange(int arr[], int target) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1, mid = 0;
        int res[] = {-1,-1};

        while(low<=high){

            mid = (low+high)/2;
            if(target==mid){
                res[0] = mid;
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;

            }else{
                high = mid-1;

            }
        }

        low=0;
        high=arr.length - 1;
        mid=0;

        while(low<=high){

            mid = (low+high)/2;
            if(target==arr[mid]){
                res[1] = mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low = mid+1;

            }else{
                high = mid-1;

            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int target = scan.nextInt();
        SearchRange(arr, target);
    }
}