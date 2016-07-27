package xyz.xyzmax.activity;

import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class ActivityPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("run")) {
            String message = args.getString(0);
            this.run(message, callbackContext);
            return true;
        }
        return false;
    }

    private void run(String url, CallbackContext callbackContext) {
        try {
            Intent intent = Intent.getIntent(url);
            ((CordovaActivity) this.cordova.getActivity()).startActivity(intent);
            callbackContext.success("成功");
        } catch (Exception e) {
            callbackContext.error(e.getMessage()); 
        }
    }

}
