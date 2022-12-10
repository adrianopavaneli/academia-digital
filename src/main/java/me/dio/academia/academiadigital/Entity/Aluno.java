package me.dio.academia.academiadigital.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private Long id;
	private String nome;
	private String cpf;
	private LocalDate dataDeNascimento;
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
