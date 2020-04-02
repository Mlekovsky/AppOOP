package oop.Implementation;

import oop.Base.Artysta;

public class Pisarka extends Artysta {

	public Pisarka(String imie, String nazwisko, String dzielo) {
		super(imie, nazwisko, dzielo);
	}

	@Override
	public void DziedzinaSztuki() 
	{
		System.out.println("Moja dziedzina sztuki to literatura");
	}
	
	@Override
	public void WazneDzielo() 
	{
		System.out.println("Moje wa¿ne dzie³o to "+this.getDzielo());
	}
}
