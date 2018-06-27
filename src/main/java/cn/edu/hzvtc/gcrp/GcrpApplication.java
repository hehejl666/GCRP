package cn.edu.hzvtc.gcrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/***
 * 程序入口
 * @author tao
 */
@SpringBootApplication
@EnableTransactionManagement
public class GcrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcrpApplication.class, args);
    }
}
