package br.com.java.io.teste;
import java.io.FileWriter;
import java.io.IOException;

//Código omitido

public class TesteEscritaFileWriter {

        public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("lorem2.txt");
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("asfasdfsafdas dfs sdf asf assdß");

        fw.close();

        }
}
