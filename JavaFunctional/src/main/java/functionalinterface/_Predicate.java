package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // Java boolean method for phone validation check:

        System.out.println("Without predicate:");
        System.out.println();
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));

        System.out.println();

        // Predicate phone validation

        System.out.println("With predicate:");
        System.out.println();
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println();
        System.out.println(
        isPhoneNumberValidPredicate.and(containsNumber3).test("07000000030"));
    }

    // Normal Java boolean function:
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // Predicate Functional Interface funtion:
    static Predicate<String>isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String>containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

