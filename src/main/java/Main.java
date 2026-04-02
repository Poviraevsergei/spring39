import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1. Создаем IoC Container - ApplicationContext(Spring interface)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-settings.xml");

        //2. создать объект и положить в контейнер. По просьбе вернуть объект.
        //applicationContext.getBean(User.class);
        User lizaFromContainer = applicationContext.getBean("romaBean", User.class);

        System.out.println(lizaFromContainer.id);
        System.out.println(lizaFromContainer.name);
    }
}
