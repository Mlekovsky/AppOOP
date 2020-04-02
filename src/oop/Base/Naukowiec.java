package oop.Base;

import java.util.ArrayList;
import java.util.List;

import oop.Interfaces.IPoliglota;

public abstract class Naukowiec implements IPoliglota{

	protected String Imie;
	
	protected String Nazwisko;
	
	protected String Osiagniecie;
	
	protected String Dyscyplina;
		
	//Typ referencyjny nie powinien byæ nullem, dlatego warto zainicjalizowaæ pust¹ listê dla nowych obiektów
	protected List<String> jezyki = new ArrayList<String>(); 
	
	public Naukowiec(String imie, String naziwsko, String osiagniecie, String dyscyplina, List<String> jezyki) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Osiagniecie = osiagniecie;
		this.Dyscyplina = dyscyplina;
		this.jezyki = jezyki;
	}
	
	public Naukowiec(String imie, String naziwsko, String osiagniecie, String dyscyplina) 
	{
		this.Imie = imie;
		this.Nazwisko = naziwsko;
		this.Osiagniecie = osiagniecie;
		this.Dyscyplina = dyscyplina;
	}	
	
	public String getImie() 
	{
		return Imie;
	}
	
	public String getNazwisko() 
	{
		return Nazwisko;
	}
	
	public String getOsiagniecie() 
	{
		return Osiagniecie;
	}
	
	public String getDyscyplina() 
	{
		return Dyscyplina;
	}
	
	public void ImieNazwisko() 
	{
		System.out.println("Nazywam siê "+this.getImie()+" "+this.getNazwisko());
	}
	
	protected String getJezyki() {
		StringBuilder result = new StringBuilder();
		
		for(String el : this.jezyki) {
			result.append(el);
			result.append(", ");
		}
		
		//usuwamy ostatni przecinek ze spacj¹
		result.delete(result.length() - 2, result.length() - 1);
		
		return result.toString();
	}
	
	public abstract void DyscyplinaNaukowa();
	
	public abstract void NajwiekszeOsiagniecie(); 
	
}
