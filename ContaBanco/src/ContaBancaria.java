public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;
    
    public ContaBancaria(double depositoInicial){
        if (depositoInicial <= 500) {
            chequeEspecial = 50;
        }else{
            chequeEspecial = depositoInicial * 0.5;
        }
        saldo = depositoInicial;
        limiteChequeEspecial = chequeEspecial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial(){
        return chequeEspecial;
    }

    public void sacar (double valorSaque){
        if (saldo>=valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com Sucesso!");
        }else if (saldo+chequeEspecial>=valorSaque){
            System.out.println("Saque realizado com Sucesso! UTILIZADO CHEQUE ESPECIAL!");
            double restante = valorSaque-saldo;
            saldo = 0;
            chequeEspecial -= restante;
        }else {System.out.println("Saldo + Cheque Especial insuficiente");}
    }

    public void pagarBoleto (double valorBoleto){
        sacar(valorBoleto);
    }

    public void depositar(double valor) { 
        if (chequeEspecial<limiteChequeEspecial) {
            double usoChequeEspecial = limiteChequeEspecial-chequeEspecial; 
            double taxa = (usoChequeEspecial)*0.2; 
            valor -= taxa; 
            chequeEspecial += valor; 
            if (chequeEspecial>limiteChequeEspecial) {
                saldo = chequeEspecial-limiteChequeEspecial;
                chequeEspecial -= saldo;
            }
        }else{
            saldo +=valor;
        }
        System.out.println("Depósito realizado com sucesso.");
    }



}
