package br.com.ibm.treinamento.testes.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class ClienteOrigem {
    private String nome;
    private String cpf;
    private Integer idade;
    private String sexo;
    private String telefone;
    private String endereco;
}
