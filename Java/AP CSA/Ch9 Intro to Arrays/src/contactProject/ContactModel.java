package contactProject;

public class ContactModel {

	private Contact[] contact;
	private int index;
	private int contactCount;
	
	public ContactModel() {
		index = 3;
		contactCount = 0;
		contact = new Contact[10];
		
		contact[0] = new Contact("Adam", "Petersen", "125", "124", "123", "@gmail");
		contact[1] = new Contact("Billy",  "Bob", "125", "124", "123", "@gmail");
		contact[2] = new Contact("Charles", "A", "125", "124", "123", "@gmail");
		contact[3]	= new Contact("Drew",  "Thompson", "125", "124", "123", "@gmail");
		contactCount = 4;
		
	}//end constructor
	
	
	//methods
	
	
	public Contact getFavorite() {
		if(t == true) {
			return;
		}			
	}
	
	
	public String add(Contact con) {
		if (contactCount == contact.length)
			return "Sorry: roster is full";
		else {
			contact[contactCount] = con;
			contactCount++;
			return null;
		}
	}//end add
	
	public String replace(Contact con) {
		if(index == -1)
			return "Must add a student first";
		else
			contact[index] = con;
		return null;
	}
	
	//navigation
	public Contact first() {
		Contact con = null;
		if (contactCount == 0)
			index = -1; 
		else {
			index = 0;
			con = contact[contactCount];
		}
		return con;
	}//end first
	
	public Contact previous () {
		Contact con = null;
		if (contactCount == 0)
			index = -1;
		else {
			index = Math.max(0, index - 1);
			con = contact[index];
		}
		return con;
	}//end previous
	
	public Contact next() {
		Contact con = null;
		if (contactCount == 0)
			index = -1;
		else {
			index = Math.min(contactCount - 1, index + 1);
			con = contact[index];
		}
		return con;
	}//end next
	
	public Contact last() {
		Contact s = null;
		if (contactCount == 0)
			index = -1;
		else {
			index = contactCount-1;
			s = contact[index];
		}
		return s;
	}//end last
	
	public Contact currentContact() {
		if (index == -1)
			return null;
		else
			return contact[index];
	}//end currentStudent
	
	public int size() {
		return contactCount;
	}//end size
	
	public int currentPosition() {
		return index;
	}//end currentPosition

	public String toString() {
		String result = "";
		for (int i = 0; i < contactCount; i++)
			result = result + contact[i] + "\n";
		return result;
	}//end toString
	
}
