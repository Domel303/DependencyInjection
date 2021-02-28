import Services.PhotoService;
import Services.VideoService;

public class Application implements ArticleApp {
    VideoService videoService;
    PhotoService photoService;

    public Application(VideoService videoService, PhotoService photoService) {
        this.videoService = videoService;
        this.photoService = photoService;

    }

    public static void main(String[] args) {

        ArticleApp application= DependencyInjector.getArticleApp();
        application.process();

    }

    @Override
    public void process() {
    videoService.validateVideo();
    photoService.validatePhoto();
    }
}
