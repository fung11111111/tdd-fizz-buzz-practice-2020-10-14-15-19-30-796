package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZWIZZ = "FizzWhizz";
    public static final String BUZZWHIZZ = "BuzzWhizz";
    public static final String FIZZBUZZWIZZ = "FizzBuzzWhizz";
    public static final int MODULO_3 = 3;
    public static final int MODULO_5 = 5;
    public static final int MODULO_7 = 7;


    public String countOFF(int order) {

        if (order % (MODULO_3 * MODULO_5 * MODULO_7) == 0) {
            return FIZZBUZZWIZZ;
        } else if(order % (MODULO_5 * MODULO_7) == 0){
            return BUZZWHIZZ;
        } else if(order % (MODULO_3 * MODULO_7) == 0){
            return FIZZWIZZ;
        }else if(order % (MODULO_3 * MODULO_5) == 0){
            return FIZZBUZZ;
        } else if (order % MODULO_3 == 0) {
            return FIZZ;
        } else if (order % MODULO_5 == 0) {
            return BUZZ;
        } else if (order % MODULO_7 == 0) {
            return WHIZZ;
        }

        return String.valueOf(order);
    }
}
