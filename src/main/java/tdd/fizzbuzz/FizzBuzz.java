package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final int MODULO_3 = 3;


    public String countOFF(int order) {

        if(order % MODULO_3 == 0){
            return FIZZ;
        }else if(order % 5 ==0){
            return "Buzz";
        }

        return String.valueOf(order);
    }
}
