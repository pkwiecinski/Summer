package pl.teb.edukacja.summerproject;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class GreetingController {

    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello")
                                     String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}
