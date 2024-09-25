// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.

// importação do componente JFrame do módulo Swing, proveniente da biblioteca javax
import javax.swing.JFrame;
//declaração da calasse TextFieldTest
public class TextFieldTest
{  
   // declaração do método main
   public static void main(String[] args)
   // Inicio do bloco de codigo do metodo
   { 
      // declaração da variável textFieldFrame, do TIPO TextFieldFrame. Atribuição d novo objeto chamado TextFieldFrame
      TextFieldFrame textFieldFrame = new TextFieldFrame(); 
      // Definição da operação de fechamento padrão, no caso EXIT_ON_CLOSE localizado dentro do JFrame
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Definição do tamanho da janela
      textFieldFrame.setSize(350, 100);
      // Definição da visibilidade 
      textFieldFrame.setVisible(true); 
   } 
   // fim do bloco de codigo do metodo
} // fim da classe

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
