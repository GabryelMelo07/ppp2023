package negocio;

import java.io.IOException;
import java.util.ArrayList;

public class ArquivoTxt extends Arquivo {

    public ArquivoTxt(String url) {
        super(url);
    }

    @Override
    protected String processData(ArrayList<String> retorno) throws IOException {

        String conteudo = "";
        int count = 1;

        for (String string : retorno) {
            String[] aux = string.split(";");
            conteudo += String.format("[PESSOA %d]:    {NOME: %s}   -   {E-MAIL: %s}   -   {CIDADE: %s}\n", count, aux[0], aux[1], aux[2]);
            count ++;    
        }

        return conteudo;
    }
    
}