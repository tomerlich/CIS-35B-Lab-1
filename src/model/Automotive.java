package model;

import model.OptionSet.Option;

public class Automotive {
	private String name;
	private float basePrice;
	private OptionSet opset[];

/*
 * Constructors-----------------------------------------------------------------
 */
	// Default constructor.
	public Automotive() {
		this.opset = null;
		this.name = null;
		this.basePrice = 0;
	}

	// Constructor that sets up data.
	public Automotive(int size, String name, float price) {
		this.opset = new OptionSet[size];
		this.name = name;
		this.basePrice = 0;

		// To avoid nullPtr errors we use this for loop.
		for (int i = 0; i < opset.length; i++) {
			opset[i] = new OptionSet();
		}

	}
/*
 * End Constructors-------------------------------------------------------------
 */
	
/*
 * Getters/Setters--------------------------------------------------------------
 */
	public String getName() {
		return this.name;
	}
	
	public float getBasePrice() {
		return this.basePrice;
	}
	
	public OptionSet getOptionSet(int index){
		return this.opset[index];
	}
	
	public OptionSet[] getAllOptionSet() {
		return this.opset;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public void setBasePrice(float price) {
		this.basePrice = price;
	}
	
	public void setAllOptionSets(OptionSet[] opset) {
		for(int i = 0; i < this.opset.length; i++) {
			this.opset[i] = opset[i];
		}
	}
	
	public void setOptionSet(int index, OptionSet opset) {
		this.opset[index] = opset;
	}
	
	public void setOption(int indexOptionSet, int indexOption, Option option) {
		this.opset[indexOptionSet].setOpt(indexOption, option);
	}

}
