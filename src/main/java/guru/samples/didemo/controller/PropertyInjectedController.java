package guru.samples.didemo.controller;

import guru.samples.didemo.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
