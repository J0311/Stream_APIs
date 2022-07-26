package numbers;

/*
 * Demonstrating numeric manipulation with forEach method
 */

import java.util.ArrayList;
import java.util.List;

class Numbers {
	
  public static void main(String[] args) {
	  
    // create an ArrayList
	  
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("ArrayList: " + numbers);
    System.out.println();
    System.out.print("Updated ArrayList: ");

    // multiply each element by 10
    // using the lambda expression:
    
    numbers.forEach((e) -> {
      e = e * 10;
      System.out.println(e + " ");
    });
    
    // New Integer ArrayList which takes the square root of it's elements

    ArrayList<Integer> squareNumbers = new ArrayList<>();
    
    squareNumbers.add(2);
    squareNumbers.add(3);
    squareNumbers.add(4);
    squareNumbers.add(6);
    
    System.out.println("Current ArrayList: " + squareNumbers);
    System.out.println();
    System.out.println("Squared ArrayList");
    
    squareNumbers.forEach((r) ->{
    	r = r * r;
    	System.out.println(r);
    });
    };

  }

