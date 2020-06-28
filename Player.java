package tic_tac_toe;

public class Player {
	

	private String name;
	private char symbol;
	
	public Player(String name, char symbol){
		setName(name);
		setSymbol(symbol);
	}
	
	public void setName(String name) {
		//other checks can also be included
		if (!name.isEmpty())
		this.name = name;
	}
	
	public void setSymbol(char symbol) {
		//other checks can also be included
		if (symbol != '\0')
		this.symbol = symbol;
	}
	
	public String getName() {
		return this.name;
	}
	
	public char getSymbol() {
		return this.symbol;
	}
