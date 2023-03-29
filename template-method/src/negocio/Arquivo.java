package negocio;

import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Arquivo {

    private String url;

    public Arquivo(String url) {
        this.url = url;
    }

    public ArrayList<String> readData() throws IOException {  // Método concreto, imutável pois sempre lê um CSV.
        ArrayList<String> retorno = new ArrayList<>();
        File file = new File(this.url);
        Scanner in = null;
        String cabeçalho = "";
        int count = 0;
       
        in = new Scanner(file);
        while (in.hasNextLine()) {
            count += 1;
            if (count == 1) {
                cabeçalho = in.nextLine();
            } else {
                retorno.add(in.nextLine());
            }
        }
        
        if (in != null) {
            in.close();
        }

        return retorno;
    }

    protected abstract String processData(ArrayList<String> retorno) throws IOException;

    public void writeData(String conteudo, String nameAndExtension) throws IOException { // Método concreto, imutável, sempre salva um arquivo independente de qual seja o atributo (extensão) passado.

        //=============== ALTERAR PARA O DIRETORIO DO SEU COMPUTADOR ===============\\
        String diretorio = "C:/Users/Gabryel/Desktop/if/2023/";

        Path diretorioArquivo = Path.of(diretorio + nameAndExtension);

        if(Files.notExists(diretorioArquivo)) {
            Files.createFile(diretorioArquivo);
        }

        Files.writeString(diretorioArquivo, conteudo);
    }

    public void parseDataAndGenerateOutput(String nameAndExtension) throws IOException {
        this.writeData(processData(readData()), nameAndExtension);
    }

    @Override
    public String toString() {
        return this.url;
    }
    
}
