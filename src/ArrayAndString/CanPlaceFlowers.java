package ArrayAndString;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            // Check if current plot is empty and neighbors are also empty or boundaries
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                n--; // Reduce the number of flowers to plant
                i++; // Skip the next plot to ensure no adjacent planting
            }
        }
        return n == 0;
    }


    public static void main(String[] args) {
        int [] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
