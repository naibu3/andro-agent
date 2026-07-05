package com.qonversion.android.sdk.internal.services;

import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.CacheConfigProvider;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QFallbacksService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "", "context", "Landroid/app/Application;", "cacheConfigProvider", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "moshi", "Lcom/squareup/moshi/Moshi;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "convertStreamToString", "", "inputStream", "Ljava/io/InputStream;", "getStringFromFile", "obtainFallbackData", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QFallbacksService {
    private final CacheConfigProvider cacheConfigProvider;
    private final Application context;
    private final JsonAdapter<QFallbackObject> jsonAdapter;
    private final Logger logger;

    public QFallbacksService(Application context, CacheConfigProvider cacheConfigProvider, Moshi moshi, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheConfigProvider, "cacheConfigProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.cacheConfigProvider = cacheConfigProvider;
        this.logger = logger;
        JsonAdapter<QFallbackObject> jsonAdapterAdapter = moshi.adapter(QFallbackObject.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.jsonAdapter = jsonAdapterAdapter;
    }

    public final QFallbackObject obtainFallbackData() {
        try {
            return this.jsonAdapter.fromJson(getStringFromFile());
        } catch (Exception e) {
            this.logger.warn("Failed to parse Qonversion fallback file: " + e.getMessage());
            return null;
        }
    }

    public final String convertStreamToString(InputStream inputStream) throws Exception {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line).append("\n");
            } else {
                bufferedReader.close();
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }
    }

    public final String getStringFromFile() throws Exception {
        InputStream inputStreamOpen;
        Integer fallbackFileIdentifier = this.cacheConfigProvider.getCacheConfig().getFallbackFileIdentifier();
        if (fallbackFileIdentifier != null) {
            inputStreamOpen = this.context.getResources().openRawResource(fallbackFileIdentifier.intValue());
        } else {
            inputStreamOpen = this.context.getAssets().open("qonversion_android_fallbacks.json");
        }
        Intrinsics.checkNotNull(inputStreamOpen);
        String strConvertStreamToString = convertStreamToString(inputStreamOpen);
        inputStreamOpen.close();
        return strConvertStreamToString;
    }
}
