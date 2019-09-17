package videos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {

    //Variabale declaration
    private String name;
    private String surname;
    private String pw;
    private Date regDate;
    private List<Video> videos = new ArrayList<>();

    //constructor
    public User() throws Exception {
        name = "";
        surname = "";
        pw = pw;
        Date regDate = new Date();
        List<Video> videos = new ArrayList<>();
    }


    public User(String name, String surname, String pw, Date regDate) throws Exception {

        checkInput(name);
        checkInput(surname);
        checkInput(pw);

        this.name = name;
        this.surname = surname;
        this.pw = pw;
        this.regDate = new Date();

    }


    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    //Checking data
    public void checkInput(String info) throws Exception {
        if (info == null) {
            throw new Exception("S'han d'omplir tots els camps.");
        }
        if (info.equals("")) {
            throw new Exception("S'han d'omplir tots els camps.");
        }
    }

    public void enterVideoToList(Video video) {
        videos.add(video);
        setVideos(videos);
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "Nom='" + name + '\'' +
                ", Cognom'" + surname + '\'' +
                ", Contrasenya='" + pw + '\'' +
                ", Data de registre" + regDate +
                ", Videos=" + videos +
                '}';
    }
}

