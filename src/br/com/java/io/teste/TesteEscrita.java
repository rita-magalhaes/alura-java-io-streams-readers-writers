package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
	
  //Fluxo de Entrada com Arquivo
	OutputStream fos = new FileOutputStream("lorem2.txt");
	Writer osw = new OutputStreamWriter(fos);
	BufferedWriter bw = new BufferedWriter(osw);
	
	bw.write("sunt in culpa qui officia deserunt mollit anim ");
	bw.newLine();
	bw.newLine();
	bw.write("as perolas sao verdes");
	
	
	bw.close();
	
}
}