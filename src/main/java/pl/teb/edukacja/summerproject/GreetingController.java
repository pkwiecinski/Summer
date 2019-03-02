package pl.teb.edukacja.summerproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller

public class GreetingController {

    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
}
