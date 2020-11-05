package aula7e8;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nom, String nac, int ida, int vit,
                   int der, int emp, float alt, float pes) {
        this.nome = nom;
        this.nacionalidade = nac;
        this.idade = ida;
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
        this.altura = alt;
        this.setPeso(pes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(peso<52.2){
            categoria="Inválido";
        }else if(peso<=70.3){
            categoria="Peso Leve";
        }else if(peso<=83.9){
            categoria="Peso Médio";
        }else if(peso>=120.2){
            categoria="Peso Pesado";
        }else{
            categoria="Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int ida) {
        this.idade = ida;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pes) {
        this.peso = pes;
        setCategoria();
    }

    public void apresentar(){
        System.out.println("Este é o lutador: "+ this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: "+ this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }
    public void status(){
        System.out.println(this.getNome()+ " é um " + getCategoria());
        System.out.println("Ganhou " +  this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas()+ " vezes");
        System.out.println("Empatou "+ this.getEmpates()+ " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);

    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);

    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}
