package br.com.empresa.backend.backendapi.domain;

public class Negocio {
    private Integer id;
    private TipoNegocio tipoNegocio; // Barbearia, Salão de beleza, Estudio tatto, etc... Podemos cadastrar mais...
    private List<Produto> produtos;
    private List<Pacote> produtos;
    private List<Servico> produtos;

}
