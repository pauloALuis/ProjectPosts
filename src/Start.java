import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Create Post and comments  ");

        System.out.println("------------Post -------------");
        System.out.println("Moment: (21/06/2022 13:15:00)");
        String moment = scanner.nextLine();
        System.out.println("Title : (Traveling to Angola)");
        String title = scanner.nextLine();

        System.out.println("Content : (Im going to visit this wonderful country!)");
        String content = scanner.nextLine();

        System.out.println("Like : (1)");
        int like = Integer.parseInt(scanner.nextLine());

        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(moment);

        //create Post
        Post post = new Post(date1, title, content, like );

        System.out.println("How many post you want to insert?");

        int numberPost = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < numberPost; i++)
        {

            System.out.print("Comment #{"+ i + 1 +"} :");
            String comment =   scanner.nextLine();

            System.out.print("Date #{"+ i + 1 +"}: (21/06/2022 13:15:00)");
            Date dateComment   =new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());

            System.out.print("Like comment #{"+ i + 1 +"}: (1)");
            numberPost = Integer.parseInt(scanner.nextLine());
            //create comments
            Comment comments = new Comment(dateComment, comment,  numberPost);

            post.setListComments (comments);

        }

        System.out.println("\n\n --------------Show Post---------------------------------------");
        System.out.println("" + post);

        System.out.println("\n Show Comment");
        //post.ShowListComments();
        System.out.println("" + post.showPostWithComment());
        System.out.println("---------------------------------------");






    }
    }
