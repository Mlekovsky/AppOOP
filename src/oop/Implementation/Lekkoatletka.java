package oop.Implementation;

import oop.Base.Sportowiec;

public class Lekkoatletka extends Sportowiec{

	public Lekkoatletka(String imie, String naziwsko, String sukces, String dyscyplina, int obserwujacy) {
		super(imie, naziwsko, sukces, dyscyplina, obserwujacy);
	}
	
	public Lekkoatletka(String imie, String naziwsko, String sukces, String dyscyplina) {
		super(imie, naziwsko, sukces, dyscyplina);
	}
	
	@Override
	public void LiczbaObserwujacych() 
	{
		System.out.println("Liczba obserwuj�cych na Instagramie to " + this.obserwujacy);
	}

	@Override
	public void ZnajomoscJezykow() 
	{
		System.out.println("Znam takie jezyki jak: " + this.getJezyki());
	}

	@Override
	public void DyscyplinaSportu() 
	{
		System.out.println("Moja dyscyplina sportu to: " + this.getDyscyplina());
	}

	@Override
	public void NajwiekszySukces() 
	{
		System.out.println("Moj najwiekszy sukces to: " + this.getSukces());		
	}
}
