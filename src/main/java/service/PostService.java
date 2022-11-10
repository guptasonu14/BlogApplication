package service;

import model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
        public PostService() {
                System.out.println("*** PostService ***");
        }

    public ArrayList<Post> getAllPosts(){


            ArrayList<Post> posts = new ArrayList<>();

            Post post1 = new Post();
            post1.setTitle("Post 1");
            post1.setBody("Post Body 1");
            post1.setDate(new Date());

            Post post2 = new Post();
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

            return posts;
        }

    }


/*
PostService takes care of all the CRUD operations related to posts, such as
retrieving all posts through the getAllPosts() method.
CRUD (Create, Read, Update, Delete)
* */

/*
*  @service to inform the Spring Boot framework
that the PostService class is a service in the  blog application.
* */