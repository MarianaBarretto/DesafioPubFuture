package controller;

import model.ModelReceitas;
import DAO.DAOReceitas;
import java.util.ArrayList;

/**
*
* @author Mariana Barretto
*/
public class ControllerReceitas {

    private DAOReceitas daoReceitas = new DAOReceitas();

    /**
    * grava Receitas
    * @param pModelReceitas
    * @return boolean
    */
    public boolean salvarReceitasController(ModelReceitas pModelReceitas){
        return this.daoReceitas.salvarReceitasDAO(pModelReceitas);
    }

    /**
    * recupera Receitas
    * @param pIdReceitas
    * @return ModelReceitas
    */
    public ModelReceitas getReceitasController(int pIdReceitas){
        return this.daoReceitas.getReceitasDAO(pIdReceitas);
    }

    /**
    * recupera uma lista deReceitas
    * @param pIdReceitas
    * @return ArrayList
    */
    public ArrayList<ModelReceitas> getListaReceitasController(){
        return this.daoReceitas.getListaReceitasDAO();
    }

    /**
    * atualiza Receitas
    * @param pModelReceitas
    * @return boolean
    */
    public boolean atualizarReceitasController(ModelReceitas pModelReceitas){
        return this.daoReceitas.atualizarReceitasDAO(pModelReceitas);
    }

    /**
    * exclui Receitas
    * @param pIdReceitas
    * @return boolean
    */
    public boolean excluirReceitasController(int pIdReceitas){
        return this.daoReceitas.excluirReceitasDAO(pIdReceitas);
    }
}


