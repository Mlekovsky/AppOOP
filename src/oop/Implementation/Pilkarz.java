package oop.Implementation;

import java.util.List;

import oop.Base.Sportowiec;

public class Pilkarz extends Sportowiec {

	public Pilkarz(String imie, String naziwsko, String sukces, String dyscyplina, int obserwujacy) {
		super(imie, naziwsko, sukces, dyscyplina, obserwujacy);
	}
	
	public Pilkarz(String imie, String naziwsko, String sukces, String dyscyplina, List<String> jezyki) {
		super(imie, naziwsko, sukces, dyscyplina, jezyki);
	}
	
	public Pilkarz(String imie, String naziwsko, String sukces, String dyscyplina) {
		super(imie, naziwsko, sukces, dyscyplina);
	}
	

	@Override
	public void LiczbaObserwujacych() 
	{
		System.out.println("Liczba obserwuj¹cych na Instagramie to " + this.obserwujacy);
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
