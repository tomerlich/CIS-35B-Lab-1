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
	
	//Inner class for the OptionSet contained in Automotive.
	protected class OptionSet{
		protected Option opt[];
		protected String name;
		
		OptionSet(){
			opt = null;
			name = null;
		}
		
		OptionSet(String setName, int setSize){
			opt = new Option[setSize];
			name = setName;
			
			for(int i = 0; i < opt.length; i++) {
				opt[i] = new Option();
			}
		}
		
		//Inner class for the option data type contained in OptionSet.
		protected class Option{
			protected String name;
			protected String description;
			protected float price;
			
			Option(){
				name = null;
				description = null;
				price = 0;
			}
		}	
	}
}
