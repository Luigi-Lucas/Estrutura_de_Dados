package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import Model.Cliente;
import br.edu.fateczl.listaobject.Lista;

public class ModificacaoCadastroController {

	public ModificacaoCadastroController() {
		super();
	}

	private void novoArquivo(Lista l, String nomeArquivo) throws Exception {
		String path = "C:\\temp";
		File dir = new File(path);
		File arq = new File(path, nomeArquivo);
		if (dir.exists() && dir.isDirectory()) {
			boolean existe = false;
			if (arq.exists()) {
				existe = true;
			}
			for (int i = 0; i < l.size(); i++) {
				String conteudo = geraTxt(l, i);
				FileWriter fileWriter = new FileWriter(arq, existe);
				PrintWriter print = new PrintWriter(fileWriter);
				print.write(conteudo);
				print.flush();
				print.close();
				fileWriter.close();
			}
		} else {
			throw new IOException("Diretório inválido!");
		}

	}

	public void novoCadastro(int idadeMin, int idadeMax, double limiteCredito) throws Exception {
		Cliente c = new Cliente();

		Lista l = new Lista();

		String path = "C:\\temp";
		String nome = "cadastro.csv";

		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {
			File arq = new File(path, nome);
			if (arq.exists() && arq.isFile()) {
				FileInputStream fluxo = new FileInputStream(arq);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					String[] info = linha.split(";");
					if (Integer.parseInt(info[2]) >= idadeMin && (Integer.parseInt(info[2]) <= idadeMax)) {
						if (Double.parseDouble(info[3]) > limiteCredito) {
							c.CPF = (String) info[0];
							c.nome = (String) info[1];
							c.idade = Integer.parseInt(info[2]);
							c.limiteCredito = Double.parseDouble(info[3]);
							if (l.isEmpty()) {
								l.addFirst(c.CPF + ";" + c.nome + " ;" + c.idade + ";" + c.limiteCredito);
							} else {
								l.addLast(c.CPF + ";" + c.nome + " ;" + c.idade + ";" + c.limiteCredito);
							}
						}
					}
				}
				String nomeArq = "Idades" + idadeMin + "/" + idadeMax + "limite" + limiteCredito;
				novoArquivo(l, nomeArq);
			}
		}
	}

	private String geraTxt(Lista l, int i) throws Exception {
		StringBuffer buffer = new StringBuffer();
		String c = (String) l.get(i);
		String[] info = c.split(";");
		String linha = info[0] + ";" + info[1] + ";" + info[2] + ";" + info[3];
		buffer.append(linha + "\n");

		return buffer.toString();
	}
}
