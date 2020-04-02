package oop.Base;

import java.util.ArrayList;
import java.util.List;

import oop.Interfaces.IInstagramer;
import oop.Interfaces.IPoliglota;

public abstract class Sportowiec implements IInstagramer, IPoliglota {
	
	protected String Imie;
	
	protected String Nazwisko;
	
	protected String Sukces;
	
	protected String Dyscyplina;
	
	//Skoro ka�dy sportowiec musi zaimplementowa� interfejsy IInstagramer i IPoliglota, 
	//to mo�na w klasie bazowej przetrzyma� informacj� potrzebn� dla poprawnego wy�wietlenia informacji dla tych interfejs�w
	protected int obserwujacy;
	
	//Typ referencyjny nie powinien by� nullem, dlatego warto zainicjalizowa� pust� list� dla nowych obiekt�w
	protected List<String> jezyki = new ArrayList<String>(); 
	
	//konstruktor dla interfejsu IInstagramer
	public Sportowiec(String imie, String naziwsko, String sukces, String dyscyplina, int obserwujacy) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Sukces = sukces;
		this.Dyscyplina = dyscyplina;
		this.obserwujacy = obserwujacy;
	}
	
	//konstruktor dla interfejsu IPoliglota
	public Sportowiec(String imie, String naziwsko, String sukces, String dyscyplina, List<String> jezyki) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Sukces = sukces;
		this.Dyscyplina = dyscyplina;
		this.jezyki = jezyki;
	}
	
	//konstruktor bazowy
	public Sportowiec(String imie, String naziwsko, String sukces, String dyscyplina) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Sukces = sukces;
		this.Dyscyplina = dyscyplina;
	}
	
	//Konstruktor pe�ny (implementuj�cy oba interfejsy) - nie u�ywany w programie, ale zawsze warto dopisa�	
	public Sportowiec(String imie, String naziwsko, String sukces, String dyscyplina, int obserwujacy, List<String> jezyki) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Sukces = sukces;
		this.Dyscyplina = dyscyplina;
		this.obserwujacy = obserwujacy;
		this.jezyki = jezyki;		
	}
	
	public String getImie() 
	{
		return Imie;
	}
	
	public String getNazwisko() 
	{
		return Nazwisko;
	}
	
	public String getSukces() 
	{
		return Sukces;
	}
	
	public String getDyscyplina() 
	{
		return Dyscyplina;
	}
	
	public void ImieNazwisko() 
	{
		System.out.println("Nazywam si� "+this.getImie()+" "+this.getNazwisko());
	}
	
	protected String getJezyki() {
		StringBuilder result = new StringBuilder();
		
		for(String el : this.jezyki) {
			result.append(el);
			result.append(", ");
		}
		
		//usuwamy ostatni przecinek ze spacj�
		result.delete(result.length() - 2, result.length() - 1);
		
		return result.toString();
	}
	
	public abstract void DyscyplinaSportu();
	
	public abstract void NajwiekszySukces(); 
}
