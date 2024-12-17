package com.kodnest.datastructures.simpleproject;

public class Array {
private int arr[];
int length=0;

public  Array(int size) {
	arr=new int[size];
	length=size;
	System.out.println("Array Size "+size+" is created");
}

public void insert(int index,int element) {
	if(index>=0 && index<=arr.length-1) {
		arr[index]=element;
		System.out.println("Element "+element+" inserted at the index "+index);
	}
	else {
		System.out.println("Enter the index range 0 to "+(arr.length-1));
	}
}


public void delete(int index) {
	if(index>=0 && index<=arr.length-1) {
		System.out.println("Element deleted at the index "+ arr[index]);
		arr[index]=0;
	}
	else {
		System.out.println("Enter the index range 0 to "+(arr.length-1));

	}
}


public void display() {
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
}



public int search(int key) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			return mid;
		}
		else if(key>arr[mid]) {
			low=mid+1;
			high=high;
		}
		else {
			high=mid-1;
			low=low;
		}

	}
	return high;

}


public void sortingSelection() {
	
	int min=0;
	int pos=0;
	for(int i=0;i<=arr.length-1;i++) {
		min=arr[i];
		pos=i;
		for(int j=0;j<=arr.length-1;j++) {
			if(arr[j]>min) {
				min=arr[j];
				pos=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
	}
	
}


}
