import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;

public class TelaDeLogin extends JFrame {
    private final JLabel lblLogin;
    private final JLabel lblPassword;
    private final JTextField fldLogin;
    private final JPasswordField fldPassword;
    private final JButton btnLogin;
    private final JLabel lblNotificacoes;

    public TelaDeLogin() {
        super("Título da Tela de Login");
        setLayout (new FlowLayout());

        lblLogin = new JLabel ("Login:");
        lblLogin.setToolTipText("Login");
        add(lblLogin);
        
        fldLogin = new JTextField("Email ou CPF",10);
        add(fldLogin);

        lblPassword = new JLabel ("Senha:");
        lblPassword.setToolTipText("Senha");
        add(lblPassword);

        fldPassword = new JPasswordField ( "Senha", 10);
        add(fldPassword);

        btnLogin = new JButton("GANHE R$1000,00 AGORA!");
        btnLogin.setToolTipText("Logar no sistema");
        btnLogin.setPreferredSize(new Dimension(250,50));
        add(btnLogin);

        lblNotificacoes = new JLabel("Notificações");
        add(lblNotificacoes);

        ButtonHandler buttonHandler = new ButtonHandler();
        btnLogin.addActionListener(buttonHandler);


        // fldPassword.addKeyListener(
        //         new KeyAdapter() {
        //             @Override
        //             public void keyReleased(KeyEvent e) {
        //                 super.keyReleased(e);
        //             }
        //         }
        // );
    };



    private class ButtonHandler implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent event) {
            logar();
            
        };
    }

    public String setHtmlFormat(String txt){
        return "<html><body>" + txt + "</body></html>";
    }
    public void notificarUsuario(String srtTexto){
        lblNotificacoes.setText(setHtmlFormat(srtTexto));
    }

    public void logar(){
        try{ 
        Connection conexao = MySQLConnector.conectar();
        String strSqlLogin = "select * from `db_senac`.`tbl_senac` where email = '" + fldLogin.getText() + "' and senha = '" + String.valueOf(fldPassword.getPassword()) + "';";
        Statement stmsqlLogin = conexao.createStatement();
        ResultSet rstSqlLogin = stmsqlLogin.executeQuery(strSqlLogin);
            if (rstSqlLogin.next()){
                lblNotificacoes.setText("Login realizado com sucesso!" + rstSqlLogin.getString("email")+ "realizado com sucesso!");// notificar que usuario e senha foram encontrados
            } else {
                lblNotificacoes.setText("Não foi possível encontrar o realizar o Login, verifique suas credenciais e tente novamente");// notificar que não foram encontrados
            }
        } catch (Exception e) {
            lblNotificacoes.setText("Houve um problema e não foi possível realizar o login no momento. Por favor, tente novamente mais tarde.");
            System.err.println("Erro!" + e);
            }
    }

    public static void main (String[] args){
        TelaDeLogin appTelaDeLogin = new TelaDeLogin();
        appTelaDeLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appTelaDeLogin.setSize(200,200);
        appTelaDeLogin.setVisible(true);
        }   
    }
