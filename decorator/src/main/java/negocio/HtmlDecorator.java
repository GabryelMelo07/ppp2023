package negocio;

public abstract class HtmlDecorator extends Html {
    private Html html;

    public HtmlDecorator(Html html) {
        this.html = html;
    }

    @Override
    public String getHtml() {
        return String.format("%s\n%s", this.html.getHtml(), this.getBody());
    }

}
