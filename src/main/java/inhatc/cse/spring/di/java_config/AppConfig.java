package inhatc.cse.spring.di.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Student student1(){
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("축구");
        hobbys.add("야구");
        hobbys.add("농구");

        hobbys.stream().forEach(System.out::println);

        Student student = new Student("홍길동",20,hobbys);
        student.setHeight(183.4);
        student.setWeight(72.3);

        return student;
    }

    @Bean
    public Student student2(){
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("독서");
        hobbys.add("시  감상");

        Student s = new Student("홍아빠", 50, hobbys);
        s.setWeight(85.4);
        s.setHeight(167.9);

        return s;
    }
}
