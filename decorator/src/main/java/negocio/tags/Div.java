package negocio.tags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import negocio.Html;
import negocio.HtmlDecorator;

public class Div<T> extends HtmlDecorator {

    private List<T> divBody;

    @SafeVarargs
    public Div(Html html, T... objetos) {
        super(html);
        this.divBody = new ArrayList<>(Arrays.asList(objetos));
        this.body = "\t<div style='width:100%;>\n\t";
        
        for (T t : objetos) {
            this.body += t.toString().replaceAll("\\[|\\]|,", "") + "\n\t";
        }

        this.body += "</div>";
    }

    @SafeVarargs
    public Div(Html html, String className, T... objetos) {
        super(html);
        this.divBody = new ArrayList<>(Arrays.asList(objetos));
        this.body = "\t<div class='" + className + "'>\n\t";

        for (T t : objetos) {
            this.body += t.toString().replaceAll("\\[|\\]|,", "") + "\n\t";
        }

        this.body += "</div>";
    }

    @SafeVarargs
    public Div(Html html, String className, String style, T... objetos) {
        super(html);
        this.divBody = new ArrayList<>(Arrays.asList(objetos));
        this.body = "\t<div class='" + className + "' style='" + style + "'>\n\t";

        for (T t : objetos) {
            this.body += t.toString().replaceAll("\\[|\\]|,", "") + "\n\t";
        }

        this.body += "</div>";
    }

    public List<T> getDivBody() {
        return this.divBody;
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
