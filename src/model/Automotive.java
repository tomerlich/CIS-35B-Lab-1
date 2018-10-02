package model;


public class Automotive {
	protected String name;
	protected float basePrice;
	protected OptionSet opset[];
	
	//Default constructor.
	Automotive(){
		this.opset = null;
		this.name = null;
		this.basePrice = 0;
	}
	
	//Constructor that sets up data.
	Automotive(int size, String name, float price){
		this.opset = new OptionSet[size];
		this.name = name;
		this.basePrice = 0;
		
		//To avoid nullPtr errors we use this for loop.
		for (int i = 0; i < opset.length; i++) {
			opset[i] = new OptionSet();
		}
	}
}
