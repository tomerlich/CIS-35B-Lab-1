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

	// Constructor that sets up data because we are also creating an array of
	// OptionSets and therefore we are creating options we need parameters for their
	// constructors.
	public Automotive(int sizeOptionSet, String automotiveName, float price, String[] optionSetNames, int[] sizeOptions,
			String[] optionNames, float[] optionPrices) {
		this.name = automotiveName;
		this.opset = new OptionSet[sizeOptionSet];
		this.basePrice = price;

		// To avoid nullPtr errors we use this for loop.
		for (int i = 0; i < opset.length; i++) {
			opset[i] = new OptionSet(optionSetNames[i], sizeOptions[i], optionNames, optionPrices);
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

	// Because the method for getName in optionSet is protected we will us this to
	// make publicly accessible way to get this name
	public String getOptionSetName(int index) {
		return opset[index].getName();
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
			if (this.opset[j].getOpt()[i].getName() == search)
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
	public void setOptionSet(int index, OptionSet opset) {
		this.opset[index] = opset;
	}

	// Change the value of a particular option in opt in opset using the names of
	// the option and set to find the indexes
	public void setOption(int setIndex, int optionIndex, Option option) {
		this.opset[setIndex].setOpt(optionIndex, option);
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

		this.opset[setDeleteIndex].getOpt()[optionDeleteIndex].deleteOpt();
	}

	// Update an OptionSet using the name of the OptionSet to find the index
	public void updateOptionSet(String setName, OptionSet newSet) {
		int index = this.findOptionSet(setName);
		this.setOptionSet(index, newSet);
	}

	// Update an Option using the names of the OptionSet and Option
	// to find the index
	public void updateOption(String setName, String optionName, Option newOption) {
		int setIndex = this.findOptionSet(setName);
		int optionIndex = this.findOption(setName, optionName);

		this.setOption(setIndex, optionIndex, newOption);

	}

	// Will override to string so i can write my own print for the class automotive
	public String toString() {
		StringBuilder objectString = new StringBuilder(this.name);
		objectString.append(" Base Price:$").append(this.basePrice);

		for (int i = 0; i < this.opset.length; i++) {
			objectString.append("\n").append(this.opset[i].getName());
			for (int j = 0; j < this.opset[i].getOpt().length; j++) {
				objectString.append("\n").append(this.opset[i].getOpt()[j].getName());
				objectString.append(" Option Price:$").append(this.opset[i].getOpt()[j].getPrice());
			}
		}

		return objectString.toString();
	}
}
