public class WatchMovieFacade {
    private TV tv;
    private Speakers speakers;
    private Stream streamingService;

    public WatchMovieFacade() {
        this.tv = new TV();
        this.speakers = new Speakers();
        this.streamingService = new Stream();
    }

    public void startMovie(String movie) {
        System.out.println("\nStarting movie setup...");
        tv.turnOn();
        tv.setInputSource("HDMI");
        speakers.turnOn();
        speakers.setVolume(10);
        streamingService.connect();
        streamingService.playMovie(movie);
        System.out.println("Movie setup complete!\n");
    }

    public void stopMovie() {
        System.out.println("\nShutting down home theater...");
        System.out.println("Turning off TV and speakers.");
        System.out.println("Disconnected from streaming service.");
        System.out.println("Home theater is OFF.\n");
    }
}
