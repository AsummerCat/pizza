package top.linjingc.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/springboot")
    public String Hello() {
        return "Hello SpringBoot!";
    }
}