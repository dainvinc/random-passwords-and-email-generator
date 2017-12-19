import java.util.Scanner;
import java.lang.Math.*;
import java.util.*;

public class Email {
    protected String firstName, lastName, departmentName, companyName, password;
    protected String altEmail;
    protected int emailCapacity;
    private String PASSWORD_SET = "abcdEFGHijklMNOPqrstUVWxyZ~!@#$%^&*()_+-={}";
    
    public Email(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a company name?");
        setCompanyName(scan.nextLine());
        
        System.out.println("Which department do you belong?");
        setDepartmentName(scan.nextLine());
        
        System.out.println("Give some length for your password.");
        generatePassword(scan.nextInt());
        
        // System.out.println(generateEmail());
        // System.out.println(getName() +"'s password is: " +getPassword());
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public void changePassword(String password) {
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;    
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public String getName() {
        return getFirstName() +" " +getLastName();
    }
    
    public String getPassword() {
        return password;
    }
    
    public String generatePassword(int length) {
        char[] password = new char[length];
        
        for(int i=0; i<length; i++) {
            int rand = (int) (Math.random() * PASSWORD_SET.length());
            password[i] = PASSWORD_SET.charAt(rand);
        }
        
        this.password = new String(password);
        return this.password;
    }
    
    public String generateEmail() {
        return firstName+lastName+"@"+departmentName+"."+companyName+".com";
    }
}