import java.util.Scanner;
import java.lang.Math.*;
import java.util.*;

public class Email {
    private String fName;
	private String lName;
	private String depName;
	private String companyName;
	private String randomChars = "ABCDefghIJKLmnopQRST!@#$%^&*+";
	private String password;
	private int capacity;
	private String altEmail;

	public EmailApplication(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public void setDepartment(String depName) {
		this.depName = depName;
	}
	
	public void setCompany(String companyName) {
		this.companyName = companyName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setMailboxCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setAltEmail(String email) {
		altEmail = email;
	}
	
	public String getFullName() {
		return fName+" "+lName;
	}
	
	public int getMailboxCapacity() {
		return capacity;
	}
	
	public String generateEmail() {
		String newEmail = fName+"."+lName+"@"+depName+"."+companyName+".com";
		return newEmail.replaceAll("\\s", "").toLowerCase();
	}
	
	public String generatePassword() {
		String newPassword = "";
		
		for(int i=0; i<8; i++) {
			newPassword += randomChars.charAt((int) (Math.random()*randomChars.length()));
		}
		
		password = newPassword;
		return password;
	}
}