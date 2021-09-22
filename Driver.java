package com.greatlearning.currency;

import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Currency Notes:");
		int size = sc.nextInt();
		int notes[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Currency Notes Values:");
			notes[i] = sc.nextInt();
		}
		MergeSortImplementation msi = new MergeSortImplementation();
		msi.merge_sort(notes,0,size-1);
		System.out.println("Enter The Amount You Want To Pay:");
		int amount = sc.nextInt();
		Notes n = new Notes();
		n.number_of_notes(notes, amount);
		sc.close();
	}
}