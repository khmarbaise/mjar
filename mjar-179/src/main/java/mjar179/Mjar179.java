package mjar179;

import java.util.Locale;
import java.util.ResourceBundle;

public class Mjar179 {

    public String getMessage(final Locale locale) {
        final ResourceBundle messages = ResourceBundle.getBundle("mjar179/Messages", locale);
        return messages.getString("messageKey");
    }
}
