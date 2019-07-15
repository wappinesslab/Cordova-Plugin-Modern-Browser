package com.hitmacreed.plugin;
   
import android.content.Context;
import android.content.Intent;
   
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
   
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import android.graphics.Color;

// import com.thefinestartist.finestwebview.FinestWebView;

import com.wuadam.awesomewebview.AwesomeWebView;
   
public class Main extends CordovaPlugin {

    // PARAMATERS
    String url;
    String statusBarColor;
    String toolbarColor;
    String iconDefaultColor;
    String iconDisabledColor;
    String iconPressedColor;
    String swipeRefreshColor;
    String progressBarColor;
    String titleColor;
    String menuColor;

    Boolean showIconBack = true;
    Boolean disableIconBack = false;
    Boolean showIconForward = true;
    Boolean disableIconForward = false;
    Boolean showIconMenu = true;
    Boolean disableIconMenu = false;
    Boolean webViewCameraEnabled = true;
    Boolean showProgressBar = true;
    Boolean showUrl = true;
    Boolean webViewAppCacheEnabled = true;
    Boolean fileChooserEnabled = true;
    Boolean webViewCookieEnabled = true;
    Boolean webViewGeolocationEnabled = true;
    Boolean webViewAudioEnabled = true;



    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }
   
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        
        Context context = cordova.getActivity().getApplicationContext();

        try {
            JSONObject options = args.getJSONObject(0);

            
            //GET VALUES
            url = options.getString("url");
            statusBarColor = options.getString("statusBarColor");
            toolbarColor = options.getString("toolbarColor");
            iconDefaultColor = options.getString("iconDefaultColor");
            iconDisabledColor = options.getString("iconDisabledColor");
            iconPressedColor = options.getString("iconPressedColor");
            progressBarColor = options.getString("progressBarColor");
            titleColor = options.getString("titleColor");
            menuColor = options.getString("menuColor");

            showIconBack =  options.getBoolean("showIconBack");
            disableIconBack = options.getBoolean("disableIconBack");
            showIconForward = options.getBoolean("showIconForward");
            disableIconForward = options.getBoolean("disableIconForward");
            showIconMenu = options.getBoolean("showIconMenu");
            disableIconMenu = options.getBoolean("disableIconMenu");
            webViewCameraEnabled = options.getBoolean("webViewCameraEnabled");
            showProgressBar = options.getBoolean("showProgressBar");
            showUrl = options.getBoolean("showUrl");
            webViewAppCacheEnabled = options.getBoolean("webViewAppCacheEnabled");
            fileChooserEnabled = options.getBoolean("fileChooserEnabled");
            webViewCookieEnabled = options.getBoolean("webViewCookieEnabled");
            webViewGeolocationEnabled = options.getBoolean("webViewGeolocationEnabled");
            webViewAudioEnabled = options.getBoolean("webViewAudioEnabled");


        } catch (JSONException e) {
            callbackContext.error("Error encountered: " + e.getMessage());
            return false;
        }
        
        if(action.equals("create")) {
                       
             new AwesomeWebView.Builder(context)
            .statusBarColor(Color.parseColor(statusBarColor))
            .toolbarColor(Color.parseColor(toolbarColor))
            .iconDefaultColor(Color.parseColor(iconDefaultColor))
            .iconDisabledColor(Color.parseColor(iconDisabledColor))
            .iconPressedColor(Color.parseColor(iconPressedColor))
            .showIconBack(showIconBack)
            .disableIconBack(disableIconBack)
            .showIconForward(showIconForward)
            .disableIconForward(disableIconForward)
            .showIconMenu(showIconMenu)
            .disableIconMenu(disableIconMenu)
            .showProgressBar(showProgressBar)
            .progressBarColor(Color.parseColor(progressBarColor))
            .titleColor(Color.parseColor(titleColor))
            .menuColor(Color.parseColor(menuColor))
            .showUrl(showUrl)
            .webViewCameraEnabled(webViewCameraEnabled)
            .fileChooserEnabled(fileChooserEnabled)
            .webViewCookieEnabled(webViewCookieEnabled)
            .webViewAppCacheEnabled(webViewAppCacheEnabled)
            .webViewGeolocationEnabled(webViewGeolocationEnabled)
            .webViewAudioEnabled(webViewAudioEnabled)
            .show(url);

            return true;
        }
        return false;

    }
   
  
}