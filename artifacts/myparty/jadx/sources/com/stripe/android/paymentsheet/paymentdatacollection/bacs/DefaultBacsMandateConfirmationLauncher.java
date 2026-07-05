package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateConfirmationLauncher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launch", "", "data", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateData;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultBacsMandateConfirmationLauncher implements BacsMandateConfirmationLauncher {
    public static final int $stable = 8;
    private final ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher;

    public DefaultBacsMandateConfirmationLauncher(ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncher
    public void launch(BacsMandateData data, PaymentSheet.Appearance appearance) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.activityResultLauncher.launch(new BacsMandateConfirmationContract.Args(data.getEmail(), data.getName(), data.getSortCode(), data.getAccountNumber(), appearance));
    }
}
