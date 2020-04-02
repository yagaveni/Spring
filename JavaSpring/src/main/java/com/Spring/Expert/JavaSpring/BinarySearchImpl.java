package com.Spring.Expert.JavaSpring;

public class BinarySearchImpl {
	Sorting sorting;
	public BinarySearchImpl() {
		
	}
	public BinarySearchImpl(Sorting sorting) {
		this.sorting=sorting;
	}
	//BubbleSort bubbleSort=new BubbleSort();
	public int BinarySearch(int [] num, int searchnum) {
		
		
		int[] result=sorting.sort(num);
		System.out.println(sorting);
		return 3;
	}

}
