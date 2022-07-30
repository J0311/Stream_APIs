package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getDBConnectionURLSupplierList.get());
    }

    static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    // Supplier Functional Interface returns any kind of value you want
    static Supplier<String> getDBConnectionURLSupplier = ()
            -> "jdbc://localhost:5432/users";

    // You can even make your Supplier return a list
    // Now we're returning a list with 2 urls.
    static Supplier<List<String>> getDBConnectionURLSupplierList = ()
            -> List.of("jdbc://localhost:5432/users",
                        "jdbc://localhost:5432/users");

}
