package Services;

public class VideoService {
 private ValidationService validationService;

    public VideoService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void validateVideo(){

        validationService.validateData("singed in User", "user´s role");
    }
}
