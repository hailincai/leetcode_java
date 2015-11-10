package array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
    	if (nums.length == 1)
    		return 1;
    	
    	int i = 0;
    	int j = 1;
    	int slot = i + 1;
    	
    	int cnt = 1;
    	while (j < nums.length){
    		if (nums[j] == nums[i]){
    			j += 1;
    		}else{
    			if (j != i + 1){
	    			nums[slot] = nums[j];
    			}
    			i = slot;
    			slot = i + 1;
    			cnt ++;
    		}
    	}
    	
    	return cnt;
    }
    
    public static void main(String[] argv) throws Exception{
    	RemoveDuplicates obj = new RemoveDuplicates();
    	System.out.println(obj.removeDuplicates(new int[]{1,1,2,3}));
    }
}
