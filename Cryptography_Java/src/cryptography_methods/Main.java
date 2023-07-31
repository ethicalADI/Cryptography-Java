
//Name : Aditya Kumar
//Topic : The project is based on a cryptography technique that uses Double layer encryption and decryption using Armstrong numbers and RGB color-based mappings for various types of file format. The idea is inspired from a research paper.
//My Website Link : https://ethicaladi.github.io/adityakumar-portfolio/
	
package cryptography_methods;

public class Main 
{
    //entry point into the application
    public static void main(String[] args) 
    {
        /*
        String data = "This is a very important statement.";
        String key = "How old is my computer?";
        KeyGenerator kGen = new KeyGenerator(key);
        String nK = kGen.getNumericKey();
        
        ArmstrongManager aMgr = new ArmstrongManager(nK);
        ColorManager cMgr = new ColorManager(nK);
        
        String encData ="";
        int temp;
        int i;
        for(i =0 ; i < data.length(); i++)
        {
            temp = aMgr.encrypt(data.charAt(i));
            temp = cMgr.encrypt(temp);
            encData = encData  + (char)temp;
        }
        
        String decData= "";
        for(i =0 ; i < encData.length(); i++)
        {
            temp = cMgr.decrypt(encData.charAt(i));
            temp = aMgr.decrypt(temp);
            
            decData = decData  + (char)temp;
        }
        
        
        System.out.println("data: "+ data + "  " + data.length());
        System.out.println("enc data: "+ encData + "  " + encData.length());
        System.out.println("dec data: "+ decData + "  " + decData.length());
        */
        
        try
        {
            //String src = "C:\\Users\\hp\\Downloads\\crypto\\s_adi.jpg";
            //String enc = "C:\\Users\\hp\\Downloads\\crypto\\e_adi.jpg";
            //String dec = "C:\\Users\\hp\\Downloads\\crypto\\d_adi.jpg";
        	
            String src = "C:\\Users\\hp\\Downloads\\crypto\\src.txt";
            String enc = "C:\\Users\\hp\\Downloads\\crypto\\enc.txt";
            String dec = "C:\\Users\\hp\\Downloads\\crypto\\trgt.txt";
            
        	//String src = "C:\\Users\\hp\\Downloads\\crypto\\History.mp3";
            //String enc = "C:\\Users\\hp\\Downloads\\crypto\\History1.mp3";
            //String dec = "C:\\Users\\hp\\Downloads\\crypto\\History2.mp3";

            String key = "My Name Is Aditya Rathi";

            Encryptor objEnc = new Encryptor(key);
            Decryptor objDec = new Decryptor(key);

            objEnc.encrypt(src, enc);
            System.out.println("Encryption Done on "+ src + "\n\nEncrypted file is "+enc);
            
            objDec.decrypt(enc, dec);
            System.out.println("\nDecryption Done! \n" + "\nDecrypted file is " +dec);
        

        }
        catch(Exception ex)
        {
            System.out.println("Err: " +ex.getMessage());
        }
        
    }
    
}
