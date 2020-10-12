/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcamsarxos1;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

/**
 *
 * @author necati
 */
public class Webcam_Panel {
    
    public static void main (String [] args)
    {
    Webcam webcam = Webcam.getDefault();
    webcam.setViewSize(WebcamResolution.VGA.getSize()); 
    
    WebcamPanel webcampanel = new WebcamPanel(webcam);
    webcampanel.setImageSizeDisplayed(true);
    webcampanel.setFPSDisplayed(true);
    webcampanel.setMirrored(true);
    webcampanel.setDisplayDebugInfo(true);
    
    JFrame frame1 = new JFrame();
    frame1.add(webcampanel);
    frame1.setLocationRelativeTo(null);
    frame1.pack();
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame1.setVisible(true); 
    
    }
    
}
