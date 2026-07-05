package com.stripe.android.paymentsheet.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateText.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/model/MandateText;", "", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "showAbovePrimaryButton", "", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Z)V", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getShowAbovePrimaryButton", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MandateText {
    public static final int $stable = 8;
    private final boolean showAbovePrimaryButton;
    private final ResolvableString text;

    public static /* synthetic */ MandateText copy$default(MandateText mandateText, ResolvableString resolvableString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = mandateText.text;
        }
        if ((i & 2) != 0) {
            z = mandateText.showAbovePrimaryButton;
        }
        return mandateText.copy(resolvableString, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ResolvableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAbovePrimaryButton() {
        return this.showAbovePrimaryButton;
    }

    public final MandateText copy(ResolvableString text, boolean showAbovePrimaryButton) {
        return new MandateText(text, showAbovePrimaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MandateText)) {
            return false;
        }
        MandateText mandateText = (MandateText) other;
        return Intrinsics.areEqual(this.text, mandateText.text) && this.showAbovePrimaryButton == mandateText.showAbovePrimaryButton;
    }

    public int hashCode() {
        ResolvableString resolvableString = this.text;
        return ((resolvableString == null ? 0 : resolvableString.hashCode()) * 31) + Boolean.hashCode(this.showAbovePrimaryButton);
    }

    public String toString() {
        return "MandateText(text=" + this.text + ", showAbovePrimaryButton=" + this.showAbovePrimaryButton + ")";
    }

    public MandateText(ResolvableString resolvableString, boolean z) {
        this.text = resolvableString;
        this.showAbovePrimaryButton = z;
    }

    public final ResolvableString getText() {
        return this.text;
    }

    public final boolean getShowAbovePrimaryButton() {
        return this.showAbovePrimaryButton;
    }
}
