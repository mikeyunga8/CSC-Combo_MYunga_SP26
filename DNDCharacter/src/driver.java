
public class driver {

	public static void main(String[] args) {
		Character hero = new Character();
		hero.setHealth(100);
		hero.setStrength(25);
		hero.setName("Batman");
		hero.setWeapon("Batarang", 15);
		System.out.println(hero);
		
		Character villain = new Character(100, 35, "The Joker", "Cane", 10);
		System.out.println(villain);
		
		while(hero.getHealth() > 0 && villain.getHealth() > 0) {
			int hDamage;
			int vDamage;
			if(hero.getHealth() > 0) {
				hDamage = hero.hit(villain);
			System.out.println(hero.getName() + " hits " + villain.getName() + " for " + hDamage);
			}
			if(villain.getHealth() > 0) {
			vDamage = villain.hit(hero);
			System.out.println(villain.getName() + " hits " + hero.getName() + " for " + vDamage);
			}
		}
		if(hero.getHealth() > 0)System.out.println(hero.getName() + " Wins!");
		else System.out.println(villain.getName() + " Wins!");
	}

}
