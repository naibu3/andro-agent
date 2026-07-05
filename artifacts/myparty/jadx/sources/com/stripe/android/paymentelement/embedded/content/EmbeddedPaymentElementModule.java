package com.stripe.android.paymentelement.embedded.content;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentelement.embedded.DefaultEmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.EmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementModule;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EmbeddedPaymentElementSubcomponent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule;", "", "bindsSheetLauncher", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;", "launcher", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;", "bindsConfirmationHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;", "confirmationHelper", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;", "bindsEmbeddedResultCallbackHelper", "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;", "helper", "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface EmbeddedPaymentElementModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    EmbeddedConfirmationHelper bindsConfirmationHelper(DefaultEmbeddedConfirmationHelper confirmationHelper);

    @Binds
    EmbeddedResultCallbackHelper bindsEmbeddedResultCallbackHelper(DefaultEmbeddedResultCallbackHelper helper);

    @Binds
    EmbeddedSheetLauncher bindsSheetLauncher(DefaultEmbeddedSheetLauncher launcher);

    /* compiled from: EmbeddedPaymentElementSubcomponent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;", "", "<init>", "()V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "application", "Landroid/app/Application;", NamedConstantsKt.IS_LIVE_MODE, "Lkotlin/Function0;", "", "Ljavax/inject/Provider;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final PaymentConfiguration paymentConfiguration(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return PaymentConfiguration.INSTANCE.getInstance(application);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean isLiveMode$lambda$0(Provider provider) {
            return StringsKt.startsWith$default(((PaymentConfiguration) provider.get()).getPublishableKey(), "pk_live", false, 2, (Object) null);
        }

        @Provides
        @Named(NamedConstantsKt.IS_LIVE_MODE)
        public final Function0<Boolean> isLiveMode(final Provider<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(EmbeddedPaymentElementModule.Companion.isLiveMode$lambda$0(paymentConfiguration));
                }
            };
        }
    }
}
