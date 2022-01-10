package model;
/**
*
* @author Mariana Barretto
*/
public class ModelReceitas {

    private int idReceitas;
    private Double valor;
    private String dataRecebimento;
    private String dataRecebimentoEsperado;
    private String descricao;
    private int conta;
    private String tipoReceita;

    /**
    * Construtor
    */
    public ModelReceitas(){}

    /**
    * seta o valor de idReceitas
    * @param pIdReceitas
    */
    public void setIdReceitas(int pIdReceitas){
        this.idReceitas = pIdReceitas;
    }
    /**
    * @return pk_idReceitas
    */
    public int getIdReceitas(){
        return this.idReceitas;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(Double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public Double getValor(){
        return this.valor;
    }

    /**
    * seta o valor de dataRecebimento
    * @param pDataRecebimento
    */
    public void setDataRecebimento(String pDataRecebimento){
        this.dataRecebimento = pDataRecebimento;
    }
    /**
    * @return dataRecebimento
    */
    public String getDataRecebimento(){
        return this.dataRecebimento;
    }

    /**
    * seta o valor de dataRecebimentoEsperado
    * @param pDataRecebimentoEsperado
    */
    public void setDataRecebimentoEsperado(String pDataRecebimentoEsperado){
        this.dataRecebimentoEsperado = pDataRecebimentoEsperado;
    }
    /**
    * @return dataRecebimentoEsperado
    */
    public String getDataRecebimentoEsperado(){
        return this.dataRecebimentoEsperado;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de conta
    * @param pConta
    */
    public void setConta(int pConta){
        this.conta = pConta;
    }
    /**
    * @return conta
    */
    public int getConta(){
        return this.conta;
    }

    /**
    * seta o valor de tipoReceita
    * @param pTipoReceita
    */
    public void setTipoReceita(String pTipoReceita){
        this.tipoReceita = pTipoReceita;
    }
    /**
    * @return tipoReceita
    */
    public String getTipoReceita(){
        return this.tipoReceita;
    }

    @Override
    public String toString(){
        return "ModelReceitas {" + "::idReceitas = " + this.idReceitas + "::valor = " + this.valor + "::dataRecebimento = " + this.dataRecebimento + "::dataRecebimentoEsperado = " + this.dataRecebimentoEsperado + "::descricao = " + this.descricao + "::conta = " + this.conta + "::tipoReceita = " + this.tipoReceita +  "}";
    }
}