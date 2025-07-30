class Solution {
    public int numberOfSteps(int num) {
        return count(num);
    }
    int count(int num ){
        if(num == 0 ){         // base case
            return 0;
        }
        if(num % 2 == 0){
            return 1 + count(num/2);  // even case 
        }
        else {
            return 1+ count(num - 1);     // odd case
        }
    }

}