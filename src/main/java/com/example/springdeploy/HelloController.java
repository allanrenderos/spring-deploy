package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.varexample}")
    String message;

    @GetMapping("/hola")
    public String Holamundo(){
        System.out.println(message);
        return "Hola Mundo, que tal como vas, mucho gusto";
    }

    //@GetMapping("/bootstrap")
    /*public String bootstrap(){
        return """
                
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                  </head>
                  <body>
                    <h1>Hola Mundo!</h1>
                  </body>
                </html>
                
                """;
    }*/
}
