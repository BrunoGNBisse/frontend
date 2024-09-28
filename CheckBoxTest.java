
import javax.swing.JFrame; // importação dos componentes dos módulos das bibliotecas

public class CheckBoxTest //declaração da classe CheckboxTest
{
   public static void main(String[] args) //declaração do método main (executor)
   { 
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame();   // declaração da variável checkbox Frame, do tipo CheckBoxFrame atribuindoà ela um novo objeto CheckBoxFrame().
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // definição da operação de fechamento padrão -> EXIT_ON_CLOSE
      checkBoxFrame.setSize(275, 100);  // definição do tamnaho da janela
      checkBoxFrame.setVisible(true); // definição da visibilidade
   } 
} // fim da classe ButtonTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/