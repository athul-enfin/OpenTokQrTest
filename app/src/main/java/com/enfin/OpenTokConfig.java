package com.enfin;

import android.webkit.URLUtil;

public class OpenTokConfig {
    // *** Fill the following variables using your own Project info from the OpenTok dashboard  ***
    // ***                      https://dashboard.tokbox.com/projects                           ***

    // Replace with your OpenTok API key
    public static final String API_KEY = "46410162";
    // Replace with a generated Session ID
    public static final String SESSION_ID_RELAYED = "1_MX40NjQxMDE2Mn5-MTU3ODU2NTI2NzI5M35hZHc0M0dnUUpCWlJudnBRdW8waGpQa0h-UH4";
    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    public static final String TOKEN_RELAYED = "T1==cGFydG5lcl9pZD00NjQxMDE2MiZzaWc9ZTEyOWMyMjdjNzA0NmJhYjk4OThkNjhhNDYyZDE2N2I3YzExNzAxMTpzZXNzaW9uX2lkPTFfTVg0ME5qUXhNREUyTW41LU1UVTNPRFUyTlRJMk56STVNMzVoWkhjME0wZG5VVXBDV2xKdWRuQlJkVzh3YUdwUWEwaC1VSDQmY3JlYXRlX3RpbWU9MTU3ODU2NTI5NiZub25jZT0wLjg1NTMwNjAzODU3MDczNDEmcm9sZT1wdWJsaXNoZXImZXhwaXJlX3RpbWU9MTU4MTE1NzI5NSZpbml0aWFsX2xheW91dF9jbGFzc19saXN0PQ==                                                                                                                                                                                 ";


    // Replace with a generated Session ID
    public static final String SESSION_ID_ROUTED = "2_MX40NjQxMDE2Mn5-MTU2NzU4MjI2MDgxN35Pd0JXRm1MSHU0WTVzb1VrMkYvSDQ0bHN-fg";
    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    public static final String TOKEN_ROUTED = "T1==cGFydG5lcl9pZD00NjQxMDE2MiZzaWc9NTQ3MTg1Njg4YzFhNmZiMjI0NTgwZThmYjg5OTg3NzQzNGNkNDhjYTpzZXNzaW9uX2lkPTJfTVg0ME5qUXhNREUyTW41LU1UVTJOelU0TWpJMk1EZ3hOMzVQZDBKWFJtMU1TSFUwV1RWemIxVnJNa1l2U0RRMGJITi1mZyZjcmVhdGVfdGltZT0xNTY3NTgyMjc0Jm5vbmNlPTAuNTMxNDkyMjc3NjY5NDU2NiZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNTY3NjY4NjczJmluaXRpYWxfbGF5b3V0X2NsYXNzX2xpc3Q9";


    /*                           ***** OPTIONAL *****
     If you have set up a server to provide session information replace the null value
     in CHAT_SERVER_URL with it.
     For example: "https://yoursubdomain.com"
    */
    public static final String CHAT_SERVER_URL = null;
    public static final String SESSION_INFO_ENDPOINT = CHAT_SERVER_URL + "/session";


    // *** The code below is to validate this configuration file. You do not need to modify it  ***

    public static String webServerConfigErrorMessage;
    public static String hardCodedConfigErrorMessage;

    public static boolean areHardCodedConfigsValid() {
        if (OpenTokConfig.API_KEY != null && !OpenTokConfig.API_KEY.isEmpty()
                && OpenTokConfig.SESSION_ID_RELAYED != null && !OpenTokConfig.SESSION_ID_RELAYED.isEmpty()
                && OpenTokConfig.TOKEN_RELAYED != null && !OpenTokConfig.TOKEN_RELAYED.isEmpty()) {
            return true;
        }
        else {
            hardCodedConfigErrorMessage = "API KEY, SESSION ID and TOKEN in OpenTokConfig.java cannot be null or empty.";
            return false;
        }
    }

    public static boolean isWebServerConfigUrlValid(){
        if (OpenTokConfig.CHAT_SERVER_URL == null || OpenTokConfig.CHAT_SERVER_URL.isEmpty()) {
            webServerConfigErrorMessage = "CHAT_SERVER_URL in OpenTokConfig.java must not be null or empty";
            return false;
        } else if ( !( URLUtil.isHttpsUrl(OpenTokConfig.CHAT_SERVER_URL) || URLUtil.isHttpUrl(OpenTokConfig.CHAT_SERVER_URL)) ) {
            webServerConfigErrorMessage = "CHAT_SERVER_URL in OpenTokConfig.java must be specified as either http or https";
            return false;
        } else if ( !URLUtil.isValidUrl(OpenTokConfig.CHAT_SERVER_URL) ) {
            webServerConfigErrorMessage = "CHAT_SERVER_URL in OpenTokConfig.java is not a valid URL";
            return false;
        } else {
            return true;
        }
    }
}
