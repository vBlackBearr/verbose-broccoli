/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lenguajee;

import Analizador.Gramatica;
import Analizador.GramaticaTokenManager;
import Analizador.ParseException;
import Analizador.SimpleCharStream;
import Analizador.Token;
import Analizador.TokenMgrError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author serch
 */
public class LenguajeE {

    private static File archivoPrueba;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*archivoPrueba = new File("D:\\Escuela\\OneDrive - Instituto Tecnológico de Toluca\\Lenguajes y automatas 2\\prueba.txt");
        try {
            GramaticaTokenManager lexicManager = new GramaticaTokenManager(new SimpleCharStream(new FileReader(archivoPrueba)));
            while (lexicManager.getNextToken().kind != GramaticaTokenManager.EOF) {

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }*/

        try {
            Gramatica parser = new Gramatica(new BufferedReader(new FileReader("D:\\Escuela\\OneDrive - Instituto Tecnológico de Toluca\\Lenguajes y automatas 2\\prueba.txt")));
            parser.Inicio();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(LenguajeE.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }
}
