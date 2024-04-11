package inhatc.cse.spring.di.java_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {

    @Value(value = "${admin.id}")
    private String adminId;

    @Value(value = "${admin.pw}")
    private String adminPw;

    @Value(value="${sub.id")
    private String subId;

    @Value(value = "${sub.pw}")
    private String subPw;

    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new Resource[2];
        resources[0] = new ClassPathResource("ch08/admin.properties");
        resources[1] = new ClassPathResource("ch08/admin.properties");
        configurer.setLocations(resources);


        return configurer;
    }

    @Bean
    public AdminConnect adminConfig(){
        AdminConnect adminConnect = new AdminConnect();
        adminConnect.setAdminId(adminId);
        adminConnect.setAdminPw(adminPw);
        adminConnect.setSubId(subId);
        adminConnect.setSubPw(subPw);

        return adminConnect;

    }



}
