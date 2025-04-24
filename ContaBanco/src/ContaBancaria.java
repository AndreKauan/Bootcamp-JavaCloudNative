public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    
    public ContaBancaria(double depositoInicial){
        if (depositoInicial <= 500) {
            chequeEspecial = 50;
        }else{
            chequeEspecial = depositoInicial * 0.5;
        }
        saldo = depositoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial(){
        return chequeEspecial;
    }

    public void sacar (double valorSaque){
        if (saldo>valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com Sucesso!");
        }else if (saldo+chequeEspecial>valorSaque){
            System.out.println("Saque realizado com Sucesso! UTILIZADO CHEQUE ESPECIAL! ");
            double restante = valorSaque-saldo;
            saldo = 0;
            chequeEspecial -= restante;
        }else {System.out.println("Saldo + Cheque Especial insuficiente");}
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }



}
