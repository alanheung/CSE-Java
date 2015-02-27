package com.pages;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class PrevAction extends AbstractAction {
   private LotsOfPagesPanel lotsOfPages;

   public PrevAction(LotsOfPagesPanel lotsOfPages, String name, Integer keyCode) {
      super(name);
      this.lotsOfPages = lotsOfPages;
      putValue(MNEMONIC_KEY, keyCode);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      lotsOfPages.previousPage();
   }
}