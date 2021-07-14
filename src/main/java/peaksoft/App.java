package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println("Comparing objects equality with bean1 and bean2");
        System.out.println(bean1==bean2);
        System.out.println("Comparing hashcodes of bean1 and bean2");
        System.out.println("bean1 hashcode->" + bean1.hashCode());
        System.out.println("bean2 hashcode->" + bean2.hashCode());


        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Comapring objects equality with cat1 and cat2");
        System.out.println(cat1==cat2);
        System.out.println("Comparing hashcodes of cat1 and cat2");
        System.out.println("cat1 hashcode->" + cat1.hashCode());
        System.out.println("cat2 hashcode->" + cat2.hashCode());

    }
}
