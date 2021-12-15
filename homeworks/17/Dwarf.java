public class Dwarf extends Creature implements IMiner, IMagic{
	public void mine(){
		System.out.println(name + " digs");
	}
	public void spell(){
		System.out.println(name+" casts a spell");
	}
	public Dwarf(String name){
		super(name, 150);
	}
	void upgrade(Creature friend){
		friend.setLevel(friend.getLevel() + 1);
		System.out.println(name + " upgrades "+friend.getName() + " to "+friend.getLevel());
	}
}
