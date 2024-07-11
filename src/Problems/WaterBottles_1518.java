package Problems;

public class WaterBottles_1518 {
    public static void main(String[] args) {

        int numBottles = 15;
        int numExchange = 4;
        int ans = numBottles;

        if (numBottles < numExchange){
            System.out.println(numBottles);
        }
        while (numBottles>= numExchange){
            ans += numBottles/numExchange;
            numBottles = numBottles % numExchange + numBottles/numExchange ;
        }
        System.out.println(ans);
        }
    }
