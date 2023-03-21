package misc;

public class main_misc {

	public static void main(String[] args) {
		//
    int[]v = {3,2,4,1,5};
    int []l = l_perm(v,3);
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
		for(int i = 0;i < b;i++) {
			//
			int m = max(v,i);
			swap(v,m,i);
		}
		return v;
	}
	
   
	
}
