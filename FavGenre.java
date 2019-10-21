import java.util.Scanner;
public class FavGenre {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numYes;
        int numNo;
        String[] questions = new String[7];
        questions[1] = ("Do you like heavy guitar riffs? (y/n)");
        questions[2] = ("Do you like light guitar riffs? (y/n)");
        questions[3] = ("Do you like fast riffs? (y/n)");
        questions[4] = ("Do you like calming riffs? (y/n)");
        questions[5] = ("Do lyrics play a big part in a song? (y/n)");
        questions[0] = ("Are you from the South? (y/n)");
        questions[6] = ("Are you born in or before the early 90's?");
        String[] respon = new String[7];

        System.out.println("Welcome! We will figure out your favorite genre of rock from:");
        System.out.println("Classical, Punk, Country, Alternative, Grunge, or Progressive ");
        System.out.println();
        System.out.println("Press any key to continue");
        scan.nextLine();

        for (int i = 0; i < respon.length; i++) {
            System.out.println(questions[i]);
            respon[i] = scan.nextLine();
        }
            if (respon[0].equals("y") && respon[2].equals(respon[0]) && respon[2].equals(respon[4])) {
                System.out.println("Country Rock is your favorite genre");
            } else if (respon[6].equals("y") && respon[1].equals(respon[6])) {
                System.out.println("Classical Rock is your favorite genre");
            } else if (respon[6].equals("y") && respon[1].equals(respon[3])) {
                System.out.println("Grunge is your favorite genre");
            } else if (respon[6].equals("n") && respon[3].equals("y") && respon[3].equals(respon[5])) {
                System.out.println("Punk Rock is your favorite genre");
            } else if (respon[6].equals("n") && respon[2].equals("y") && respon[2].equals(respon[5])) {
                System.out.println("Alternative Rock is your favorite genre");
            } else if (respon[1].equals("y") && respon[3].equals("y") && respon[1].equals(respon[2])
                    && respon[3].equals(respon[4])) {
                System.out.println("Progressive Rock is your favorite genre");
            } else {
                System.out.println("Could not resolve favorite genre, try again");
            }
    }
}
