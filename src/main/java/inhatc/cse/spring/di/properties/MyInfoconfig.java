package inhatc.cse.spring.di.properties;

import inhatc.cse.spring.di.java_config.Student;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

public class MyInfoconfig {
    @Bean
    MyInfo myInfo1 (){
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("축구");
        hobbys.add("야구");
        hobbys.add("농구");
        //hobbys.stream().forEach(System.out::println);
        MyInfo myInfo=new MyInfo("홍길동",hobbys);
        myInfo.setHeight(183.4);
        myInfo.setWeight(72.3);
        return myInfo ;
    }
}
