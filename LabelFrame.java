
// importação dos pacotes

import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

// definição da classe LabelFrame herdando conteudo do componente JFrame
public class LabelFrame extends JFrame 
//inicio do bloco de codigo da classe
{
   //declaração das variáveis label1, 2 e 3. 
   // valor privado, conteúdo disponível apenas para uso interno da própria classe
   // final -> somente leitura
   //JLabel -> tipo da variável
   private final JLabel label1; 
   private final JLabel label2; 
   private final JLabel label3; 

   
   // construtor: não pode ser privado, é dinamico (não pode ser static), não pode ser void nem 
   // tem o mesmo nome da classe, que tem o mesmo nome do arquivo
   public LabelFrame()
   { 
      //método para definição do título da janela ->super
      super("Testing JLabel");
      //definição do desenho do quadro como FlowLayout -> seguindo o fluxo
      setLayout(new FlowLayout()); 

      // atribuição do objeto JLabel à variável `label1`, e adicionar uma string nele
      label1 = new JLabel("Label with text");
      // invoca um método para adicionar uma dica que recebe um texto
      label1.setToolTipText("This is label1");
      // injetar conteúdo indicado anteriormente ao label1
      add(label1);

      //declação deuma variavel tipo Icon, será um ImageIcon. Pega um recurso da classe com o nome "bug1.pgn"
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      // atribuição da variável label 2, adiciona uma string, trás o objeto bug e na sequencia utiliza o SwingConstants.LEFT para alinhar o último elemento (bug) 
      //vírgula é usada para separação de parametros
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);
      // invoca um método para adicionar uma dica que recebe um texto
      label2.setToolTipText("This is label2");
      // injetar conteúdo indicado anteriormente ao label2
      add(label2); 

      // Definição da variavel label 3, como senod um objeto JLabel
      label3 = new JLabel(); 
      // definição do texto do objeto
      label3.setText("Label with icon and text at bottom");
      // definição do icone, reutilzado o bug da variavel anterior
      label3.setIcon(bug); 
      // definição da posição horizontal do texto
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      // definição da posição vertical do texto
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      // invoca um método para adicionar uma dica que recebe um texto
      label3.setToolTipText("This is label3");
      // injetar conteúdo indicado anteriormente ao label3
      add(label3); 
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
