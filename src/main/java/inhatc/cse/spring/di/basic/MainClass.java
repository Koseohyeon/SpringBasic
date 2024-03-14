package inhatc.cse.spring.di.basic;

import inhatc.cse.spring.di.xml.Calculator;
import inhatc.cse.spring.di.xml.MyCalculator;

public class MainClass {
    public static void main(String[] args){
        inhatc.cse.spring.di.xml.MyCalculator myCalculator=new MyCalculator();
        myCalculator.setCalculator(new Calculator());
        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(2);

        myCalculator.add();
        myCalculator.div();
        myCalculator.sub();
        myCalculator.mul();

    }

}
