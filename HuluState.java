public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Run", "Nomadland", "Boss Level", "2067", "Girl"};
    private String[] shows = {"Eric Andre Show", "Letterkenny", "Snowfall", "Manifest", "Big"};

    public HuluState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu.");
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
