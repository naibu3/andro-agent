package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"daysToMs", "", "", "getDaysToMs", "(I)J", "daysToSeconds", "getDaysToSeconds", "shouldFireFallback", "", "Lcom/qonversion/android/sdk/dto/QonversionError;", "getShouldFireFallback", "(Lcom/qonversion/android/sdk/dto/QonversionError;)Z", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final long getDaysToSeconds(int i) {
        long j = 60;
        return i * 24 * j * j;
    }

    public static final long getDaysToMs(int i) {
        return getDaysToSeconds(i) * 1000;
    }

    public static final boolean getShouldFireFallback(QonversionError qonversionError) {
        Intrinsics.checkNotNullParameter(qonversionError, "<this>");
        if (qonversionError.getCode() == QonversionErrorCode.NetworkConnectionFailed) {
            return true;
        }
        Integer httpCode$sdk_release = qonversionError.getHttpCode$sdk_release();
        return httpCode$sdk_release != null && ExtensionsKt.isInternalServerError(httpCode$sdk_release.intValue());
    }
}
