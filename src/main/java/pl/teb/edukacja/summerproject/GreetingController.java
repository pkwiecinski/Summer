package pl.teb.edukacja.summerproject;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class GreetingController {

    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello")
                                     String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}
