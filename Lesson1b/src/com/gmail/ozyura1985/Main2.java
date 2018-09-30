package com.gmail.ozyura1985;

public class Main2 {

	public static void main(String[] args) {
		 double tovar=5200;
	      double sale=25;
	      double tovarFoSale;
	      tovarFoSale=tovar-(tovar/100*sale);
	      System.out.println("Ціна товару - "+tovar+" грн.");
	      System.out.println("Знижка - "+sale+"%");
	      System.out.println("Ціна товару зі знижкою "+tovarFoSale+" грн.");
	   }

	}
