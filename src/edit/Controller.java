package edit;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.Home_Controller;
import main.Main;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Controller {
    @FXML
    Button button;
    private final Properties info = System.getProperties();
    private final String user = info.getProperty("user.name");
    private static Button history;
    private static boolean current = false;
    public void load() throws IOException {
        focus();
        Home_Controller load = (Home_Controller) Main.getLoader();
        load.loadNote(button, new ResearchNote().ResearchNote("/Users/"+user+"/.Note/" + button.getText() + "/Note.txt"));
        nofocus();
    }

    public void onMouseEntered (){
        if (current==false) {
            button.setId("onMouseEntered");
        }
    }

    public void  focus (){
        current = true;
        button.setId("Focus");
    }

    public void nofocus (){
        if (history != button && history!=null) {
            history.setId("NoFocus");
            current = false;
        }
        history = button;
    }

    public void onMouseExited() {
        if (current==false){
            button.setId("NoFocus");
        }
    }
}
