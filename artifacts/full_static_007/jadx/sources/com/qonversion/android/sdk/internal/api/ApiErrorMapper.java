package com.qonversion.android.sdk.internal.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* compiled from: ApiErrorMapper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0010J\u0017\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "", "helper", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V", "convertResponseBody", "", "response", "Lokhttp3/ResponseBody;", "getAdditionalMessageForCode", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getErrorFromResponse", "Lcom/qonversion/android/sdk/dto/QonversionError;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lretrofit2/Response;", "getQonversionErrorCode", "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "getInt", "Lorg/json/JSONObject;", "field", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getJsonObject", "getString", "toFormatString", "fieldName", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ApiErrorMapper {
    private static final String CODE = "code";
    private static final String DATA = "data";
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private final ApiHelper helper;

    @Inject
    public ApiErrorMapper(ApiHelper helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.helper = helper;
    }

    public final <T> QonversionError getErrorFromResponse(Response<T> value) {
        String formatString;
        JSONObject jSONObject;
        Request request;
        ApiHelper apiHelper;
        Intrinsics.checkNotNullParameter(value, "value");
        String str = new String();
        ResponseBody responseBodyErrorBody = value.errorBody();
        Integer num = null;
        if (responseBodyErrorBody != null) {
            try {
                jSONObject = new JSONObject(convertResponseBody(responseBodyErrorBody));
                request = value.raw().request();
                apiHelper = this.helper;
                Intrinsics.checkNotNull(request);
            } catch (IOException e) {
                formatString = "error=" + e.getLocalizedMessage();
                Unit unit = Unit.INSTANCE;
            } catch (JSONException unused) {
                Unit unit2 = Unit.INSTANCE;
                formatString = "error=failed to parse the backend response";
            }
            if (apiHelper.isDeprecatedEndpoint(request)) {
                JSONObject jsonObject = getJsonObject(jSONObject, "data");
                String formatString2 = toFormatString(jsonObject, "data");
                if (formatString2 != null) {
                    str = formatString2;
                }
                num = getInt(jsonObject, CODE);
                Unit unit3 = Unit.INSTANCE;
            } else {
                formatString = toFormatString(getString(getJsonObject(jSONObject, "error"), MESSAGE), "error");
                if (formatString != null) {
                    Unit unit4 = Unit.INSTANCE;
                    str = formatString;
                }
            }
        }
        QonversionErrorCode qonversionErrorCode = getQonversionErrorCode(num);
        String additionalMessageForCode = getAdditionalMessageForCode(num);
        int iCode = value.code();
        if (additionalMessageForCode == null) {
            additionalMessageForCode = "";
        }
        return new QonversionError(qonversionErrorCode, "HTTP status code=" + iCode + ", " + ((Object) str) + ". " + additionalMessageForCode, Integer.valueOf(value.code()));
    }

    private final String convertResponseBody(ResponseBody response) throws IOException {
        BufferedSource bufferedSourceSource = response.source();
        bufferedSourceSource.request(Long.MAX_VALUE);
        Buffer bufferClone = bufferedSourceSource.getBuffer().clone();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return bufferClone.readString(charsetForName);
    }

    private final JSONObject getJsonObject(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    private final Integer getInt(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    private final String getString(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    private final String toFormatString(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return str + "=" + obj;
    }

    private final QonversionErrorCode getQonversionErrorCode(Integer value) {
        return ((value != null && value.intValue() == 10002) || (value != null && value.intValue() == 10003)) ? QonversionErrorCode.InvalidCredentials : ((value != null && value.intValue() == 10004) || (value != null && value.intValue() == 10005) || (value != null && value.intValue() == 20014)) ? QonversionErrorCode.InvalidClientUid : (value != null && value.intValue() == 10006) ? QonversionErrorCode.UnknownClientPlatform : (value != null && value.intValue() == 10008) ? QonversionErrorCode.FraudPurchase : (value != null && value.intValue() == 20005) ? QonversionErrorCode.FeatureNotSupported : ((value != null && value.intValue() == 20006) || (value != null && value.intValue() == 20007) || ((value != null && value.intValue() == 20300) || ((value != null && value.intValue() == 20303) || (value != null && value.intValue() == 20399)))) ? QonversionErrorCode.PlayStoreError : ((value != null && value.intValue() == 20008) || (value != null && value.intValue() == 20010) || ((value != null && value.intValue() == 20203) || (value != null && value.intValue() == 20210))) ? QonversionErrorCode.PurchaseInvalid : ((value != null && value.intValue() == 20011) || (value != null && value.intValue() == 20012) || (value != null && value.intValue() == 20013)) ? QonversionErrorCode.ProjectConfigError : (value != null && value.intValue() == 20201) ? QonversionErrorCode.InvalidStoreCredentials : QonversionErrorCode.BackendError;
    }

    private final String getAdditionalMessageForCode(Integer value) {
        if (value != null && value.intValue() == 20201) {
            return "For more details please check our guide [Troubleshooting](https://documentation.qonversion.io/docs/troubleshooting)";
        }
        if (value != null && value.intValue() == 20203) {
            return "Possible reasons for this error are fraud purchases and incorrect configuration of the project key in the Qonversion Dashboard";
        }
        return null;
    }
}
