package aula02atividade;

public class Atividade {
    public static void main(String[] args) {

        Garrafa g1 = new Garrafa();

        g1.vazia = false;
        g1.tamanho = 1.5;
        g1.modelo = "sport";
        g1.cor = "amarelo";
        g1.status();
        g1.esvaziar();

        Garrafa g2 = new Garrafa();
        g2.vazia = true;
        g2.tamanho = 0.9;
        g2.modelo = "classica";
        g2.cor = "Azul";
        g2.status();
        g2.esvaziar();
    }
}
