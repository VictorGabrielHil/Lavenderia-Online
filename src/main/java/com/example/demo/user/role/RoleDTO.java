package com.example.demo.user.role;

import com.example.demo.endereco.EnderecoDTO;
import com.example.demo.telefone.TelefoneDTO;

import java.time.LocalDate;
import java.util.List;

public class RoleDTO {
    private String role; // "client" ou "employee"
    private String cpf; // Para "client"
    private List<EnderecoDTO> enderecos; // Para "client"
    private List<TelefoneDTO> telefones; // Para "client"
    private LocalDate birthDate; // Para "employee"

    public RoleDTO(String cpf, List<EnderecoDTO> enderecosDTO, List<TelefoneDTO> telefonesDTO) {
        this.cpf = cpf;
        this.enderecos = enderecosDTO;
        this.telefones =telefonesDTO;
    }

    public RoleDTO() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "role='" + role + '\'' +
                ", cpf='" + cpf + '\'' +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                ", dataNascimento='" + birthDate + '\'' +
                '}';
    }
}