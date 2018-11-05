package cn.tx.ann_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoaderTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ParentConfig.class);
        Car toyo = (Car) context.getBean(Toyo.class);
        toyo.print();
        System.out.println("-----------------");
    }
}
