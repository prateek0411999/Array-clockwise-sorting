import java.util.*;



import java.io.*;

public class clockwiseSorting {
	//static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String args[]) {
		
		int[][] arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
	//	int count=0;
		int top=0;
		int bottom=2;
		int left=0;
		int right=2;
		while((bottom)>=top && (right)>=left) {
			
		for(int j=left;j<=right;j++) {
			arr[top][j]=sc.nextInt();
			
		}
		top++;
		for(int i=top;i<=bottom;i++) {
			arr[i][right]=sc.nextInt();
			
		}
		right--;
		for(int a=right;a>=left;a++) {
			arr[bottom][a]=sc.nextInt();
			
		}
		bottom--;
		for(int s=bottom;s>=right;s++) {
			arr[s][left]=sc.nextInt();
		}
			
		left++;	
			
			
			
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;i<3;j++) {
				System.out.println(arr[i][j]+" ");
				//count=arr[i][j];
//				addThis(count);
//				
			}
			
			
			
		}
		
		
		
		
		
		
	}

//	public  static void addThis(int count) {
//		// TODO Auto-generated method stub
//		
//		al.add(count);
//	}
}
