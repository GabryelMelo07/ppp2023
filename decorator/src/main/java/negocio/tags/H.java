package negocio.tags;

import negocio.Html;
import negocio.HtmlDecorator;

public class H extends HtmlDecorator {

    public H(Html html, int tamanhoH, String text) {
        super(html);
        if (tamanhoH < 1 || tamanhoH > 6) {
            throw new IllegalArgumentException("O elemento de cabeçalho deve ser algo entre h1 e h6.");
        } else {
            this.body = "\t<h" + tamanhoH + ">" + text + "</h" + tamanhoH + ">";
        }
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public String getFooter() {
        return this.FOOTER;
    }
    
}
