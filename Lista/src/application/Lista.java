package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ana");
		list.add("Felipe");
		list.add("Mlaudia");
		list.add("Wagner");
		list.add("Mruna");
		list.add("Samuel");
		for (String x : list) {
			System.out.println("Nome: " + x);
			
		}
		System.out.println("________________");
		list.removeIf(x -> x.charAt(0)=='M');
		for (String x : list) {
			System.out.println("Nome: " + x);
		}
		
	}

}
