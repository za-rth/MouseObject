import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();

        mouseButton1 leftClick  = new mouseButton1();
        mouseButton2 scrollWheel = new mouseButton2();
        mouseButton3 rightClick = new mouseButton3();
        mouseButton4 mb4 = new mouseButton4();
        mouseButton5 mb5 = new mouseButton5();

        //Prints out the chosen string array brand in the class Mouse
        System.out.println(mouse.brand[0]);

        //Prints out the chosen string array color in the class Mouse
        System.out.println(mouse.color[1]);

        //Prints out the chosen string array colorLighting in the class Mouse
        System.out.println(mouse.colorLighting[8]);

        //Prints out the chosen string array type in the class Mouse
        System.out.println(mouse.type[1]);

        //Determines if the mouseButton1, leftClick method is evaluated to true
        leftClick.leftClick();
        System.out.println("Is MB1 working? "+mouseButton1.leftClick+ " STATUS: Working ");

        //Determines if the mouseButton2, scrollWheel Method is evaluated to true or false
        scrollWheel.scrollUp();
        System.out.println("Is MB2 scroll wheel up working? "+mouseButton2.scrollUp + " STATUS: Working ");
        scrollWheel.scrollDown();
        System.out.println("Is scroll wheel down working? "+mouseButton2.scrollUp + " STATUS: Working ");

        //Determines if mouseButton3, rightClick method is evaluated to true
        rightClick.rightClick();
        System.out.println("Is MB4 working? "+mouseButton3.rightClick + " STATUS: Working ");

        //Determines if mouseButton4, mouse4Click method is evaluated to true
        mb4.mouse4Click();
        System.out.println("Is MB5 working? "+mouseButton4.click + " STATUS: Working ");

        mb5.mouse5Click();
        System.out.println(mouseButton5.click);

    }
}