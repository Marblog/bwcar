package cn.marblog.bwcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import rx.Observable;


@SpringBootApplication
@MapperScan(basePackages = "cn.marblog.bwcar.dao")
@ServletComponentScan(basePackages = "cn.marblog.bwcar.config")
public class BwcarApplication {


    public static void main(String[] args) {
        SpringApplication.run(BwcarApplication.class, args);
        hello("SpringBoot");
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(s -> System.out.println("Hello " + s + "!"));
    }


}
