package org.example.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    @GetMapping(value ="/hello")
    public String sayHello() {
        return "hello_world";//return view hello_world.html from views
    }
}
