package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "", "durationRemaining", "Lkotlin/time/Duration;", "ctaText", "", "pollingState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "<init>", "(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDurationRemaining-UwyO8pc", "()J", "J", "getCtaText", "()I", "getPollingState", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "component1", "component1-UwyO8pc", "component2", "component3", "copy", "copy-KLykuaI", "(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PollingUiState {
    public static final int $stable = 0;
    private final int ctaText;
    private final long durationRemaining;
    private final PollingState pollingState;

    public /* synthetic */ PollingUiState(long j, int i, PollingState pollingState, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, pollingState);
    }

    /* renamed from: copy-KLykuaI$default, reason: not valid java name */
    public static /* synthetic */ PollingUiState m8393copyKLykuaI$default(PollingUiState pollingUiState, long j, int i, PollingState pollingState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = pollingUiState.durationRemaining;
        }
        if ((i2 & 2) != 0) {
            i = pollingUiState.ctaText;
        }
        if ((i2 & 4) != 0) {
            pollingState = pollingUiState.pollingState;
        }
        return pollingUiState.m8395copyKLykuaI(j, i, pollingState);
    }

    /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getDurationRemaining() {
        return this.durationRemaining;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component3, reason: from getter */
    public final PollingState getPollingState() {
        return this.pollingState;
    }

    /* renamed from: copy-KLykuaI, reason: not valid java name */
    public final PollingUiState m8395copyKLykuaI(long durationRemaining, int ctaText, PollingState pollingState) {
        Intrinsics.checkNotNullParameter(pollingState, "pollingState");
        return new PollingUiState(durationRemaining, ctaText, pollingState, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollingUiState)) {
            return false;
        }
        PollingUiState pollingUiState = (PollingUiState) other;
        return Duration.m10487equalsimpl0(this.durationRemaining, pollingUiState.durationRemaining) && this.ctaText == pollingUiState.ctaText && this.pollingState == pollingUiState.pollingState;
    }

    public int hashCode() {
        return (((Duration.m10503hashCodeimpl(this.durationRemaining) * 31) + Integer.hashCode(this.ctaText)) * 31) + this.pollingState.hashCode();
    }

    public String toString() {
        return "PollingUiState(durationRemaining=" + Duration.m10522toStringimpl(this.durationRemaining) + ", ctaText=" + this.ctaText + ", pollingState=" + this.pollingState + ")";
    }

    private PollingUiState(long j, int i, PollingState pollingState) {
        Intrinsics.checkNotNullParameter(pollingState, "pollingState");
        this.durationRemaining = j;
        this.ctaText = i;
        this.pollingState = pollingState;
    }

    /* renamed from: getDurationRemaining-UwyO8pc, reason: not valid java name */
    public final long m8396getDurationRemainingUwyO8pc() {
        return this.durationRemaining;
    }

    public final int getCtaText() {
        return this.ctaText;
    }

    public /* synthetic */ PollingUiState(long j, int i, PollingState pollingState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? PollingState.Active : pollingState, null);
    }

    public final PollingState getPollingState() {
        return this.pollingState;
    }
}
