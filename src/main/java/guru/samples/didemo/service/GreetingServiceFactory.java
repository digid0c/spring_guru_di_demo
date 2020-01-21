package guru.samples.didemo.service;

import guru.samples.didemo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String language) {
        switch (language) {
            case "es": return new PrimarySpanishGreetingService(greetingRepository);
            case "de": return new PrimaryGermanGreetingService(greetingRepository);
            default: return new PrimaryGreetingService(greetingRepository);
        }
    }
}
