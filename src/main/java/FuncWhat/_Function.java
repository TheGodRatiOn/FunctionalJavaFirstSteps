package FuncWhat;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args){
        //EGGXample

        int increment = increment(6);
        //System.out.println(increment);

        System.out.println(incrementByOne.apply(increment));

       //incrementByOne.

        int multiply = mutimplyByFive.apply(increment);
        System.out.println(multiply);

        Function<Integer, Integer> add1mulp5 = incrementByOne.andThen(mutimplyByFive);

        System.out.println(add1mulp5.apply(increment));

        //BeeFunc

        System.out.println(incAndMult(4, 12));

        System.out.println(incrementByOneAndMutimplyByFive.apply(4, 12));

    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;

    static Function<Integer, Integer> mutimplyByFive = number -> number * 5;

    static int increment(int number){
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMutimplyByFive =
            (numbToInc, numbToMupt) -> (numbToInc + 1) * numbToMupt;

    static int incAndMult(int number1, int number2){
        return (number1 + 1) * number2;
    }
}