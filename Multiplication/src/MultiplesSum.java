public class MultiplesSum {
    public static void multiples(int limit1) {
        int sum = 0;

        for (int i = 3; i < limit1; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("sum" + limit1 + " is: " + sum);
    }

    public static void main(String[] args) {

        multiples(10);
    }
}

