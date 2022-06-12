package com.example.chatdemo.constant;

public interface RestConstants {

    String AUTHORIZATION_HEADER = "Authorization";

    String BASE_PATH_V1 = "/api/v1/";

    String TOKEN_TYPE = "Bearer ";

    String PHONE_NUMBER_REGEX = "^[+][0-9]{9,15}$";

    String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    String SMS_CODE_REGEX = "^[0-9]{5,8}$";

    String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=])(?=\\S+$).{8,}$";

    /*REST API Error codes*/
    int INCORRECT_USERNAME_OR_PASSWORD = 3001;
    int EMAIL_OR_PHONE_EXIST = 3002;
    int EXPIRED = 3003;
    int ACCESS_DENIED = 3004;
    int NOT_FOUND = 3005;
    int INVALID = 3006;
    int REQUIRED = 3007;
    int SERVER_ERROR = 3008;
    int CONFLICT = 3009;
    int NO_ITEMS_FOUND = 3011;
    int CONFIRMATION = 3012;
    int USER_NOT_ACTIVE = 3013;
    int JWT_TOKEN_INVALID = 3014;

    String ADMIN_PHONE_NUMBER = "+998943000808";

}
