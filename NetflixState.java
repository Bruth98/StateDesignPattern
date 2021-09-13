public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"What Lies Below", "Concrete Cowboy", "Saving Private Ryan", "Legally Blonde", "Sniper: Ghost Shooter"};
    private String[] shows = {"Ginny & Georgia", "Community", "Breaking Bad","Narcos", "Black Mirror"};

    /*
    Create an instance of a tv and set it to the Netflix state
    */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());  // change the state of the TV to Home
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");  // already in the netflix state
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());  // change the state of the TV to Hulu
    }

    @Override
    public void pressMovieButton() {
        System.out.println("**********Movies**********");
        for (int i = 0; i < movies.length; i++) {  // iterate over the length of the movie array
            System.out.println(movies[i]);  // print the movie stored in that index
        }
        System.out.println("**************************");
        System.out.println();
    }

    @Override
    public void pressTVButton() {
        System.out.println("********TV Shows*********");
        for (int i = 0; i < shows.length; i++) {  // iterate over the length of the show array
            System.out.println(shows[i]);  // print the show stored at that index
        }
        System.out.println("**************************");
        System.out.println();
    }

}
