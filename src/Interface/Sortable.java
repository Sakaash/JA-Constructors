package Interface;

import java.util.Scanner;

public interface Sortable {
    void sort(int[] array);
} 

class BubbleSort implements Sortable {
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean swapped = false;       
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}

class QuickSort implements Sortable {
    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
    }
    private void quickSort(int[] array, int low, int high) {
        if(low<high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }
    private int partition(int[] array, int low , int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j]<=pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}

class MergeSort implements Sortable {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length-1);
    }
    private void mergeSort(int[] array, int left, int right) {
        if(left<right) {
            int mid = (left + right) /2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }
    private void merge(int[] array, int left, int mid, int right) {
        int l1 = mid - left + 1;
        int l2 = right - mid;
        int[] leftArray = new int[l1];
        int[] rightArray = new int[l2];
        for (int i = 0; i < l1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < l2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i<l1 && j<l2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<l1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j<l2) {
            array[k] = rightArray[j];
            j++;
            k++; 
        }
    }
}
class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        int choice;
        while (true) {
            System.out.println("Select Sorting Algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.print("Enter your choice (1/2/3): ");
            choice = scanner.nextInt();
            if(choice >= 1 && choice <= 3) {
                break;
            } else {
                System.out.println("Please Enter a valid choice!!!!!");
            }
        }

        Sortable sorter = null;
        switch (choice) {
            case 1 -> sorter = new BubbleSort();
            case 2 -> sorter = new QuickSort();
            case 3 -> sorter = new MergeSort();
        }
        sorter.sort(array);
        System.out.println("The sorted array is ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}