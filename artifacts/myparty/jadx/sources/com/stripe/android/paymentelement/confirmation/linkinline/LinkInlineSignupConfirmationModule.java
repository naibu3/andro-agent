package com.stripe.android.paymentelement.confirmation.linkinline;

import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkInlineSignupConfirmationModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;", "", "<init>", "()V", "providesLinkConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "linkAnalyticsComponentBuilder", "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {LinkAnalyticsComponent.class})
/* loaded from: classes5.dex */
public final class LinkInlineSignupConfirmationModule {
    public static final int $stable = 0;
    public static final LinkInlineSignupConfirmationModule INSTANCE = new LinkInlineSignupConfirmationModule();

    private LinkInlineSignupConfirmationModule() {
    }

    @Provides
    @IntoSet
    public final ConfirmationDefinition<?, ?, ?, ?> providesLinkConfirmationDefinition(LinkStore linkStore, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkAnalyticsComponent.Builder linkAnalyticsComponentBuilder) {
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        return new LinkInlineSignupConfirmationDefinition(linkConfigurationCoordinator, linkAnalyticsComponentBuilder.build().getLinkAnalyticsHelper(), linkStore);
    }
}
