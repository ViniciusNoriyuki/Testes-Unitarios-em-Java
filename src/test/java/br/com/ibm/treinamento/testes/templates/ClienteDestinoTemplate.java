package br.com.ibm.treinamento.testes.templates;

import br.com.ibm.treinamento.testes.cliente.ClienteDestino;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class ClienteDestinoTemplate implements TemplateLoader {

    public static final String CLIENTE_DESTINO_VALIDO = "cliente destino valido";

    @Override
    public void load() {
        Fixture.of(ClienteDestino.class).addTemplate(CLIENTE_DESTINO_VALIDO, new Rule(){{
            add("nome", "Vinicius");
            add("cpf", "999.999.999-99");
            add("idade", 25);
            add("sexo", "masculino");
            add("telefone", "9999-9999");
            add("endereco", "Rua Um");
        }});
    }
}
