package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Titel") String titulo,
                         @JsonAlias("TotalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliação) {

}
