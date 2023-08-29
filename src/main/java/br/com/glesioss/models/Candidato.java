package br.com.glesioss.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.glesioss.enuns.Genero;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero; 
    public String naturalidade;
    public String nacionalidade;
    public Endereço endereco;
    public List<Escolaridade> escolaridades = new ArrayList<>();
}
