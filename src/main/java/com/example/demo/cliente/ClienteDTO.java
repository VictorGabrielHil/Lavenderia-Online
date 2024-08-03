package com.example.demo.cliente;

import com.example.demo.endereco.EnderecoDTO;
import com.example.demo.telefone.TelefoneDTO;
import com.example.demo.user.UsuarioDTO;
import java.util.List;

public class ClienteDTO extends UsuarioDTO {

    private String cpf;
    private List<EnderecoDTO> enderecos;
    private List<TelefoneDTO> telefones;

    // Construtor vazio
    public ClienteDTO() {}

    // Construtor completo
    public ClienteDTO(UsuarioDTO usuarioDTO, String cpf, List<EnderecoDTO> enderecos, List<TelefoneDTO> telefones) {
        super(usuarioDTO);
        this.cpf = cpf;
        this.enderecos = enderecos;
        this.telefones = telefones;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public List<TelefoneDTO> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "cpf='" + cpf + '\'' +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                '}';
    }
}