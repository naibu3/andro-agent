package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionLauncherFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/DefaultCvcRecollectionLauncherFactory;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncherFactory;", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCvcRecollectionLauncherFactory implements CvcRecollectionLauncherFactory {
    public static final int $stable = 0;
    public static final DefaultCvcRecollectionLauncherFactory INSTANCE = new DefaultCvcRecollectionLauncherFactory();

    private DefaultCvcRecollectionLauncherFactory() {
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory
    public CvcRecollectionLauncher create(ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        return new DefaultCvcRecollectionLauncher(activityResultLauncher);
    }
}
