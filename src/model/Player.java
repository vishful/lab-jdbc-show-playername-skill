package model;


public class Player{
	private long playerId;
	private String name;
	private String country;
	Skill skill;
	
	
	
	public Player(long playerId, String name, String country, Skill skill) {
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public long getPlayerId() {
		return playerId;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
}
