package oop.Implementation;

import java.util.List;

import oop.Base.Naukowiec;

public class Matematyk extends Naukowiec {

	public Matematyk(String imie, String naziwsko, String osiagniecie, String dyscyplina, List<String> jezyki) 
	{
		super(imie, naziwsko, osiagniecie, dyscyplina, jezyki);
	}
	
	public Matematyk(String imie, String naziwsko, String osiagniecie, String dyscyplina) 
	{
		super(imie, naziwsko, osiagniecie, dyscyplina);
	}

	@Override
	public void ZnajomoscJezykow() 
	{
		System.out.println("Znam takie jezyki jak: " + this.getJezyki());
	}

	@Override
	public void DyscyplinaNaukowa() 
	{
		System.out.println("Moja dyscyplina naukowa to " + this.getDyscyplina());
	}

	@Override
	public void NajwiekszeOsiagniecie() 
	{
		System.out.println("Moje najwiêksze osi¹gniecie to " + this.getOsiagniecie());
	}	
}
