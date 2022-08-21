package src.main;

/**
 * Classe Voo.
 */

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   *
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;
    int round = (int) Math.round(duracaoDouble);
    this.tempoVoo = round;
    return this.tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   *
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
                                      String destino) {
    return "Voo de " + origem
            + "para " + destino + "saindo ás "
            + embarque + "e chegando ao destino às " + desembarque;
  }
}

