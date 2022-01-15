package DAO;



import model.ModelReceitas;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
*
* @author Mariana Barretto
*/
public class DAOReceitas extends ConexaoSQLite {

    /**
    * grava Receitas
    * @param pModelReceitas
    * @return boolean
    */
    public boolean salvarReceitasDAO(ModelReceitas pModelReceitas){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_receitas ("
                    + "valor,"
                    + "data_recebimento,"
                    + "data_recebimento_esperado,"
                    + "descricao,"
                    + "conta,"
                    + "tipo_receita"
                + ") VALUES (?,?,?,?,?,?);";
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setDouble(1, pModelReceitas.getValor());
            preparedStatement.setString(2, pModelReceitas.getDataRecebimento());
            preparedStatement.setString(3, pModelReceitas.getDataRecebimentoEsperado());
            preparedStatement.setString(4, pModelReceitas.getDescricao());
            preparedStatement.setInt(5, pModelReceitas.getConta());
            preparedStatement.setString(6, pModelReceitas.getTipoReceita());
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
    * recupera Receitas
    * @param pModelReceitas
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
                    + "tipo_Receita"
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
            preparedStatement.setDouble(1, pModelReceitas.getValor());
            preparedStatement.setString(2, pModelReceitas.getDataRecebimento());
            preparedStatement.setString(3, pModelReceitas.getDataRecebimentoEsperado());
            preparedStatement.setString(4, pModelReceitas.getDescricao());
            preparedStatement.setInt(5, pModelReceitas.getConta());
            preparedStatement.setString(6, pModelReceitas.getTipoReceita());
            preparedStatement.setInt(7, pModelReceitas.getIdReceitas());
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
