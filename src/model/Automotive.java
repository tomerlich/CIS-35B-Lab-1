package model;

public class Automotive {
	String name;
	OptionSet opset[];
	
	Automotive(int size, String name){
		opset = new OptionSet[size];
		this.name = name;
	}
	
	class OptionSet{
		Option opt[];
		String name;
		
		OptionSet(String setName, int setSize){
			opt = new Option[setSize];
			name = setName;
			
		}
		
		class Option{
			String name;
			float price;
		}	
	}
}
