// Importação do scomponentes dos módulos da bibliotecas 
import java.awt.FlowLayout; //gerenciador de layout
import java.awt.Font; // gerenciamento das fontes
import java.awt.event.ItemListener;  // listener, captura dos eventos
import java.awt.event.ItemEvent; // 
import javax.swing.JFrame; // estrutura base de janelas
import javax.swing.JTextField; //estrutura do campo de texto
import javax.swing.JCheckBox; //estrutura dos checkbox
import java.awt.font.*;
import java.util.*;

public class CheckBoxFrame extends JFrame //declaração da classe checkbox frame, herdadndo o JFrame
{
   //declaração de variáveis privadas, de uso exclusivo da classe, disponíveis apenas para leitura
   private final JTextField textField; //campo de texto
   private final JCheckBox boldJCheckBox; // checkbox de negrito
   private final JCheckBox italicJCheckBox;  //checkbox de italico
   private final JCheckBox underlineJCheckbox;

   //declaração do construtor
   public CheckBoxFrame()
   {
      super("JCheckBox Test"); //definição do titulo da janela
      setLayout(new FlowLayout()); //definção do layout da tela

      
      textField = new JTextField("Watch the font style change", 20); // atribuição dos de caracteríticas para a variável textField, será um objeto do tipo JTextField, receberá um texto inicial e uma largura pré-determinada
      textField.setFont(new Font("Serif", Font.PLAIN, 14)); //textField invocará o método setFont para atribuir caracteríticas à formatação do texto (fonte, tipo e tamanho)
      add(textField); //adiciona à tela

      boldJCheckBox = new JCheckBox("Bold"); //atribuição de característica para a variável boldJCheckbox, que receberá um objeto do tipo JCheckBox, com um texto 
      italicJCheckBox = new JCheckBox("Italic"); //atribuição de característica para a variável italicJCheckbox, que receberá um objeto do tipo JCheckBox, com um texto 
      underlineJCheckbox = new JCheckBox("Underline");
      add(boldJCheckBox); //adiciona à tela
      add(italicJCheckBox); //adiciona à tela
      add(underlineJCheckbox);

      CheckBoxHandler handler = new CheckBoxHandler(); //definição da variável 'handler' (manipulador) do tipo CheckBoxHandler, atribuindo à ela o objeto CheckBoxHandler()
      boldJCheckBox.addItemListener(handler); //adiciona um listener a cada um dos checkbox por por meio do metodo addItemListener
      italicJCheckBox.addItemListener(handler);
      underlineJCheckbox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener  // definição da subclasse privada CheckBoxHandler, injetando nela o ItemListener. Se torna classe poliorfica. É um objeto e ao mesmo tempo uma classe.
   {
      @Override //sobrescreve
      public void itemStateChanged(ItemEvent event) //implementação de metodo para verificar se houve mudança no estado do item
      {
         Font font = null; //definição da variavel Font, do tipo font, inicialmente é nula


         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) // se os dois checkbox estiverem selecionados
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); //recebe um novo objeto do tipo fonte serifada, itálica e em negrito com tamanho  14
         else if (boldJCheckBox.isSelected()) // se apenas o checbox bold estver selecionado
            font = new Font("Serif", Font.BOLD, 14); //recebe um novo objeto do tipo fonte serifada, em negrito com tamanho  14
         else if (italicJCheckBox.isSelected()) // se apenas o checbox itálico estver selecionado
            font = new Font("Serif", Font.ITALIC, 14); //recebe um novo objeto do tipo fonte serifada, em itálico com tamanho  14       
         else //caso contrário
         font = new Font("Serif", Font.PLAIN, 14); //recebe um novo objeto do tipo fonte apenas serifada e com tamanho  14

         textField.setFont(font); //muda a fonte do textField para o definido na variável deste método.
         
         if (underlineJCheckbox.isSelected()){
            font = textField.getFont();
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textField.setFont(font.deriveFont(attributes));
            font = new Font(attributes);
         }
         
      } 
   }
} // end class CheckBoxFrame

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
