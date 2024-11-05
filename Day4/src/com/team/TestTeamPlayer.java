package com.team;
import java.util.Scanner;

public class TestTeamPlayer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do{		
			System.out.println("1.Add new team");
			System.out.println("2.Delete the team");
			System.out.println("3.Search by tid");
			System.out.println("4.Search by playerId");
			System.out.println("5.Display Team");
			 choice = sc.nextInt();
			switch(choice)
			{			
			 case 1:
				  TeamService.addNewTeam();
				  break;
			 case 2:
  				
			 case 3:
				  //TeamService.addNewTeam();
				 System.out.println("Enter team id");
				 int num = sc.nextInt();
				 Team team= TeamService.searchTeamById(num);
				 if(team != null)
				 {
					 System.out.println(team);
				 }
				 break;
			 case 4:
				  System.out.println("Enter player id tosearch team");
				  int pid = sc.nextInt();
				  
				  Team t1 = TeamService.searchTeamByPid(pid);
				  if(t1 != null)
				  {
					  System.out.println(t1);
				  }
				  break;
			 case 5:
				  Team[] arr = TeamService.display();
				  for(Team t : arr)
				  {
					  if(t != null)
					  {
						  System.out.println(t);
					  }
				  }
				  break;
			}
		 }while(choice != 6);
	}
}
