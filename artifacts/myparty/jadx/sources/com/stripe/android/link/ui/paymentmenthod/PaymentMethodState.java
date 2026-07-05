package com.stripe.android.link.ui.paymentmenthod;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.uicore.elements.FormElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodState.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006)"}, d2 = {"Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;", "", "formArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "primaryButtonState", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "primaryButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "errorMessage", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;)V", "getFormArguments", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "getFormElements", "()Ljava/util/List;", "getPrimaryButtonState", "()Lcom/stripe/android/link/ui/PrimaryButtonState;", "getPrimaryButtonLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethodState {
    public static final int $stable = 8;
    private final ResolvableString errorMessage;
    private final FormArguments formArguments;
    private final List<FormElement> formElements;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final ResolvableString primaryButtonLabel;
    private final PrimaryButtonState primaryButtonState;

    public static /* synthetic */ PaymentMethodState copy$default(PaymentMethodState paymentMethodState, FormArguments formArguments, List list, PrimaryButtonState primaryButtonState, ResolvableString resolvableString, PaymentMethodCreateParams paymentMethodCreateParams, ResolvableString resolvableString2, int i, Object obj) {
        if ((i & 1) != 0) {
            formArguments = paymentMethodState.formArguments;
        }
        if ((i & 2) != 0) {
            list = paymentMethodState.formElements;
        }
        if ((i & 4) != 0) {
            primaryButtonState = paymentMethodState.primaryButtonState;
        }
        if ((i & 8) != 0) {
            resolvableString = paymentMethodState.primaryButtonLabel;
        }
        if ((i & 16) != 0) {
            paymentMethodCreateParams = paymentMethodState.paymentMethodCreateParams;
        }
        if ((i & 32) != 0) {
            resolvableString2 = paymentMethodState.errorMessage;
        }
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        ResolvableString resolvableString3 = resolvableString2;
        return paymentMethodState.copy(formArguments, list, primaryButtonState, resolvableString, paymentMethodCreateParams2, resolvableString3);
    }

    /* renamed from: component1, reason: from getter */
    public final FormArguments getFormArguments() {
        return this.formArguments;
    }

    public final List<FormElement> component2() {
        return this.formElements;
    }

    /* renamed from: component3, reason: from getter */
    public final PrimaryButtonState getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    /* renamed from: component4, reason: from getter */
    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    /* renamed from: component6, reason: from getter */
    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    public final PaymentMethodState copy(FormArguments formArguments, List<? extends FormElement> formElements, PrimaryButtonState primaryButtonState, ResolvableString primaryButtonLabel, PaymentMethodCreateParams paymentMethodCreateParams, ResolvableString errorMessage) {
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(formElements, "formElements");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        return new PaymentMethodState(formArguments, formElements, primaryButtonState, primaryButtonLabel, paymentMethodCreateParams, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodState)) {
            return false;
        }
        PaymentMethodState paymentMethodState = (PaymentMethodState) other;
        return Intrinsics.areEqual(this.formArguments, paymentMethodState.formArguments) && Intrinsics.areEqual(this.formElements, paymentMethodState.formElements) && this.primaryButtonState == paymentMethodState.primaryButtonState && Intrinsics.areEqual(this.primaryButtonLabel, paymentMethodState.primaryButtonLabel) && Intrinsics.areEqual(this.paymentMethodCreateParams, paymentMethodState.paymentMethodCreateParams) && Intrinsics.areEqual(this.errorMessage, paymentMethodState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((((((this.formArguments.hashCode() * 31) + this.formElements.hashCode()) * 31) + this.primaryButtonState.hashCode()) * 31) + this.primaryButtonLabel.hashCode()) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode2 = (iHashCode + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
        ResolvableString resolvableString = this.errorMessage;
        return iHashCode2 + (resolvableString != null ? resolvableString.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodState(formArguments=" + this.formArguments + ", formElements=" + this.formElements + ", primaryButtonState=" + this.primaryButtonState + ", primaryButtonLabel=" + this.primaryButtonLabel + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", errorMessage=" + this.errorMessage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodState(FormArguments formArguments, List<? extends FormElement> formElements, PrimaryButtonState primaryButtonState, ResolvableString primaryButtonLabel, PaymentMethodCreateParams paymentMethodCreateParams, ResolvableString resolvableString) {
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(formElements, "formElements");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        this.formArguments = formArguments;
        this.formElements = formElements;
        this.primaryButtonState = primaryButtonState;
        this.primaryButtonLabel = primaryButtonLabel;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.errorMessage = resolvableString;
    }

    public /* synthetic */ PaymentMethodState(FormArguments formArguments, List list, PrimaryButtonState primaryButtonState, ResolvableString resolvableString, PaymentMethodCreateParams paymentMethodCreateParams, ResolvableString resolvableString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(formArguments, list, primaryButtonState, resolvableString, (i & 16) != 0 ? null : paymentMethodCreateParams, (i & 32) != 0 ? null : resolvableString2);
    }

    public final FormArguments getFormArguments() {
        return this.formArguments;
    }

    public final List<FormElement> getFormElements() {
        return this.formElements;
    }

    public final PrimaryButtonState getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }
}
