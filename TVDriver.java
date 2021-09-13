/*
THIS IS NOT MY CODE
THIS IS A DRIVER PROVIDED BY MY PROFESSOR TO TEST MY CODE
*/
public class TVDriver {

	public void runTV() {
		TV tv = new TV();
		tv.pressHomeButton();
		tv.pressNetflixButton();
		tv.pressMovieButton();
		tv.pressTVButton();
		tv.pressHuluButton();
		tv.pressMovieButton();
		tv.pressTVButton();
		tv.pressHomeButton();
	}
	
	public static void main(String[] args) {
		TVDriver tvDriver = new TVDriver();
		tvDriver.runTV();
	}
}
