public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Run", "Nomadland", "Boss Level", "2067", "Girl"};
    private String[] shows = {"Eric Andre Show", "Letterkenny", "Snowfall", "Manifest", "Big"};

    /*
    load an instance of the TV into a Hulu state
    */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());  // change the state of the TV to Home
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());  // change the state of the TV to Netflix
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu.");  // already in the Hulu state
    }

    @Override
    public void pressMovieButton() {
        System.out.println("**********Movies**********");
        for (int i = 0; i < movies.length; i++) {  // iterate over the size of the movie list
            System.out.println(movies[i]);  // print the movie stored in that index
        }
        System.out.println("**************************");
        System.out.println();
    }

    @Override
    public void pressTVButton() {
        System.out.println("********TV Shows*********");
        for (int i = 0; i < shows.length; i++) {  // iterate over the size of the show list
            System.out.println(shows[i]);  // print the show stored at that index
        }
        System.out.println("**************************");
        System.out.println();
    }

}
