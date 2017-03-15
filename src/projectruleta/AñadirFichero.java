/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectruleta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ricky_000
 */
public class AñadirFichero {

    PrintWriter f;
    FileWriter añadir;

    public void engadirTexto(String nomFich, String dato) {
        try {
            f = new PrintWriter(new FileWriter(nomFich, true));
            f.println(dato);
        } catch (IOException ex) {
            System.out.println("erro 2" + ex.getMessage());
        } finally {
            f.close();
        }
    }
}
