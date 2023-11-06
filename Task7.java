public class Task7 {
    public static void main(String[] args) {
        int[] a = {23, 45, 67, 78, 86, 90};
        int target = 67;
        int indx = binarySearch(a, target);
        if (indx != -1) {
            if (isPrime(target)) {
                System.out.println(target + " is present in " + indx + " index position and it is a prime number ");
            } else {
                System.out.println(target + " is present in " + indx + " index position and it is not a prime number ");
            }
        } else {
            System.err.println(target + " is not present ");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int index = 0;
        int size = arr.length - 1;
        while (index <= size) {
            int mid = index + (size - index) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                index = mid + 1;
            } else {
                size = mid - 1;
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}