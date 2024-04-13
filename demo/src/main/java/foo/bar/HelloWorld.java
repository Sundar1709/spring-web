package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public String getHelloWorld(){
        return "Hello There !";
    }
}
