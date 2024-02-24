package br.com.alura.projeto.screenmatch;

import br.com.alura.projeto.screenmatch.model.DadosSerie;
import br.com.alura.projeto.screenmatch.service.ConsumoApi;
import br.com.alura.projeto.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=suits&apikey=20a88c70");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados( json, DadosSerie.class);
		System.out.println(dados);
	}
}

