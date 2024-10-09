
import java.awt.*;
// import java.awt.FlowLayout;
// import java.awt.Color;
import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JList;
// import javax.swing.JScrollPane;
// import javax.swing.ListSelectionModel;

import javax.swing.event.*;
// import javax.swing.event.ListSelectionListener;
// import javax.swing.event.ListSelectionEvent;


public class ListFrame extends JFrame //definição da classe ListFrame, pública, herdando conteudo do pacote JFrame;
{
   private final JList<String> colorJList;  //definição da variavel privada coloJList, do tipo JList recebendo dados do tipo string 
   private static final String[] colorNames = {"Black", "Blue", "Cyan", //definição da variavel privada colorNames, que recebe um array de Strings.
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"};
   private static final Color[] colors = {Color.BLACK, Color.BLUE,//definição da variavel privada colors, que irá receber um array com os objetos das cores, as cores em si.
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};

   private final JList<String> tamanhoJList;
   private static final String[] tamanhoNames = {"Pequeno", "Medio", "Grande"};

   public ListFrame() //definição do construção ListFrame()
   {
      super("List Test"); //definição do titulo da janela   
      setLayout(new FlowLayout()); // ordem de renderização dos elementos

      colorJList = new JList<String>(colorNames); //definição da variavel colorJList, que receberá um novo objeto Jlist, no caso será do tipo string, trará os dados de colorNames
      colorJList.setVisibleRowCount(5); //definição do tamanho de itens exibidos      
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //definção do modo de seleção.

      tamanhoJList = new JList<String>(tamanhoNames);
      tamanhoJList.setVisibleRowCount(3);      
      tamanhoJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


      add(new JScrollPane(colorJList)); //adiciona um novo objeto JScrollPane, que receberá o colorJList

      add(new JScrollPane(tamanhoJList));

      colorJList.addListSelectionListener( //Adiciona observador da lista de seleção
         new ListSelectionListener() 
         {   
            @Override //sobrescrita do método
            public void valueChanged(ListSelectionEvent event) //uma vez recebendo o ListSelecrEvent pelo parametro event, ele edita o background color com base no numero do vetor recebido.
            {
               getContentPane().setBackground(
                  colors[colorJList.getSelectedIndex()]);
            } 

         } 
      ); 

      tamanhoJList.addListSelectionListener( //Adiciona observador da lista de seleção
      new ListSelectionListener() 
      {
         @Override //sobrescrita do método
         public void valueChanged(ListSelectionEvent event)
      
      {   
         switch (tamanhoJList.getSelectedIndex()){
            case 0:
               setSize(350 , 150);
               break;
            case 1:
               setSize(700 , 300);
               break;
            case 2:
               setSize(1400 , 600);
               break;
            default:
               setSize(350 , 150);
               break;
         }

      } 
   }
   );
   } 
}
