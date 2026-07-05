package com.stripe.android.paymentsheet.model;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.common.ui.DelegateDrawable;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.uicore.image.DrawablePainterKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOption.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0013J\u0006\u0010*\u001a\u00020\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u00100\u001a\u00020\fHÂ\u0003J$\u00101\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eHÂ\u0003¢\u0006\u0002\u00102Jp\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001e\b\u0002\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eHÀ\u0001¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOption;", "", "drawableResourceId", "", "label", "", "paymentMethodType", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "_shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "_labels", "Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;", "imageLoader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/drawable/Drawable;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;Lkotlin/jvm/functions/Function1;)V", "(ILjava/lang/String;)V", "getDrawableResourceId$annotations", "()V", "getDrawableResourceId", "()I", "getLabel", "()Ljava/lang/String;", "getPaymentMethodType", "getBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "Lkotlin/jvm/functions/Function1;", "labels", "getLabels$annotations", "getLabels", "()Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;", "shippingDetails", "getShippingDetails$annotations", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "iconPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "getIconPainter", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", PaymentSheetAppearanceKeys.ICON, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function1;", "copy", "copy$paymentsheet_release", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/model/PaymentOption;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Labels", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentOption {
    public static final int $stable = 8;
    private final Labels _labels;
    private final AddressDetails _shippingDetails;
    private final PaymentSheet.BillingDetails billingDetails;
    private final int drawableResourceId;
    private final Function1<Continuation<? super Drawable>, Object> imageLoader;
    private final String label;
    private final String paymentMethodType;

    /* renamed from: component5, reason: from getter */
    private final AddressDetails get_shippingDetails() {
        return this._shippingDetails;
    }

    /* renamed from: component6, reason: from getter */
    private final Labels get_labels() {
        return this._labels;
    }

    private final Function1<Continuation<? super Drawable>, Object> component7() {
        return this.imageLoader;
    }

    public static /* synthetic */ PaymentOption copy$paymentsheet_release$default(PaymentOption paymentOption, int i, String str, String str2, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, Labels labels, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentOption.drawableResourceId;
        }
        if ((i2 & 2) != 0) {
            str = paymentOption.label;
        }
        if ((i2 & 4) != 0) {
            str2 = paymentOption.paymentMethodType;
        }
        if ((i2 & 8) != 0) {
            billingDetails = paymentOption.billingDetails;
        }
        if ((i2 & 16) != 0) {
            addressDetails = paymentOption._shippingDetails;
        }
        if ((i2 & 32) != 0) {
            labels = paymentOption._labels;
        }
        if ((i2 & 64) != 0) {
            function1 = paymentOption.imageLoader;
        }
        Labels labels2 = labels;
        Function1 function12 = function1;
        AddressDetails addressDetails2 = addressDetails;
        String str3 = str2;
        return paymentOption.copy$paymentsheet_release(i, str, str3, billingDetails, addressDetails2, labels2, function12);
    }

    @Deprecated(message = "Please use icon() instead.")
    public static /* synthetic */ void getDrawableResourceId$annotations() {
    }

    public static /* synthetic */ void getLabels$annotations() {
    }

    public static /* synthetic */ void getShippingDetails$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentSheet.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final PaymentOption copy$paymentsheet_release(int drawableResourceId, String label, String paymentMethodType, PaymentSheet.BillingDetails billingDetails, AddressDetails _shippingDetails, Labels _labels, Function1<? super Continuation<? super Drawable>, ? extends Object> imageLoader) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(_labels, "_labels");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        return new PaymentOption(drawableResourceId, label, paymentMethodType, billingDetails, _shippingDetails, _labels, imageLoader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) other;
        return this.drawableResourceId == paymentOption.drawableResourceId && Intrinsics.areEqual(this.label, paymentOption.label) && Intrinsics.areEqual(this.paymentMethodType, paymentOption.paymentMethodType) && Intrinsics.areEqual(this.billingDetails, paymentOption.billingDetails) && Intrinsics.areEqual(this._shippingDetails, paymentOption._shippingDetails) && Intrinsics.areEqual(this._labels, paymentOption._labels) && Intrinsics.areEqual(this.imageLoader, paymentOption.imageLoader);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.drawableResourceId) * 31) + this.label.hashCode()) * 31) + this.paymentMethodType.hashCode()) * 31;
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        int iHashCode2 = (iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this._shippingDetails;
        return ((((iHashCode2 + (addressDetails != null ? addressDetails.hashCode() : 0)) * 31) + this._labels.hashCode()) * 31) + this.imageLoader.hashCode();
    }

    public String toString() {
        return "PaymentOption(drawableResourceId=" + this.drawableResourceId + ", label=" + this.label + ", paymentMethodType=" + this.paymentMethodType + ", billingDetails=" + this.billingDetails + ", _shippingDetails=" + this._shippingDetails + ", _labels=" + this._labels + ", imageLoader=" + this.imageLoader + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOption(int i, String label, String paymentMethodType, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, Labels _labels, Function1<? super Continuation<? super Drawable>, ? extends Object> imageLoader) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        Intrinsics.checkNotNullParameter(_labels, "_labels");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.drawableResourceId = i;
        this.label = label;
        this.paymentMethodType = paymentMethodType;
        this.billingDetails = billingDetails;
        this._shippingDetails = addressDetails;
        this._labels = _labels;
        this.imageLoader = imageLoader;
    }

    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final PaymentSheet.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* compiled from: PaymentOption.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;", "", "label", "", "sublabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getSublabel", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Labels {
        public static final int $stable = 0;
        private final String label;
        private final String sublabel;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Labels)) {
                return false;
            }
            Labels labels = (Labels) obj;
            return Intrinsics.areEqual(this.label, labels.label) && Intrinsics.areEqual(this.sublabel, labels.sublabel);
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            String str = this.sublabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Labels(label=" + this.label + ", sublabel=" + this.sublabel + ")";
        }

        public Labels(String label, String str) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.sublabel = str;
        }

        public /* synthetic */ Labels(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getSublabel() {
            return this.sublabel;
        }
    }

    public final Labels getLabels() {
        return this._labels;
    }

    public final AddressDetails getShippingDetails() {
        return this._shippingDetails;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "Not intended for public use.")
    public PaymentOption(int i, String label) {
        this(i, label, "unsupportedInitializationType", null, null, new Labels(label, null, 2, 0 == true ? 1 : 0), PaymentOptionKt.errorImageLoader);
        Intrinsics.checkNotNullParameter(label, "label");
    }

    public final Painter getIconPainter(Composer composer, int i) {
        composer.startReplaceGroup(1718313909);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1718313909, i, -1, "com.stripe.android.paymentsheet.model.PaymentOption.<get-iconPainter> (PaymentOption.kt:99)");
        }
        Painter painterRememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(icon(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return painterRememberDrawablePainter;
    }

    public final Drawable icon() {
        return new DelegateDrawable(this.imageLoader);
    }
}
