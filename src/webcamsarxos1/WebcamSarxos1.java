/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcamsarxos1;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author necati
 */
public class WebcamSarxos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Webcam w = Webcam.getDefault();
        
        w.addWebcamListener(new WebcamListener() {
            @Override
            public void webcamOpen(WebcamEvent we) {
                System.out.println("Webcam ist offen!");
            }

            @Override
            public void webcamClosed(WebcamEvent we) {
                System.out.println("Webcam ist geschlossen!");
            }

            @Override
            public void webcamDisposed(WebcamEvent we) {
                System.out.println("Webcam ist geneigt!");
            }

            @Override
            public void webcamImageObtained(WebcamEvent we) {
                System.out.println("Bild ist erhalten!");
            }
        });
        
//        for(Dimension supportedSize: w.getViewSizes())
//        {
//            System.out.println(supportedSize.toString());
//        }
        
        //w.setViewSize(new Dimension(640, 480)); 
        w.setViewSize(WebcamResolution.VGA.getSize()); 
        
        w.open(); 
        ImageIO.write(w.getImage(), "PNG", new File("BildNetbeansCam.png"));
        w.close();
    }
    
}
