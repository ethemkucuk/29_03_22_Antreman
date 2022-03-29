/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çok_boyutlu_diziler;

import javax.swing.JOptionPane;

/**
 *
 * @author Monster
 */
public class Çok_Boyutlu_diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String KisiBilgisi[][][]=new String [3][2][4];

KisiBilgisi[0][0][0]=JOptionPane.showInputDialog(null,"1.Kişinin Adını Soyadını Giriniz"); KisiBilgisi[0][0][1]=JOptionPane.showInputDialog(null,KisiBilgisi[0][0][0]+" Hangi Şehirde Doğdu ?");
KisiBilgisi[0][0][2]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Semtte Doğdu ?");
KisiBilgisi[0][0][3]=JOptionPane.showInputDialog(null,KisiBilgisi[0][0][0]+"Hangi Hastahanede Doğdu ?");
KisiBilgisi[0][1][0]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Şehirde Yaşıyor ?");
KisiBilgisi[0][1][1]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Semtte Yaşıyor ?");
KisiBilgisi[0][1][2]=JOptionPane.showInputDialog(null, KisiBilgisi[0][0][0]+" Hangi Mahallede Yaşıyor ?");

KisiBilgisi[1][0][0]=JOptionPane.showInputDialog(null, "2.Kişinin Adını Soyadını Giriniz");
KisiBilgisi[1][0][1]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Şehirde Doğdu ?");
KisiBilgisi[1][0][2]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Semtte Doğdu ?");
KisiBilgisi[1][0][3]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Hastahanede Doğdu ?");
KisiBilgisi[1][1][0]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Şehirde Yaşıyor ?");                                         KisiBilgisi[1][1][1]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Semtte Yaşıyor ?");
KisiBilgisi[1][1][2]=JOptionPane.showInputDialog(null, KisiBilgisi[1][0][0]+" Hangi Mahallede Yaşıyor ?");

KisiBilgisi[2][0][0]=JOptionPane.showInputDialog(null, "3.Kişinin Adını Soyadını Giriniz");
KisiBilgisi[2][0][1]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Şehirde Doğdu ?");
KisiBilgisi[2][0][2]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Semtte Doğdu ?");
KisiBilgisi[2][0][3]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Hastahanede Doğdu ?");
KisiBilgisi[2][1][0]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Şehirde Yaşıyor ?");
KisiBilgisi[2][1][1]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Semtte Yaşıyor ?");
KisiBilgisi[2][1][2]=JOptionPane.showInputDialog(null, KisiBilgisi[2][0][0]+" Hangi Mahallede Yaşıyor ?");

       

        JOptionPane.showMessageDialog(null, KisiBilgisi[0][0][0] + "n Doğduğu Yer : "
        + KisiBilgisi[0][0][1] + " / " + KisiBilgisi[0][0][2] + " / " + KisiBilgisi[0][0][3]
        + "n Yaşadığı Yer : " + KisiBilgisi[0][1][0] + " / " + KisiBilgisi[0][1][1] + " / "
        + KisiBilgisi[0][1][2] + "n"  + KisiBilgisi[1][0][0] + "n Doğduğu Yer : "
        + KisiBilgisi[1][0][1] + " / " + KisiBilgisi[1][0][2] + " / " + KisiBilgisi[0][0][3]
        + "n Yaşadığı Yer : " + KisiBilgisi[1][1][0] + " / " + KisiBilgisi[1][1][1] + " / "
        + KisiBilgisi[1][1][2] + "n" + KisiBilgisi[2][0][0]  + "n Doğduğu Yer : "  
        + KisiBilgisi[2][0][1] + " / "+ KisiBilgisi[2][0][2]  + " / " + KisiBilgisi[2][0][3]
        + "n Yaşadığı Yer : " + KisiBilgisi[2][1][0] + " / " + KisiBilgisi[2][1][1]
        + " / " + KisiBilgisi[2][1][2]);

       
    }
        // TODO code application logic here
    }
    

