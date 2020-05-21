package br.com.ibm.treinamento.testes.mapper;

import br.com.ibm.treinamento.testes.cliente.ClienteDestino;
import br.com.ibm.treinamento.testes.cliente.ClienteOrigem;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-18T11:38:20-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDestino converterOrigemParaDestino(ClienteOrigem clienteOrigem) {
        if ( clienteOrigem == null ) {
            return null;
        }

        ClienteDestino clienteDestino = new ClienteDestino();

        clienteDestino.setNome( clienteOrigem.getNome() );
        clienteDestino.setCpf( clienteOrigem.getCpf() );
        clienteDestino.setIdade( clienteOrigem.getIdade() );
        clienteDestino.setSexo( clienteOrigem.getSexo() );
        clienteDestino.setTelefone( clienteOrigem.getTelefone() );
        clienteDestino.setEndereco( clienteOrigem.getEndereco() );

        return clienteDestino;
    }
}
