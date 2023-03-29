package negocio;

import java.io.IOException;
import java.util.ArrayList;

public class ArquivoHTML extends Arquivo {

    public ArquivoHTML(String url) {
        super(url);
    }

    @Override
    protected String processData(ArrayList<String> retorno) throws IOException {

        String conteudo = "<!DOCTYPE html><html lang='pt-BR'><head><meta charset='UTF-8'><meta http-equiv='X-UA-Compatible' content='IE=edge'><meta name='viewport' content='width=device-width, initial-scale=1.0'><link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'><title>Pessoas em HTML</title></head><body><table class='table table-striped'><thead><tr><th>Nome</th><th>E-mail</th><th>Cidade</th></tr></thead><tbody>";

        for (String string : retorno) {
            String[] aux = string.split(";");
            conteudo += String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>", aux[0], aux[1], aux[2]);
        }

        conteudo += "</tbody></table></body></html>";

        return conteudo;
        
    }
    
}
