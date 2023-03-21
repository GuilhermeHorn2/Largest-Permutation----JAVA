package misc;

public class main_misc {

	public static void main(String[] args) {
		//
    //int[]v = {3,2,4,1,5};
	int []v = {4,3,1,2};
    int []l = l_perm(v,1);
    for(int i = 0;i < l.length;i++){
    	System.out.print(l[i]);
    }


	
		

	}
	//The idea here is to find the maximum of the substring of v starting from 0 to b-1
	//so that i can swap with the place that holds the best decimal value 10*(n-i-1)
	public static int max(int[]v,int i) {
		//find the index of the max value of the subarray v,starting from index i
		int k = i;
		for(int j = i;j < v.length;j++){
			if(v[j] >= v[k]) {
				k = j;
			}
		}
		return k;
	}
	public static void swap(int []v,int i,int j) {
		//
		int d = v[i];
		v[i] = v[j];
		v[j] = d;
	}
	public static int[] l_perm(int[]v,int b){
		//
		int c = 0;
		for(int i = 0;i < v.length;i++) {
			//
			if(c == b) {
				break;
			}
			int m = max(v,i);
			if(m == i) {
				//m is on the spot that it should be so we dont count that as a swap
				continue;
			}
			swap(v,m,i);
			c++;
		}
		return v;
	}
	
   
	
}
