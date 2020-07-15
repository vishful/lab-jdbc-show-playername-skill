package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Skill;
import utility.ConnectionManager;


public class SkillDAO {
	//static List<Skill> skillShare= new ArrayList<Skill>(); 
	
	final String SELECT_ALL_SKILLS = "Select * from SKILL1";
	
	public Skill getSkillBylD(Long id) throws SQLException, Exception {

		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(SELECT_ALL_SKILLS);
		long skillId;
		String skillName;
		ResultSet rs = ps.executeQuery();
		
do {
			skillId = rs.getLong("ID");
			skillName = rs.getString("NAME");
			
			System.out.println(skillId);
			System.out.println(skillName);


	}while(rs.next());
		Skill skills = new Skill(skillId, skillName);
		return skills;
}

}




















/*public class SkillDAO {
	public List< Skill > listAllSkills() throws SQLException, Exception {

		Skill skills=null;
		
		
		
		//insert all the details into database

		ConnectionManager cm=new ConnectionManager();
		String sql="SELECT * (ID,NAME)VALUES(?,?)";
		//Create statement object
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		
		List skills=st.get
		st.executeUpdate();
		cm.getConnection().close();
		
		return (List<Skill>) skills;
	}
}
*/


