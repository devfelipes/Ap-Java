package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa1 {
	public static void main(String [] args){
	DateTimeFormatter dat1f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate dat1 = LocalDate.now();
	System.out.println("Dat1: " +dat1);
	
	LocalDate dat3 = LocalDate.parse("2022-09-22");
	System.out.println("Dat3: "+dat3);
	
	LocalDateTime dat4 = LocalDateTime.parse("2022-09-22T23:40:20");
	System.out.println("Dat4: "+dat4);
	
	Instant dat5 = Instant.parse("2022-09-22T23:40:20-03:00");
	System.out.println("Dat5: "+dat5);
	
	LocalDate dat6 = LocalDate.parse("22/09/2022", dat1f);
	System.out.println("Dat6: "+dat6);
	}
	
}
