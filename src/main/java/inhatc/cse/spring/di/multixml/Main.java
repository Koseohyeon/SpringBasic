package inhatc.cse.spring.di.multixml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String location = "classpath:multi_xml/appCTX.xml";

        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
        StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
        System.out.println(studentInfo.getStudent().getName());

    }
}
