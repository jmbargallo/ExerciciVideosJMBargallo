package videos;

import java.util.Date;

import java.util.Scanner;

import static videos.Video.enterVideo;

public class Main {


    public static void main(String[] args) throws Exception {
        //variable
        boolean moreVideos = true;

        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduir dades usuari");

        System.out.println("Nom? ");
        String name = sc.nextLine();

        System.out.println("Cognom? ");
        String surname = sc.nextLine();

        System.out.println("Contrasenya?? ");
        String pw = sc.nextLine();

        //Get register data
        Date regDate = new Date();



        User user = new User(name, surname, pw, regDate);

        //n videos Input
        while (moreVideos == true){
            System.out.println("vols introduir un video S/N? ");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("S")){
                user.enterVideoToList(enterVideo());
                moreVideos = true;
            } else if (resp.equalsIgnoreCase("N")){
                moreVideos = false;
            } else {
                System.out.println("has de contestar S o N");
            }
        }
        //Show all data
        System.out.println("les dades introduïdes són: " );
        System.out.println( user.toString());
    }
}
