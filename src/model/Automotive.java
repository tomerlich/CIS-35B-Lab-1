package model;

import model.OptionSet.Option;

public class Automotive {
	private String name;
	private float basePrice;
	private OptionSet opset[];

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

	// Get the name of the automotive
	public String getName() {
		return this.name;
	}

	// Get the Base Price of the automotive
	public float getBasePrice() {
		return this.basePrice;
	}

	// Get one OptionSet from opset[] knowing the index.
	public OptionSet getOptionSet(int index) {
		return this.opset[index];
	}

	// Get the entire opset[] array
	public OptionSet[] getAllOptionSet() {
		return this.opset;
	}

	// Find the index for an option set knowing the name of the set
	public int findOptionSet(String search) {
		boolean optionSetFound = false;
		int i = 0;
		do {
			if (this.opset[i].getName() == search) {
				optionSetFound = true;
			} else
				i++;
		} while (optionSetFound == false);

		return i;
	}

	// Find the index for a specific option knowing both the name of the set and the
	// option
	public int findOption(String setName, String search) {
		boolean optionFound = false;
		int i = 0, j = this.findOptionSet(setName);

		do {
			if (this.opset[j].getOptName(i) == search)
				optionFound = true;
			else
				i++;
		} while (optionFound == false);

		return i;
	}

	// Change the name of an automobile will need to be called knowing the index of
	// the automobile
	public void setName(String name) {
		this.name = name;
	}

	// Change the base price of an automobile will need to be called knowing the
	// index of the automobile
	public void setBasePrice(float price) {
		this.basePrice = price;
	}

	// Change all the values of for the opset[] for a given automobile
	public void setAllOptionSets(OptionSet[] opset) {
		for (int i = 0; i < this.opset.length; i++) {
			this.opset[i] = opset[i];
		}
	}

	// Change the value of a single OptionSet in opset using the name to find the
	// index of a given set
	public void setOptionSet(String name, OptionSet opset) {
		int index = this.findOptionSet(name);
		this.opset[index] = opset;
	}

	// Change the value of a particular option in opt in opset using the names of
	// the option and set to find the indexes
	public void setOption(String setName, String optionName, Option option) {
		int indexOptionSet = this.findOptionSet(setName);
		int indexOption = this.findOption(setName, optionName);
		this.opset[indexOptionSet].setOpt(indexOption, option);
	}

	// Delete all an OptionSet from an automobile given the set name
	public void deleteOptionSet(String name) {
		int deleteIndex = this.findOptionSet(name);
		this.opset[deleteIndex].delete();
	}

	// Delete all an Option from a OptionSet given the set and option name
	public void deleteOption(String setName, String optionName) {
		int setDeleteIndex = this.findOptionSet(setName);
		int optionDeleteIndex = this.findOption(setName, optionName);
		
		this.opset[setDeleteIndex].deleteOpt(optionDeleteIndex);
	}
}
