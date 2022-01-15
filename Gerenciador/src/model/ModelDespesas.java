package model;
/**
*
* @author Mariana Barretto
*/
public class ModelDespesas {

    public int idDespesas;
    public double valor;
    public String dataPagamento;
    public String dataPagamentoEsperado;
    private int conta;
    private String tipoDespesa;

    /**
    * Construtor
    */
    public ModelDespesas(){}

    /**
    * seta o valor de idDespesas
    * @param pIdDespesas
    */
    public void setIdDespesas(int pIdDespesas){
        this.idDespesas = pIdDespesas;
    }
    /**
    * @return pk_idDespesas
    */
    public int getIdDespesas(){
        return this.idDespesas;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public double getValor(){
        return this.valor;
    }

    /**
    * seta o valor de dataPagamento
    * @param pDataPagamento
    */
    public void setDataPagamento(String pDataPagamento){
        this.dataPagamento = pDataPagamento;
    }
    /**
    * @return dataPagamento
    */
    public String getDataPagamento(){
        return this.dataPagamento;
    }

    /**
    * seta o valor de dataPagamentoEsperado
    * @param pDataPagamentoEsperado
    */
    public void setDataPagamentoEsperado(String pDataPagamentoEsperado){
        this.dataPagamentoEsperado = pDataPagamentoEsperado;
    }
    /**
    * @return dataPagamentoEsperado
    */
    public String getDataPagamentoEsperado(){
        return this.dataPagamentoEsperado;
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
    * seta o valor de tipoDespesa
    * @param pTipoDespesa
    */
    public void setTipoDespesa(String pTipoDespesa){
        this.tipoDespesa = pTipoDespesa;
    }
    /**
    * @return tipoDespesa
    */
    public String getTipoDespesa(){
        return this.tipoDespesa;
    }

    @Override
    public String toString(){
        return "ModelDespesas {" + "::idDespesas = " + this.idDespesas + "::valor = " + this.valor + "::dataPagamento = " + this.dataPagamento + "::dataPagamentoEsperado = " + this.dataPagamentoEsperado + "::conta = " + this.conta + "::tipoDespesa = " + this.tipoDespesa +  "}";
    }
}