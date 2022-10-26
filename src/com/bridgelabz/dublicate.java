package com.bridgelabz;

public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr=new int[] {1,2,3,3,4,5,6,2,8,8};
		System.out.println("Dublicate element in array:");
		
		for (int i=0; i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
