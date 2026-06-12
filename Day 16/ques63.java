public class ques63 {

    static void twoSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "+" + arr[j]);
                    return;
                }
            }
        }
        System.out.println("none");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        int sum = 5;

        twoSum(arr, sum);
    }
}

