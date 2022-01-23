import java.util.Date;

public class Comment {

    private Date dateComment = new Date();

    private String textComment = "";
    private int likesComment =0;

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

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public int getLikesComment() {
        return likesComment;
    }

    public void setLikesComment(int likesComment) {
        this.likesComment = likesComment;
    }


    public String getComment (){
        return  "Comment:" + this.textComment
            +"\n\t Date: " +this.dateComment
            +"\t Like(s): " +  this.likesComment;
    }
}
