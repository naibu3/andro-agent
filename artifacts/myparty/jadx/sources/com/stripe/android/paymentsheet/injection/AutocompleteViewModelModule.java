package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelModule;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteViewModelModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule;", "", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface AutocompleteViewModelModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    /* compiled from: AutocompleteViewModelModule.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule$Companion;", "", "<init>", "()V", "providesContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "providesProductUsage", "", "", "providesAutocompleteViewModelArgs", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "providesEnableLogging", "", "providesPublishableKey", "Lkotlin/Function0;", "context", "provideGooglePlacesClient", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "provideGooglePlacesClient$paymentsheet_release", "provideEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "defaultAddressLauncherEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean providesEnableLogging() {
            return false;
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final Context providesContext(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            Context applicationContext = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return applicationContext;
        }

        @Provides
        @Singleton
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Custom;
        }

        @Provides
        @Singleton
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> providesProductUsage() {
            return SetsKt.setOf("PaymentElement.Autocomplete");
        }

        @Provides
        @Singleton
        public final AutocompleteViewModel.Args providesAutocompleteViewModelArgs(AutocompleteContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new AutocompleteViewModel.Args(args.getCountry$paymentsheet_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providesPublishableKey$lambda$0(Context context) {
            return PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey();
        }

        @Provides
        @Singleton
        @Named("publishableKey")
        public final Function0<String> providesPublishableKey(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Function0() { // from class: com.stripe.android.paymentsheet.injection.AutocompleteViewModelModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutocompleteViewModelModule.Companion.providesPublishableKey$lambda$0(context);
                }
            };
        }

        @Provides
        @Singleton
        public final PlacesClientProxy provideGooglePlacesClient$paymentsheet_release(Context context, AutocompleteContract.Args args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            return PlacesClientProxy.Companion.create$default(PlacesClientProxy.INSTANCE, context, args.getGooglePlacesApiKey$paymentsheet_release(), null, null, null, ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, context, null, 2, null), 28, null);
        }

        @Provides
        @Singleton
        public final AddressLauncherEventReporter provideEventReporter(DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
            Intrinsics.checkNotNullParameter(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
            return defaultAddressLauncherEventReporter;
        }
    }
}
