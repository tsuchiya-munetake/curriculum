package check;
import constans.Constants;
public class Check {
    private static String firstName="宗武";
    private static String lastName="土屋";

    public static void main(String[] args) {
    	printerName(lastName, firstName);
    	   Pet pet=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	   pet.introduce();
    	   RobotPet rp=new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    	   rp.introduce();
    }
    private static void printerName(String lastName,String firstName ) {
    	String fullName=lastName+firstName;
    	System.out.println(fullName);
    //System.out.println(lastName+firstName);
	}
}