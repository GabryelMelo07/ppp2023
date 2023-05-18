package negocio.tags;

import negocio.Html;
import negocio.HtmlDecorator;

public class P extends HtmlDecorator {
    
    public P(Html html, String texto) {
        super(html);
        this.body = "\t<p>" + texto + "</p>";
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
