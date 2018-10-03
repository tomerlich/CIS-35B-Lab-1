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
		this.setOpt(null);
		this.name = null;
	}
			
	OptionSet(String setName, int setSize){
		this.setOpt(new Option[setSize]);
		this.name = setName;
				
		for(int i = 0; i < getOpt().length; i++) {
			getOpt()[i] = new Option();
		}
	}	

	protected String getName() {
		return this.name;
	}
	
	protected void setOpt(int index, Option option) {
		this.opt[index] = option;
	}
	
	protected void setAllOpt(Option[] opt) {
		for (int i = 0; i < this.getOpt().length; i++) {
			this.getOpt()[i] = opt[i];
		}
	}
	
	protected String getOptName(int index) {
		return this.getOpt()[index].name;
	}

	protected float getOptPrice(int index) {
		return this.getOpt()[index].price;
	}
	
	protected Option[] getOpt() {
		return this.opt;
	}

	protected void setOpt(Option opt[]) {
		this.opt = opt;
	}
	
	protected void delete() {
		this.setOpt(null);
		this.name = null;
	}

	protected void deleteOpt(int optionDeleteIndex) {
		this.getOpt()[optionDeleteIndex].name = null;
		this.getOpt()[optionDeleteIndex].price = 0;
	}

}