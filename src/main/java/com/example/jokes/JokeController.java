package com.example.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class JokeController {

    /*
    po  adresie  url:
    localhost:8080 /przechodzi do metody generateJoke()
    ModelMap słuzy do przekazywania ddanych z kontrollera do widoku HTML
    jesli pirzemy map.put ( "nam" "Michał")
    to  w HTML bedzie  widoczna zmiennia  name, ktore wartosc  bedzie  Michał
     */
    @GetMapping("/")
    public String  generateJoke(ModelMap map){
        ChuckNorrisQuotes chuckNorrisQuotes= new ChuckNorrisQuotes();
        map.put("quote",chuckNorrisQuotes.getRandomQuote());

        return "jokes";
        //przejdz do pliku:
        // resources/templates/joke.html
    }
}
