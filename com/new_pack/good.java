package com.new_pack;

public class good {
public static void main(String[] args) {
	int arr[]= {10,15,20,20};
	frequency(arr);
}

private static void frequency(int arr[]) {
	boolean b[]= new boolean[arr.length];
	int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(!b[i])
			{
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
			{
				count++;
				b[j]=true;
			}
			
		}
			System.out.println(arr[i]+"="+count);

}

}}
}