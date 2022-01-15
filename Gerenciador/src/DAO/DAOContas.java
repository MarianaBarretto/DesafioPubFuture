package DAO;

import model.ModelContas;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Mariana Barretto
*/
public class DAOContas extends ConexaoSQLite {

    /**
    * grava Contas
    * @param pModelContas
    * @return int
    */
    public boolean salvarContasDAO(ModelContas pModelContas){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_contas ("
                    + "pk_id_conta,"
                    + "saldo,"
                    + "tipo_conta,"
                    + "instituicao_financeira"
                + ") VALUES (?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setInt(1, pModelContas.getIdConta());
            preparedStatement.setDouble(2, pModelContas.getSaldo());
            preparedStatement.setString(3, pModelContas.getTipoConta());
            preparedStatement.setInt(4, pModelContas.getInstituicaoFinanceira());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
            return true;
        }

    }
/**
    * recupera Contas
    * @param pIdConta
    * @return ModelContas
    */
    public ModelContas getContasDAO(int pIdConta){
        ModelContas modelContas = null;

        String sql = "SELECT "
                    + "pk_id_conta,"
                    + "saldo,"
                    + "tipo_conta,"
                    + "instituicao_financeira"
                 + " FROM"
                     + " tbl_contas"
                 + " WHERE"
                     + " pk_id_conta = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pIdConta);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelContas = new ModelContas();
                modelContas.setIdConta(resultSet.getInt(1));
                modelContas.setSaldo(resultSet.getDouble(2));
                modelContas.setTipoConta(resultSet.getString(3));
                modelContas.setInstituicaoFinanceira(resultSet.getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelContas;
    }

    /**
    * recupera uma lista de Contas
        * @return ArrayList
    */
    public ArrayList<ModelContas> getListaContasDAO(){
        ArrayList<ModelContas> listamodelContas = new ArrayList();
        ModelContas modelContas = null;

        String sql = "SELECT "
                    + "pk_id_conta,"
                    + "saldo,"
                    + "tipo_conta,"
                    + "instituicao_financeira"
                 + " FROM"
                     + " tbl_contas"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelContas = new ModelContas();
                modelContas.setIdConta(resultSet.getInt(1));
                modelContas.setSaldo(resultSet.getDouble(2));
                modelContas.setTipoConta(resultSet.getString(3));
                modelContas.setInstituicaoFinanceira(resultSet.getInt(4));
                listamodelContas.add(modelContas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelContas;
    }

    /**
    * atualiza Contas
    * @param pModelContas
    * @return boolean
    */
    public boolean atualizarContasDAO(ModelContas pModelContas){
        this.conectar();
        String sql = 
            "UPDATE tbl_contas SET "
                    + "pk_id_conta = ?,"
                    + "saldo = ?,"
                    + "tipo_conta = ?,"
                    + "instituicao_financeira = ?"
                + " WHERE pk_id_conta = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelContas.getIdConta());
            preparedStatement.setDouble(2, pModelContas.getSaldo());
            preparedStatement.setString(3, pModelContas.getTipoConta());
            preparedStatement.setInt(4, pModelContas.getInstituicaoFinanceira());
            preparedStatement.setInt(5, pModelContas.getIdConta());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Contas
    * @param pIdConta
    * @return boolean
    */
    public boolean excluirContasDAO(int pIdConta){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_contas "
                + " WHERE pk_id_conta = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pIdConta);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}