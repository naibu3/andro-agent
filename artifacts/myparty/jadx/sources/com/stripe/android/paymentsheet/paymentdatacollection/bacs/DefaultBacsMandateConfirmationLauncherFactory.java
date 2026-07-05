package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateConfirmationLauncherFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultBacsMandateConfirmationLauncherFactory implements BacsMandateConfirmationLauncherFactory {
    public static final int $stable = 0;
    public static final DefaultBacsMandateConfirmationLauncherFactory INSTANCE = new DefaultBacsMandateConfirmationLauncherFactory();

    private DefaultBacsMandateConfirmationLauncherFactory() {
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncherFactory
    public BacsMandateConfirmationLauncher create(ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        return new DefaultBacsMandateConfirmationLauncher(activityResultLauncher);
    }
}
