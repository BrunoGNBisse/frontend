import java.sql.*;

public class NavegadorDeRegistro extends TelaDePesquisa {
    public static String pesquisaRealizada = "";
    public static String clausulaDePesquisaComWhere = "";
    public static String clausulaDePesquisaSemWhere = "";


    public static void registraPesquisa(){
        pesquisaRealizada = barraPesquisa.getText().trim();
        if (pesquisaRealizada.length() > 0) {
            clausulaDePesquisaComWhere = " where `nome` like '%" + pesquisaRealizada + "%' or `Email` like '%" + pesquisaRealizada + "%'";
            clausulaDePesquisaSemWhere = " and (`nome` like '%" + pesquisaRealizada + "%' or `Email` like '%" + pesquisaRealizada + "%')";
        }
        goToFirstRegister();
    }

    public static void inicializacaoDeRegistros() {
        goToFirstRegister();
    }

    public static void goToFirstRegister() {
        try {
            String strSqlInicializacao = "select * from `db_senac`.`tbl_senac`" + clausulaDePesquisaComWhere + " order by `id` asc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmSqlInicializacao = conexao.createStatement();
            ResultSet rstSqlInicializacao = stmSqlInicializacao.executeQuery(strSqlInicializacao);
            if (rstSqlInicializacao.next()) {
                txtId.setText(rstSqlInicializacao.getString("id"));
                txtNome.setText(rstSqlInicializacao.getString("nome"));
                txtEmail.setText(rstSqlInicializacao.getString("email"));
                notificarUsuario("Primeiro registro posicionado com sucesso!");
                habilitarAvancar();
            } else {
                notificarUsuario("Não foram encontrados registros.");
            }
            stmSqlInicializacao.close();
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void goToNextRegister(){
        try {
            String strNextRegister = "select * from `db_senac`.`tbl_senac` where `id` > " + txtId.getText() + clausulaDePesquisaSemWhere + " order by `id` asc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmNextRegister = conexao.createStatement();
            ResultSet rstNextRegister = stmNextRegister.executeQuery(strNextRegister);
            if (rstNextRegister.next()) {
                txtId.setText(rstNextRegister.getString("id"));
                txtNome.setText(rstNextRegister.getString("nome"));
                txtEmail.setText(rstNextRegister.getString("email"));
                notificarUsuario("Proximo registro posicionado com sucesso!");

                String strUltimoRegistro = "select * from `db_senac`. `tbl_senac`" + clausulaDePesquisaComWhere + " order by `id` desc;";
                Statement smtUltimoRegistro = conexao.createStatement();
                ResultSet rstUltimoRegistro =  smtUltimoRegistro.executeQuery(strUltimoRegistro);
                rstUltimoRegistro.next();
                String ultimoId = rstUltimoRegistro.getString("id");

                if(txtId.getText().equals(ultimoId)){
                    habilitarVoltar();
                } else {
                    habilitarTodos();
                }
            } else {
                habilitarVoltar();
                notificarUsuario("Não foram encontrados registros.");
            }
            stmNextRegister.close();
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void goToPreviousRegister(){
        try {
            String strPreviousRegister = "select * from `db_senac`.`tbl_senac` where `id` < " + txtId.getText() + clausulaDePesquisaSemWhere + " order by `id` desc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmPreviousRegister = conexao.createStatement();
            ResultSet rstPreviousRegister = stmPreviousRegister.executeQuery(strPreviousRegister);
            if (rstPreviousRegister.next()) {
                txtId.setText(rstPreviousRegister.getString("id"));
                txtNome.setText(rstPreviousRegister.getString("nome"));
                txtEmail.setText(rstPreviousRegister.getString("email"));
                notificarUsuario("Registro anterior posicionado com sucesso!");


                String strPrimeiroRegistro = "select * from `db_senac`. `tbl_senac`" + clausulaDePesquisaComWhere + " order by `id` asc;";
                Statement smtPrimeiroRegistro = conexao.createStatement();
                ResultSet rstPrimeirRegistro =  smtPrimeiroRegistro.executeQuery(strPrimeiroRegistro);
                rstPrimeirRegistro.next();
                String PrimeiroId = rstPrimeirRegistro.getString("id");

                if(txtId.getText().equals(PrimeiroId)){
                    habilitarAvancar();
                } else {
                    habilitarTodos();
                }

            } else {
                habilitarAvancar();
                notificarUsuario("Não foram encontrados registros.");
            }
            stmPreviousRegister.close();
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void goToLastRegister(){
        try {
            String strLastRegister = "select * from `db_senac`.`tbl_senac` order by `id` desc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmLastRegister = conexao.createStatement();
            ResultSet rstLastRegister = stmLastRegister.executeQuery(strLastRegister);
            if (rstLastRegister.next()) {
                txtId.setText(rstLastRegister.getString("id"));
                txtNome.setText(rstLastRegister.getString("nome"));
                txtEmail.setText(rstLastRegister.getString("email"));
                notificarUsuario("Último registro posicionado com sucesso!");
                habilitarVoltar();
            } else {
                notificarUsuario("Não foram encontrados registros.");
            }
            stmLastRegister.close();
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }
}