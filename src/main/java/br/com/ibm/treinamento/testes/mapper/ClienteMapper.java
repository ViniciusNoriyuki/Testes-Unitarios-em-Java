package br.com.ibm.treinamento.testes.mapper;

import br.com.ibm.treinamento.testes.cliente.ClienteDestino;
import br.com.ibm.treinamento.testes.cliente.ClienteOrigem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDestino converterOrigemParaDestino(ClienteOrigem clienteOrigem);
}
