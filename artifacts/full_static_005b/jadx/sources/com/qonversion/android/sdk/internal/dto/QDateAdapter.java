package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: QonversionMappingAdapters.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QDateAdapter;", "", "()V", "fromJson", "Ljava/util/Date;", "date", "", "toJson", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QDateAdapter {
    @ToJson
    private final long toJson(Date date) {
        return ExtensionsKt.milliSecondsToSeconds(date.getTime());
    }

    @FromJson
    public final Date fromJson(long date) {
        return new Date(ExtensionsKt.secondsToMilliSeconds(date));
    }
}
