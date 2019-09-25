package company;
import java.util.Scanner;

public class User {
   static Scanner scanner = new Scanner(System.in);
    private String name;
    private String companyName;
    private int joiningYear;
    private String email;
    private String password;

    public void User(String name, String companyName, int joiningYear){
        this.name=name;
        this.companyName=companyName;
        this.joiningYear=joiningYear;
        this.email=createEmail();
        this.password=createPassword();
    }

    private int generateRandomIntegerFromLimit(int limit){
        return (int) (Math.random() * limit);
    }

    private char generateRandomCharacter(){
        return  (char) ('a' + generateRandomIntegerFromLimit(26));
    }

    private String getFirst5CharactersFromUserName(){
        if (getName().length()<5){
            StringBuilder pass=new StringBuilder();
            int diff= 5- getName().length();
             pass.append("0".repeat(Math.max(0,diff)));
             return pass.toString();
        }
        else{
            return getName().substring(0, 5);
        }
    }

    private String createEmail(){
        return String.format("%s_%d@%s.com", getName().toLowerCase(),
                getJoiningYear(), getCompanyName().toLowerCase());
    }

    private char generateRandomSpecialSymbol(){
        char[] specialSymbols= {
                '@','!','#','$','%','^','&','*','(',')','-','+','=',
                '{','}','[',']','~','|','\\','/','`'
                };
        int randomNumber=generateRandomIntegerFromLimit(specialSymbols.length);
        return specialSymbols[randomNumber];
    }

    private String createPassword(){
        StringBuilder pass= new StringBuilder();
        pass.append(generateRandomCharacter());
        int j=0;
        while (j<4){
            pass.append((int)(Math.random()*10));
            j++;
        }
        pass.append(getFirst5CharactersFromUserName());
        pass.append(generateRandomCharacter());
        return pass.toString();
    }

    public static void main(String[] args) {

        User obj = new User();
        System.out.println("Please enter the username");
        obj.name=scanner.nextLine().trim();
        System.out.println("Please enter the company name");
        obj.companyName=scanner.nextLine().trim();
        System.out.println("Please enter the joining year");
        obj.joiningYear=scanner.nextInt();

        System.out.println(obj.createEmail() +"\n" + obj.createPassword());

    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
