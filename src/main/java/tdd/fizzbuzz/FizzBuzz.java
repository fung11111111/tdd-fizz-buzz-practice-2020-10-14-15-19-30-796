package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final int MODULO_3 = 3;

    public String countOFF(int order) {

        if(order % MODULO_3 == 0){
            return FIZZ;
        }

        return String.valueOf(order);
    }
}
