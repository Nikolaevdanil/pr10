package pr10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pr10.HarryPotter.HarryPotter;
import pr10.HarryPotter.RonWeesly;
import pr10.HarryPotter.Voldemort;
import pr10.config.BeanConfig;
import pr10.config.Config;
import pr10.interface1.Magican;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context1 =
              new AnnotationConfigApplicationContext(BeanConfig.class);

        Magican mag1 = context1.getBean(Voldemort.class);
        Magican mag2 = context1.getBean(RonWeesly.class);
        Magican mag3 = context1.getBean(HarryPotter.class);

        mag1.doMagic();
        mag2.doMagic();
        mag3.doMagic();

        System.out.println("Победа)");
        System.out.println();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Magican magican1 = context.getBean(Voldemort.class);
        Magican magican2 = context.getBean(RonWeesly.class);
        Magican magican3 = context.getBean(HarryPotter.class);

        magican1.doMagic();
        magican2.doMagic();
        magican3.doMagic();
        System.out.println("Поражение(");

    }
}