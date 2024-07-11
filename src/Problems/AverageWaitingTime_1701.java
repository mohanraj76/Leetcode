package Problems;

public class AverageWaitingTime_1701 {
    public static void main(String[] args) {
        int[][] customers = {
                {1,2},
                {4,5},
                {6,8},
        };
        double sum = 0;
        int max = 0;

        for (int[] c : customers) {
            max = Math.max(max,c[0]);
            sum += max - c[0] + c[1];
            max = max + c[1];
        }

        System.out.println(sum / customers.length);
    }
}
