package com.pages;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class LotsOfPagesMain {
   private static final String[] LABELS = { "One", "Two", "Three", "Four",
         "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
         "Thirteen", "Fourteen", "Fifteen" };
   private static final Dimension LABEL_SIZE = new Dimension(400, 300);

   private static void createAndShowGui() {
      LotsOfPagesPanel lotsOfPages = new LotsOfPagesPanel();
      Random random = new Random();

      // I'm using JLabels as a simple substitute for your complex JPanel GUI "pages"
      for (String labelText : LABELS) {
         JLabel label = new JLabel(labelText, SwingConstants.CENTER);
         label.setPreferredSize(LABEL_SIZE);
         label.setOpaque(true);
         label.setBackground(new Color(random.nextInt(170) + 85, random
               .nextInt(170) + 85, random.nextInt(170) + 85));
         lotsOfPages.registerPage(label, labelText);
      }

      JFrame frame = new JFrame("LotsOfPages");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(lotsOfPages);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}