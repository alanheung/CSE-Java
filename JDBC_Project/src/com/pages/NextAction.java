package com.pages;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class NextAction extends AbstractAction {
   private LotsOfPagesPanel lotsOfPages;

   public NextAction(LotsOfPagesPanel lotsOfPages, String name, Integer keyCode) {
      super(name);
      this.lotsOfPages = lotsOfPages;
      putValue(MNEMONIC_KEY, keyCode);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      lotsOfPages.nextPage();
   }
}