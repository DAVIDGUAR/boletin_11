/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_11;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Cronometro {
    
    

    public void lerTexto() {

        long inicioTiempo = System.currentTimeMillis();
        
        Scanner ler = new Scanner(System.in); //lo utilizo para que no salte la pantalla e inicie el tiempo directamente.
        
        System.out.println("tecle un numero para iniciar prueba");
        
        int inicio=ler.nextInt();   //lo utilizo para que no salte la pantalla e inicie el tiempo directamente.
        
        JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : \n"
                + "   A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
        long finalTiempo = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Preme enter para rematar");
        JOptionPane.showMessageDialog(null, "Tardaches " + (finalTiempo - inicioTiempo) / 1000 + " seg en escribir a frase.");
    }

    
    }

    

