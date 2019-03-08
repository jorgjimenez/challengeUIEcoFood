package data;

import tests.UsersAcount;

import java.util.List;

public class DataUserAcount {
    private static String nameRegister = "pepito";
    private  static String lasNameField = "perez";
    private static String emailField = "pepito@gmail.com";
    private static  String passwordField= "1234";
    private static String confirmField=  "1234";
    private static String usernameField=  "pepitp9714";
    private static String usernameInvalid= Data.RandomVariable.getRandomString(5);
    private static String paswordInvalid= Data.RandomVariable.getRandomString(5);


    public static String getNameRegister() {
        return nameRegister;
    }

    public static String getLasNameField() {
        return lasNameField;
    }

    public static String getEmailField() {
        return emailField;
    }

    public static String getPasswordField() {
        return passwordField;
    }

    public static String getConfirmField() {
        return confirmField;
    }

    public static String getUsernameField() {
        return usernameField;
    }

    public static String getUsernameInvalid() {
        return usernameInvalid;
    }

    public static String getPaswordInvalid() {
        return paswordInvalid;
    }
}

