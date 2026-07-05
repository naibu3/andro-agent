package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentElementAutocompleteAddressInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;", "launcher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "autocompleteConfig", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V", "getAutocompleteConfig", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "eventListener", "Lkotlin/Function1;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "", "register", "onEvent", "onAutocomplete", "country", "", "onAutocompleteLauncherResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentElementAutocompleteAddressInteractor implements AutocompleteAddressInteractor, AutocompleteLauncherResultHandler {
    public static final int $stable = 8;
    private final AutocompleteAddressInteractor.Config autocompleteConfig;
    private Function1<? super AutocompleteAddressInteractor.Event, Unit> eventListener;
    private final AutocompleteLauncher launcher;

    public PaymentElementAutocompleteAddressInteractor(AutocompleteLauncher launcher, AutocompleteAddressInteractor.Config autocompleteConfig) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(autocompleteConfig, "autocompleteConfig");
        this.launcher = launcher;
        this.autocompleteConfig = autocompleteConfig;
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public AutocompleteAddressInteractor.Config getAutocompleteConfig() {
        return this.autocompleteConfig;
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public void register(Function1<? super AutocompleteAddressInteractor.Event, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.eventListener = onEvent;
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public void onAutocomplete(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        String googlePlacesApiKey = getAutocompleteConfig().getGooglePlacesApiKey();
        if (googlePlacesApiKey != null) {
            this.launcher.launch(country, googlePlacesApiKey, this);
        }
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteLauncherResultHandler
    public void onAutocompleteLauncherResult(AutocompleteLauncher.Result result) {
        Object obj;
        Function1<? super AutocompleteAddressInteractor.Event, Unit> function1;
        Intrinsics.checkNotNullParameter(result, "result");
        AddressDetails addressDetails = result.getAddressDetails();
        Map identifierMap$default = addressDetails != null ? AddressDetailsKt.toIdentifierMap$default(addressDetails, null, 1, null) : null;
        if (result instanceof AutocompleteLauncher.Result.EnterManually) {
            obj = (AutocompleteAddressInteractor.Event) new AutocompleteAddressInteractor.Event.OnExpandForm(identifierMap$default);
        } else {
            if (!(result instanceof AutocompleteLauncher.Result.OnBack)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = (AutocompleteAddressInteractor.Event) (identifierMap$default != null ? new AutocompleteAddressInteractor.Event.OnValues(identifierMap$default) : null);
        }
        if (obj == null || (function1 = this.eventListener) == null) {
            return;
        }
        function1.invoke(obj);
    }

    /* compiled from: PaymentElementAutocompleteAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "launcher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "autocompleteConfig", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;)V", "create", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements AutocompleteAddressInteractor.Factory {
        public static final int $stable = AutocompleteAddressInteractor.Config.$stable;
        private final AutocompleteAddressInteractor.Config autocompleteConfig;
        private final AutocompleteLauncher launcher;

        public Factory(AutocompleteLauncher launcher, AutocompleteAddressInteractor.Config autocompleteConfig) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            Intrinsics.checkNotNullParameter(autocompleteConfig, "autocompleteConfig");
            this.launcher = launcher;
            this.autocompleteConfig = autocompleteConfig;
        }

        @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor.Factory
        public AutocompleteAddressInteractor create() {
            return new PaymentElementAutocompleteAddressInteractor(this.launcher, this.autocompleteConfig);
        }
    }
}
