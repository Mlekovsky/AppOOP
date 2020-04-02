package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oop.Base.Artysta;
import oop.Base.Naukowiec;
import oop.Base.Sportowiec;
import oop.Implementation.Aktor;
import oop.Implementation.Elektrotechnik;
import oop.Implementation.Lekkoatletka;
import oop.Implementation.Matematyk;
import oop.Implementation.Pilkarz;
import oop.Implementation.Piosenkarz;
import oop.Implementation.Pisarka;
import oop.Implementation.Skoczek;
import oop.Interfaces.IInstagramer;
import oop.Interfaces.IPoliglota;

public class AppOOP {
	public static void main(String [] args) {
		
		//Artysci
		List<Artysta> artysci=new ArrayList<Artysta>();
		artysci.add(new Piosenkarz("Phil","Collins","In the air tonight"));
		artysci.add(new Aktor("Al","Pacino","Ojciec chrzestny"));
		artysci.add(new Piosenkarz("Freddy","Mercury","The Show Must Go On"));
		artysci.add(new Pisarka("J.K.","Rowling","Harry Potter"));
		
		//Sportowcy
		List<Sportowiec> sportowcy = new ArrayList<Sportowiec>();
		sportowcy.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", "Pi³ka no¿na"));
		sportowcy.add(new Skoczek("Kamil", "Stoch", "Mistrzostwo olimpijskie", "Skoki narciarskie"));
		sportowcy.add(new Lekkoatletka("Anita", "W³odaczyk", "Mistrzosto olimpijskie", "lekkoatletyka"));
		
		//naukowcy
		List<Naukowiec> naukowcy = new ArrayList<Naukowiec>();
		naukowcy.add(new Matematyk("Stanis³aw", "Ulam", "Metody numeryczne", "Matematyka"));
		naukowcy.add(new Elektrotechnik("Nikola", "Tesla", "Silnik indukcyjny", "Elektrotechnika"));
		
		//instagrametrzy
		List<IInstagramer> instagramerzy = new ArrayList<IInstagramer>();
		instagramerzy.add(new Piosenkarz("Phil","Collins","In the air tonight", 398000));
		instagramerzy.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", "Pi³ka no¿na", 16800000));
		instagramerzy.add(new Skoczek("Kamil", "Stoch", "Mistrzostwo olimpijskie", "Skoki narciarskie", 320000));
		instagramerzy.add(new Lekkoatletka("Anita", "W³odaczyk", "Mistrzosto olimpijskie", "lekkoatletyka", 30100));

		//poligloci
		List<IPoliglota> poligloci = new ArrayList<IPoliglota>();
		poligloci.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", "Pi³ka no¿na", new ArrayList<String>(Arrays.asList("polski", "niemiecki"))));
		poligloci.add(new Matematyk("Stanis³aw", "Ulam", "Metody numeryczne", "Matematyka", new ArrayList<String>(Arrays.asList("polski", "angielski", "niemiecki"))));
		poligloci.add(new Elektrotechnik("Nikola", "Tesla", "Silnik indukcyjny", "Elektrotechnika", new ArrayList<String>(Arrays.asList("serbski", "chorwacki", "niemiecki", "angielski"))));
		
		
		for(Artysta element : artysci) {
			printInformacjeArtysta(element);
		}
		
		for(Sportowiec element : sportowcy) {
			printInformacjeSportowiec(element);
		}
		
		for(Naukowiec element : naukowcy) {
			printInformacjeNaukowiec(element);
		}
		
		for(IInstagramer element : instagramerzy) {
			printInformacjeInstagramer(element);
		}
		
		for(IPoliglota element : poligloci) {
			printInformacjePoliglota(element);
		}
	}
	
	static void printInformacjeArtysta(Artysta element) 
	{
		element.ImieNazwisko();
		element.DziedzinaSztuki();
		element.WazneDzielo();
	}
	
	static void printInformacjeSportowiec(Sportowiec element) 
	{
		element.ImieNazwisko();
		element.DyscyplinaSportu();
		element.NajwiekszySukces();
	}
	
	static void printInformacjeNaukowiec(Naukowiec element)
	{
		element.ImieNazwisko();
		element.DyscyplinaNaukowa();
		element.NajwiekszeOsiagniecie();
	}
	
	static void printInformacjeInstagramer(IInstagramer element) 
	{
		element.LiczbaObserwujacych();
	}
	
	static void printInformacjePoliglota(IPoliglota element)
	{
		element.ZnajomoscJezykow();
	}

}
