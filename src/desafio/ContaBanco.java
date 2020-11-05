package desafio;

import com.sun.security.jgss.GSSUtil;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Você tem um saldo na sua conta de: " + this.saldo +
                    " Saque o seu saldo total para fechar a conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você está em débito, seu saldo negativo é: " + getSaldo() +
                    " Faça um depósito para fechar a conta");
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso!");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Sua conta está fechada precisa abrir");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() && this.getSaldo() > v) {
            this.setSaldo(getSaldo() - v);
            System.out.println("Você acaba de sacar " + v + "Você ficou com saldo de: " + getSaldo());
        } else {
            System.out.println("Você não tem saldo o suficiente ou sua conta está fechada");
        }
    }

    public void pagarMensalidade(String t) {
        if (tipo.equals("cc")) {
            setSaldo(getSaldo() - 12.00f);
            System.out.println("Você pagou sua mensalidade, e seu saldo é de " + getSaldo());
        } else if (tipo.equals("cp")) {
            setSaldo(getSaldo() - 20.00f);
            System.out.println("Você pagou sua mensalidade, e seu saldo é de " + getSaldo());
        } else {
            System.out.println("Deu erro!");
        }

    }
}







