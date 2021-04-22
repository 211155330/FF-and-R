/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastforward.and.rewind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Khaya_Malusi
 */
public class FXMLDocumentController implements Initializable {

    /**
     *
     * @param event
     */
    public void rewind(ActionEvent event);{
        mediaPlayer.setRate(0.5);
   }  
    public void fastforward(ActionEvent event);{
        mediaPlayer.setRate(2);
        
   }     
        
    public void skip10(ActionEvent event);
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(Duration.seconds(10)));
        
        
      public void back10(ActionEvent event);
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(Duration.seconds(-10)));
        
        
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
