package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration//这是一个配置Spring的配置类
@SpringBootApplication//@SpringBootApplication：Spring Boot项目的核心注解，主要目的是开启自动配置。
//@SpringBootApplication(exclude={RedisAutoConfiguration.class})//这里后面表示不需要自动加载redis
public class HelloApplication {
   public static void main(String[] args) {
	   System.out.println("11");
      //启动spring boot应用
      SpringApplication.run(HelloApplication.class,args);
   }

}