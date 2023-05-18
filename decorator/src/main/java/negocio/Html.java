package negocio;

public abstract class Html {
    protected String header;
    protected String body;
    protected final String FOOTER = "\n</body>\n</html>";
    
    public abstract String getHtml();
    public abstract String getBody();
    public abstract String getFooter();
}
