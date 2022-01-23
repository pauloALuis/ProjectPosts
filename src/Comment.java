import java.util.Date;

/**
 * The type Comment.
 */
public class Comment {

    private Date dateComment = new Date();

    private String textComment = "";
    private int likesComment =0;

    /**
     * Instantiates a new Comment.
     *
     * @param dateComment  the date comment
     * @param textComment  the text comment
     * @param likesComment the likes comment
     */
    public Comment(Date dateComment, String textComment, int likesComment) {
        this.dateComment = dateComment;
        this.textComment = textComment;
        this.likesComment = likesComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "dateComment=" + dateComment +
                ", textComment='" + textComment + '\'' +
                ", likesComment=" + likesComment +
                '}';
    }

    /**
     * Gets date comment.
     *
     * @return the date comment
     */
    public Date getDateComment() {
        return dateComment;
    }

    /**
     * Sets date comment.
     *
     * @param dateComment the date comment
     */
    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    /**
     * Gets text comment.
     *
     * @return the text comment
     */
    public String getTextComment() {
        return textComment;
    }

    /**
     * Sets text comment.
     *
     * @param textComment the text comment
     */
    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    /**
     * Gets likes comment.
     *
     * @return the likes comment
     */
    public int getLikesComment() {
        return likesComment;
    }

    /**
     * Sets likes comment.
     *
     * @param likesComment the likes comment
     */
    public void setLikesComment(int likesComment) {
        this.likesComment = likesComment;
    }


    /**
     * Get comment string.
     *
     * @return the string
     */
    public String getComment (){
        return  "Comment:" + this.textComment
            +"\n\t Date: " +this.dateComment
            +"\t Like(s): " +  this.likesComment;
    }
}
