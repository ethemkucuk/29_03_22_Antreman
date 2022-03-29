/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tek_boyutlu_diziler;

import javax.swing.JOptionPane;

/**
 *
 * @author Monster
 */
public class Tek_Boyutlu_Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Bilgisayar[] = new String[4];
        
        Bilgisayar[0] = JOptionPane.showInputDialog("İşlemciniz");
        Bilgisayar[1] = JOptionPane.showInputDialog("Ekran Kartınız");
        Bilgisayar[2] = JOptionPane.showInputDialog("Raminiz");
        Bilgisayar[3] = JOptionPane.showInputDialog("Anakartınız");
        
        JOptionPane.showMessageDialog(null, " PC'nizin Özellikleri"+ " : n " + Bilgisayar[0] + " n " 
        + Bilgisayar[1] + " n " + Bilgisayar[2] + " n " + Bilgisayar[3]);

        
        
        // TODO code application logic here
    }
    
}
