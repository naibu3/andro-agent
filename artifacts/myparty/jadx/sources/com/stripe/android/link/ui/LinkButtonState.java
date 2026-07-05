package com.stripe.android.link.ui;

import androidx.webkit.Profile;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.ui.wallet.DefaultPaymentUI;
import com.stripe.android.link.ui.wallet.DefaultPaymentUIKt;
import com.stripe.android.model.DisplayablePaymentDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkButtonState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/ui/LinkButtonState;", "", "<init>", "()V", "DefaultPayment", "Email", Profile.DEFAULT_PROFILE_NAME, "Companion", "Lcom/stripe/android/link/ui/LinkButtonState$Default;", "Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;", "Lcom/stripe/android/link/ui/LinkButtonState$Email;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkButtonState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ LinkButtonState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LinkButtonState() {
    }

    /* compiled from: LinkButtonState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;", "Lcom/stripe/android/link/ui/LinkButtonState;", "paymentUI", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "<init>", "(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V", "getPaymentUI", "()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DefaultPayment extends LinkButtonState {
        public static final int $stable = 0;
        private final DefaultPaymentUI paymentUI;

        public static /* synthetic */ DefaultPayment copy$default(DefaultPayment defaultPayment, DefaultPaymentUI defaultPaymentUI, int i, Object obj) {
            if ((i & 1) != 0) {
                defaultPaymentUI = defaultPayment.paymentUI;
            }
            return defaultPayment.copy(defaultPaymentUI);
        }

        /* renamed from: component1, reason: from getter */
        public final DefaultPaymentUI getPaymentUI() {
            return this.paymentUI;
        }

        public final DefaultPayment copy(DefaultPaymentUI paymentUI) {
            Intrinsics.checkNotNullParameter(paymentUI, "paymentUI");
            return new DefaultPayment(paymentUI);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DefaultPayment) && Intrinsics.areEqual(this.paymentUI, ((DefaultPayment) other).paymentUI);
        }

        public int hashCode() {
            return this.paymentUI.hashCode();
        }

        public String toString() {
            return "DefaultPayment(paymentUI=" + this.paymentUI + ")";
        }

        public final DefaultPaymentUI getPaymentUI() {
            return this.paymentUI;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultPayment(DefaultPaymentUI paymentUI) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentUI, "paymentUI");
            this.paymentUI = paymentUI;
        }
    }

    /* compiled from: LinkButtonState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/link/ui/LinkButtonState$Email;", "Lcom/stripe/android/link/ui/LinkButtonState;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Email extends LinkButtonState {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ Email copy$default(Email email, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = email.email;
            }
            return email.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Email copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new Email(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && Intrinsics.areEqual(this.email, ((Email) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "Email(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: LinkButtonState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/link/ui/LinkButtonState$Default;", "Lcom/stripe/android/link/ui/LinkButtonState;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends LinkButtonState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }
    }

    /* compiled from: LinkButtonState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/ui/LinkButtonState$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/link/ui/LinkButtonState;", "linkEmail", "", "paymentDetails", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "enableDefaultValues", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkButtonState create(String linkEmail, DisplayablePaymentDetails paymentDetails, boolean enableDefaultValues) {
            DefaultPaymentUI defaultPaymentUI = paymentDetails != null ? DefaultPaymentUIKt.toDefaultPaymentUI(paymentDetails, enableDefaultValues) : null;
            if (defaultPaymentUI != null) {
                return new DefaultPayment(defaultPaymentUI);
            }
            if (linkEmail != null) {
                return new Email(linkEmail);
            }
            return Default.INSTANCE;
        }
    }
}
