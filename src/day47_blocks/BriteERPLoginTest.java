package day47_blocks;

//static import
import static day47_blocks.BriteERP.*;

public class BriteERPLoginTest {
	public static void main(String[] args) {
		
		//calling static methods using a non static way by importing the static class day47_blocks.BriteERP.*;
		enterEmail();
		enterPassword();
		verifyLogin();
	}
}
