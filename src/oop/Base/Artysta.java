package oop.Base;

public abstract class Artysta {
	
	private String imie;
	private String nazwisko;
	private String dzielo;
	
	public Artysta(String imie, String nazwisko, String dzielo) 
	{
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.dzielo=dzielo;
	}
	
	public String getImie() 
	{
		return imie;
	}
	
	public String getNazwisko() 
	{
		return nazwisko;
	}
	
	public String getDzielo() 
	{
		return dzielo;
	}
	
	public void ImieNazwisko() 
	{
		System.out.println("Nazywam siê "+this.getImie()+" "+this.getNazwisko());
	}
	
	public abstract void DziedzinaSztuki();

	public abstract void WazneDzielo();

}
