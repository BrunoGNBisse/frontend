
import javax.swing.*; //importação das bibliotecas

public class MultipleSelectionTest //definição da classe pública MultipleSelectionTest
{
   public static void main(String[] args) //definilção do método main
   { 
      MultipleSelectionFrame multipleSelectionFrame = // definição da variavel multipleSelectionFrame, do tipo MultipleSelectionFrame 
         new MultipleSelectionFrame(); 
      multipleSelectionFrame.setDefaultCloseOperation( //definição do metodo de fechamento padrão
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(1200, 350); //definição do tamanho da janela
      multipleSelectionFrame.setVisible(true); //definição da visibilidade
   } 
}