package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.SkillDAO;
import dao.PlayerDAO;
import model.Player;

public class Main{
	
	public static void main(String[]args) throws SQLException, Exception {
		SkillDAO skilldao=new SkillDAO();
		PlayerDAO playerdao=new PlayerDAO();
		List<Player> playerList=new ArrayList<Player>();
		playerList=playerdao.getAllPlayers();
		
		if(playerList!=null)
		{
			for(Player plays:playerList) {
				System.out.println(plays.getPlayerId());
				System.out.println(plays.getName());
				System.out.println(plays.getCountry());
				System.out.println(plays.getSkill());
			}
		}
			
	}
	

}

