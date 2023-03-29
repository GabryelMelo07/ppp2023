package negocio;

import java.io.IOException;
import java.util.ArrayList;

public class ArquivoXML extends Arquivo {

    public ArquivoXML(String url) {
        super(url);
    }

    @Override
    protected String processData(ArrayList<String> retorno) throws IOException {

        String conteudo = "<root>\n\t";
        int count = 1;

        for (String string : retorno) {
            String[] aux = string.split(";");
            conteudo += String.format("<pessoa%d>\n\t<nome>%s</nome>\n\t<email>%s</email>\n\t<cidade>%s</cidade>\n\t</pessoa%d>\n", count, aux[0], aux[1], aux[2], count);
            count++;
        }

        conteudo += "</root>";

        return conteudo.trim();
    }
    
}
