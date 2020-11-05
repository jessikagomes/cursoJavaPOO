package aula02atividade;

public class Garrafa {
    Double tamanho;
    String cor, modelo;
    Boolean vazia;

    void status(){
        System.out.println("Tamanho em litros: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está vazia? " + this.vazia);


    }

    void encher(){
        if(!this.vazia) {
            System.out.println("Vai transbordar! A garrafa já está cheia!");
        }else{
            System.out.println("Que bom, agora você encheu sua garrafa");
        }
    }

    void esvaziar(){
        if(this.vazia) {
            System.out.println("Você não consegue esvaziar pois a garrafa estava vazia!");
        }else{
            System.out.println("Que bom, você esvaziou sua garrafa");
        }
    }
}
