/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class LeerProperties {
    private Properties property;
    
    public LeerProperties(){
        FileInputStream input;
        property = new Properties();
        try {
            input = new FileInputStream("config/rutas.properties");
            property.load(input);
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Properties getProperty() {
        return property;
    }
}
