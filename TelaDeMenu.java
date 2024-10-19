import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenu extends JFrame{
    private final JMenu cadastroMenu;
    private final JLabel lblNomeDaTela;
    private final JMenuBar menuBar;
    private final JMenuItem newItem;
    private final JMenuItem searchItem;
    private final JMenuItem refreshItem;
    private final JMenuItem removeItem;


    public TelaDeMenu(){
        super ("Tela de Menu");

        cadastroMenu = new JMenu("Gestão de Cadastros");

        lblNomeDaTela = new JLabel("Tela de Menu",  SwingConstants.CENTER);

        menuBar = new JMenuBar();

        newItem = new JMenuItem("Novo");

        searchItem = new JMenuItem("Pesquisar");

        refreshItem = new JMenuItem("Atualizar");

        removeItem = new JMenuItem("Remover");


        cadastroMenu.add(newItem);
        cadastroMenu.add(searchItem);
        cadastroMenu.add(refreshItem);
        cadastroMenu.add(removeItem);

        menuBar.add(cadastroMenu);
        setJMenuBar(menuBar);

        add(lblNomeDaTela, BorderLayout.CENTER);


        newItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent event){
                    JOptionPane.showMessageDialog(null,"Eita como clica!" + event.getActionCommand());
                }
            }
        );

        searchItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent event){
                    JOptionPane.showMessageDialog(null,"Eita como clica!" + event.getActionCommand());
                }
            }
        );

        refreshItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent event){
                    JOptionPane.showMessageDialog(null,"Eita como clica!" + event.getActionCommand());
                }
            }
        );

        removeItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent event){
                    JOptionPane.showMessageDialog(null,"Eita como clica!" + event.getActionCommand());
                }
            }
        );
    }

    public static void main(String[] args) {
        TelaDeMenu appTelaDeMenu = new TelaDeMenu();
        appTelaDeMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeMenu.setSize(300, 300);
        appTelaDeMenu.setVisible(true);
    }
}