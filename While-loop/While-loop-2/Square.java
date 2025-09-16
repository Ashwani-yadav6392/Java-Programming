class Square {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        System.out.println("Squares of numbers from 1 to 100:");

        while (i <= 100) {
            int square = i * i;
            System.out.println(i + " ^ 2 = " + square);
            sum += square;
            i++;
        }

        System.out.println("\nSum of squares from 1 to 100 = " + sum);
    }
}
