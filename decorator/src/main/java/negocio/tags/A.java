package negocio.tags;

import negocio.Html;
import negocio.HtmlDecorator;

public class A extends HtmlDecorator {
    
    public A(Html html, String textLink, String link, String cor) {
        super(html);
        if(cor.toLowerCase().equals("amarelo")) {
            this.body = "\t<a href='" + link + "' class='link-warning'>" + textLink + "</a>";
        } else if (cor.toLowerCase().equals("vermelho")) {
            this.body = "\t<a href='" + link + "' class='link-danger'>" + textLink + "</a>";
        }
    }

    public A(Html html, String textLink, String link) {
        super(html);
        this.body = "\t<a href='" + link + "'>" + textLink + "</a>";
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
