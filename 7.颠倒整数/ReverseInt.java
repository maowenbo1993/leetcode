public class ReverseInt{
	public static void main(String[] args){
		Solution s = new Solution();
		
		System.out.println(s.reverse(1234567899));
 	}
}
class Solution{
    public int reverse(int x) {
        long result = 0;
        while( x != 0){
            int tail = x % 10;
            long newResult = result * 10 + tail;
            result = newResult;
            x= x/10;
            if( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;
    }
}

// class Solution {
//     public int reverse(int x) {
//         if(x < -(int)Math.pow(2,31) || x > (int)Math.pow(2,31)-1){
//             return 0;
//         }
//     	int sum = 0;
//     	int count = 0;
//     	int[] array = new int[10];
//         if(x < 0){
//         	x = -x;
//             while(x/10 != 0){
//                 int i = x % 10;
//                 array[count] = i; 
//                 x /= 10;
//                 count++;
//             }
//             array[count] = x;
//             for(int j = 0; j <= count; j++){
//                 sum += array[j] * (int)Math.pow(10,count - j);
//             }
//             // System.out.println(""+array[0]+array[1]+array[2]);
//             return -sum;



//         }else{
//         	while(x/10 != 0){
//         		int i = x % 10;
//         		array[count] = i; 
//         		x /= 10;
//         		count++;
//         	}
//             array[count] = x;
//             if(count==9 && array[0]>2){
//                 return 0;
//             }
//         	for(int j = 0; j <= count; j++){
//         		sum += array[j] * (int)Math.pow(10,count - j);
//         	}
//             // System.out.println(""+array[0]+array[1]+array[2]);
//         	return sum;
//         }
//     }
// }