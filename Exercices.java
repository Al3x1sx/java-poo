
import service.*;
import poo.*;


public class Exercices {

    public static TestService testService = new TestService();
    public static void main(String[] args)
            throws Exception {

//        testService.readTextFile();
//        testService.printReverse(args[0]);
//        testService.printPyramid(args[0]);
//        testService.counter();
//        testService.checkNumberIsEven();
//        testService.findRandomNumber();
//        testService.countWordInSentence();
//        testService.generateTextFile();
//        testService.readTextFile();

        Square square = new Square(4,9);

        System.out.println(square.areaCalculation());
    }


}