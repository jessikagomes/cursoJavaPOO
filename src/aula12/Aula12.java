package aula12;

public class Aula12 {
    public static void main(String[] args) {
        //filhas
        Mamifero ma = new Mamifero();
        Peixe pe = new Peixe();
        Reptil re = new Reptil();
        Ave av = new Ave();
        //descendentes
        Canguru can1 = new Canguru();
        Cachorro cao1 = new Cachorro();
        Cobra cob1 = new Cobra();
        Tartaruga tar1 = new Tartaruga();
        GoldFish gol1 = new GoldFish();
        Arara ara1 = new Arara();

        ma.locomover();
        pe.locomover();
        re.locomover();
        av.locomover();
        can1.locomover();
        can1.emitirSom();
        cao1.emitirSom();

    }
}
