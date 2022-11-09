package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // HomeController class is mapped to ‘/’, which represents the homepage of the web application.
    @RequestMapping("/")
    public String getAllPosts(){

    }
}
