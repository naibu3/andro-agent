package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionLauncher.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/DefaultCvcRecollectionLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launch", "", "data", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", NamedConstantsKt.IS_LIVE_MODE, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCvcRecollectionLauncher implements CvcRecollectionLauncher {
    public static final int $stable = 8;
    private final ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher;

    public DefaultCvcRecollectionLauncher(ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncher
    public void launch(CvcRecollectionData data, PaymentSheet.Appearance appearance, boolean isLiveMode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher = this.activityResultLauncher;
        String lastFour = data.getLastFour();
        if (lastFour == null) {
            lastFour = "";
        }
        activityResultLauncher.launch(new CvcRecollectionContract.Args(lastFour, data.getBrand(), appearance, !isLiveMode));
    }
}
