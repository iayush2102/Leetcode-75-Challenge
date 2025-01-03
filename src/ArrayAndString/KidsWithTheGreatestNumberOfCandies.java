package ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMax = getMax(candies);
        List <Boolean> result = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies < currentMax){
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }

    private static int getMax(int [] candies){
        int max = candies[0];
        for(int candy : candies){
            if(max < candy){
                max = candy;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] candies = {1, 2, 3, 4};
        int extraCandies = 2;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
