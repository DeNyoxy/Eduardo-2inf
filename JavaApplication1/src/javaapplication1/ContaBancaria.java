
package javaapplication1;


public class ContaBancaria {
    int numero;
    double senha;
    String cliente;
    double saldo, limite;
    void depositar (double quantidade) {
       
                this.saldo+=quantidade;
                System.out.println("deposito: "+ quantidade);
                System.out.println("Saldo Anual: " +this.saldo);
                this.saldo+=this.limite;
                System.out.println("Limite + Saldo:" + this.saldo);
    }
                boolean sacar(double quantidade){
{
        if (quantidade <this.saldo) {
            this.saldo=this.saldo-quantidade;
            System.out.println("Quantiade sacada: " +quantidade);
            System.out.println("saldo atual : " +this.saldo);
           return true;
        }
        else{
            System.out.println ("Não tem saldo suficiente");
                return false;
        }
}
                }
}
    
    

    
   

