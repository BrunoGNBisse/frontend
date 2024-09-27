// importação dos componentes dos módulos das bibliotecas
import java.awt.FlowLayout; //gerenciador de layout
import java.awt.event.ActionListener; // listener, captura dos eventos
import java.awt.event.ActionEvent; // ação, executa os eventos
import javax.swing.JFrame; // estrutura base de janelas
import javax.swing.JButton; // componente dos botões
import javax.swing.Icon; // estrutura para manipulação das imagens/ícones
import javax.swing.ImageIcon; // gerenciamento das imagens
import javax.swing.JOptionPane; // pop-ups, textos reativos

public class ButtonFrame extends JFrame  //declaração da classe ButtonFrame, herdando o JFrame
{
   private final JButton plainJButton;  //declaração da variável plainJButton do tipo Jbutton, de uso exclusivo da classe (private), apenas leitura
   private final JButton fancyJButton; //

   public ButtonFrame() //declaração do construtor, com o mesmo nome da classe
   {
      super("Testing Buttons"); //definição do titulo da janela
      setLayout(new FlowLayout()); //definição do layout por meio do objeto FlowLayout()

      plainJButton = new JButton("Plain Button"); //atrubuição de caracteristicas à variavel plainJButton, será um objeto JButton e terá um texto
      add(plainJButton); // adiciona à tela

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif")); // declaração variavel bug1, do tipo Icon. Atribuindo à ela um objeto ImageIcon, que coleta a classe no qual ImageIcon está inserido, e invoca o metodo para coleta do recurso, no caso indica o nome do arquivo alvo.
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      fancyJButton = new JButton("Fancy Button", bug1); // //atrubuição de caracteristicas à variavel fancyJButton, será um objeto JButton que terá um texto e uma imagem (no caso a variável bug1)
      fancyJButton.setRolloverIcon(bug2); //atribuição de reatividade ao fancyJButton, por meio do método setRolloverIcon. Ao passar o mouse trocará a imagem pela variável bug2
      add(fancyJButton); // adiciona à tela

      ButtonHandler handler = new ButtonHandler(); //definição da variável 'handler' (manipulador) do tipo ButtonHandler, atribuindo à ela o objeto ButtonHandler()
      fancyJButton.addActionListener(handler); //adiciona um listener ao botão, invocando o método addActionListener
      plainJButton.addActionListener(handler);
   }

   private class ButtonHandler implements ActionListener  //declaração de classe privativa, de uso da classe principal. Definindo o tipo ButtonHandler. Injetados os dados do ActionListener como objeto
   {
      @Override //sobrescrever os métodos de actionPerformed
      public void actionPerformed(ActionEvent event) //declara o método
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format( //JOptionPane irá mostrar uma caixa de dialogo (showMessageDialog), com o s parametros: ButtonFrame.this, objeto pai, causador da ação é o proprio objeto, o proprio botão.
            "You pressed: %s", event.getActionCommand())); //segundo parâmatro é a mensagem exibida na caixa de dialogo, no caso o texto do proprio botão de onde veio o evento (event.getActionCommand())
      }
   } 
}

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
