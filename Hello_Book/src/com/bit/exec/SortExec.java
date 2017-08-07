package com.bit.exec;

public class SortExec {

	public static void main(String[] args) {

		int[] array = new int[] { 2,3,2,1,5,7,9,7,6,5,4,2,2 };
		System.out.println("정렬전");
		for( int i : array) {
			System.out.println(i);
		}
		
		for(int i = 0 ; i < array.length; i ++) {
			for(int j = i ; j < array.length;j++) {
				if(array[i] > array[j]) {
					// array[i] 와 array[j] 자리 바꿈
					int temp = array[i] ;
					array[i] = array[j] ;
					array[j] = temp ;
				}
			}
		}
		System.out.println("정렬후");
		for(int i : array) {
			System.out.println(i);
		}
		
	}

}











