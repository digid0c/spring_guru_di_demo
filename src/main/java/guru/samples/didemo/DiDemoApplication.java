package guru.samples.didemo;

import guru.samples.didemo.controller.ConstructorInjectedController;
import guru.samples.didemo.controller.MyController;
import guru.samples.didemo.controller.PropertyInjectedController;
import guru.samples.didemo.controller.SetterInjectedController;
import guru.samples.external.ExternalComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.samples.external", "guru.samples.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.sayHello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

        ExternalComponent externalComponent = context.getBean(ExternalComponent.class);
        externalComponent.sayHello();
    }

}
