import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string\n");
        String stringOfText = sc.next();
        char[] sarray = stringOfText.toCharArray();
        if(isPalindrom(sarray)==true){
            StringOfText palindrom = new Palindrom(stringOfText);
            System.out.println("Choose action:\n1 - see your string in Real World\n2 - see your string in Mirror World\n9 - exit\n");
            int choose = 0;
            while (choose!=9){
                choose = sc.nextInt();
                switch (choose) {
                    case 1: {
                        StringOfText palindromReal = new PalindromeReal(palindrom);
                        System.out.println("In Real World:\n" + palindromReal.getStringOfText());
                        break;
                    }
                    case 2: {
                        StringOfText palindromMirror = new PalindromeMirror(palindrom);
                        System.out.println("In Mirror World:\n" + palindromMirror.getStringOfText());
                        break;
                    }
                    default: {
                        System.out.println("Your string is: " + stringOfText);
                        break;
                    }
                }
            }
            System.out.println("Exit..");
        }
    }
    public static boolean isPalindrom(char[] sp){
        boolean palindrom = false;
        if(sp.length%2 == 0){
            for(int i = 0; i < sp.length/2-1; i++){
                if(sp[i] != sp[sp.length-i-1]){
                    System.out.println("It is not palindrom");
                    return false;
                }else{
                    System.out.println("It is palindrom");
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (sp.length-1)/2-1; i++){
                if(sp[i] != sp[sp.length-i-1]){
                    System.out.println("It is not palindrom");
                    return false;
                }else{
                    System.out.println("It is palindrom");
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}