import java.util.Scanner;


public class EasyBibSucks{
    public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    System.out.println("wElCoMe tO eAsY bIb!");
    System.out.println("Just enter the info I ask for and you'll get your MLA 8 citation");
    
    String author;
    String siteTitle;
    String pageTitle;
    String publisher;
    String date;
    String url;
    int decision;
    
    boolean goAgain= true;
    while (goAgain){
    
        System.out.println("Enter the author's name.(Last name, First name)");
        System.out.println("Remember that you can leave a bit blank if it is n/a");
        author= input.nextLine();
        System.out.println("Ok, now put in the title of the webpage");
        pageTitle= input.nextLine();
        System.out.println("Ok, now put in the title of the website");
        siteTitle=input.nextLine();
        System.out.println("Who published this website?");
        publisher= input.nextLine();
        System.out.println("When was this website published? (# Mon. 2xxx)");
        date= input.nextLine();
        System.out.println("Finally, put in the URL");
        url= input.nextLine();
        System.out.println("Here's your citation:");
        System.out.println(author+". “"+pageTitle+".”"+siteTitle+" , "+publisher+ " "+url);
         
        System.out.println("Want to cite another? (1 for yes, 2 for no))");
        decision= input.nextInt();
        while (true){
        if (decision==1){
            break;
        } else if(decision==2){
            goAgain=false;
            break;
        } else {
            System.out.println("I couldn't tell what that was, try again.");
            
        }
        }
    System.out.println("Thanks for using ChrisBib!");
    }
}
}
