package bddGestionArtiste;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;
import java.sql.*;
import java.util.Properties;


public class Application {
    private static Connection connect = null;


    public static Connection ouvrirConnectionBDD() {
        String pilote = null;
        String url = null;
        String utilisateur = null;
        String motDePasse = null;

        Properties property = new Properties();

        try{

            FileInputStream fis = new FileInputStream("fichierConfig.properties");
            property.load(fis);

            //pilote = property.getProperty("pilote");
            pilote = "oracle.jdbc.driver.OracleDriver" ;
            //url = property.getProperty("url");
            url = "jdbc:oracle:thin:@localhost:1521/xe" ;
            //utilisateur = property.getProperty("utilisateur");
            utilisateur = "SYS" ;
            //motDePasse = property.getProperty("motDePasse");
            motDePasse = "mernol56" ;

            // Load the driver
            Class.forName (pilote);

            // Connect to database
            System.out.println("Connecting to Database URL = " + url);
            connect = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println ("Connected ... Now  creating a statement");


        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Problème avec le pilote, la connection ne peut être créée.", "ERREUR",
                    JOptionPane.WARNING_MESSAGE);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null,
                    "Le fichier de configuration est introuvable, la connection ne peut être créée.", "ERREUR",
                    JOptionPane.WARNING_MESSAGE);
        } catch (SQLSyntaxErrorException sqlsee) {
            JOptionPane.showMessageDialog(null, "Erreur de connection, accès non autorisé pour cet utilisateur.",
                    "ERREUR", JOptionPane.WARNING_MESSAGE);
            sqlsee.printStackTrace();
        } catch (SecurityException se) {
            JOptionPane.showMessageDialog(null, "Erreur de connection, l'url est incorrecte.", "ERREUR",
                    JOptionPane.WARNING_MESSAGE);
            se.printStackTrace();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erreur de connection, l'accès requiert un mot de passe.", "ERREUR",
                    JOptionPane.WARNING_MESSAGE);
            sqle.printStackTrace();
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Problème avec le Driver, la connection ne peut être créée.", "ERREUR",
                    JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problème de connection.", "ERREUR", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
        return connect;
    }



    public static void main(String[] args) throws IOException, SQLException {
        int rep = -1;

        if (ouvrirConnectionBDD() != null) {

        }

    }
}