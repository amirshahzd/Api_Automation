package RestAssuredDemo;

import org.apache.commons.lang3.RandomStringUtils;

public class restUtils {
    public static String get_Name(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Krishna"+generatedString);
    }
    public static String get_email(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return (generatedString+"gmail.com");
    }
    public static String get_Gender(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return (generatedString);
    }
    public static String get_Status(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return (generatedString);
    }
    public static String get_id() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }
    public static String getPost_id() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }
}
