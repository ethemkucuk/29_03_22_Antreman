/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tek_boyutlu_diziler_2;

import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author Monster
 */
public class Tek_Boyutlu_Diziler_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String ArabaMarkalari[]=new String[15];
          Random rnd = new Random();
          int a = rnd.nextInt();

        ArabaMarkalari[0]=" BMW ";
        ArabaMarkalari[1]=" MERCEDES ";
        ArabaMarkalari[2]=" TOFAŞ ";
        ArabaMarkalari[3]=" FİAT ";
        ArabaMarkalari[4]=" FERRARİ ";
        ArabaMarkalari[5]=" RENAULT ";
        ArabaMarkalari[6]=" FORD ";
        ArabaMarkalari[7]=" SKODA ";
        ArabaMarkalari[8]=" PORSCHE ";
        ArabaMarkalari[9]=" BUGATTİ ";
        ArabaMarkalari[10]=" SAAB ";
        ArabaMarkalari[11]=" OPEL ";
        ArabaMarkalari[12]=" HONDA ";
        ArabaMarkalari[13]=" HYUNDAİ ";
        ArabaMarkalari[14]=" DODGE " ;

        JOptionPane.showMessageDialog(null,"Random Araba Markası" + ArabaMarkalari.length[a].toString() + "n");
        // TODO code application logic here
        
        // Yanlış YAPTIM !!!
    }
    
}
