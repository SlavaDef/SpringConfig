package homeworkAl.com;

import java.util.ArrayList;
import java.util.List;

public class RadioPlayer {

 private List<Radio> janre;

public RadioPlayer (List<Radio> janre) {
    this.janre = janre;

}

public void playSong() {
    double a = Math.random()*3;
    System.out.println("Now is playing: " + janre.get((int)a).getSong());
}



}
