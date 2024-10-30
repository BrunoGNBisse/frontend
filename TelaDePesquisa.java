import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import java.sql.*;

public class TelaDePesquisa extends JFrame{

    public static final JTextField barraPesquisa = new JTextField(20);
    public final JButton btnPesquisar;

    public final JLabel lblId;
    // public final JTextField txtId;
    public static final JTextField txtId = new JTextField(10);


    public final JLabel lblNome;
    public static final JTextField txtNome = new JTextField(10);

    public final JLabel lblEmail;
    public static final JTextField txtEmail = new JTextField(10);

    public static final JButton btnPrimeiro = new JButton("<<");;
    public static final JButton btnAnterior = new JButton("<");;
    public static final JButton btnProximo = new JButton(">");;
    public static final JButton btnUltimo = new JButton(">>");;

    public static final JLabel lblNotificacao = new JLabel("Notificações", SwingConstants.CENTER);

    public TelaDePesquisa(){
        super("Tela de Pesquisa");
        setLayout(new GridLayout(7,1,5,5));

        JPanel linhaInputPesquisa = new JPanel(new GridLayout(1,1));
        // barraPesquisa = new JTextField(20);
        linhaInputPesquisa.add(barraPesquisa);
        add(linhaInputPesquisa);

        JPanel linhaBotaoPesquisa = new JPanel(new GridLayout(1,1));
        btnPesquisar = new JButton("Pesquisar");
        linhaBotaoPesquisa.add(btnPesquisar);
        add(linhaBotaoPesquisa);     
        
        JPanel linhaId = new JPanel(new GridLayout(1,2));
        lblId = new JLabel("Id:", SwingConstants.RIGHT);
        // txtId = new JTextField(10);
        txtId.setEditable(false);
        linhaId.add(lblId);
        linhaId.add(txtId);
        add(linhaId);

        JPanel linhaNome = new JPanel(new GridLayout(1,2));
        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        // txtNome = new JTextField(10);
        txtNome.setEditable(false);
        linhaNome.add(lblNome);
        linhaNome.add(txtNome);
        add(linhaNome);

        JPanel linhaEmail = new JPanel(new GridLayout(1,2));
        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        // txtEmail = new JTextField(10);
        txtEmail.setEditable(false);
        linhaEmail.add(lblEmail);
        linhaEmail.add(txtEmail);
        add(linhaEmail);

        JPanel linhaBotoes = new JPanel(new GridLayout(1,6));
        // btnPrimeiro = new JButton("<<");
        // btnAnterior = new JButton("<");
        // btnProximo = new JButton(">");
        // btnUltimo = new JButton(">>");
        linhaBotoes.add(new JLabel());
        linhaBotoes.add(btnPrimeiro);
        linhaBotoes.add(btnAnterior);
        linhaBotoes.add(btnProximo);
        linhaBotoes.add(btnUltimo);
        linhaBotoes.add(new JLabel());
        add(linhaBotoes);

        JPanel linhaNotificacoes = new JPanel(new GridLayout(1,1));
        // lblNotificacao = new JLabel("Notificações", SwingConstants.CENTER);
        linhaNotificacoes.add(lblNotificacao);
        add(linhaNotificacoes);

        btnPrimeiro.addActionListener((
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent Event){
                    NavegadorDeRegistro.goToFirstRegister();
                }
            }
        ));

        btnProximo.addActionListener((
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent Event){
                    NavegadorDeRegistro.goToNextRegister();
                }
            }
        ));

        btnAnterior.addActionListener((
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent Event){
                    NavegadorDeRegistro.goToPreviousRegister();
                }
            }
        ));

        btnUltimo.addActionListener((
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent Event){
                    NavegadorDeRegistro.goToLastRegister();
                }
            }
        ));

        btnPesquisar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        NavegadorDeRegistro.registraPesquisa();
                    }
                }
        );

        NavegadorDeRegistro.inicializacaoDeRegistros();

    }

    public static void notificarUsuario(String strTexto) {
        lblNotificacao.setText(setHtmlFormat(strTexto));
    }

    public static String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>";
    }


    public static void habilitarVoltar() {
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
    }

    public static void habilitarAvancar() {
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
    }

    public static void habilitarTodos() {
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
    }

    public static void main (String[] args){
        TelaDePesquisa appTelaDePesquisa = new TelaDePesquisa();
        appTelaDePesquisa.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDePesquisa.setSize(300,300);
        appTelaDePesquisa.setVisible(true);
    }
}