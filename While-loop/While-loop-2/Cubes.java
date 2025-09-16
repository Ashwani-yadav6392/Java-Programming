class Cubes {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            int cube = i * i*i;
            System.out.println(i + " ^ 2 = " + cube);
            sum += cube;
            i++;
        }

        System.out.println("\nSum of cubes from 1 to 100 = " + sum);
    }
}
