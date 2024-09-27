package app;

public class HomeTask4 {

    static int productNumb = 1;
    static int dayCount = 0;
    static String productType;
    static double profitOfDays;
    static double totalAmount = 0;
    static String currency = "EUR";

    public static void main(String[] args) {
    //* sales of smartphones
        productType = "smartphone";

        double samsungS4Price = 2383.5;
        double samsungS5Price = 2064.74;
        double samsungS6Price = 1004.9545;
        double iPhone1Price = 3049.4564;
        double iPhone2Price = 3650.7591;

        dayCount = 5;
        totalAmount = samsungS4Price + samsungS5Price + samsungS6Price + iPhone1Price + iPhone2Price;
        profitOfDays = totalAmount / dayCount;

        System.out.printf(
            """
            Product No %d: %s,
            total sales for %d days is %s %.2f,
            sales by day is %s %.2f.
            """,
            productNumb++, productType,
            dayCount, currency, totalAmount,
            currency, profitOfDays
        );

    //* sales of laptop
        productType = "laptop";

        double dell435 = 103.331;
        double dell893 = 940.534;
        double lenovo1 = 249.423;
        double lenovo2 = 1495.905;
        double mac2 = 1365.372;
        double mac4 = 1696.285;
        double samsung56 = 1905.905;
        double samsung43 = 2730.095;

        dayCount = 7;
        totalAmount = dell435 + dell893 + lenovo1 + lenovo2 + mac2 + mac4 + samsung56 + samsung43;
        profitOfDays = totalAmount / dayCount;

        System.out.printf(
            """
            Product No %d: %s,
            total sales for %d days is %s %.2f,
            sales by day is %s %.2f.
            """,
            productNumb++, productType,
            dayCount, currency, totalAmount,
            currency, profitOfDays
        );

    }
}

