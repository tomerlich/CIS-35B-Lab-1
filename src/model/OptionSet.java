package model;

class OptionSet{
	private Option opt[];
	private String name;
	
	class Option{
		private String name;
		private float price;
			
		Option(){
			this.name = null;
			this.setPrice(0);
		}
		
		Option(String name, float price){
			this.name = name;
			this.setPrice(price);
		}

		protected float getPrice() {
			return this.price;
		}

		protected void setPrice(float price) {
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


	protected String getName() {
		return this.name;
	}
	
	protected void setOpt(int index, Option option) {
		this.opt[index] = option;
	}
	
	protected String getOptName(int index) {
		return this.opt[index].name;
	}
	

	protected void delete() {
		this.opt = null;
		this.name = null;
	}

	protected void deleteOpt(int optionDeleteIndex) {
		this.opt[optionDeleteIndex].name = null;
		this.opt[optionDeleteIndex].price = 0;
	}
}