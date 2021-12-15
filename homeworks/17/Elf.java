public class Elf extends Creature implements IMagic, IRider{
	public void ride(){
		System.out.println(name + " rides");
	}
	public void spell(){
		System.out.println(name+" casts a spell");
	}
	public Elf(String name){
		super(name, 250);
	}
	void heal(){
		this.hp += level;
		System.out.println(name + " heals self: "+hp);
	}
	void heal(Creature friend){
		friend.setHp(friend.getHp() + level);
		System.out.println(name + " heals " + friend.getName() + ": " + friend.getHp());
	}
}