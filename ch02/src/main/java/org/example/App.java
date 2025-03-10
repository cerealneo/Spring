package org.example;

import org.example.config.AppConfig;
import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 날짜 : 2025/03/10
 * 이름 : 이민성
 * 내용 : ch02. Spring IoC/DI 실습하기
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 기존 객체 생성 방식
        Hello hello = new Hello();
        Welcome welcome = new Welcome();
        Greeting greeting = new Greeting();

        hello.show();
        welcome.show();
        greeting.show();

        //////////////////////////////////////////////////////////////
        //스프링 컨테이너 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello helloBeen = context.getBean(Hello.class);
        helloBeen.show();

        Welcome welcomeBeen = (Welcome)context.getBean("welcome");
        welcomeBeen.show();

        Greeting greetingBeen = (Greeting) context.getBean("ggg");
        greetingBeen.show();



    }
}
