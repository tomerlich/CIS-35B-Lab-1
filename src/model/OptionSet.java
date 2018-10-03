package model;

class OptionSet {
	// Properties of OptionSet these are private only automotive can access
	private Option opt[];
	private String name;

	// Inner class for individual options
	class Option {
		// Properties of Option these are to be kept as private accessible by OptionSet
		private String name;
		private float price;

		// Default constructor
		Option() {
			this.name = null;
			this.setPrice(0);
		}

		// Constructor that initializes values
		Option(String name, float price) {
			this.name = name;
			this.setPrice(price);
		}

		// Return the price of an object
		protected float getPrice() {
			return this.price;
		}

		// Return the name of an option
		protected String getName() {
			return this.name;
		}

		// Change the price of an option
		protected void setPrice(float price) {
			this.price = price;
		}

		// Change the name of an option
		protected void setName(String name) {
			this.name = name;
		}

		// Set an option to null
		protected void deleteOpt() {
			this.name = null;
			this.price = 0;
		}

	}

	// Default constructor
	OptionSet() {
		this.opt = null;
		this.name = null;
	}

	// Constructor that initializes values
	OptionSet(String setName, int setSize) {
		this.opt = new Option[setSize];
		this.name = setName;

		for (int i = 0; i < opt.length; i++) {
			opt[i] = new Option();
		}
	}

	// Return the optionSet name
	protected String getName() {
		return this.name;
	}

	// Return the array of options for this set
	protected Option[] getOpt() {
		return this.opt;
	}

	// Change a particular option in the option array
	protected void setOpt(int index, Option option) {
		this.opt[index] = option;
	}

	// Change all the options using an array as input
	protected void setAllOpt(Option[] opt) {
		for (int i = 0; i < this.getOpt().length; i++) {
			this.getOpt()[i] = opt[i];
		}
	}

	// Set all properties of the OptionSet to null
	protected void delete() {
		this.setAllOpt(null);
		this.name = null;
	}
}