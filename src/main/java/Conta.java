public class Conta {



    double saldo=0;
    double limite=10000;
    boolean cartao=false;
    boolean poupanca=false;




    double VerSaldo(){

        System.out.println(saldo);
        return saldo;


    }

    double depositar(double quantia)
    {
        if(quantia>0)
        {
            saldo=saldo+quantia;
        }
        return saldo;
    }

    double sacar(double quantia)
    {
        if(saldo>0 & quantia<saldo & quantia!=0)
        {
            saldo=saldo-quantia;
        }
        return saldo;
    }

    double sacarLimite(double valor)
    {
        double soma=10000;
        if(valor <=10000){
            limite=limite-valor;

        }
        return limite;
    }
    double saldoLimite()
    {
        System.out.println(limite);
        return limite;
    }

    double ReporLimite(double quantia)
    {
        limite=limite+quantia;
        return limite;
    }

    boolean OpcionalcartaoCredito(boolean opcao)
    {
        if(opcao==true)
        {
            cartao=true;
        }
        else if(opcao==false)
        {
            cartao=false;
        }

        return cartao;
    }
    boolean OpcionalContaPoupança(boolean opcao)
    {
        if(opcao==true)
        {
            poupanca=true;
        }
        else if(opcao==false)
        {
            poupanca=false;
        }

        return poupanca;
    }
}
