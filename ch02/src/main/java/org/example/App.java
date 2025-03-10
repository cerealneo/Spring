package org.example;

import org.example.config.AppConfig;
import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.example.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 날짜 : 2025/03/10
 * 이름 : 이민성
 * 내용 : ch02. Spring IoC/DI 실습하기
 *
 * @Configuration
 *  - 애플리케이션을 구성하는 빈(객체)을 스프링 컨테이너에 등록하기 위한 설정 클래스 어노테이션
 *  - XML, 설정파일 대신 Java 클래스를 사용해 스프링 컨테이너 설정
 *
 * @Bean
 *  - 컨테이너에 등록하기 위한 빈 설정 어노테이션
 *  - 사용자 정의 클래스, 외부 라이브러리 빈 등록 어노테이션
 *
 * @ComponentScan
 *  - basePackages로 시작하는 패키지내의 빈을 스캔해서 컨테이너에 등록시키는 어노테이션
 *  - 스캔 대상 컴포넌트는 @Component(@Service, @Repository) 어노테이션 선언해야됨
 *
 * @Component
 *  - 스캐닝으로 컨테이너에 등록할 대상 컴포넌트 설정
 *  - @Controller, @Service, @Repository로 파생
 *
 * @Autowired
 *  - 컨테이너에 등록되어 있는 빈을 주입하는 어노테이션
 *  - 이름 또는 클래스 타입으로 매칭된 빈을 주입
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

        //////////////////////////////////////////////////////////////
        // IoC/DI 기법을 이용한 객체 실습
        Computer computer = (Computer) context.getBean("com");
        computer.show();



    }
}
