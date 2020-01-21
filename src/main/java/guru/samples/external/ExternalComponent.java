package guru.samples.external;

import org.springframework.stereotype.Component;

@Component
public class ExternalComponent {

    public void sayHello() {
        System.out.print("This component is not included into Spring Boot application default component scan ");
        System.out.println("as it locates outside of application default package.");
    }
}
