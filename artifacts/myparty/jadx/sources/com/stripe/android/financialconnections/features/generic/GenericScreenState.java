package com.stripe.android.financialconnections.features.generic;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericScreen.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;", "", "screen", "LFinancialConnectionsGenericInfoScreen;", "inModal", "", "<init>", "(LFinancialConnectionsGenericInfoScreen;Z)V", "getScreen", "()LFinancialConnectionsGenericInfoScreen;", "getInModal", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GenericScreenState {
    public static final int $stable = 8;
    private final boolean inModal;
    private final FinancialConnectionsGenericInfoScreen screen;

    public static /* synthetic */ GenericScreenState copy$default(GenericScreenState genericScreenState, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsGenericInfoScreen = genericScreenState.screen;
        }
        if ((i & 2) != 0) {
            z = genericScreenState.inModal;
        }
        return genericScreenState.copy(financialConnectionsGenericInfoScreen, z);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsGenericInfoScreen getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInModal() {
        return this.inModal;
    }

    public final GenericScreenState copy(FinancialConnectionsGenericInfoScreen screen, boolean inModal) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new GenericScreenState(screen, inModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericScreenState)) {
            return false;
        }
        GenericScreenState genericScreenState = (GenericScreenState) other;
        return Intrinsics.areEqual(this.screen, genericScreenState.screen) && this.inModal == genericScreenState.inModal;
    }

    public int hashCode() {
        return (this.screen.hashCode() * 31) + Boolean.hashCode(this.inModal);
    }

    public String toString() {
        return "GenericScreenState(screen=" + this.screen + ", inModal=" + this.inModal + ")";
    }

    public GenericScreenState(FinancialConnectionsGenericInfoScreen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.inModal = z;
    }

    public final FinancialConnectionsGenericInfoScreen getScreen() {
        return this.screen;
    }

    public final boolean getInModal() {
        return this.inModal;
    }
}
