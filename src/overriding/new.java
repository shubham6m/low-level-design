package overriding;

class news{
public static int smallestIndex(int[] nums) {
        // check for each number : digit of sum, constaints are small
        for(int i=0; i<nums.length; i++){
            int digitSum = 0;
            while(nums[i] > 0 && digitSum <= i){
                int lastDigit = nums[i] % 10;
                digitSum += lastDigit;
                nums[i] /= 10;
            }
            if(digitSum == i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        smallestIndex(arr);
    }
}
