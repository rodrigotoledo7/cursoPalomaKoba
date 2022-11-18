package br.com.rodrigotoledo.Model;

public class Estudante extends Pessoa{
    private String registro;
    private float media;
    private float nota1,nota2;

    public Estudante(String nome, int anonasc, String registro, float media, float nota1, float nota2) {
        super(nome, anonasc);
        this.registro = registro;
        this.media = media;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

}
