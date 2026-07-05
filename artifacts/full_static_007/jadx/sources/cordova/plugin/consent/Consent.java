package cordova.plugin.consent;

import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.messaging.Constants;
import cordova.plugin.consent.Generated;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Consent extends CordovaPlugin {
    private static final SparseArray<ConsentForm> forms = new SparseArray<>();
    private final ArrayList<PluginResult> eventQueue = new ArrayList<>();
    private final String TAG = getClass().getSimpleName();
    private CallbackContext readyCallbackContext = null;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        ExecuteContext.plugin = this;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        ExecuteContext executeContext;
        executeContext = new ExecuteContext(str, jSONArray, callbackContext);
        Log.d(this.TAG, str);
        str.hashCode();
        switch (str) {
            case "canRequestAds":
                return executeCanRequestAds(executeContext);
            case "showPrivacyOptionsForm":
                return executeShowPrivacyOptionsForm(executeContext);
            case "getConsentStatus":
                callbackContext.success(getConsentStatus());
                return true;
            case "getFormStatus":
                callbackContext.success(getConsentInformation().isConsentFormAvailable() ? 1 : 2);
                return true;
            case "showForm":
                return executeShowForm(executeContext);
            case "ready":
                return executeReady(callbackContext);
            case "reset":
                getConsentInformation().reset();
                callbackContext.success();
                return true;
            case "requestInfoUpdate":
                return executeRequestInfoUpdate(executeContext);
            case "privacyOptionsRequirementStatus":
                return executePrivacyOptionsRequirementStatus(executeContext);
            case "loadAndShowIfRequired":
                return executeLoadAndShowIfRequired(executeContext);
            case "loadForm":
                return executeLoadForm(executeContext);
            default:
                return false;
        }
    }

    private int getConsentStatus() {
        int consentStatus = getConsentInformation().getConsentStatus();
        if (consentStatus == 1) {
            return 2;
        }
        if (consentStatus != 2) {
            return consentStatus;
        }
        return 1;
    }

    private boolean executeReady(CallbackContext callbackContext) throws JSONException {
        if (this.readyCallbackContext == null) {
            Iterator<PluginResult> it = this.eventQueue.iterator();
            while (it.hasNext()) {
                callbackContext.sendPluginResult(it.next());
            }
            this.eventQueue.clear();
        } else {
            Log.e(this.TAG, "Ready action should only be called once.");
        }
        this.readyCallbackContext = callbackContext;
        emit(Generated.Events.READY);
        return true;
    }

    private boolean executeRequestInfoUpdate(final ExecuteContext executeContext) {
        ConsentRequestParameters consentRequestParametersOptConsentRequestParameters = executeContext.optConsentRequestParameters();
        ConsentInformation consentInformation = getConsentInformation();
        AppCompatActivity activity = this.f9cordova.getActivity();
        final CallbackContext callbackContext = executeContext.callbackContext;
        Objects.requireNonNull(callbackContext);
        consentInformation.requestConsentInfoUpdate(activity, consentRequestParametersOptConsentRequestParameters, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda7
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                callbackContext.success();
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda8
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                executeContext.callbackContext.error(formError.getMessage());
            }
        });
        return true;
    }

    private boolean executePrivacyOptionsRequirementStatus(ExecuteContext executeContext) {
        String strName = getConsentInformation().getPrivacyOptionsRequirementStatus().name();
        Log.d(this.TAG, "privacy status: " + strName);
        executeContext.callbackContext.success(strName);
        return true;
    }

    private boolean executeCanRequestAds(ExecuteContext executeContext) {
        executeContext.callbackContext.success(String.valueOf(getConsentInformation().canRequestAds()));
        return true;
    }

    private boolean executeLoadAndShowIfRequired(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m194x6db40642(executeContext);
            }
        });
        return true;
    }

    /* renamed from: lambda$executeLoadAndShowIfRequired$2$cordova-plugin-consent-Consent, reason: not valid java name */
    /* synthetic */ void m194x6db40642(final ExecuteContext executeContext) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(this.f9cordova.getActivity(), new ConsentForm.OnConsentFormDismissedListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda6
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                Consent.lambda$executeLoadAndShowIfRequired$1(executeContext, formError);
            }
        });
    }

    static /* synthetic */ void lambda$executeLoadAndShowIfRequired$1(ExecuteContext executeContext, FormError formError) {
        if (formError != null) {
            executeContext.callbackContext.error(formError.getErrorCode() + " " + formError.getMessage());
        } else {
            executeContext.callbackContext.success("success");
        }
    }

    private boolean executeShowPrivacyOptionsForm(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m197xe62041a3(executeContext);
            }
        });
        return true;
    }

    /* renamed from: lambda$executeShowPrivacyOptionsForm$4$cordova-plugin-consent-Consent, reason: not valid java name */
    /* synthetic */ void m197xe62041a3(final ExecuteContext executeContext) {
        UserMessagingPlatform.showPrivacyOptionsForm(this.f9cordova.getActivity(), new ConsentForm.OnConsentFormDismissedListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda10
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                Consent.lambda$executeShowPrivacyOptionsForm$3(executeContext, formError);
            }
        });
    }

    static /* synthetic */ void lambda$executeShowPrivacyOptionsForm$3(ExecuteContext executeContext, FormError formError) {
        if (formError != null) {
            executeContext.callbackContext.error(formError.getErrorCode() + " " + formError.getMessage());
        } else {
            executeContext.callbackContext.success("success");
        }
    }

    private boolean executeLoadForm(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m195lambda$executeLoadForm$7$cordovapluginconsentConsent(executeContext);
            }
        });
        return true;
    }

    /* renamed from: lambda$executeLoadForm$7$cordova-plugin-consent-Consent, reason: not valid java name */
    /* synthetic */ void m195lambda$executeLoadForm$7$cordovapluginconsentConsent(final ExecuteContext executeContext) {
        UserMessagingPlatform.loadConsentForm(this.f9cordova.getActivity(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda4
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                Consent.lambda$executeLoadForm$5(executeContext, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda5
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                Consent.lambda$executeLoadForm$6(executeContext, formError);
            }
        });
    }

    static /* synthetic */ void lambda$executeLoadForm$5(ExecuteContext executeContext, ConsentForm consentForm) {
        int iHashCode = consentForm.hashCode();
        forms.put(iHashCode, consentForm);
        executeContext.callbackContext.success(iHashCode);
    }

    static /* synthetic */ void lambda$executeLoadForm$6(ExecuteContext executeContext, FormError formError) {
        if (formError != null) {
            executeContext.callbackContext.error(formError.getErrorCode() + " " + formError.getMessage());
        }
    }

    private boolean executeShowForm(final ExecuteContext executeContext) {
        final ConsentForm consentForm = forms.get(executeContext.optId());
        if (consentForm == null) {
            executeContext.callbackContext.error("Consent form not found or already used.");
            return true;
        }
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m196lambda$executeShowForm$9$cordovapluginconsentConsent(consentForm, executeContext);
            }
        });
        return true;
    }

    /* renamed from: lambda$executeShowForm$9$cordova-plugin-consent-Consent, reason: not valid java name */
    /* synthetic */ void m196lambda$executeShowForm$9$cordovapluginconsentConsent(ConsentForm consentForm, final ExecuteContext executeContext) {
        consentForm.show(this.f9cordova.getActivity(), new ConsentForm.OnConsentFormDismissedListener() { // from class: cordova.plugin.consent.Consent$$ExternalSyntheticLambda3
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                Consent.lambda$executeShowForm$8(executeContext, formError);
            }
        });
    }

    static /* synthetic */ void lambda$executeShowForm$8(ExecuteContext executeContext, FormError formError) {
        forms.remove(executeContext.optId());
        if (formError == null) {
            executeContext.callbackContext.success();
        } else {
            executeContext.callbackContext.error(formError.getErrorCode() + " " + formError.getMessage());
        }
    }

    private ConsentInformation getConsentInformation() {
        return UserMessagingPlatform.getConsentInformation(this.f9cordova.getActivity());
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onDestroy() {
        this.readyCallbackContext = null;
        super.onDestroy();
    }

    public void emit(String str) throws JSONException {
        emit(str, null);
    }

    public void emit(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject);
        pluginResult.setKeepCallback(true);
        CallbackContext callbackContext = this.readyCallbackContext;
        if (callbackContext == null) {
            this.eventQueue.add(pluginResult);
        } else {
            callbackContext.sendPluginResult(pluginResult);
        }
    }
}
