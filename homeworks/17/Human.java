public class Human extends Creature implements IMiner, IRider{
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
