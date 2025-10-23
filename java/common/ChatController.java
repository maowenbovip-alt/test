package common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @GetMapping("/hello")
    public String chat(){
        return "hello world";
    }
}
