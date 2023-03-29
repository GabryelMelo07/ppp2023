package negocio;

import java.io.IOException;
import java.util.ArrayList;

public class ArquivoSQL extends Arquivo {

    public ArquivoSQL(String url) {
        super(url);
    }

    @Override
    protected String processData(ArrayList<String> retorno) throws IOException {

        String conteudo = "";
        // INSERT INTO pessoa (nome, email, cidade) values ();

        for (String string : retorno) {
            String[] aux = string.split(";");
            conteudo += String.format("INSERT INTO pessoa (nome, email, cidade) values ('%s, %s, %s'),\n", aux[0], aux[1], aux[2]);
        }

        String sql = conteudo.substring(0, conteudo.length() - 2);
        sql += ";";

        return sql;
    }
    
}
