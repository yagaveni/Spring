package com.Spring.Expert.JavaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl=new BinarySearchImpl(new QuickSort());
		int result=binarySearchImpl.BinarySearch(new int[] {10,30},  20);
		System.out.println(result);
		//SpringApplication.run(JavaSpringApplication.class, args);
	}

}
