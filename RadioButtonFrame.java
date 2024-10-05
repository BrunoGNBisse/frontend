
// import java.awt.FlowLayout;
// import java.awt.Font;
import java.awt.*;
// import java.awt.event.ItemListener;
// import java.awt.event.ItemEvent;
import java.awt.event.*;
// import javax.swing.JFrame;
// import javax.swing.JTextField;
// import javax.swing.JRadioButton;
// import javax.swing.ButtonGroup;
import javax.swing.*;

public class RadioButtonFrame extends JFrame //declaração da classe pública RadioButtonFrame, herdando base da classe JFrame
{
   //declaração das variáveis privadas, exclusivas da classe.
   private JTextField textField; 
   private Font plainFont; 
   private Font boldFont;
   private Font italicFont;
   private Font boldItalicFont;
   private JRadioButton plainJRadioButton; 
   private JRadioButton boldJRadioButton;
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 
   private ButtonGroup radioGroup; 

   private JRadioButton blueButton;
   private JRadioButton redButton;
   private JRadioButton yellowButton;
   private JRadioButton greenButton;
   private ButtonGroup colorRadioGroup;
   private Color blueColor; 
   private Color redColor;
   private Color yellowColor;
   private Color greenColor;

   public RadioButtonFrame() //definição do construtor
   {
      super("RadioButton Test"); //definição do titulo da janela
      setLayout(new FlowLayout());  //definição do tipo de layout

      textField = new JTextField("Watch the font style change", 25); // declaração d avariavel textField do sendo um objeto JTextFiel, definindo um texto de placeholder e um tamnanho
      add(textField); //adiciona ao frame

      //definição das variaveis dos botões sendo objetos JRadioButton, cada um com um texto e estado especifico
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton);
      add(boldJRadioButton); 
      add(italicJRadioButton); 
      add(boldItalicJRadioButton); 
      //adiciona eles à tela

      radioGroup = new ButtonGroup(); //define a variavel que vai abrigar o grupo de botões e adicionando cada um dos botões ao grupo
      radioGroup.add(plainJRadioButton); 
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton);
      radioGroup.add(boldItalicJRadioButton); 

      //atribuição de valores as variaveis das fontes, adicionando à cada uma delas um objeto do tipo fonte e definindo os parâmetros de estilo
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);
      
      
      // adicina ações a cada um dos botões, 
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));





      blueButton = new JRadioButton("Blue", true);
      redButton = new JRadioButton("Red", false);
      yellowButton = new JRadioButton("Yellow", false);
      greenButton = new JRadioButton("Green", false);
      add(blueButton);
      add(yellowButton); 
      add(redButton); 
      add(greenButton); 
      //adiciona eles à tela

      colorRadioGroup = new ButtonGroup(); //define a variavel que vai abrigar o grupo de botões e adicionando cada um dos botões ao grupo
      colorRadioGroup.add(blueButton); 
      colorRadioGroup.add(redButton); 
      colorRadioGroup.add(yellowButton);
      colorRadioGroup.add(greenButton); 

      //atribuição de valores as variaveis das fontes, adicionando à cada uma delas um objeto do tipo fonte e definindo os parâmetros de estilo
      blueColor = Color.BLUE;
      redColor = Color.RED;
      yellowColor = Color.YELLOW;
      greenColor = Color.GREEN;
      textField.setForeground(blueColor);
      
      
      // adicina ações a cada um dos botões, 
      blueButton.addItemListener(
         new ColorButtonHandler(blueColor));
      redButton.addItemListener(
         new ColorButtonHandler(redColor));
      yellowButton.addItemListener(
         new ColorButtonHandler(yellowColor));
      greenButton.addItemListener(
         new ColorButtonHandler(greenColor));





   } 

   private class ColorButtonHandler implements ItemListener //injetando ItemListener na classe, para que ela (RadioButtonHandler) possa ser utilizado como objeto
   {
      private Color color; //definição da variavel font do tipo Font, exclusiva de uso da classe, para manipulação pelo handler

      public ColorButtonHandler(Color c)
      {
         color = c; 
      } 
   
      //sobrescrever os valores 
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setForeground(color); 
      } 
   } 


   private class RadioButtonHandler implements ItemListener //injetando ItemListener na classe, para que ela (RadioButtonHandler) possa ser utilizado como objeto
   {
      private Font font; //definição da variavel font do tipo Font, exclusiva de uso da classe, para manipulação pelo handler

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      //sobrescrever os valores 
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
}