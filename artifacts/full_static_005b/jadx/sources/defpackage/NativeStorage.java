package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Collection;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class NativeStorage extends CordovaPlugin {
    public static final String TAG = "Native Storage";
    private SharedPreferences.Editor editor;
    private SharedPreferences sharedPref;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        Log.v(TAG, "Init NativeStorage");
        SharedPreferences sharedPreferences = cordovaInterface.getActivity().getSharedPreferences(this.preferences.getString("NativeStorageSharedPreferencesName", "NativeStorage"), 0);
        this.sharedPref = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, final JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        if ("remove".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        NativeStorage.this.editor.remove(jSONArray.getString(0));
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success();
                        } else {
                            callbackContext.error("Remove operation failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "Removing failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("clear".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        NativeStorage.this.editor.clear();
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success();
                        } else {
                            callbackContext.error("Clear operation failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "Clearing failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("putBoolean".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        Boolean boolValueOf = Boolean.valueOf(jSONArray.getBoolean(1));
                        NativeStorage.this.editor.putBoolean(string, boolValueOf.booleanValue());
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success(String.valueOf(boolValueOf));
                        } else {
                            callbackContext.error("Write failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "PutBoolean failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getBoolean".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.4
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        callbackContext.success(String.valueOf(Boolean.valueOf(NativeStorage.this.sharedPref.getBoolean(jSONArray.getString(0), false))));
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "PutBoolean failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("putInt".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.5
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        int i = jSONArray.getInt(1);
                        NativeStorage.this.editor.putInt(string, i);
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success(i);
                        } else {
                            callbackContext.error("Write failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "PutInt failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getInt".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.6
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        callbackContext.success(NativeStorage.this.sharedPref.getInt(jSONArray.getString(0), -1));
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "GetInt failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("putDouble".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.7
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        float f = (float) jSONArray.getDouble(1);
                        NativeStorage.this.editor.putFloat(string, f);
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success(Float.toString(f));
                        } else {
                            callbackContext.error("Write failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "PutFloat failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getDouble".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.8
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        callbackContext.success(Float.toString(NativeStorage.this.sharedPref.getFloat(jSONArray.getString(0), -1.0f)));
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "GetFloat failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("putString".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.9
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        String string2 = jSONArray.getString(1);
                        NativeStorage.this.editor.putString(string, string2);
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success(string2);
                        } else {
                            callbackContext.error("Write failed");
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "PutString failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getString".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.10
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        callbackContext.success(NativeStorage.this.sharedPref.getString(jSONArray.getString(0), "null"));
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "GetString failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("setItem".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.11
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        String string2 = jSONArray.getString(1);
                        NativeStorage.this.editor.putString(string, string2);
                        if (NativeStorage.this.editor.commit()) {
                            callbackContext.success(string2);
                        } else {
                            callbackContext.error(1);
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "setItem :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("setItemWithPassword".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.12
                /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: Exception -> 0x00bc, TryCatch #3 {Exception -> 0x00bc, blocks: (B:3:0x0002, B:4:0x0017, B:23:0x008d, B:25:0x0093, B:27:0x00a8, B:28:0x00ae, B:29:0x00b4, B:7:0x001e, B:9:0x002c, B:11:0x003a, B:13:0x0048, B:15:0x0056, B:17:0x0064, B:19:0x0072, B:21:0x0080), top: B:34:0x0002, inners: #5, #6, #7, #8, #9, #8 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #3 {Exception -> 0x00bc, blocks: (B:3:0x0002, B:4:0x0017, B:23:0x008d, B:25:0x0093, B:27:0x00a8, B:28:0x00ae, B:29:0x00b4, B:7:0x001e, B:9:0x002c, B:11:0x003a, B:13:0x0048, B:15:0x0056, B:17:0x0064, B:19:0x0072, B:21:0x0080), top: B:34:0x0002, inners: #5, #6, #7, #8, #9, #8 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() throws JSONException {
                    String strEncrypt;
                    try {
                        String string = jSONArray.getString(0);
                        String string2 = jSONArray.getString(1);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                strEncrypt = Crypto.encrypt(string2, jSONArray.getString(2));
                                            } catch (BadPaddingException e) {
                                                e.printStackTrace();
                                                callbackContext.error(e.getMessage());
                                                strEncrypt = "";
                                                if (!strEncrypt.equals("")) {
                                                }
                                            }
                                        } catch (UnsupportedEncodingException e2) {
                                            e2.printStackTrace();
                                            callbackContext.error(e2.getMessage());
                                            strEncrypt = "";
                                            if (!strEncrypt.equals("")) {
                                            }
                                        }
                                    } catch (InvalidKeySpecException e3) {
                                        e3.printStackTrace();
                                        callbackContext.error(e3.getMessage());
                                        strEncrypt = "";
                                        if (!strEncrypt.equals("")) {
                                        }
                                    }
                                } catch (NoSuchPaddingException e4) {
                                    e4.printStackTrace();
                                    callbackContext.error(e4.getMessage());
                                    strEncrypt = "";
                                    if (!strEncrypt.equals("")) {
                                    }
                                }
                            } catch (InvalidAlgorithmParameterException e5) {
                                e5.printStackTrace();
                                callbackContext.error(e5.getMessage());
                                strEncrypt = "";
                                if (!strEncrypt.equals("")) {
                                }
                            } catch (NoSuchAlgorithmException e6) {
                                e6.printStackTrace();
                                callbackContext.error(e6.getMessage());
                                strEncrypt = "";
                                if (!strEncrypt.equals("")) {
                                }
                            }
                        } catch (InvalidKeyException e7) {
                            e7.printStackTrace();
                            callbackContext.error(e7.getMessage());
                            strEncrypt = "";
                            if (!strEncrypt.equals("")) {
                            }
                        } catch (IllegalBlockSizeException e8) {
                            e8.printStackTrace();
                            callbackContext.error(e8.getMessage());
                            strEncrypt = "";
                            if (!strEncrypt.equals("")) {
                            }
                        }
                        if (!strEncrypt.equals("")) {
                            NativeStorage.this.editor.putString(string, strEncrypt);
                            if (NativeStorage.this.editor.commit()) {
                                callbackContext.success(string2);
                                return;
                            } else {
                                callbackContext.error(1);
                                return;
                            }
                        }
                        callbackContext.error("Encryption failed");
                    } catch (Exception e9) {
                        Log.e(NativeStorage.TAG, "setItem :", e9);
                        e9.printStackTrace();
                        callbackContext.error(e9.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getItem".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.13
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = NativeStorage.this.sharedPref.getString(jSONArray.getString(0), "nativestorage_null");
                        if (string.equals("nativestorage_null")) {
                            callbackContext.error(2);
                        } else {
                            callbackContext.success(string);
                        }
                    } catch (Exception e) {
                        Log.e(NativeStorage.TAG, "getItem failed :", e);
                        callbackContext.error(e.getMessage());
                    }
                }
            });
            return true;
        }
        if ("getItemWithPassword".equals(str)) {
            this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.14
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        String string = jSONArray.getString(0);
                        String string2 = jSONArray.getString(1);
                        String string3 = NativeStorage.this.sharedPref.getString(string, "nativestorage_null");
                        if (string3.equals("nativestorage_null")) {
                            callbackContext.error(2);
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            callbackContext.success(Crypto.decryptPbkdf2(string3, string2));
                                        } catch (BadPaddingException e) {
                                            e.printStackTrace();
                                            callbackContext.error(e.getMessage());
                                        } catch (NoSuchPaddingException e2) {
                                            e2.printStackTrace();
                                            callbackContext.error(e2.getMessage());
                                        }
                                    } catch (InvalidKeySpecException e3) {
                                        e3.printStackTrace();
                                        callbackContext.error(e3.getMessage());
                                    } catch (IllegalBlockSizeException e4) {
                                        e4.printStackTrace();
                                        callbackContext.error(e4.getMessage());
                                    }
                                } catch (InvalidAlgorithmParameterException e5) {
                                    e5.printStackTrace();
                                    callbackContext.error(e5.getMessage());
                                } catch (NoSuchAlgorithmException e6) {
                                    e6.printStackTrace();
                                    callbackContext.error(e6.getMessage());
                                }
                            } catch (UnsupportedEncodingException e7) {
                                e7.printStackTrace();
                                callbackContext.error(e7.getMessage());
                            } catch (InvalidKeyException e8) {
                                e8.printStackTrace();
                                callbackContext.error(e8.getMessage());
                            }
                        }
                    } catch (Exception e9) {
                        Log.e(NativeStorage.TAG, "getItem failed :", e9);
                        callbackContext.error(e9.getMessage());
                    }
                }
            });
            return true;
        }
        if (!"keys".equals(str)) {
            return false;
        }
        this.f9cordova.getThreadPool().execute(new Runnable() { // from class: NativeStorage.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    callbackContext.success(new JSONArray((Collection) NativeStorage.this.sharedPref.getAll().keySet()));
                } catch (Exception e) {
                    Log.e(NativeStorage.TAG, "Get keys failed :", e);
                    callbackContext.error(e.getMessage());
                }
            }
        });
        return true;
    }
}
