package co.develhope.democlean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/V1")
@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String HelloWorld() {
        return "HelloWorld";
    }
    @GetMapping ("/Ciao")
    public String ciao (@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao come è il tempo in provincia " + nome + " provincia ";
    }
}

