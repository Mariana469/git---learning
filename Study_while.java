
import java.util.Scanner;
public class Study_while {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean SongOnRepeat = true;
       while (SongOnRepeat) {
        System.out.println("Playing current song?");
        System.out.println("Would you like to play the next song?");
        String Input = input.next();

        if (Input.matches ("yes")) {
            SongOnRepeat = false;
        }

       }
        System.out.println("Playing the next song");
    }
}