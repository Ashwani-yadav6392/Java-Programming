public class LetterPrint {
    
       public static void printPattern() {
        char letter = 'A';                 
       for (int row = 0; row < 5; row++) {
            for (int space = 0; space < row; space++)                  { 
                System.out.print("  ");
            }
            
      int lettersInRow = 5 - row;
       for (int col = 0; col < lettersInRow; col++) {
                System.out.print(letter + " ");
                letter++;
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printPattern();
    }
}
