package com.fie2377.escala.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import lombok.Cleanup;

@Service
public class CarregarExcell {
	


	public List<Row> carregaDadosExcell(String caminho, int posisaoDaAba) throws IOException{
		List<T> lista = new ArrayList<T>();

			//apos utilizar o arquivo, sera fechado
			@Cleanup FileInputStream file = new FileInputStream(caminho);
			
			//retorna o Excell inteiro
			Workbook arquivoCarregado = new XSSFWorkbook(file);
			
			//pega a primeira aba na posição 0
			Sheet primeiraAba = arquivoCarregado.getSheetAt(posisaoDaAba);
			
			//cada linha do excell
			List<Row> linhasDoExcell = (List<Row>) tranformaIteratorEmListaLista(primeiraAba.iterator());
			
		return linhasDoExcell;
	}
	
	public List<?> tranformaIteratorEmListaLista(Iterator<?> itetator){
		return IteratorUtils.toList(itetator);
	}
	
	
	

	
}
