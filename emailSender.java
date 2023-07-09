package auth;
import com.mailgun.api.v3.MailgunMessagesApi;
import com.mailgun.client.MailgunClient;
import com.mailgun.model.message.Message;
import com.mailgun.model.message.MessageResponse;

public class emailSender {
    static int code = authenticationEmailChecker.codeReturn();
    private static final String authkey = "";
    static String From = SettingsMail.getFromUser();
    static String Subject = SettingsMail.getSubject();
    static String Text = SettingsMail.getText_Message(code);
    static String Domain = SettingsMail.getDomain();

    public static MessageResponse sendSimpleMessage(String To) {


        MailgunMessagesApi mailgunMessagesApi = MailgunClient.config(authkey)
                .createApi(MailgunMessagesApi.class);

        Message message = Message.builder()
                .from(From)
                .to(To)
                .subject(Subject)
                .text(Text)
                .build();

        return mailgunMessagesApi.sendMessage(Domain, message);
    }


}
