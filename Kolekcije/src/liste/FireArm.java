package liste;

public class FireArm implements Weapon {

	private String name;
	private int damage = 50;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void hit(Soldier soldier) {
		
		int preostaliHelath = soldier.getHealth() - this.damage;
		soldier.setHealth(preostaliHelath);
		
	
	System.out.println(soldier.getName() + " sada ima " + preostaliHelath );	

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
