
public class Automobile {
	// These are all the parameters of the automobile data type
	// I interpret options set to be an array of data type features where features
	// are different things that can be added to an automobile
	public String make, model;
	public int year, cost;
	public Automobile.Feature[] optionsSet;

	//this is an inner class for the features that will be in the optionsSet array
	public class Feature {
		public String featureName, description;
		public int costChange;
		
		//Default constructor sets values to null
		public Feature() {
			featureName = new String();
			description = new String();
			costChange =  0;
			
			return;
		}
		
		//Constructor for setting values
		public Feature(String name, String description, int change) {
			this.featureName = name;
			this.description = description;
			this.costChange = change;
			
			return;
		}
		
 		public String getFeatureName() {
			return this.featureName;
		}
		
		public String getDescription() {
			return this.description;
		}
		
		public int getCostChange() {
			return this.costChange;
		}
		
		public void setFeatureName(String name) {
			this.featureName = name;
			
			return;
		}
		
		public void setDescription(String description) {
			this.description = description;
			
			return;
		}
		
		public void setCostChange(int change) {
			this.costChange = change;
			
			return;
		}
	}

	public Automobile() {
		
	}

}
