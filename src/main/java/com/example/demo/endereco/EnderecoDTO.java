package com.example.demo.endereco;

public class EnderecoDTO {
    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String numero;
    private String localidade;
    private String uf;

    public EnderecoDTO(String logradouro, String numero, String localidade, String bairro, String uf, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.localidade =localidade;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "EnderecoDTO{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}