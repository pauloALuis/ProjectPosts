import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 class Post {

    private Date datePost;
    private String title;
    private String content;
    private int likes =0;
    private List<Comment>  listComments ;//= new List<Comment>();


     public Date getDatePost() {
         return datePost;
     }

     public void setDatePost(Date datePost) {
         this.datePost = datePost;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getContent() {
         return content;
     }

     public void setContent(String content) {
         this.content = content;
     }

     public int getLikes() {
         return likes;
     }

     public void setLikes(int likes) {
         this.likes = likes;
     }

     public List<Comment> getListComments() {
         return listComments;
     }

     public void setListComments(Comment listComments) {
         this.listComments.add(listComments)  ;
     }

     public Post(Date datePost, String title, String content, int likes) {
        this.datePost = datePost;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.listComments = new ArrayList<Comment>();
    }

    public String showPostWithComment(){
        var comment = "";
        for (var item:this.listComments   ) {
            comment += item.getComment ()+"\n";
        }
        return "---------------------------\n" + this.showPost()
                + comment ;
    }

     @Override
     public String toString() {
         return "Posts{" +
                 "datePost=" + this.datePost +
                 ", title='" + this.title + '\'' +
                 ", content='" + this.content + '\'' +
                 ", likes=" + this.likes +
                 '}';
     }

     private String showPost() {
         return "Post: \n "
                 +" Title: " + this.title
                 +" Content: " + this.content
                 +"\n\tLike(s): "+ this.likes + "\tDate: "+ this.datePost + "\n";
     }
 }
