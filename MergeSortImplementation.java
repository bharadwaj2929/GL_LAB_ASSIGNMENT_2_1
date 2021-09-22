package com.greatlearning.currency;
public class MergeSortImplementation{
	public void merge_sort(int notes[], int left, int right){
		if(right>left){
			int mid = (left+right)/2;
			merge_sort(notes, left, mid);
			merge_sort(notes, mid+1, right);
			merge(notes, left, mid, right);
		}
	}	
	private void merge(int notes[], int left, int mid, int right){
		int i=left;
		int k=left;
		int j=mid+1;
		int auxillaryArray[] = new int[right+1];
		while(i<=mid && j<=right){
			if(notes[i] < notes[j]){
				auxillaryArray[k] = notes[j];
				k++;
				j++;
			} 
			else{
				auxillaryArray[k] = notes[i];
				k++;
				i++;
			}
		}
		while(i<=mid){
			auxillaryArray[k] = notes[i];
			k++;
			i++;
		}
		while(j<=right){
			auxillaryArray[k] = notes[j];
			k++;
			j++;
		}
		for(int p=left;p<=right;p++)
			notes[p] = auxillaryArray[p];
	}
}        