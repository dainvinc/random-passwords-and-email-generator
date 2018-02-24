import java.lang.Math;

public class MyEncryption {
    private String encryptedText;
    
    public String encryptText(String text) {
        System.out.println("Encrypting... " +text.length());
        
        StringBuilder firstPart = 
            new StringBuilder(text.substring(0, (int)Math.ceil((float)text.length()/2)));
        StringBuilder secondPart = 
            new StringBuilder(text.substring((int)Math.ceil((float)text.length()/2), text.length())); 
        
        if(text.length()%2 == 0)
            encryptedText = secondPart +"" +firstPart;
        else 
            encryptedText = secondPart +"#" +firstPart;
        
        return encryptedText;
    }
    
    public String decryptText() {
        String decryptedText;
        String text = this.encryptedText;
        StringBuilder firstPart;
        if(text.contains("#")) {
            firstPart = 
                new StringBuilder(text.substring(0,text.length()/2-1));
        }
        else { 
            firstPart = 
                new StringBuilder(text.substring(0,text.length()/2));
        }
        StringBuilder secondPart = 
            new StringBuilder(text.substring(text.length()/2, text.length()));
        
        
        
        decryptedText = secondPart +"" +firstPart;
        
        return decryptedText;
    }
    
    
    public static void main(String[] args) {
        MyEncryption enc = new MyEncryption();
        
        System.out.println("Encryption: " +enc.encryptText("Anil"));
        System.out.println("Decryption: " +enc.decryptText());
    }
}