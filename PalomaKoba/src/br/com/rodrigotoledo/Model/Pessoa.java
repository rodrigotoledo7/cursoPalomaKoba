package br.com.rodrigotoledo.Model;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int anonasc;

    public Pessoa(String nome, int anonasc) {
        this.nome = nome;
        this.anonasc = anonasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnonasc() {
        return anonasc;
    }

    public void setAnonasc(int anonasc) {
        this.anonasc = anonasc;
    }

    public int calculaIdade() {
        int idade;
        int anoatual = Calendar.getInstance().get(Calendar.YEAR);
        idade = anoatual - anonasc;
        return idade;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Maria", 1980);
        Pessoa x = new Pessoa("Pedro", 1990);
        System.out.println(p.toString());
        System.out.println((x.toString()));
        p.setNome("Maria Carvalho");
        p.setAnonasc(1986);
        System.out.println(p.toString());

    }
}
