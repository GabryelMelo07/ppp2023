package negocio.tags;

import negocio.Html;
import negocio.HtmlDecorator;

public class Button extends HtmlDecorator {

    public Button(Html html, String texto, String className) {
        super(html);
        this.body = "\t<button class='" + className + "' style='margin:5px;'>" + texto + "</button>";
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
