package top.linjingc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("top.linjingc.dao") //Mybaitis 扫描包
@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching //开启缓存
@EnableTransactionManagement // 开启事务管理
@ServletComponentScan //扫描包Bean
@EnableRedisHttpSession   //开启spring session支持
/**
 * jar包写法
 */
public class PizzaApplication {

public static void main(String[] args) {
    SpringApplication.run(PizzaApplication.class, args);
}
}

/**
 * war包写法
 */
//public class PizzaApplication extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(PizzaApplication.class);
//	}
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(PizzaApplication.class, args);
//	}
//}