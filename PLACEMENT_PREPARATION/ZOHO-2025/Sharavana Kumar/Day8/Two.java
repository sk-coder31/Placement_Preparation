import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int target = 3;
        int[] arr = new int[]{1, 3, 2, 0, 3};

        int combinations = helper(target, 0, arr);
        System.out.println(combinations);
    }

    public static int helper(int sum, int i, int[] arr) {
    if (sum == 0) return 1;
    if (sum < 0 || i >= arr.length) return 0;

    int take = 0;
    if (arr[i] != 0) {
        take = helper(sum - arr[i], i, arr) + 
    }

    int notake = helper(sum, i + 1, arr);

    return take + notake;
}

}
