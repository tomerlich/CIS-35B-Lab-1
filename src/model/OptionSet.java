package model;

class OptionSet{
	private Option opt[];
	private String name;
	
	class Option{
		private String name;
		private float price;
			
		Option(){
			this.name = null;
			this.price = 0;
		}
		
		Option(String name, float price){
			this.name = name;
			this.price = price;
		}
	}
			
	OptionSet(){
		this.opt = null;
		this.name = null;
	}
			
	OptionSet(String setName, int setSize){
		this.opt = new Option[setSize];
		this.name = setName;
				
		for(int i = 0; i < opt.length; i++) {
			opt[i] = new Option();
		}
	}	
	
	protected void setOpt(int index, Option option) {
		this.opt[index] = option;
	}
	
}