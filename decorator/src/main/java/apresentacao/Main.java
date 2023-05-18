package apresentacao;

import negocio.Html;
import negocio.HtmlBase;
import negocio.tags.A;
import negocio.tags.Button;
import negocio.tags.Div;
import negocio.tags.H;
import negocio.tags.Input;
import negocio.tags.P;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter arquivo = new FileWriter("decorator.html");
        
        Html html = new HtmlBase();
        html = new A(html, "GitHub", "https://github.com/gabryelmelo07/");
        html = new A(html, "LinkedIn", "https://www.linkedin.com/in/gabryel-melo-232488240/");
        html = new H(html, 1, "TESTE EM H1");
        html = new P(html, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis, molestias, delectus iusto quos cum veniam placeat"
                       + "modi laborum rem pariatur quam incidunt quisquam molestiae, maiores culpa. Suscipit, laudantium dicta. Ea!");
        
        html = new Div<>(html, "container-fluid", "width:100%; height:80%; display:flex; flex-direction:column; align-items:center; justify-content:center; border:3px solid red;",   // Div externa
                new A(html, "Facebook", "https://facebook.com/", "vermelho").getBody(),   //  ❮⥢⥢⥢⥢ Conteúdo da div
                new A(html, "Instagram", "https://instagram.com/", "amarelo").getBody(), //  ❮⥢⥢⥢⥢
                new H(html, 3, "Texto em H3").getBody(),                                    // ❮⥢⥢⥢⥢
                    new Div<>(html, "div-child", "width:80%; height:45%; display:flex; flex-direction:column; align-items:center; justify-content:center; border:2px solid blue; padding:5px;",  // Div dentro da div
                        new H(html, 1, "EU MEREÇO UMA NOTA BOA POR ESTE TRABALHO!").getBody(), // ❮⥢⥢⥢⥢ Conteúdo da div 2
                        new Input(html, "Insira a nota...").getBody(),
                        new Button(html, "DAR NOTA EXTRA", "btn btn-primary").getBody()
                    ).getBody()
        ); 
        
        System.out.println(html.getHtml() + html.getFooter());

        arquivo.write(html.getHtml());
        arquivo.write(html.getFooter());
        arquivo.close();
        
    }
}
