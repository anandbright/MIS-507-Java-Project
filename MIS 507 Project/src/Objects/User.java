package Objects;

/*
 * The base class for all users.
 * It has two fields for unique identification
 * ID - Unique ID and
 * Name - User's name
 */
public class User {
	private long ID;
	private String name;
	//Hi ANirudh here
	//Getter and setters
	public void setID(long inputID){
		this.ID = inputID;
	}
	public long getID(){
		return this.ID;
	}
	
	public void setName(String nameTobe){
		this.name = nameTobe;
	}
	
	public String getName(){
		return this.name;
	}
}
