package liste;

public class ColdWeapon implements Weapon {

	private final int damage = 10;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	@Override
	public void hit(Soldier soldier) {
		int preostaliHelath = soldier.getHealth() - this.damage;
		soldier.setHealth(preostaliHelath);
		
	
	System.out.println(soldier.getName() + " sada ima " + preostaliHelath );
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
