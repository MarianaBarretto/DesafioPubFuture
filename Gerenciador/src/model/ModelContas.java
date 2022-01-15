package model;
/**
*
* @author Mariana Barretto
*/
public class ModelContas {

    public int idConta;
    public double saldo;
    public String tipoConta;
    public int instituicaoFinanceira;

    /**
    * Construtor
    */
    public ModelContas(){}

    /**
    * seta o valor de idConta
    * @param pIdConta
    */
    public void setIdConta(int pIdConta){
        this.idConta = pIdConta;
    }
    /**
    * @return pk_idConta
    */
    public int getIdConta(){
        return this.idConta;
    }

    /**
    * seta o valor de saldo
    * @param pSaldo
    */
    public void setSaldo(double pSaldo){
        this.saldo = pSaldo;
    }
    /**
    * @return saldo
    */
    public double getSaldo(){
        return this.saldo;
    }

    /**
    * seta o valor de tipoConta
    * @param pTipoConta
    */
    public void setTipoConta(String pTipoConta){
        this.tipoConta = pTipoConta;
    }
    /**
    * @return tipoConta
    */
    public String getTipoConta(){
        return this.tipoConta;
    }

    /**
    * seta o valor de instituicaoFinanceira
    * @param pInstituicaoFinanceira
    */
    public void setInstituicaoFinanceira(int pInstituicaoFinanceira){
        this.instituicaoFinanceira = pInstituicaoFinanceira;
    }
    /**
    * @return instituicaoFinanceira
    */
    public int getInstituicaoFinanceira(){
        return this.instituicaoFinanceira;
    }

    @Override
    public String toString(){
        return "ModelContas {" + "::idConta = " + this.idConta + "::saldo = " + this.saldo + "::tipoConta = " + this.tipoConta + "::instituicaoFinanceira = " + this.instituicaoFinanceira +  "}";
    }
}