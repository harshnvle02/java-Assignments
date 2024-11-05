package com.team;
import java.util.Scanner;

public class TeamService {
	
	 static Team[] teamarr = new Team[4];
	 static int count = 0;

	public static void addNewTeam() {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter team id:");	
	 int tid =sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter team name:");
	 String name=sc.nextLine();
	 
	 System.out.println("Enter caoach name:");
	 String coachName=sc.nextLine();
	 
	 System.out.println("Enter captain id:");
	 int capId = sc.nextInt();
	 
	 sc.nextLine();
	 
	 
	 System.out.println("Enter captain name:");
	 String capName = sc.nextLine();
	 
	 System.out.println("Enter speciality:");
	 String speciality = sc.nextLine();
	 String ch="y";
	 
	 Player p = new Player(capId, capName, speciality);
	 Player plist[] = new Player[11]; 
	 int cnt = 0;
	
	 
	 do {
		 
		 System.out.println("Enter player id:");
		 int pid = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter player name:");
		 String pname = sc.nextLine();
		 
		 System.out.println("Enter player speciality:");
		 String pspecs = sc.nextLine();
		 
		 System.out.println("do you want to continue(y/n)?");
		 ch = sc.nextLine();
		 
		 plist[cnt] = new Player(pid,pname,pspecs);
		 cnt++;
		 
		 
	 }while(ch.equals("y"));
	 
	 teamarr[count] = new Team(tid, name, coachName,p,plist);
	 count++;
		
	}

	public static Team[] display() {
		
		return teamarr;
		
	}

	public static Team searchTeamById(int id) {
		
		for(Team t : teamarr)
		{
			if(t != null)
			{
				if(t.getTid() == id)
				{
					return t;
				}
			}
			else {
				return null;
			}
		}
		return null;
		
		
	}

	public static Team searchTeamByPid(int pid) 
	{
		
		for(Team t : teamarr)
		{
			
		
		if(t!=null) 
		{
			
			Player[] plst=t.getPlist();
			
			for(Player p:plst) 
			{
				if(p!=null) 
				{
					if(p.getPid()==pid) {
						return t;
				}

				else
				{
					break; 
				}
		
			}
		  }
		}
	}
	
	  return null;
  }
}
  



