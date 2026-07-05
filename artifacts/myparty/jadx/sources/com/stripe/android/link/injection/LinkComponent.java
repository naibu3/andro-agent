package com.stripe.android.link.injection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.gate.LinkGate;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: LinkComponent.kt */
@LinkScope
@Subcomponent(modules = {LinkModule.class, ApplicationIdModule.class})
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X \u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/injection/LinkComponent;", "", "<init>", "()V", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "getLinkAccountManager$paymentsheet_release", "()Lcom/stripe/android/link/account/LinkAccountManager;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "getConfiguration$paymentsheet_release", "()Lcom/stripe/android/link/LinkConfiguration;", "linkGate", "Lcom/stripe/android/link/gate/LinkGate;", "getLinkGate$paymentsheet_release", "()Lcom/stripe/android/link/gate/LinkGate;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "getLinkAttestationCheck$paymentsheet_release", "()Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "inlineSignupViewModelFactory", "Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;", "getInlineSignupViewModelFactory$paymentsheet_release", "()Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;", "linkAuth", "Lcom/stripe/android/link/account/LinkAuth;", "getLinkAuth$paymentsheet_release", "()Lcom/stripe/android/link/account/LinkAuth;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkComponent {
    public static final int $stable = 0;

    /* compiled from: LinkComponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/injection/LinkComponent$Builder;", "", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/link/injection/LinkComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        LinkComponent build();

        @BindsInstance
        Builder configuration(LinkConfiguration configuration);
    }

    public abstract LinkConfiguration getConfiguration$paymentsheet_release();

    public abstract LinkInlineSignupAssistedViewModelFactory getInlineSignupViewModelFactory$paymentsheet_release();

    public abstract LinkAccountManager getLinkAccountManager$paymentsheet_release();

    public abstract LinkAttestationCheck getLinkAttestationCheck$paymentsheet_release();

    public abstract LinkAuth getLinkAuth$paymentsheet_release();

    public abstract LinkGate getLinkGate$paymentsheet_release();
}
