/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projebp2;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author awada
 */
public class ColorBox extends JPanel{
    private int x,y;
    private Color Renk;
    private boolean Odak;
    private AnaSayfa anasayfa;
    
     public ColorBox(int x, int y, int genislik, int yukseklik, Color Renk,AnaSayfa anasayfa) {
         this.x=x;
         this.y=y;
         this.Renk=Renk;
         this.anasayfa=anasayfa;
         setBounds(x, y,genislik,yukseklik);
         setBackground(Renk);
         setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
         
          addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                for (ColorBox k: anasayfa.boxes) {
                   k.SetOdak(false);   
                }
                SetOdak(true);
            }
     });
     
     }
     
     public Color GetRenk(){
         return Renk;
     }
     public void SetRenk(Color Renk){
         this.Renk=Renk;
     }
     
     public void SetOdak(boolean Odak){
         this.Odak=Odak;
         if(Odak){
             setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
         }
         else{
             setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
         }
     }
     public boolean Odakli(){
         return Odak;
     }
}
