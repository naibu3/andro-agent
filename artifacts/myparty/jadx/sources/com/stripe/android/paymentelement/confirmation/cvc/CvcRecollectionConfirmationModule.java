package com.stripe.android.paymentelement.confirmation.cvc;

import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandlerImpl;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionLauncherFactory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;

/* compiled from: CvcRecollectionConfirmationModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J \u0010\u0002\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule;", "", "bindsCvcConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "cvcReConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CvcRecollectionConfirmationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    @IntoSet
    ConfirmationDefinition<?, ?, ?, ?> bindsCvcConfirmationDefinition(CvcRecollectionConfirmationDefinition cvcReConfirmationDefinition);

    /* compiled from: CvcRecollectionConfirmationModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule$Companion;", "", "<init>", "()V", "provideCvcRecollectionLauncherFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncherFactory;", "provideCvcRecollectionHandler", "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final CvcRecollectionLauncherFactory provideCvcRecollectionLauncherFactory() {
            return DefaultCvcRecollectionLauncherFactory.INSTANCE;
        }

        @Provides
        public final CvcRecollectionHandler provideCvcRecollectionHandler() {
            return new CvcRecollectionHandlerImpl();
        }
    }
}
