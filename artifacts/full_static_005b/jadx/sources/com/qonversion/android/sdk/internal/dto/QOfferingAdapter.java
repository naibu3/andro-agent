package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.FromJson;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionMappingAdapters.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "offering", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QOfferingAdapter {
    @FromJson
    public final QOffering fromJson(QOffering offering) {
        Intrinsics.checkNotNullParameter(offering, "offering");
        Iterator<T> it = offering.getProducts().iterator();
        while (it.hasNext()) {
            ((QProduct) it.next()).setOfferingID(offering.getOfferingID());
        }
        return offering;
    }
}
