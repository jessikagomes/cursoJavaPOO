package aula11;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;

    public final void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Dados {" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
