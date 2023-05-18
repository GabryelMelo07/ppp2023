package negocio;

public class HtmlBase extends Html {
    
    public HtmlBase(){
        this.header = "<!DOCTYPE html>\n" +
                "<html lang='pt-BR'>\n" +
                "<head>\n" +
                "\t<meta charset='UTF-8'>\n" +
                "\t<meta http-equiv='X-UA-Compatible' content='IE=edge'>\n" +
                "\t<meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
                "\t<title>Decorator</title>\n" +
                "\t<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>" +
                "</head>" +
                "\n<body style='height:100vh;'>";
        this.body = "";
    }

    @Override
    public String getHtml() {
        return this.header;
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
