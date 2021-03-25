/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esp32.downloader;

import java.io.IOException;

/**
 *
 * @author fahrul
 */
public class ESP32Downloader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        App app = new App();
        app.setTitle("ESP32 Downloader");
        app.setVisible(true);
        
    }
    
}
