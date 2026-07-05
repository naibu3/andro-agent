package com.stripe.android.financialconnections.debug;

import android.app.Application;
import android.content.SharedPreferences;
import com.facebook.internal.AnalyticsEvents;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: DebugConfiguration.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/debug/DebugConfiguration;", "", "context", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "overriddenNative", "", "getOverriddenNative$financial_connections_release", "()Ljava/lang/Boolean;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebugConfiguration {
    public static final int $stable = 8;
    private final SharedPreferences sharedPreferences;

    @Inject
    public DebugConfiguration(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = context.getSharedPreferences("FINANCIAL_CONNECTIONS_DEBUG", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean getOverriddenNative$financial_connections_release() {
        Object objM9118constructorimpl;
        Boolean bool;
        JsonPrimitive jsonPrimitive;
        try {
            Result.Companion companion = Result.INSTANCE;
            DebugConfiguration debugConfiguration = this;
            String string = this.sharedPreferences.getString("json", null);
            if (string == null) {
                bool = null;
                objM9118constructorimpl = Result.m9118constructorimpl(bool);
            } else {
                JsonElement jsonElement = (JsonElement) ((JsonObject) Json.INSTANCE.decodeFromString(JsonObject.INSTANCE.serializer(), string)).get((Object) "financial_connections_override_native");
                String contentOrNull = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
                if (Intrinsics.areEqual(contentOrNull, "native")) {
                    bool = true;
                } else if (Intrinsics.areEqual(contentOrNull, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB)) {
                    bool = false;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(bool);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return (Boolean) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
    }
}
