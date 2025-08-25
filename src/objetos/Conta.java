package objetos;

public class Conta {
    
    private String agencia;
    private String numeroConta;
    private String saldo;


    public String getAgencia(){
        return agencia;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getSaldo(){
        return saldo;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(String saldo){
        this.saldo = saldo;
    }


}

