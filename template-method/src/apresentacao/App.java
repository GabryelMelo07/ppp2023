package apresentacao;

import negocio.Arquivo;
import negocio.ArquivoHTML;
import negocio.ArquivoSQL;
import negocio.ArquivoTxt;
import negocio.ArquivoXML;

public class App {
    public static void main(String[] args) throws Exception {

        // =============== ALTERAR PARA O DIRETORIO DO SEU COMPUTADOR ===============\\
        String diretorio = "C:/Users/Gabryel/Desktop/if/2023/ppp/template-method/lib/teste.csv";

        Arquivo csvToTxt = new ArquivoTxt(diretorio);    // Converte CSV para TXT
        csvToTxt.parseDataAndGenerateOutput("pessoas.txt");

        Arquivo csvToSQL = new ArquivoSQL(diretorio);    // Converte CSV para SQL
        csvToSQL.parseDataAndGenerateOutput("pessoas.sql");

        Arquivo csvToXML = new ArquivoXML(diretorio);    // Converte CSV para XML
        csvToXML.parseDataAndGenerateOutput("pessoasXML.xml");

        Arquivo csvToHTML = new ArquivoHTML(diretorio);  // Converte CSV para HTML
        csvToHTML.parseDataAndGenerateOutput("pessoasHTML.html");
    }
}
