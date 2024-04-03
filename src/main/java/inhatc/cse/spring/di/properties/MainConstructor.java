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

import inhatc.cse.spring.di.java_config.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MainConstructor {
    public static void main(String[] args) {
        String location = "classpath:properties/constructorCTX.xml";

        try (AbstractApplicationContext ctx = new GenericXmlApplicationContext(location)) {
            MyInfo myInfo1 = ctx.getBean("myInfo1", MyInfo.class);

            System.out.println(myInfo1.getName());
            System.out.println(myInfo1.getHobbys());
            BMICalc bmiCalc = myInfo1.getBmiCalc();
            bmiCalc.bmiCalc(myInfo1.getWeight(), myInfo1.getHeight());
            myInfo1.getHobbys().stream().sorted().forEach(System.out::println);


        }
    }
}
