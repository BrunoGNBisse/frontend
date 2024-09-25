// importação de componentes, seguindo ordem hieráquica componente, modulo, biblioteca e pacote
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

// Definição da classe  TextFieldFrame, herdando o JFrame importado do Jframe
public class TextFieldFrame extends JFrame 
{
   // declaração das variáveis textfield1, 2 e 3. Privadas (exclisivas da classe), sendo final (apenas leitura) e sendo do tipo JTextField

   private final JTextField textField1; 
   private final JTextField textField2; 
   private final JTextField textField3;
   // realiza o mesmo mas com a variável passwordField, que será do tipo JPasswordField 
   private final JPasswordField passwordField;

   // definição do construtor TextFielFrame
   public TextFieldFrame()
   {
      // Definição do título da janela
      super("Testing JTextField and JPasswordField");
      // Definição da organização do layout
      setLayout(new FlowLayout());

      // atruibuição de característica ao textField1, no caso o novo objeto JTextField com largura de 10 colunas
      textField1 = new JTextField(10); 
      add(textField1); // adiciona textField1 ao JFrame

      //  atruibuição de característica ao textField2, no caso um novo objeto JTextField com placeholder.
      textField2 = new JTextField("Enter text here");
      add(textField2); // adiciona textField2 ao JFrame

      // atruibuição de característica ao textField2, no caso um novo objeto JTextField com placeholder e largura de 21 colunas
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // define o campo como não editável pelo metodo setEditable
      add(textField3); // adiciona textField3 ao JFrame

      // atruibuição de característica ao passwordField, no caso um novo objeto JPasswordField
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // adiciona passwordField ao JFrame

      //  registro dos manipuladores dos eventos
      // variavel handler recebe o construtor TextFieldHandler()
      TextFieldHandler handler = new TextFieldHandler();
      // adiciona um listener (escutador) das ações para cada campo adicionado anteriormente. Todos usam o mesmo método, sendo o handler o proprio handler
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } 

   // injeta o ActionListener como objeto dentro da classe TextFieldHandler, como se fosse um novo ActionListener.
   private class TextFieldHandler implements ActionListener 
   {
      // sobrescreva, sem alertas (marcado com @)
      @Override
      //no caso sobrescrever o conteúdo de ActionListener com metodo actionPerformed, do tipo publica e sem retorno.
      public void actionPerformed(ActionEvent event)
      {
         // definição da variavel string do tipo String, "" -> texto vazio
         String string = ""; 
         // definição de condicional:
         // Compara pelo sinal ==, se a origem do evento (event.getSource()) for o textField1, então a variavel string recebe o um texto formatado.
         // %s define que será uma string, proveniente de  event.getActionCommand()
         if (event.getSource() == textField1)
            string = String.format("textField1: %s",
               event.getActionCommand());

         // Segue realizando as verificações para os todos as outras possibilidades de entrada de ação, retornando um um output para cada.
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());


         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

     
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // chama uma caixa de dialogo pelo metodo showMessageDialog, no caso sem componente pai (null), e com o texto da variável string
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame

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
