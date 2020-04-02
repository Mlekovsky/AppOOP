package oop.Implementation;

import oop.Base.Artysta;
import oop.Interfaces.IInstagramer;

public class Piosenkarz extends Artysta implements IInstagramer {
	
	private int obserwujacy;
	
	public Piosenkarz(String imie, String nazwisko, String dzielo) { super(imie, nazwisko, dzielo); }

	public Piosenkarz(String imie, String nazwisko, String dzielo, int obserwujacy) 
	{
		super(imie, nazwisko, dzielo);
		this.obserwujacy=obserwujacy;
	}
	
	@Override
	public void DziedzinaSztuki() 
	{
		System.out.println("Moja dziedzina sztuki to muzyka");
	}
	
	@Override
	public void WazneDzielo() 
	{
		System.out.println("Moje wa¿ne dzie³o to "+this.getDzielo());
	}
	
	@Override
	public void LiczbaObserwujacych() 
	{
		System.out.println("Liczba obserwuj¹cych na Instagramie to "+this.obserwujacy);
	}
}

