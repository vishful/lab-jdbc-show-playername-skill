
package model;

public class Skill {
	private long skilld;
	private String skillName;
	
	
	
	public Skill(long skilld, String skillName) {
		this.skilld = skilld;
		this.skillName = skillName;
	}
	public long getSkilld() {
		return skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkilld(long skilld) {
		this.skilld = skilld;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
