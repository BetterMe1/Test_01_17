package xust;

/*
1.整数反转
 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 
示例 1:
输入: 123
输出: 321

 示例 2:
输入: -123
输出: -321

示例 3:
输入: 120
输出: 21

注意:
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

//public class Test_0117 {
//	public static void main(String[] args) {
//		Solution So=new Solution();
//		System.out.println("num:"+123);
//		System.out.println("反转后:"+So.reverse(123));
//		System.out.println("num:"+-123);
//		System.out.println("反转后:"+So.reverse(-123));
//		int num=1563847412;
//		System.out.println("num:"+num);
//		if(So.reverse(num) !=0){
//			System.out.println("反转后:"+So.reverse(num));
//		}
//		else{
//			System.out.println("反转后:溢出");	
//		}
//	}
//}
//
///*
// * 算法思想：算出数据长度，从数据的最后一位开始，遍历数据的每一位，计算出翻转后数据的值，
// * 每计算完一位，判断数据是否溢出，若溢出，返回0，若计算完毕没有溢出，返回翻转后的数据
// */
//class Solution {
//    public int reverse(int x) {
//        String s=String.valueOf(x); 
//        int ret=0;
//        int len =s.length()-1;
//        if(x<0){
//        	len--;//去掉负号的长度
//        }
//        for(int i=len; i>=0; i--){
//        	int temp=ret;//记录此时ret的值
//    		ret=ret*10 + x%10;
//        	if((ret - x%10)/10 !=temp){//判断溢出,计算出原来ret的值，如果不等于temp,说明溢出
//        		return 0;
//        	}
//        	x/=10;
//        }
//        return ret;
//    }
//}

/*
2. 删除排序数组中的重复项
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

示例 1:
给定数组 nums = [1,1,2], 
函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
你不需要考虑数组中超出新长度后面的元素。

示例 2:
给定 nums = [0,0,1,1,1,2,2,3,3,4],
函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
你不需要考虑数组中超出新长度后面的元素。

说明:
为什么返回数值是整数，但输出的答案是数组呢?
请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:
// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
int len = removeDuplicates(nums);
// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */
public class Test_0117 {
	public static void main(String[] args) {
		Solution So=new Solution();
		int[] nums={0,0,1,1,1,2,2,3,3,4};
		int len=So.removeDuplicates(nums);
		System.out.println("数组长度为："+len);
		//打印数组内容
		for(int i=0; i<len; i++){
			System.out.print(nums[i]+"  ");
		}
	}
}
/*
 * 算法思想：
 * 先判断数组长度，如果是0，则直接返回0，
 * 如果不是，则进行下面的操作：
 * 用i标记去掉重复后数组的下标，用j遍历数组其他内容与i标记的内容进行比较，
 * 若不同，则加至i标记的内容后面，并将i后移一位，直到遍历完数组内容，返回i+1(去掉重复后的数组长度)。
 */
class Solution {
    public int removeDuplicates(int[] nums) {
    	if(nums.length==0){
    		return 0;
    	}
    	int i=0;
    	for(int j=1; j<nums.length; j++){
    		if(nums[j] != nums[i]){//如果不同，将不同的加至nums[i]后面
    			i++;
    			nums[i]=nums[j];
    		}
    	}
    	return i+1;
    }
}