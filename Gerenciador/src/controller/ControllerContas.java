package controller;

import model.ModelContas;
import DAO.DAOContas;
import java.util.ArrayList;

/**
*
* @author Mariana Barretto
*/
public class ControllerContas {

    private DAOContas daoContas = new DAOContas();

    /**
    * grava Contas
    * @param pModelContas
    * @return int
    */
    public boolean salvarContasController(ModelContas pModelContas){
        return this.daoContas.salvarContasDAO(pModelContas);
    }

    /**
    * recupera Contas
    * @param pIdConta
    * @return ModelContas
    */
    public ModelContas getContasController(int pIdConta){
        return this.daoContas.getContasDAO(pIdConta);
    }

    /**
    * recupera uma lista deContas
    * @param pIdConta
    * @return ArrayList
    */
    public ArrayList<ModelContas> getListaContasController(){
        return this.daoContas.getListaContasDAO();
    }

    /**
    * atualiza Contas
    * @param pModelContas
    * @return boolean
    */
    public boolean atualizarContasController(ModelContas pModelContas){
        return this.daoContas.atualizarContasDAO(pModelContas);
    }

    /**
    * exclui Contas
    * @param pIdConta
    * @return boolean
    */
    public boolean excluirContasController(int pIdConta){
        return this.daoContas.excluirContasDAO(pIdConta);
    }
}