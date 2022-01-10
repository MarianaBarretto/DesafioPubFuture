package DAO;

import model.ModelReceitas;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Mariana Barretto
*/
public class DAOReceitas extends ConexaoSQLite {

    /**
    * grava Receitas
    * @param pModelReceitas
    * @return int
    */
    public int salvarReceitasDAO(ModelReceitas pModelReceitas){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_receitas ("
                    + "valor,"
                    + "data_recebimento,"
                    + "data_recebimento_esperado,"
                    + "descricao,"
                    + "conta,"
                    + "tipo_receita"
                + ") VALUES (?,?,?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setDouble(1, pModelReceitas.getValor());
            preparedStatement.setString(2, pModelReceitas.getDataRecebimento());
            preparedStatement.setString(3, pModelReceitas.getDataRecebimentoEsperado());
            preparedStatement.setString(4, pModelReceitas.getDescricao());
            preparedStatement.setInt(5, pModelReceitas.getConta());
            preparedStatement.setString(6, pModelReceitas.getTipoReceita());
            return preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.desconectar();
        }

    }
/**
    * recupera Receitas
    * @param pIdReceitas
    * @return ModelReceitas
    */
    public ModelReceitas getReceitasDAO(int pIdReceitas){
        ModelReceitas modelReceitas = null;

        String sql = "SELECT "
                    + "pk_id_receitas,"
                    + "valor,"
                    + "data_recebimento,"
                    + "data_recebimento_esperado,"
                    + "descricao,"
                    + "conta,"
                    + "tipo_receita"
                 + " FROM"
                     + " tbl_receitas"
                 + " WHERE"
                     + " pk_id_receitas = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pIdReceitas);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelReceitas = new ModelReceitas();
                modelReceitas.setIdReceitas(resultSet.getInt(1));
                modelReceitas.setValor(resultSet.getDouble(2));
                modelReceitas.setDataRecebimento(resultSet.getString(3));
                modelReceitas.setDataRecebimentoEsperado(resultSet.getString(4));
                modelReceitas.setDescricao(resultSet.getString(5));
                modelReceitas.setConta(resultSet.getInt(6));
                modelReceitas.setTipoReceita(resultSet.getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelReceitas;
    }

    /**
    * recupera uma lista de Receitas
        * @return ArrayList
    */
    public ArrayList<ModelReceitas> getListaReceitasDAO(){
        ArrayList<ModelReceitas> listamodelReceitas = new ArrayList();
        ModelReceitas modelReceitas = null;

        String sql = "SELECT "
                    + "pk_id_receitas,"
                    + "valor,"
                    + "data_recebimento,"
                    + "data_recebimento_esperado,"
                    + "descricao,"
                    + "conta,"
                    + "tipo_receita"
                 + " FROM"
                     + " tbl_receitas"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelReceitas = new ModelReceitas();
                modelReceitas.setIdReceitas(resultSet.getInt(1));
                modelReceitas.setValor(resultSet.getDouble(2));
                modelReceitas.setDataRecebimento(resultSet.getString(3));
                modelReceitas.setDataRecebimentoEsperado(resultSet.getString(4));
                modelReceitas.setDescricao(resultSet.getString(5));
                modelReceitas.setConta(resultSet.getInt(6));
                modelReceitas.setTipoReceita(resultSet.getString(7));
                listamodelReceitas.add(modelReceitas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelReceitas;
    }

    /**
    * atualiza Receitas
    * @param pModelReceitas
    * @return boolean
    */
    public boolean atualizarReceitasDAO(ModelReceitas pModelReceitas){
        this.conectar();
        String sql = 
            "UPDATE tbl_receitas SET "
                    + "pk_id_receitas = ?,"
                    + "valor = ?,"
                    + "data_recebimento = ?,"
                    + "data_recebimento_esperado = ?,"
                    + "descricao = ?,"
                    + "conta = ?,"
                    + "tipo_receita = ?"
                + " WHERE pk_id_receitas = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelReceitas.getIdReceitas());
            preparedStatement.setDouble(2, pModelReceitas.getValor());
            preparedStatement.setString(3, pModelReceitas.getDataRecebimento());
            preparedStatement.setString(4, pModelReceitas.getDataRecebimentoEsperado());
            preparedStatement.setString(5, pModelReceitas.getDescricao());
            preparedStatement.setInt(6, pModelReceitas.getConta());
            preparedStatement.setString(7, pModelReceitas.getTipoReceita());
            preparedStatement.setInt(8, pModelReceitas.getIdReceitas());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Receitas
    * @param pIdReceitas
    * @return boolean
    */
    public boolean excluirReceitasDAO(int pIdReceitas){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_receitas "
                + " WHERE pk_id_receitas = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pIdReceitas);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}