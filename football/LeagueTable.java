package football;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class LeagueTable {
	public ArrayList<Team> teams;
	public ArrayList<Team> teams_temp;
	public ArrayList<Team> relegated;
	
	
	
	public LeagueTable()
	{
		teams=new ArrayList<Team>();
		Team a=new Team("AEK         ",false,10);
		Team o=new Team("OSFP        ",false,10);
		Team m=new Team("PAOK        ",false,10);
		Team p=new Team("PAO         ",false,10);
		Team at=new Team("ATROMITOS   ",false,10);
		Team pas=new Team("PAS GIANNENA",false,10);
		Team pgss=new Team("PANIONIOS   ",false,10);
		Team ael=new Team("AEL         ",false,10);
		Team aris=new Team("ARIS        ",false,10);
		
		
		Player p11=new Player("Marko", "Livaja", a, 24, 92, 42, 700, "forward");
		Player p12=new Player("Sergio", "Araujo", a, 24, 90, 41, 700, "forward");
		Player p13=new Player("Lazaros", "Christodoulopoulos", a, 31, 88, 35, 220, "midfielder");
		Player p14=new Player("Tasos", "Bakasetas", a, 24, 82, 49, 250, "midfielder");
		Player p15=new Player("Andre", "Simoes", a, 28, 71, 88, 300, "midfielder");
		Player p16=new Player("Panagiotis", "Kone", a, 31, 75, 69, 300, "midfielder");
		Player p17=new Player("Ognen", "Vranjes", a, 28, 45, 90, 300, "defender");
		Player p18=new Player("Dmytro", "Chygrinsky", a, 31, 50, 91, 300, "defender");
		Player p19=new Player("Mixalis", "Bakakis", a, 26, 72, 87, 200, "defender");
		Player p110=new Player("Helder", "Lopes", a, 28, 78, 80, 300, "defender");
		Player p111=new Player("Vasilis", "Barkas", a, 23, 20, 81, 200, "keeper");
		a.calculateOffence();
		a.calculateDefence();
		
		Player p21=new Player("Karim", "Ansarifard", o, 27, 87, 44, 700, "forward");
		Player p22=new Player("Kevin", "Mirallas", o, 31, 93, 23, 700, "forward");
		Player p23=new Player("Kostas", "Fortounis", o, 26, 89, 28, 220, "midfielder");
		Player p24=new Player("Marko", "Marin", o, 30, 86, 30, 250, "midfielder");
		Player p25=new Player("Panagiotis", "Tachtsidis", o, 29, 78, 65, 300, "midfielder");
		Player p26=new Player("Alexis", "Romao", o, 32, 76, 80, 300, "midfielder");
		Player p27=new Player("Papis", "Cisse", o, 21, 40, 85, 300, "defender");
		Player p28=new Player("Alberto", "Botia", o, 32, 35, 78, 300, "defender");
		Player p29=new Player("Omar", "Ellabdellaoui", o, 28, 82, 73, 200, "defender");
		Player p210=new Player("Leonardo", "Koutris", o, 23, 75, 75, 300, "defender");
		Player p211=new Player("Silvi", "Proto", o, 34, 20, 84, 200, "keeper");
		o.calculateOffence();
		o.calculateDefence();
		
		Player p31=new Player("Aleksander", "Prijovic", m, 28, 94, 35, 700, "forward");
		Player p32=new Player("Robert", "Mak", m, 29, 89, 33, 700, "forward");
		Player p33=new Player("Dimitris", "Pelkas", m, 23, 84, 38, 220, "midfielder");
		Player p34=new Player("Djalma", "Campos", m, 29, 85, 34, 250, "midfielder");
		Player p35=new Player("Silva", "Maurisio", m, 31, 81, 69, 300, "midfielder");
		Player p36=new Player("Eugene", "Shakhov", m, 26, 76, 75, 300, "midfielder");
		Player p37=new Player("Fernando", "Varela", m, 29, 45, 90, 300, "defender");
		Player p38=new Player("Jose", "Crespo", m, 28, 40, 85, 300, "defender");
		Player p39=new Player("Leo", "Matos", m, 32, 86, 85, 200, "defender");
		Player p310=new Player("Adelinho", "Vieirinha", m, 32, 88, 72, 300, "defender");
		Player p311=new Player("Alexandros", "Pasxalakis", m, 24, 20, 80, 200, "keeper");
		m.calculateOffence();
		m.calculateDefence();
		
		Player p41=new Player("Guillermo", "Molins", p, 32, 77, 35, 700, "forward");
		Player p42=new Player("Anthony", "Mounie", p, 31, 84, 35, 700, "forward");
		Player p43=new Player("Fanis", "Tsandaris", p, 25, 70, 75, 220, "midfielder");
		Player p44=new Player("Ergys", "Kace", p, 26, 72, 77, 250, "midfielder");
		Player p45=new Player("Robin", "Lod", p, 25, 79, 78, 300, "midfielder");
		Player p46=new Player("Dimitris", "Kourmpelis", p, 26, 76, 83, 300, "midfielder");
		Player p47=new Player("Dimitris", "Kolovetsios", p, 27, 30, 73, 300, "defender");
		Player p48=new Player("Mixalis", "Oikonomou", p, 30, 32, 72, 300, "defender");
		Player p49=new Player("Ousmane", "Coulibally", p, 26, 74, 76, 200, "defender");
		Player p410=new Player("Emanuel", "Insua", p, 30, 75, 77, 300, "defender");
		Player p411=new Player("Odysseas", "Vlachodimos", p, 24, 20, 83, 200, "keeper");
		p.calculateOffence();
		p.calculateDefence();
		
		Player p51=new Player("Abiola", "Daouda", at, 30, 75, 38, 700, "forward");
		Player p52=new Player("Anthony", "Diguiny", at, 31, 76, 35, 700, "forward");
		Player p53=new Player("Amr", "Warda", at, 25, 89, 31, 220, "midfielder");
		Player p54=new Player("Javier", "Umbides", at, 32, 77, 79, 250, "midfielder");
		Player p55=new Player("Nasimento", "Manson", at, 25, 72, 82, 300, "midfielder");
		Player p56=new Player("Thodoris", "Vasilakakis", at, 28, 78, 83, 300, "midfielder");
		Player p57=new Player("Spiros", "Risvanis", at, 24, 35, 84, 300, "defender");
		Player p58=new Player("Dimitris", "Xatzihsaias", at, 24, 32, 79, 300, "defender");
		Player p59=new Player("Kiriakos", "Kivrakidis", at, 26, 71, 78, 200, "defender");
		Player p510=new Player("Dimitris", "Giannoulis", at, 20, 73, 73, 300, "defender");
		Player p511=new Player("Adreas", "Gianniotis", at, 22, 20, 83, 200, "keeper");
		at.calculateOffence();
		at.calculateDefence();
		
		Player p61=new Player("Fiori", "Dourmisai", pgss, 30, 71, 38, 700, "forward");
		Player p62=new Player("Samid", "Yesil", pgss, 31, 74, 35, 700, "forward");
		Player p63=new Player("Giorgos", "Masouras", pgss, 25, 80, 35, 220, "midfielder");
		Player p64=new Player("Srdan", "Spiridonovic", pgss, 26, 83, 34, 250, "midfielder");
		Player p65=new Player("Manolis", "Siopis", pgss, 25, 72, 82, 300, "midfielder");
		Player p66=new Player("Panagiotis", "Korbos", pgss, 33, 69, 78, 300, "midfielder");
		Player p67=new Player("Jerom", "Giota", pgss, 27, 30, 72, 300, "defender");
		Player p68=new Player("Yaya", "Banana", pgss, 27, 30, 74, 300, "defender");
		Player p69=new Player("Valentinos", "Vlahos", pgss, 26, 68, 73, 200, "defender");
		Player p610=new Player("Giorgos", "Saramantas", pgss, 25, 70, 73, 300, "defender");
		Player p611=new Player("Matic", "Kotnic",pgss, 26, 20, 80, 200, "keeper");
		pgss.calculateOffence();
		pgss.calculateDefence();
		
		Player p71=new Player("Pedro", "Conte", pas, 30, 89, 38, 700, "forward");
		Player p72=new Player("Evripidis", "Giakos", pas, 24, 70, 45, 700, "forward");
		Player p73=new Player("Karim", "Soltani", pas, 31, 76, 35, 220, "midfielder");
		Player p74=new Player("Alexandros", "Garoufallias", pas, 22, 69, 75, 250, "midfielder");
		Player p75=new Player("Themistoklis", "Tzimopoulos", pas, 33, 67, 76, 300, "midfielder");
		Player p76=new Player("Andi", "Lila", pas, 33, 69, 78, 300, "midfielder");
		Player p77=new Player("Thodoris", "Berios", pas, 27, 30, 72, 300, "defender");
		Player p78=new Player("Alexis", "Mixail", pas, 29, 40, 74, 300, "defender");
		Player p79=new Player("Nikos", "Karanikas", pas, 26, 66, 72, 200, "defender");
		Player p710=new Player("Mixalis", "Boukouvalas", pas, 25, 68, 75, 300, "defender");
		Player p711=new Player("Markos", "Vellidis",pas, 26, 20, 74, 200, "keeper");
		pas.calculateOffence();
		pas.calculateDefence();
		
		Player p81=new Player("Thomas", "Nazlidis", ael, 30, 76, 44, 700, "forward");
		Player p82=new Player("Sandy", "Krisman", ael, 29, 75, 45, 700, "forward");
		Player p83=new Player("Milos", "Deletic", ael, 28, 74, 28, 220, "midfielder");
		Player p84=new Player("Miro", "Dragicevic", ael, 30, 66, 74, 250, "midfielder");
		Player p85=new Player("Adnan", "Aganovic", ael, 32, 70, 70, 300, "midfielder");
		Player p86=new Player("Andoni", "Fation", ael, 27, 65, 72, 300, "midfielder");
		Player p87=new Player("Nikos", "Golias", ael, 27, 30, 70, 300, "defender");
		Player p88=new Player("Ante", "Zizic", ael, 30, 24, 72, 300, "defender");
		Player p89=new Player("Giannis", "Masouras", ael, 21, 74, 74, 200, "defender");
		Player p810=new Player("Fernando", "Wallace", ael, 32, 74, 72, 300, "defender");
		Player p811=new Player("Mladen", "Bozovic",ael, 35, 20, 77, 200, "keeper");
		ael.calculateOffence();
		ael.calculateDefence();
		
		teams.add(ael);
	    teams.add(a);
	    teams.add(m);
	    teams.add(o);
	    teams.add(p);
	    teams.add(pgss);
	    teams.add(pas);	   
	    teams.add(at);
	    
	    teams_temp=new ArrayList<Team>(teams);
	    relegated=new ArrayList<Team>();
	    
	    relegated.add(aris);
	 }
	
	public void promote()
	{
		teams.add(relegated.get(0));
		checkTable();
		showRegTable();
		teams_temp.add(relegated.get(0));
		showTable();
		relegated.remove(relegated.get(0));
		showRegTable();
	}
	
	public void removal()
	{
	
		for(int i=0;i<teams.size();i++)
		{
			if(teams.get(i).getUser())
				{
				teams.get(i).removePlayer();
				
				
				}
		}
		
	}
	
	
	
	
	public void showTable()
	{
		
		Collections.sort(teams_temp, new Comparator<Team>() {
	        @Override
	        public int compare(Team team2, Team team1)
	        {

	            return  Integer.compare(team1.getPoints(),team2.getPoints());
	        }
	    });
		System.out.println("NAME\t\t\t POINTS\t WINS\tDRAWS\tLOSES\tGOALS\tCONTROL");
		for (int i = 0; i < teams_temp.size(); i++) {
			System.out.println(i+1+". "+teams_temp.get(i).getName()+"             "+teams_temp.get(i).getPoints()+"\t   "+teams_temp.get(i).getWins()+"\t   "+teams_temp.get(i).getDraws()+"\t   "+teams_temp.get(i).getLoses()+"\t   "+teams_temp.get(i).getGoalsScored()+ "\t-- "+teams_temp.get(i).displayUser());
		}
	}
	public void checkTable()
	{
		System.out.println("A ETHNIKI:");
		for (int i = 0; i < teams.size(); i++) {
			
			System.out.println(i+1+". "+teams.get(i).getName()+" "+teams.get(i).getPoints()+" -- "+teams.get(i).displayUser());
		}
	}
	public void showRegTable()
	{
		System.out.println("B ETHNIKI:");
		for (int i = 0; i < relegated.size(); i++) {
			System.out.println(i+1+". "+relegated.get(i).getName()+" "+relegated.get(i).getPoints()+" -- "+relegated.get(i).displayUser());
		}
	}
	public void getInfo()
	{
		int i;
		for(i=0;i<teams_temp.size();i++)
		{
			if(teams_temp.get(i).getUser())
				{
				System.out.println(teams_temp.get(i).getName()+":: Offence is "+teams_temp.get(i).getOffence()+" Defence is "+teams_temp.get(i).getDefence()+" Budget is "+teams_temp.get(i).getBudget());
				teams_temp.get(i).showPlayers();
				}
			
		}
		
	}
	
	public void enstasi()
	{
		int i;
		for(i=0;i<teams_temp.size();i++)
		{
			if(teams_temp.get(i).getUser())
			{
				if(teams_temp.get(i).getBudget()>=10)
				{
					teams_temp.get(i).emptyBudget();
				    teams_temp.get(i-1).cutPoints();
				    System.out.println("Your lawsuit was passed. "+teams_temp.get(i-1).getName()+" lost 3 points");
				}
				else
					System.out.println("No money Honey!!");
			}
		}
	}
	
	public void showSelectionTable()
	{
		for (int i = 0; i < teams_temp.size(); i++) {
			System.out.println(i+1+". "+teams_temp.get(i).getName()+" "+teams_temp.get(i).getPoints()+" -- "+teams_temp.get(i).displayUser());
		}
	}
	
	

}
