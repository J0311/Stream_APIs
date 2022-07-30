/***
 * Juxtaposes normal function with Function interface, Function<T,R></T,R>
 */


package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function takes 1 arg and produces 1 result

        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // multiplying by 10

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        // Chaining increment and mulitiply functions together
        // we use ".andThen" to chain methods, save into a variable
        Function<Integer, Integer> addBy1AndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1AndMultiplyBy10.apply(4));

        // BiFunction takes 2 args and produces 1 result

        System.out.println(incrementByOneAndMultiply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    // This function will take a number, then increment it
    // by 1

    static int incrementByOne(int number){
        return number + 1;
    }

    // bi-function to increment by 1 and multiply by:
    BiFunction<Integer, Integer, Integer>incrementByOneAndMultiplyBiFunction =
            // Because this takes TWO args, must wrap in parentheses
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    // normal method to increment by 1 and multiply by
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
