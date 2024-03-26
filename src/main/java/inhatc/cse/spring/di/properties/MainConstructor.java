/*
package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainConstructor {
    public static void main(String[] args) {
        String location = "classpath:properties/constructorCTX.xml";

        try (AbstractApplicationContext ctx = new GenericXmlApplicationContext(location)) {
            MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
            System.out.println("키: " + myInfo.getHeight());
            System.out.println("체중: " + myInfo.getWeight());
            myInfo.getBmiCalc().bmiCalc(myInfo.getWeight(), myInfo.getHeight());
        }
    }
}
*/
//입력받아 출력하기
package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MainConstructor {
    public static void main(String[] args) {
        String location = "classpath:properties/constructorCTX.xml";

        try (AbstractApplicationContext ctx = new GenericXmlApplicationContext(location)) {
            MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);

            Scanner scanner = new Scanner(System.in);

            System.out.print("키를 입력하세요(cm): ");
            double height = scanner.nextDouble();

            System.out.print("몸무게를 입력하세요(kg): ");
            double weight = scanner.nextDouble();

            myInfo.setHeight(height);
            myInfo.setWeight(weight);

            BMICalc bmiCalc = myInfo.getBmiCalc();
            bmiCalc.bmiCalc(myInfo.getWeight(), myInfo.getHeight());
        }
    }
}
