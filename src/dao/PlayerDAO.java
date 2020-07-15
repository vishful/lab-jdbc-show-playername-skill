
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utility.ConnectionManager;
import model.Player;
import model.Skill;


public class PlayerDAO {
	
	static List<Player> sportspersons= new ArrayList<Player>(); 
	final String SELECT_ALL_SKILLS = "Select SKILL1.ID,SKILL1.NAME, PLAYER.NAME from SKILL1 INNER JOIN PLAYER ON SKILL1.ID=PLAYER.SKILL_ID";

	public List< Player > getAllPlayers() throws SQLException, Exception {
		Player play = new Player(0, SELECT_ALL_SKILLS, SELECT_ALL_SKILLS, null);
		
		Skill skill;
		SkillDAO skills = new SkillDAO();
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(SELECT_ALL_SKILLS);
		
		ResultSet rs = ps.executeQuery();
					
				
		while(rs.next()) {
			long id= rs.getLong("ID");
			String playerName=rs.getString("PLAYER NAME");
			String country=rs.getString("COUNTRY");
			Skill skillGetter=skills.getSkillBylD(id);
			
			
			System.out.println(id);
			System.out.println(playerName);
			System.out.println(country);
			System.out.println(skillGetter);
			
	
			play.setPlayerId(id);
			play.setName(playerName);
			play.setCountry(country);
			play.setSkill(skillGetter);
			

	}
		return sportspersons;
}

}


















