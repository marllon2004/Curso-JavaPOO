package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("CONTA: "+ this.getDono());
        System.out.println("TIPO: "+ this.getTipo());
        System.out.println("DONO: "+ this.getDono());
        System.out.println("SALDO: "+ this.getSaldo());
        System.out.println("STATUS: "+ this.getStatus());
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } 
        else {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta possui dinheiro. Não´e possível fechar.");
        } 
        else if(this.getSaldo() < 0){
            System.out.println("Conta com débito. Não é possível fechar.");
        }
        else{
            this.setStatus(false);;
            System.out.println("Conta fechada.");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+ this.getDono() +" com sucesso!");
        } else {
            System.out.println("Conta fechada! Impossível depositar!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }
            else{
                System.out.println("Saldo insuficiente!");
            }
        } 
        else {
            System.out.println("Conta fechada! Impossível sacar!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } 
        else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }
        else{
            System.out.println("Impossível pagar! Conta fechada!");
        }
        
    }

    /***************************/ 
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
