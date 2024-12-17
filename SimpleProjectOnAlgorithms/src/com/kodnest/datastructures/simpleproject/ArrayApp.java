package com.kodnest.datastructures.simpleproject;

import java.util.Scanner;

public class ArrayApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Student Details");
	int size=scan.nextInt();
	Array arr=new Array(size);
	while(true) {
		System.out.println("Press------>1 To Insert the Element");
		System.out.println("Press------>2 To Delete the Element");
		System.out.println("Press------>3 To Display the Elements");
		System.out.println("Press------>4 To Search the Element");
		System.out.println("Press------>5 To Sort the Elements");
		System.out.println("Press------>Any Number To Stop");
int choice=scan.nextInt();
switch(choice) {
case 1: System.out.println("Enter Index Followed by Element to Insert");
int index=scan.nextInt();
int  element=scan.nextInt();
arr.insert(index, element);
break;  

case 2: System.out.println("Enter Index To Delete");
int index1=scan.nextInt();
arr.delete(index1);
break;  


case 3: arr.display();
break;  

case 4:System.out.println("Enter Key to Search");
int key=scan.nextInt();
int res=arr.search(key);
if(res>=0) {
	System.out.println("Key Found At "+res);
}
else {
	System.out.println("Key Not Found At "+res);
}
break;  


case 5:arr.sortingSelection();
break;  

default : System.out.println("Bye bye GoodByee Gaya....");
	break;	
	}
}
}
}