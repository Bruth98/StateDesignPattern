/*
This class describes the TV when it is "on the home screen"
*/

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {  // establish a new instance of a TV
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {  // simulating the home button being pressed
        System.out.println("TV is already on the home screen.");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());  // change the state of the TV to Netflix
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());  // change the state of the TV to Hulu
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");  // cannot show movies from home state
    }

    @Override
    public void pressTVButton() {
        System.out.println("Home: You must pick an app to show tv shows.");  // cannot show TV shows from home state
    }
}
