import javax.swing.JFrame; //importação das bibliotecas

public class RadioButtonTest  // PUBLIC - declaração de exportação || CLASS - classe
{
   public static void main(String[] args) // declaração do método main, estático, de retorno nulo. Recebe parâmetros (args) do tipo string, num array
   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); //declaração da variavel radioButtonFrame, do tipo RadioButtonFrame (declarada no outro arquivo), vai receber um objeto RadioButtonFrame().
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //invocação de metodo para definição do padrão de fechamento. (JFrame.EXIT_ON_CLOSE)
      radioButtonFrame.setSize(300, 300); //invocação de metodo para definição do tamanho da janela
      radioButtonFrame.setVisible(true); // invicação de metodo para definição de visibilidade
   } 
} 
