package auth;

public class SettingsMail {
    private static String FromUser = "USER@XYZ.COM";
    private static String Domain = "XYZ.COM";
    private static String Subject = "Your verification mail";


    public static String getFromUser() {
        return FromUser;
    }

    public static String getDomain() {
        return Domain;
    }

    public static String getSubject() {
        return Subject;
    }

    public static String getText_Message(int code) {
        String Text_Message = "Your Verification Code is " + String.valueOf(code);
        return Text_Message;
    }
}
