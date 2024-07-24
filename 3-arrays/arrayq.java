import java.util.*;

public class arrayq {

    public static boolean twiceornot(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int targetIndex(int arr[], int target){
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==target){
        //         return i;
        //     }
        // }
        // return -1;

        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }


    public static int buysellStocks(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static int trap(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterlevel - height[i];
        }
        return trapWater;

    }


    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }

    public static void main(String[] args) {

        //!Given an integer array nums, return true if any value appears at
        //!atleast twice in the array, and return false if every element is distinct.
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the elements of the array");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(twiceornot(arr));


        //!return the index of target if it is in nums, or -1 if it is not
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the elements of the array:- ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the target element:- ");
        // int target = sc.nextInt();
        // System.out.println();
        // System.out.println(targetIndex(arr, target));
        
        
        //!Buy and sell stocks
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the prices of the stocks in the array:- ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println();
        // System.out.println("Maximum profit is:- ");
        // System.out.println(buysellStocks(arr));
    
    
        //!RainwaterTrapping
        // System.out.println("Enter the multiple heights of the bars to trap rain water : - ");
        // System.out.println("Enter the size of the array:- ");
        // int n = sc.nextInt();
        // int height[] = new int[n];
        // System.out.println("Enter the multiple heights of the bars to trap rain water : - ");

        // for(int i=0; i<n; i++){
        //     height[i] = sc.nextInt();
        // }

        // System.out.println(trap(height));
    
        //!return triplets
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(threeSum(arr));

    }
}
