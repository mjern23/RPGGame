package rpggame.classes;

public enum Classes {
	Fighter(50),
	Wizard(35),
	Rogue(50),
	Barbarian(75);
	
  private int health = 0;
  
	Classes(int h){
		health = h;
	}
  
  public int getHealth(){
  	return health; 
  }
  
}




