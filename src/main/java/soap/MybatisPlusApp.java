package soap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ZhangPY on 2020/4/2
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@SpringBootApplication
@MapperScan(value = "soap.mapper")
public class MybatisPlusApp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApp.class , args);
    }
}
