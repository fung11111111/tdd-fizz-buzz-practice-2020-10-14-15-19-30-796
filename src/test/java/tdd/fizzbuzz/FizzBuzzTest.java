package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_countOff_given_order_num_1(){
        //give
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String actual = fizzBuzz.countOFF(order);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_Fizz_when_countOff_given_order_num_3(){
        //give
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String actual = fizzBuzz.countOFF(order);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_countOff_given_order_num_5(){
        //give
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String actual = fizzBuzz.countOFF(order);

        //then
        assertEquals("Buzz", actual);
    }




}
