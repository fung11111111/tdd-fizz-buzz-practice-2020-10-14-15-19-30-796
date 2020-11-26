package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String Whizz = "Whizz";
    public static final int MODULO_3 = 3;
    public static final int MODULO_5 = 5;
    public static final int MODULO_7 = 7;


    public String countOFF(int order) {

        if(order % MODULO_3 == 0){
            return FIZZ;
        }else if(order % MODULO_5 == 0){
            return BUZZ;
        }else if(order % MODULO_7 == 0){
            return Whizz;
        }

        return String.valueOf(order);
    }
}
