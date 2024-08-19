package testDatas;

import org.json.JSONObject;

public class PetLeoData {

    public static JSONObject petLeoRegistrationReqData(String email,String password,String language,String country_code){
        JSONObject registrationReqData=new JSONObject();
        registrationReqData.put("email", email);
        registrationReqData.put("password", password);
        registrationReqData.put("language", language);
        registrationReqData.put("country_code", country_code);

        return registrationReqData;

    }
}
