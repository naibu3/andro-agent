package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.offerings.QOfferingTag;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import kotlin.Metadata;

/* compiled from: QonversionMappingAdapters.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "tag", "", "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "toJson", "enum", "(Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;)Ljava/lang/Integer;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QOfferingTagAdapter {
    @ToJson
    private final Integer toJson(QOfferingTag qOfferingTag) {
        return qOfferingTag.getTag();
    }

    @FromJson
    public final QOfferingTag fromJson(Integer tag) {
        return QOfferingTag.INSTANCE.fromTag(tag);
    }
}
