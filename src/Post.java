import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Post.
 */
class Post {

    private Date datePost;
    private String title;
    private String content;
    private int likes =0;
    private List<Comment>  listComments ;


    /**
     * Gets date post.
     *
     * @return the date post
     */
    public Date getDatePost() {
         return datePost;
     }

    /**
     * Sets date post.
     *
     * @param datePost the date post
     */
    public void setDatePost(Date datePost) {
         this.datePost = datePost;
     }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
         return title;
     }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
         this.title = title;
     }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
         return content;
     }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
         this.content = content;
     }

    /**
     * Gets likes.
     *
     * @return the likes
     */
    public int getLikes() {
         return likes;
     }

    /**
     * Sets likes.
     *
     * @param likes the likes
     */
    public void setLikes(int likes) {
         this.likes = likes;
     }

    /**
     * Gets list comments.
     *
     * @return the list comments
     */
    public List<Comment> getListComments() {
         return listComments;
     }

    /**
     * Sets list comments.
     *
     * @param listComments the list comments
     */
    public void setListComments(Comment listComments) {
         this.listComments.add(listComments)  ;
     }

    /**
     * Instantiates a new Post.
     *
     * @param datePost the date post
     * @param title    the title
     * @param content  the content
     * @param likes    the likes
     */
    public Post(Date datePost, String title, String content, int likes) {
        this.datePost = datePost;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.listComments = new ArrayList<Comment>();
    }

    /**
     * Show post with comment string. And
     *    show all comments association in Post
     * @return the string
     */
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
