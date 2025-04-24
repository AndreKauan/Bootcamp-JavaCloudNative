public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    
    public ContaBancaria(double depositoInicial){
        if (depositoInicial <= 500) {
            chequeEspecial = 50;
        }else{
            chequeEspecial = depositoInicial * 0.5;
        }
        
        saldo += depositoInicial+chequeEspecial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial(){
        return chequeEspecial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    

}
