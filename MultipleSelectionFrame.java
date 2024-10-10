import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> copyJList; 
   private JButton copyJButton; 
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   private final JList<String> vitrine; 
   private final JList<String> carrinho; 
   private JButton adicionarAoCarrinho; 
   private static final String[] itensVitrine = {"Sopa de Mamaco", "Singaro de Chocolate", "Mamão mó paia",
      "Maçã Banana", "Uva Pera", "Passarinho à Frango", "Bicarbonato de ódio", "Uvas Passadas", "Suco de Naranja", 
      "Bolo Gostoso", "Fuzil AR-15", "Item para completar frete"};

   public MultipleSelectionFrame()
   {
      super("Azamônia");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); 
      colorJList.setVisibleRowCount(10);
      colorJList.setFixedCellHeight(30);
      colorJList.setSelectionBackground(getBackground().green);
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); 

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() 
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray( //coleta os valores selecionados e transforma uma matriz de string
                     new String[0
                     ])); //define o tamanho da matriz enviada
            }
         } 
      ); 

      add(copyJButton);
      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(10); 
      copyJList.setFixedCellWidth(300);
      copyJList.setFixedCellHeight(30); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList));


      vitrine = new JList<String>(itensVitrine); 
      vitrine.setVisibleRowCount(10);
      vitrine.setFixedCellHeight(30);
      vitrine.setSelectionBackground(getBackground().red);
      vitrine.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(vitrine)); 

      adicionarAoCarrinho = new JButton("Adicionar ao Carinho >>>"); 
      adicionarAoCarrinho.setBackground(getBackground().green);
      adicionarAoCarrinho.addActionListener(
         new ActionListener() 
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               carrinho.setListData(
                  vitrine.getSelectedValuesList().toArray( //coleta os valores selecionados e transforma uma matriz de string
                     new String[0])); //define o tamanho da matriz enviada
            }
         } 
      ); 

      add(adicionarAoCarrinho);
      carrinho = new JList<String>(); 
      carrinho.setVisibleRowCount(10); 
      carrinho.setFixedCellWidth(300);
      carrinho.setSelectionBackground(getBackground().red);
      carrinho.setFixedCellHeight(30); 
      carrinho.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(carrinho));




   } 
} 