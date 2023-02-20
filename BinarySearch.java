 
 import java.util.Scanner;
class BinarySearch {
    int binarySearch(int array[], int element, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element)
                return mid;
            if (array[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch obj = new BinarySearch();
        Scanner input = new Scanner(System.in);
        int[] array;

        System.out.println("Enter the number of elements in the array");

        int n = input.nextInt();

        
        System.out.println("Enter the numbers of the array:");
        for(int i=0;i<n;i++){
            int z;
            array[z] = input.nextInt();
        }

        
        System.out.println("Enter element to be searched:");

        int element = input.nextInt();
        input.close();

        int result = obj.binarySearch(array, element, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}