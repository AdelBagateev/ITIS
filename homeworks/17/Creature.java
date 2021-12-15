public class Creature{
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
	interface IMiner{
	    void mine();
	}
	interface IMagic{
		void spell();
	}
	interface IRider{
		void ride();
	}
}
