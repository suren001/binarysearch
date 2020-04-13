package binarysearchiterative;

public class MyBinarySearchIterative {

    private int[] arr;

    public MyBinarySearchIterative(int[] arr) {
        this.arr = arr;
    }

    public int binarySearchIterative(int searchelement) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchelement)
                return mid;
            else if (arr[mid] > searchelement) {
                high = mid - 1;
            } else
                low = mid + 1;

        }
        return -1;
    }
}