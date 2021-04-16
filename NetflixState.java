public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"What Lies Below", "Concrete Cowboy", "Saving Private Ryan", "Legally Blonde", "Sniper: Ghost Shooter"};
    private String[] shows = {"Ginny & Georgia", "Community", "Breaking Bad","Narcos", "Black Mirror"};

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("**********Movies**********");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
        System.out.println("**************************");
        System.out.println();
    }

    @Override
    public void pressTVButton() {
        System.out.println("********TV Shows*********");
        for (int i = 0; i < shows.length; i++) {
            System.out.println(shows[i]);
        }
        System.out.println("**************************");
        System.out.println();
    }

}
