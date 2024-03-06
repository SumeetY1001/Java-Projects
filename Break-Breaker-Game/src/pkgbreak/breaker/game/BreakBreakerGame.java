/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgbreak.breaker.game;

import javax.swing.JFrame;

/**
 *
 * @author Shubham
 */
public class BreakBreakerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        
     
    }
    
}
