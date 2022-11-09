package model;

import java.util.Date;

public class Post {
/*Title: This variable is used to store the title of the post.
Body: This variable is used to store the content of the post.
Date (of creation): This variable is used to store the date on which the blog post was created.*/
    private String title;
    private String body;
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
