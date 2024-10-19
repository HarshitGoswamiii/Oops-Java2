public class arr {
    public static void main(String[] args) {

        // Question 1
        // float sum = 0;
        // float[] arr = { 12.5f, 12.4f, 4.5f, 5.1f, 5.6f };
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }
        // System.out.println(sum);

        // Question 2
        // int[] arr2 = { 2, 1, 33, 43, 11, 33 };
        // int find = 3;
        // boolean found = false;
        // System.out.println("Number : " + find);
        // for (int i = 0; i < arr2.length; i++) {
        // if (find == arr2[i]) {
        // found = true;
        // break;
        // }
        // }
        // if (found == true) {
        // System.out.println("Found");
        // } else {
        // System.out.println("Not Found");
        // }

        // Question 3
        int[] arr2 = { 24, 15, 29, 19, 17 };
        // int sum = 0;
        // float avg;
        // for (int element : arr2) {
        // sum += element;
        // }
        // avg = sum / arr2.length;
        // System.out.println(avg);

        // Question 6
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }
}