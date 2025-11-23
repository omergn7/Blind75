package blind75.arrays;

import java.util.Arrays;

/**
 * Blind 75 - Two Sum1
 *
 * Problem:
 *  Verilen int dizisinde, toplamları target olan iki farklı indexi bul.
 *
 * Yaklaşım:
 *  - Brute force (tüm çiftleri dene).
 *  - Her i için tüm j'leri dolaş, nums[i] + nums[j] == target ise indexleri döndür.
 *
 * Zaman karmaşıklığı: O(n^2)
 * Bellek karmaşıklığı: O(1)
 */

class TwoSumBruteForce {
    public int[] twoSum(int[] nums, int target) {
        int z=nums.length;
        for(int x=0;x<z;x++){
            for(int y=0;y<z;y++){
                if(nums[x]+nums[y]== target && x!=y){
                    return new int[]{x,y};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumBruteForce solver = new TwoSumBruteForce();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); // [0, 1]
    }
}

