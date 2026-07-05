package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LinkAccountPickerViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;", "", "account", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "display", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "<init>", "(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V", "getAccount", "()Lcom/stripe/android/financialconnections/model/PartnerAccount;", "getDisplay", "()Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "type", "", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkedAccount {
    public static final int $stable = 8;
    private final PartnerAccount account;
    private final NetworkedAccount display;

    public static /* synthetic */ LinkedAccount copy$default(LinkedAccount linkedAccount, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            partnerAccount = linkedAccount.account;
        }
        if ((i & 2) != 0) {
            networkedAccount = linkedAccount.display;
        }
        return linkedAccount.copy(partnerAccount, networkedAccount);
    }

    /* renamed from: component1, reason: from getter */
    public final PartnerAccount getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final NetworkedAccount getDisplay() {
        return this.display;
    }

    public final LinkedAccount copy(PartnerAccount account, NetworkedAccount display) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(display, "display");
        return new LinkedAccount(account, display);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkedAccount)) {
            return false;
        }
        LinkedAccount linkedAccount = (LinkedAccount) other;
        return Intrinsics.areEqual(this.account, linkedAccount.account) && Intrinsics.areEqual(this.display, linkedAccount.display);
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + this.display.hashCode();
    }

    public String toString() {
        return "LinkedAccount(account=" + this.account + ", display=" + this.display + ")";
    }

    public LinkedAccount(PartnerAccount account, NetworkedAccount display) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(display, "display");
        this.account = account;
        this.display = display;
    }

    public final PartnerAccount getAccount() {
        return this.account;
    }

    public final NetworkedAccount getDisplay() {
        return this.display;
    }

    public final String getType() {
        return (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) this.account.getId(), new String[]{"_"}, false, 0, 6, (Object) null));
    }
}
