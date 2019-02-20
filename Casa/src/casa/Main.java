/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        House mansion = new House();
        mansion.setOwner(JOptionPane.showInputDialog("Insira o dono: "));
        mansion.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Insira o numero: ")));
        mansion.setOccupation(Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de ocupantes: ")));
        System.out.println("Dono:"+mansion.getOwner());
        System.out.println("Numero:"+mansion.getNumber());
        System.out.println("Quantidade de Moradores: "+mansion.getOccupation());
    }
    
}
