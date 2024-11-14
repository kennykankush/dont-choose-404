package workshop01.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Day1Controller {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/results")
    public String nextPage(@RequestParam("4041") Integer number_) {
        if (number_ == 404){
            return "404";
        } else {
            return "Congratulations";
        }
    }
}


