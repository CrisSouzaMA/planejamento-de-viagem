package src.main;

/**
 * Classe Viagem.
 */

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
            new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  /**
   * Método retornarDuracaoVoo.
   */

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return this.voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
            new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    return this.voo.retornarInformacaoVoo(this.embarque, this.origem,
            tempoViagem.retonarDesembarqueHorarioLocalDestino(), this.destino);
  }
}