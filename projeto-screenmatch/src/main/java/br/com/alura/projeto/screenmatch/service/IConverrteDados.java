package br.com.alura.projeto.screenmatch.service;

public interface IConverrteDados {

    <T> T obterDados(String json, Class <T> classe);
}
