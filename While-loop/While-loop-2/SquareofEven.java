class SquareOfEven {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while (i <= 100) {

            sum +=i*i;
            i+=2;
        }

        System.out.println("\nSum of squares from 1 to 100 = " + sum);
    }
}
