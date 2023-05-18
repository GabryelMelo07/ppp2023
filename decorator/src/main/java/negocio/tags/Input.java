package negocio.tags;

import negocio.Html;
import negocio.HtmlDecorator;

public class Input extends HtmlDecorator {

    public Input(Html html, String placeHolder) {
        super(html);
        this.body = "\t<input type='text' placeholder='" + placeHolder + "' class='form-control' style='margin:5px; padding:5px;'>";
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