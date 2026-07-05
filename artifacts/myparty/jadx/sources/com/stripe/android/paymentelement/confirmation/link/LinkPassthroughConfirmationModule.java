package com.stripe.android.paymentelement.confirmation.link;

import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;

/* compiled from: LinkPassthroughConfirmationModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationModule;", "", "bindsLinkPassthroughConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "definition", "Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface LinkPassthroughConfirmationModule {
    @Binds
    @IntoSet
    ConfirmationDefinition<?, ?, ?, ?> bindsLinkPassthroughConfirmationDefinition(LinkPassthroughConfirmationDefinition definition);
}
