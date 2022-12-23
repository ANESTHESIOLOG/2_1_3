import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(beanCat1.getMessage());

        Cat beanCat2 = (Cat) applicationContext.getBean("catBean");
        System.out.println(beanCat2.getMessage());

        System.out.println("Bean singleton: " + (bean == bean2));
        System.out.println("Bean prototype: " + (beanCat1 == beanCat2));
    }
}