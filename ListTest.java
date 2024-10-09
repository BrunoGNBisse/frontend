
import javax.swing.*; //importação dos pacotes

public class ListTest //declaração classe poblica ListTest
{
   public static void main(String[] args)//declaração do método main, estático de retorno nulo. Definição dos arguementos por meio de uma matriz de string.
   { 
      ListFrame listFrame = new ListFrame(); // declaração da variavael listFrame, do tipo ListFrame, que recebe um novo objeto list frame
      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // definição do método de fechamento padrão
      listFrame.setSize(350, 150);  // definição do tamanho da tela
      listFrame.setVisible(true);  // definição da visibiledade
   } 
} 