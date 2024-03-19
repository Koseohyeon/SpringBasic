package inhatc.cse.spring.di.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appCTX.xml");

        // Person 객체 가져오기
        Person person = (Person) context.getBean("person");

        // 정보 출력
        System.out.println("이름: " + person.getFirstname() + " " + person.getLastname());
        System.out.println("나이: " + person.getAge());
        System.out.println("주소: " + person.getAddress().getCity() + " " );
    }
}
