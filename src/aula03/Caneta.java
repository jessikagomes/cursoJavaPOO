package aula03;
public class Caneta{
    public String modelo, cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.carga);
        System.out.println(this.tampada);

    }

    public void rabiscar(){
        if(this.tampada) {
            System.out.println("Erro");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}

