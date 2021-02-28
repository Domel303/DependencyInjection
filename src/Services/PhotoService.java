package Services;

public class PhotoService {
    private ValidationService validationService;

    public PhotoService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void validatePhoto(){
        validationService.validateData("singed in user", "user´s role");
    }
}
