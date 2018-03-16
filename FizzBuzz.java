/**
 * CLASSIC FIZZBUZZ GAME.
 * Print Fizz for the multiples of 3.
 * Print Buzz for the multiples of 5.
 * The limit goes till 100.
 * 
 * In this GAME, the limit can be anything as well as 
 * the multiples, so we can easily use command line arguments.
 * 
 * @author MUHAMMAD ANAS GAUBA
 * 
 */
public class FizzBuzz {
    /**
     * The upper limit is 100 but the user can press any number.
     * bound is created to help better use command line
     * and is converting string into int. Same goes with
     * the multiples.
     * 
     * @param args using arguments on command prompt.
     */

    public static void main(String[] args) {

        int bound = Integer.parseInt(args[0]);
        int mult1 = Integer.parseInt(args[1]);
        int mult2 = Integer.parseInt(args[2]);
        
        for (int i = 1; i <= bound; i++) {
            if (i % mult1 == 0 && i % mult2 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % mult1 == 0) {
                System.out.println("Fizz");
            }
            else if (i % mult2 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
