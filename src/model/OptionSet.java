package model;

//Inner class for the OptionSet contained in Automotive.
class OptionSet{
	private Option opt[];
	private String name;
			
	protected OptionSet(){
		this.opt = null;
		this.name = null;
	}
			
	protected OptionSet(String setName, int setSize){
		this.opt = new Option[setSize];
		this.name = setName;
				
		for(int i = 0; i < opt.length; i++) {
			opt[i] = new Option();
		}
	}	
}