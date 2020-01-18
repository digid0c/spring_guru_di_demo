package guru.samples.didemo.service;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello gurus!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
