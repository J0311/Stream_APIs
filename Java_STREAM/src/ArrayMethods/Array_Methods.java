package ArrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_Methods {
	
	public static void main(String[] args) {
	
	// Converting String array into ArrayList
	
	String [] food = {"bacon", "eggs", "pancakes"};
	
	List<String> foodList = Arrays.asList(food);
	
	for (String s : foodList) {
		System.out.println(s + " ");
	}
	
	System.out.println();
	
	// Converting int array into ArrayList
	
	int [] num = {2,4,6,8};
	
	List<Integer> numList = new ArrayList<>();
	
	for (int i : num) {
		numList.add(i);
	}
	
	System.out.println(numList);
	
	// Converting int array into ArrayList via Stream APIs
	
	int [] num1 = {9,4,3,8,5,7};
	
	List<Integer> listNum = new ArrayList<>();
	listNum = Arrays.stream(num1).boxed().collect(Collectors.toList());
	
	System.out.println(listNum);
	
	System.out.println();
	
	// How to fill array with certain value
	
	int [] newArr = new int[4]; // initializes capacity
	
	Arrays.fill(newArr, 20); // 2 args: arrayName, value to fill array with
	
	
	for (Integer i : newArr) {
		
		// fills array with value of 20 in all 4 indices:
		
		System.out.println(i + " ");
	}
		
		System.out.println();
		
		// Copying of array to duplicate existing array
		
		/*** 
		 * int [] arr1 = new int[5];
		 * int [] arr2 = arr1;
		 * 
		 * This is BAD practive, because any changes 
		 * made to arr1 effects arr2, and vice versa
		 * Instead, make an acual copy with "copyOf" method:
		 */
		
		int [] arr1 = new int[6];
		//arr1 = {1,2,3,5,6};
		
		// Pass 2 args: array you wish to copy from, 
		// and RANGE. If you wish to copy ENTIRE array, 
		// arrayName.length: 
		
		int [] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		for (int a : arr2) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		// Check EQUALITY of arrays with .equals
		// returns BOOLEAN value of whether arrays are
		// equal or not:
		
		String [] words1 = {"my", "name", "is", "joseph"};
		String [] words2 = {"my", "name", "is", "joseph"};
		
		System.out.println(Arrays.equals(words1, words2));
		
		System.out.println();
		
		// COMPARE method compares 2 arrays Lexographically:
		
		// Lexicographical order is nothing but the dictionary order or 
		// preferably the order in which words appear in the dictonary. 
		// For example, let's take three strings, "short", "shorthand" and 
		// "small". In the dictionary, "short" comes before "shorthand" and 
		// "shorthand" comes before "small". This is lexicographical order.

		Arrays.compare(words1, words2);
		
		// if both have same # of elements and ALL elements are equal
		// returns value of 0
		// if words1 is "lexographically FIRST",it returns a negative number
		// if 2nd array (words2) is "lexographically first", returns a postive 
		// number.
		
		// if you set this method equal to a variable and print it, will print
		// out the numeric DIFFERENCE between the TWO ARRAYS
		// e.g.:
		// int diff = Arrays.compare(words1, words2);
		// sysout(diff);
		
		System.out.println();
		
		// SORT method:
		// for PRIMITIVE DATA TYPES.
		// Use comparator for Objects
		
		Arrays.sort(num1); // ascending order
		for (Integer i : num1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// BINARY search: looks for trgt within array indices
		// Array must be sorted FIRST
		
		System.out.println(Arrays.binarySearch(num1, 7));
		// returns index 3
		
		System.out.println();
		
		/***
		 * OTHER STREAM APIS
		 */
		
		// SUM of all elements in an array
		// take your integer array...turn it into an integer STREAM
		// Store that integer stream into a variable: 
		
		int [] numbers = {1,2,3,4,5,5,6,7,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		IntStream is = Arrays.stream(numbers);
		
		// now, you can manipulate your integer stream using "is":
		
		// here, we use Stream API to print sum of array elements:
		System.out.println(is.sum());
		
		System.out.println();
		
		// Sum of elements between given indices
		// sum of 5th index to 10th index
		// Here, we create a "NEW STREAM" that represents
		// index 5 - 10 of numbers array:
		// first index(5)is INCLUSIVE
		// last index (10) is EXCLUSIVE and will NOT be included
		
		// @parem: arrayName, start index, end index:
		IntStream is2 = Arrays.stream(numbers,5,10);
		
		System.out.println(is2.sum());
		
		System.out.println();
		
		// Count of DISTINCT element between given indices
		// e.g. index 5 - 10 has two elements of value 7
		
		IntStream is3 = Arrays.stream(numbers, 5,10);
		int distinctNumberSum = is3.distinct().sum();
		
		// this will take only distinct elements and return sum
		System.out.println(distinctNumberSum);
		
		System.out.printlin();
		
		// COUNT distinct elements between indices:
		
		IntStream is4 = Arrays.stream(numbers, 5,10);

		System.out.println(is4.distinct().count());
		
		// Print DISTINCT elements between given indices
		
	}
	
	}
