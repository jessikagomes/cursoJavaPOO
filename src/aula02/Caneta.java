package aula02;

public class Caneta {
    //atributos:
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    //métodos:
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" está tampada? "+ this.tampada);

    }
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println(" ERRO! Não posso rabiscar!");
        }else{
                System.out.println("Estou rabiscando");
        }


    }

    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;

    }

}
