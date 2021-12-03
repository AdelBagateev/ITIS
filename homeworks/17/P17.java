public class P17{
	public static void main(String[] args){
	}
}
class Creature{
	String name;
	int hp;
	int level;
	public Creature(String name, int hp){
		this.name = name;
		this.hp = hp;
		level = 1;
	}
	public int getLevel(){
		return level;
	}
	public int getHp(){
		return hp;
	}
	public String getName(){
		return name;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public void setLevel(int level){
		this.level = level;
	}
	void attack(Creature other){
		int otherHp = other.getHp();
		otherHp -= level;
		other.setHp(otherHp);
		System.out.println(name + " attacks " + other.getName()+": " + other.getHp()+" left");
	}
}
class Elf extends Creature implements IMagic, IRider{
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
class Dwarf extends Creature implements IMiner, IMagic{
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
class Human extends Creature implements IMiner, IRider{
	public void ride(){
		System.out.println(name + " rides");
	}
	public void mine(){
		System.out.println(name + " digs");
	}
	static int population;
	public Human(String name){
		super(name, 100);
		population++;
	}
	public static int getPopulation(){
		return population;
	}
	public Human reproduce(){
		int sonLevel = level / 2; 
		level= level / 2;
		Human son = new Human(name + ", son of " + name);
		son.setLevel(sonLevel);
		son.setHp(100);
		System.out.println(name + " gives birth to " + son.getName()+": " + son.getLevel());
		return son;
	}
}
interface IMiner{
	void mine();
}
interface IMagic{
	void spell();
}
interface IRider{
	void ride();
}