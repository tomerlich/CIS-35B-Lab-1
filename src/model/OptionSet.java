package model;

//Inner class for the OptionSet contained in Automotive.
class OptionSet{
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
}