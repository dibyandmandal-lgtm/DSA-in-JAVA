 public class same_number {
    public int countLargestGroup(int n) {
        int[] groups = new int[37]; 

        int maxSize = 0;

        // Build the groups
        for (int num = 1; num <= n; num++) {
            int sum = digitSum(num);
            groups[sum]++;
            maxSize = Math.max(maxSize, groups[sum]);
        }

        
        int answer = 0;
        for (int size : groups) {
            if (size == maxSize) {
                answer++;
            }
        }

        return answer;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10; // take last digit
            num /= 10;       // remove last digit
        }

        return sum;
    }
    public static void main(String[] args) {
        same_number solution = new same_number();
        int n = 13; // Example input
        int result = solution.countLargestGroup(n);
        System.out.println("Number of groups with the largest size for n = " + n + ": " + result);
    }
}