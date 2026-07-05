package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.internal.billing.BillingError;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: errors.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toQonversionError", "Lcom/qonversion/android/sdk/dto/QonversionError;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ErrorsKt {

    /* compiled from: errors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QonversionErrorCode.values().length];
            try {
                iArr[QonversionErrorCode.BillingUnavailable.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QonversionErrorCode.PurchaseInvalid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final QonversionError toQonversionError(BillingError billingError) {
        QonversionErrorCode qonversionErrorCode;
        String str;
        Intrinsics.checkNotNullParameter(billingError, "<this>");
        int billingResponseCode = billingError.getBillingResponseCode();
        if (billingResponseCode == 12) {
            qonversionErrorCode = QonversionErrorCode.NetworkConnectionFailed;
        } else {
            switch (billingResponseCode) {
                case -2:
                    qonversionErrorCode = QonversionErrorCode.FeatureNotSupported;
                    break;
                case -1:
                case 2:
                case 6:
                    qonversionErrorCode = QonversionErrorCode.PlayStoreError;
                    break;
                case 0:
                    qonversionErrorCode = QonversionErrorCode.Unknown;
                    break;
                case 1:
                    qonversionErrorCode = QonversionErrorCode.PurchaseCanceled;
                    break;
                case 3:
                    qonversionErrorCode = QonversionErrorCode.BillingUnavailable;
                    break;
                case 4:
                    qonversionErrorCode = QonversionErrorCode.StoreProductNotAvailable;
                    break;
                case 5:
                    qonversionErrorCode = QonversionErrorCode.PurchaseInvalid;
                    break;
                case 7:
                    qonversionErrorCode = QonversionErrorCode.ProductAlreadyOwned;
                    break;
                case 8:
                    qonversionErrorCode = QonversionErrorCode.ProductNotOwned;
                    break;
                default:
                    qonversionErrorCode = QonversionErrorCode.Unknown;
                    break;
            }
        }
        QonversionErrorCode qonversionErrorCode2 = qonversionErrorCode;
        int i = WhenMappings.$EnumSwitchMapping$0[qonversionErrorCode2.ordinal()];
        if (i == 1) {
            str = "Billing service is not connected to any Google account at the moment.";
        } else if (i == 2) {
            str = "Please make sure that you are using the google account where purchases are allowed and the application was correctly signed and properly set up for billing.";
        } else {
            str = "";
        }
        return new QonversionError(qonversionErrorCode2, billingError.getMessage() + ". " + str, null, 4, null);
    }

    public static final QonversionError toQonversionError(Throwable th) {
        QonversionError qonversionError;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof JSONException) {
            QonversionErrorCode qonversionErrorCode = QonversionErrorCode.ResponseParsingFailed;
            String localizedMessage = ((JSONException) th).getLocalizedMessage();
            qonversionError = new QonversionError(qonversionErrorCode, localizedMessage == null ? "" : localizedMessage, null, 4, null);
        } else if (th instanceof IOException) {
            QonversionErrorCode qonversionErrorCode2 = QonversionErrorCode.NetworkConnectionFailed;
            String localizedMessage2 = ((IOException) th).getLocalizedMessage();
            qonversionError = new QonversionError(qonversionErrorCode2, localizedMessage2 == null ? "" : localizedMessage2, null, 4, null);
        } else {
            QonversionErrorCode qonversionErrorCode3 = QonversionErrorCode.Unknown;
            String localizedMessage3 = th.getLocalizedMessage();
            qonversionError = new QonversionError(qonversionErrorCode3, localizedMessage3 == null ? "" : localizedMessage3, null, 4, null);
        }
        return qonversionError;
    }
}
