package Encapsulation;
public class Player
{ 
 private String pName; 
 private int pAge; 
 private String gameType; 

// Create a constructor and initialize the three parameters pName, pAge, and gameType. 
public Player(String pName, int pAge, String gameType)
{ 
 this.pName = pName; 
 this.pAge = pAge; 
 this.gameType = gameType;
} 

public String getpName() {
	return pName;
}

public void setpName(String pName) {
	this.pName = pName;
}

public int getpAge() {
	return pAge;
}

public void setpAge(int pAge) {
	this.pAge = pAge;
}

public String getGameType() {
	return gameType;
}

public void setGameType(String gameType) {
	this.gameType = gameType;
}

static class PlayerTest 
{ 
public static void main(String[] args) 
{ 
Player ply = new Player("Sachin", 40, "Cricket"); 
 String plyName = ply.getpName(); 
 int plyAge = ply.getpAge(); 
 String plyGameType = ply.getGameType(); 

System.out.println("Player's Name: " +plyName); 
System.out.println("Player's Age: " +plyAge); 
System.out.println("Player's Gametype: " +plyGameType); 
 } 
}
}