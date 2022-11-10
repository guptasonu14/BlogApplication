package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Post;
import service.PostService;
import java.util.ArrayList;


@Controller
public class HomeController {

    public HomeController(){
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService;

    // HomeController class is mapped to ‘/’, which represents the homepage of the web application.
    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts",posts);

        return "index";

    }
}
/*
The controller method, which is used to get all the posts, is supposed to do the following:

Fetch all the blog posts available in the technical blog web application.
Store the list of posts as a Spring Model object.
Return the Spring Model object.*/
/*
HomeController is now responsible only for processing the user request and returning
 the required view name and model. It uses the PostService class to
 get the required data to respond to the client request.
**/