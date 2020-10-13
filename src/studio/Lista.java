package studio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Ramones");
		list.add("Sex Pistols");
		list.add("Matanza");
		list.add("Metallica");
		list.add("Mutantes");
		list.add("Beatles");
		list.add("Rolling Stones");
		list.add("CCR");
		list.add(2, "AC/DC");

		list.remove(1);	
		list.remove("CCR");
		
		list.removeIf(x -> x.charAt(0) == 'R');
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		System.out.println("Consulta Posicao Beatles: " + list.indexOf("Beatles"));


		System.out.println("Carrega somente quem inicia com a letra M");		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x:result) {
			System.out.println(x);
		}
		
		System.out.println("Carrega o primeiro elemento que inicia com a letra M");		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
