package com.stripe.android.ui.core.elements.autocomplete.model;

import android.text.SpannableString;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Place.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "", PaymentSheetAppearanceKeys.PRIMARY_TEXT, "Landroid/text/SpannableString;", PaymentSheetAppearanceKeys.SECONDARY_TEXT, "placeId", "", "<init>", "(Landroid/text/SpannableString;Landroid/text/SpannableString;Ljava/lang/String;)V", "getPrimaryText", "()Landroid/text/SpannableString;", "getSecondaryText", "getPlaceId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AutocompletePrediction {
    public static final int $stable = 8;
    private final String placeId;
    private final SpannableString primaryText;
    private final SpannableString secondaryText;

    public static /* synthetic */ AutocompletePrediction copy$default(AutocompletePrediction autocompletePrediction, SpannableString spannableString, SpannableString spannableString2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            spannableString = autocompletePrediction.primaryText;
        }
        if ((i & 2) != 0) {
            spannableString2 = autocompletePrediction.secondaryText;
        }
        if ((i & 4) != 0) {
            str = autocompletePrediction.placeId;
        }
        return autocompletePrediction.copy(spannableString, spannableString2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SpannableString getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final SpannableString getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    public final AutocompletePrediction copy(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        return new AutocompletePrediction(primaryText, secondaryText, placeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompletePrediction)) {
            return false;
        }
        AutocompletePrediction autocompletePrediction = (AutocompletePrediction) other;
        return Intrinsics.areEqual(this.primaryText, autocompletePrediction.primaryText) && Intrinsics.areEqual(this.secondaryText, autocompletePrediction.secondaryText) && Intrinsics.areEqual(this.placeId, autocompletePrediction.placeId);
    }

    public int hashCode() {
        return (((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.placeId.hashCode();
    }

    public String toString() {
        return "AutocompletePrediction(primaryText=" + ((Object) this.primaryText) + ", secondaryText=" + ((Object) this.secondaryText) + ", placeId=" + this.placeId + ")";
    }

    public AutocompletePrediction(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.placeId = placeId;
    }

    public final SpannableString getPrimaryText() {
        return this.primaryText;
    }

    public final SpannableString getSecondaryText() {
        return this.secondaryText;
    }

    public final String getPlaceId() {
        return this.placeId;
    }
}
