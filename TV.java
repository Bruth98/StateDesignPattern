public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;

    private State state;

    // Construct TV and load in all possible states
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = homeState;
    }

    /*
    Changing the state to home if not already
    */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /*
    Changing the state to Netflix if not already
    */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /*
    Changing the state to Hulu if not already\
    */
    public void pressHuluButton() {
        state.pressHuluButton();
    }
    
    /*
    Displays the app's list of movies if possible
    */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /*
    Displays the app's list of tv shows if possible
    */
    public void pressTVButton() {
        state.pressTVButton();
    }

    // Set new TV State
    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }

}
