package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.NavHostAddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElementViewModelModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001f\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;", "", "<init>", "()V", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "providesProductUsage", "", "", "providesPublishableKey", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "provideGooglePlacesClient", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "context", "Landroid/content/Context;", "provideGooglePlacesClient$paymentsheet_release", "provideEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "defaultAddressLauncherEventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;", "Bindings", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {Bindings.class}, subcomponents = {AddressElementViewModelSubcomponent.class, InputAddressViewModelSubcomponent.class, AutocompleteViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public final class AddressElementViewModelModule {
    public static final int $stable = 0;

    /* compiled from: AddressElementViewModelModule.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule$Bindings;", "", "bindsAddressElementNavigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Module
    public interface Bindings {
        @Binds
        AddressElementNavigator bindsAddressElementNavigator(NavHostAddressElementNavigator navigator);
    }

    @Provides
    @Singleton
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }

    @Provides
    @Singleton
    @Named(NamedConstantsKt.PRODUCT_USAGE)
    public final Set<String> providesProductUsage() {
        return SetsKt.setOf("PaymentSheet.AddressController");
    }

    @Provides
    @Singleton
    @Named("publishableKey")
    public final String providesPublishableKey(AddressElementActivityContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return args.getPublishableKey$paymentsheet_release();
    }

    @Provides
    @Singleton
    public final PlacesClientProxy provideGooglePlacesClient$paymentsheet_release(Context context, AddressElementActivityContract.Args args) {
        String googlePlacesApiKey;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(args, "args");
        AddressLauncher.Configuration config$paymentsheet_release = args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release == null || (googlePlacesApiKey = config$paymentsheet_release.getGooglePlacesApiKey()) == null) {
            return null;
        }
        return PlacesClientProxy.Companion.create$default(PlacesClientProxy.INSTANCE, context, googlePlacesApiKey, null, null, null, ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, context, null, 2, null), 28, null);
    }

    @Provides
    @Singleton
    public final AddressLauncherEventReporter provideEventReporter(DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
        Intrinsics.checkNotNullParameter(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }
}
