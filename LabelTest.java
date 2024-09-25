// Fig. 12.7: LabelTest.java
// Testing LabelFrame.

// importação do componente JFrame do módulo Swing, proveniente da biblioteca javax
import javax.swing.JFrame;


// Declaração da classe LabelTest
public class LabelTest 
// bloco de código da classe LabelTest
{
   // declaração método main
   public static void main(String[] args)
   { 
      // declaração da variável labelFrame, com o mesmo nome do construtor (tipo) LabelFrame 
      LabelFrame labelFrame = new LabelFrame(); 
      //invocação do método .setDefaultCloseOperation (define operação padrão de fechamento) -> argumento: EXIT_ON_CLOSE
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // invocação do método .setSize para definição do tamanho, tamanho 260 por 180
      labelFrame.setSize(260, 180); 
      // invocação do método .setVisible para definição da visibilidade 
      labelFrame.setVisible(true); 
   } // fim do bloco código do método
} // fim do bloco código da classe


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
