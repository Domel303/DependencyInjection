import Services.PhotoService;
import Services.ValidationService;
import Services.VideoService;

public class DependencyInjector {
    private static VideoService videoService;
    private static ValidationService validationService;
    private static PhotoService photoService;

    public static ArticleApp getArticleApp(){
        return new Application(getUserService(), getArticleService());
    }

    private static PhotoService getArticleService() {
        if (photoService == null){
            photoService = new PhotoService(getEmailService());
        }
        return photoService;
    }

    private static VideoService getUserService() {
        if (videoService == null){
            videoService = new VideoService(getEmailService());
        }

        return videoService;
    }

    private static ValidationService getEmailService() {
        if (validationService == null){
            validationService = new ValidationService();
        }
        return validationService;
    }
}
