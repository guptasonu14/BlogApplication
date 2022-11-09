package Controller;
/*
The controller method, which is used to get all the posts, is supposed to do the following:

Fetch all the blog posts available in the technical blog web application.
Store the list of posts as a Spring Model object.
Return the Spring Model object.*/

import model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    // HomeController class is mapped to ‘/’, which represents the homepage of the web application.
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2= new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);


        model.addAttribute("posts",posts);

        return "index";

    }
}
