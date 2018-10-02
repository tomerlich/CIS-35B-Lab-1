package model;

//Inner class for the option data type contained in OptionSet.
class Option{
	private String name;
	private String description;
	private float price;
		
	protected Option(){
		this.name = null;
		this.description = null;
		this.price = 0;
	}
}