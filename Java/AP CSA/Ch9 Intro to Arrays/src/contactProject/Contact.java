package contactProject;

//Case Study 9.1: Student class

public class Contact {

private String nameFirst, nameLast;
private String[] phoneNumber = new String[3];  
private String email;



// first/last name and phone numbers are in n
public Contact(String fn, String ln, int n, String phone, String email){
	nameFirst = fn;
	nameLast = ln;
    email = this.email;
   if (n == 0) {
	   phoneNumber[0] = phone;
   }
   if (n == 1) {
	   phoneNumber[1] = phone;
   }
   if (n == 2) {
	   phoneNumber[2] = phone;
   }
}
public Contact(String fn, String ln){
	nameFirst = fn;
	nameLast = ln;
    
}

 

// Builds a copy of con
//public void setType()
public Contact(String fn, String ln, String phone1, String phone2, String phone3, String mail) {
	nameFirst = fn;
	nameLast = ln;
	phoneNumber[0] = phone1;
	phoneNumber[0] = phone2;
	phoneNumber[0] = phone3;
	email = mail;
}

public Contact(Contact con){
   this(con.nameFirst, con.nameLast, con.phoneNumber[0],con.phoneNumber[1], con.phoneNumber[2], con.email);
}
 
public void setNameFirst (String nm){
   nameFirst = nm;
}
public void setNameLast (String nm){
	   nameLast = nm;
	}
 


public void setPhoneNumber (int i, String number){
   phoneNumber[i] = number;
}


public String[] getPhoneNumber() {
	return phoneNumber;
}




public String getEmail() {
	return email;
}


public void setEmail(String mail) {
	email = mail;
}


public String getNameFirst() {
	return nameFirst;
}


public String getNameLast() {
	return nameLast;
}


//public void getType


//Returns null if there are no errors else returns
//an appropriate error message.
public String validateData(){
   if (nameFirst.equals ("")) return "SORRY: first name required";
   if (nameLast.equals ("")) return "SORRY: last name required";
   return null;
}  

}
