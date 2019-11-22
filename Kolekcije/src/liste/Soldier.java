package liste;

import java.util.ArrayList;
import java.util.List;

public class Soldier {
	
	
	private String name;
	private int health;
	private double money;
	private String team;
	
	private List<Weapon> ranac = new ArrayList <Weapon> ();
	
	
	public List<Weapon> getRanac() {
		return ranac;
	}
	public void setRanac(List<Weapon> ranac) {
		this.ranac = ranac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
