package com.stripe.android.paymentelement;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.AnnotatedString;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.webkit.Profile;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.common.ui.DelegateDrawable;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfigurationCoordinator;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedContent;
import com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementScope;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModel;
import com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper;
import com.stripe.android.paymentelement.embedded.content.PaymentOptionDisplayDataHolder;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.paymentsheet.utils.ActivityUtilsKt;
import com.stripe.android.uicore.image.DrawablePainterKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedPaymentElement.kt */
@EmbeddedPaymentElementScope
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\n-./0123456B9\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@¢\u0006\u0002\u0010&J\r\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\r\u0010*\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\u0006\u0010+\u001a\u00020(J\u0006\u0010,\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R5\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d*\u0004\b\u0018\u0010\u0019¨\u00067²\u0006\f\u00108\u001a\u0004\u0018\u000109X\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0004\u0018\u00010;X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "", "confirmationHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;", "contentHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "paymentOptionDisplayDataHolder", "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;", "configurationCoordinator", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;", "stateHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V", "paymentOption", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;", "getPaymentOption", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", ServerProtocol.DIALOG_PARAM_STATE, "getState$delegate", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Ljava/lang/Object;", "getState", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", "setState", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V", "state$receiver", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;", "configure", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WalletButtons", "", "(Landroidx/compose/runtime/Composer;I)V", "Content", "confirm", "clearPaymentOption", "Builder", "Configuration", "FormSheetAction", "ConfigureResult", "PaymentOptionDisplayData", "Result", "ResultCallback", "RowSelectionBehavior", "State", "Companion", "paymentsheet_release", "walletButtonsContent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "embeddedContent", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElement {
    private final EmbeddedConfigurationCoordinator configurationCoordinator;
    private final EmbeddedConfirmationHelper confirmationHelper;
    private final EmbeddedContentHelper contentHelper;
    private final StateFlow<PaymentOptionDisplayData> paymentOption;
    private final EmbeddedSelectionHolder selectionHolder;

    /* renamed from: state$receiver, reason: from kotlin metadata */
    private final EmbeddedStateHelper state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;", "", "onResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResultCallback {
        void onResult(Result result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(EmbeddedPaymentElement embeddedPaymentElement, int i, Composer composer, int i2) {
        embeddedPaymentElement.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletButtons$lambda$1(EmbeddedPaymentElement embeddedPaymentElement, int i, Composer composer, int i2) {
        embeddedPaymentElement.WalletButtons(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public EmbeddedPaymentElement(EmbeddedConfirmationHelper confirmationHelper, EmbeddedContentHelper contentHelper, EmbeddedSelectionHolder selectionHolder, PaymentOptionDisplayDataHolder paymentOptionDisplayDataHolder, EmbeddedConfigurationCoordinator configurationCoordinator, EmbeddedStateHelper stateHelper) {
        Intrinsics.checkNotNullParameter(confirmationHelper, "confirmationHelper");
        Intrinsics.checkNotNullParameter(contentHelper, "contentHelper");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(paymentOptionDisplayDataHolder, "paymentOptionDisplayDataHolder");
        Intrinsics.checkNotNullParameter(configurationCoordinator, "configurationCoordinator");
        Intrinsics.checkNotNullParameter(stateHelper, "stateHelper");
        this.confirmationHelper = confirmationHelper;
        this.contentHelper = contentHelper;
        this.selectionHolder = selectionHolder;
        this.configurationCoordinator = configurationCoordinator;
        this.paymentOption = paymentOptionDisplayDataHolder.getPaymentOption();
        this.state = stateHelper;
    }

    public final StateFlow<PaymentOptionDisplayData> getPaymentOption() {
        return this.paymentOption;
    }

    public final State getState() {
        return this.state.getState();
    }

    public final void setState(State state) {
        this.state.setState(state);
    }

    public final Object configure(PaymentSheet.IntentConfiguration intentConfiguration, Configuration configuration, Continuation<? super ConfigureResult> continuation) {
        return this.configurationCoordinator.configure(intentConfiguration, configuration, continuation);
    }

    public final void WalletButtons(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1609568745);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1609568745, i2, -1, "com.stripe.android.paymentelement.EmbeddedPaymentElement.WalletButtons (EmbeddedPaymentElement.kt:89)");
            }
            WalletButtonsContent walletButtonsContentWalletButtons$lambda$0 = WalletButtons$lambda$0(StateFlowsComposeKt.collectAsState(this.contentHelper.getWalletButtonsContent(), null, composerStartRestartGroup, 0, 1));
            if (walletButtonsContentWalletButtons$lambda$0 != null) {
                walletButtonsContentWalletButtons$lambda$0.Content(composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElement$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmbeddedPaymentElement.WalletButtons$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(746947016);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(746947016, i2, -1, "com.stripe.android.paymentelement.EmbeddedPaymentElement.Content (EmbeddedPaymentElement.kt:100)");
            }
            EmbeddedContent embeddedContentContent$lambda$2 = Content$lambda$2(StateFlowsComposeKt.collectAsState(this.contentHelper.getEmbeddedContent(), null, composerStartRestartGroup, 0, 1));
            if (embeddedContentContent$lambda$2 != null) {
                embeddedContentContent$lambda$2.Content(composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElement$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmbeddedPaymentElement.Content$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void confirm() {
        this.confirmationHelper.confirm();
    }

    public final void clearPaymentOption() {
        this.selectionHolder.set(null);
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0017H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001dH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017@BX\u0080\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001d@BX\u0080\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;", "", "deferredHandler", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;", "resultCallback", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;", "<init>", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V", "getDeferredHandler$paymentsheet_release", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;", "getResultCallback$paymentsheet_release", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;", "value", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "externalPaymentMethodConfirmHandler", "getExternalPaymentMethodConfirmHandler$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "confirmCustomPaymentMethodCallback", "getConfirmCustomPaymentMethodCallback$paymentsheet_release$annotations", "()V", "getConfirmCustomPaymentMethodCallback$paymentsheet_release", "()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "analyticEventCallback", "getAnalyticEventCallback$paymentsheet_release$annotations", "getAnalyticEventCallback$paymentsheet_release", "()Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "rowSelectionBehavior", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "getRowSelectionBehavior$paymentsheet_release", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "setRowSelectionBehavior$paymentsheet_release", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;)V", "handler", "callback", "DeferredHandler", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AnalyticEventCallback analyticEventCallback;
        private ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback;
        private final DeferredHandler deferredHandler;
        private ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler;
        private final ResultCallback resultCallback;
        private RowSelectionBehavior rowSelectionBehavior;

        public static /* synthetic */ void getAnalyticEventCallback$paymentsheet_release$annotations() {
        }

        public static /* synthetic */ void getConfirmCustomPaymentMethodCallback$paymentsheet_release$annotations() {
        }

        public Builder(DeferredHandler deferredHandler, ResultCallback resultCallback) {
            Intrinsics.checkNotNullParameter(deferredHandler, "deferredHandler");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            this.deferredHandler = deferredHandler;
            this.resultCallback = resultCallback;
            this.rowSelectionBehavior = RowSelectionBehavior.INSTANCE.m8072default();
        }

        /* renamed from: getDeferredHandler$paymentsheet_release, reason: from getter */
        public final DeferredHandler getDeferredHandler() {
            return this.deferredHandler;
        }

        /* renamed from: getResultCallback$paymentsheet_release, reason: from getter */
        public final ResultCallback getResultCallback() {
            return this.resultCallback;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(CreateIntentCallback createIntentCallback, ResultCallback resultCallback) {
            this(new DeferredHandler.Intent(createIntentCallback), resultCallback);
            Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(PreparePaymentMethodHandler preparePaymentMethodHandler, ResultCallback resultCallback) {
            this(new DeferredHandler.SharedPaymentToken(preparePaymentMethodHandler), resultCallback);
            Intrinsics.checkNotNullParameter(preparePaymentMethodHandler, "preparePaymentMethodHandler");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        }

        /* renamed from: getExternalPaymentMethodConfirmHandler$paymentsheet_release, reason: from getter */
        public final ExternalPaymentMethodConfirmHandler getExternalPaymentMethodConfirmHandler() {
            return this.externalPaymentMethodConfirmHandler;
        }

        /* renamed from: getConfirmCustomPaymentMethodCallback$paymentsheet_release, reason: from getter */
        public final ConfirmCustomPaymentMethodCallback getConfirmCustomPaymentMethodCallback() {
            return this.confirmCustomPaymentMethodCallback;
        }

        /* renamed from: getAnalyticEventCallback$paymentsheet_release, reason: from getter */
        public final AnalyticEventCallback getAnalyticEventCallback() {
            return this.analyticEventCallback;
        }

        /* renamed from: getRowSelectionBehavior$paymentsheet_release, reason: from getter */
        public final RowSelectionBehavior getRowSelectionBehavior() {
            return this.rowSelectionBehavior;
        }

        public final void setRowSelectionBehavior$paymentsheet_release(RowSelectionBehavior rowSelectionBehavior) {
            Intrinsics.checkNotNullParameter(rowSelectionBehavior, "<set-?>");
            this.rowSelectionBehavior = rowSelectionBehavior;
        }

        public final Builder externalPaymentMethodConfirmHandler(ExternalPaymentMethodConfirmHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.externalPaymentMethodConfirmHandler = handler;
            return this;
        }

        public final Builder confirmCustomPaymentMethodCallback(ConfirmCustomPaymentMethodCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.confirmCustomPaymentMethodCallback = callback;
            return this;
        }

        public final Builder analyticEventCallback(AnalyticEventCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.analyticEventCallback = callback;
            return this;
        }

        public final Builder rowSelectionBehavior(RowSelectionBehavior rowSelectionBehavior) {
            Intrinsics.checkNotNullParameter(rowSelectionBehavior, "rowSelectionBehavior");
            this.rowSelectionBehavior = rowSelectionBehavior;
            return this;
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;", "", "Intent", "SharedPaymentToken", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface DeferredHandler {

            /* compiled from: EmbeddedPaymentElement.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "<init>", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V", "getCreateIntentCallback", "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Intent implements DeferredHandler {
                public static final int $stable = 8;
                private final CreateIntentCallback createIntentCallback;

                public Intent(CreateIntentCallback createIntentCallback) {
                    Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                    this.createIntentCallback = createIntentCallback;
                }

                public final CreateIntentCallback getCreateIntentCallback() {
                    return this.createIntentCallback;
                }
            }

            /* compiled from: EmbeddedPaymentElement.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "<init>", "(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V", "getPreparePaymentMethodHandler", "()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SharedPaymentToken implements DeferredHandler {
                public static final int $stable = 8;
                private final PreparePaymentMethodHandler preparePaymentMethodHandler;

                public SharedPaymentToken(PreparePaymentMethodHandler preparePaymentMethodHandler) {
                    Intrinsics.checkNotNullParameter(preparePaymentMethodHandler, "preparePaymentMethodHandler");
                    this.preparePaymentMethodHandler = preparePaymentMethodHandler;
                }

                public final PreparePaymentMethodHandler getPreparePaymentMethodHandler() {
                    return this.preparePaymentMethodHandler;
                }
            }
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001QBÙ\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0004\b'\u0010(J\u0006\u0010J\u001a\u00020KJ\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020KR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0014\u0010\u001e\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00104R\u0014\u0010\u001f\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0014\u0010!\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006R"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "Landroid/os/Parcelable;", "merchantDisplayName", "", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonLabel", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "externalPaymentMethods", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "customPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "embeddedViewDisplaysMandateText", "link", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "formSheetAction", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;", "termsDisplay", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Ljava/util/List;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;Ljava/util/Map;)V", "getMerchantDisplayName$paymentsheet_release", "()Ljava/lang/String;", "getCustomer$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getGooglePay$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getDefaultBillingDetails$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getShippingDetails$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAllowsDelayedPaymentMethods$paymentsheet_release", "()Z", "getAllowsPaymentMethodsRequiringShippingAddress$paymentsheet_release", "getAppearance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getPrimaryButtonLabel$paymentsheet_release", "getBillingDetailsCollectionConfiguration$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getPreferredNetworks$paymentsheet_release", "()Ljava/util/List;", "getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release", "getPaymentMethodOrder$paymentsheet_release", "getExternalPaymentMethods$paymentsheet_release", "getCardBrandAcceptance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "getCustomPaymentMethods$paymentsheet_release", "getEmbeddedViewDisplaysMandateText$paymentsheet_release", "getLink$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "getFormSheetAction$paymentsheet_release", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;", "getTermsDisplay$paymentsheet_release", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration implements Parcelable {
        private final boolean allowsDelayedPaymentMethods;
        private final boolean allowsPaymentMethodsRequiringShippingAddress;
        private final boolean allowsRemovalOfLastSavedPaymentMethod;
        private final PaymentSheet.Appearance appearance;
        private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
        private final List<PaymentSheet.CustomPaymentMethod> customPaymentMethods;
        private final PaymentSheet.CustomerConfiguration customer;
        private final PaymentSheet.BillingDetails defaultBillingDetails;
        private final boolean embeddedViewDisplaysMandateText;
        private final List<String> externalPaymentMethods;
        private final FormSheetAction formSheetAction;
        private final PaymentSheet.GooglePayConfiguration googlePay;
        private final PaymentSheet.LinkConfiguration link;
        private final String merchantDisplayName;
        private final List<String> paymentMethodOrder;
        private final List<CardBrand> preferredNetworks;
        private final String primaryButtonLabel;
        private final AddressDetails shippingDetails;
        private final Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> termsDisplay;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                int i;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String string = parcel2.readString();
                PaymentSheet.CustomerConfiguration customerConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : PaymentSheet.CustomerConfiguration.CREATOR.createFromParcel(parcel2);
                PaymentSheet.GooglePayConfiguration googlePayConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : PaymentSheet.GooglePayConfiguration.CREATOR.createFromParcel(parcel2);
                PaymentSheet.BillingDetails billingDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel2);
                AddressDetails addressDetailsCreateFromParcel = parcel2.readInt() != 0 ? AddressDetails.CREATOR.createFromParcel(parcel2) : null;
                boolean z = false;
                if (parcel2.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                boolean z2 = parcel2.readInt() != 0 ? 1 : i;
                PaymentSheet.Appearance appearanceCreateFromParcel = PaymentSheet.Appearance.CREATOR.createFromParcel(parcel2);
                String string2 = parcel2.readString();
                PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel2);
                int i2 = parcel2.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = i; i3 != i2; i3++) {
                    arrayList.add(CardBrand.valueOf(parcel2.readString()));
                }
                ArrayList arrayList2 = arrayList;
                boolean z3 = parcel2.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel2.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel2.createStringArrayList();
                PaymentSheet.CardBrandAcceptance cardBrandAcceptance = (PaymentSheet.CardBrandAcceptance) parcel2.readParcelable(Configuration.class.getClassLoader());
                int i4 = parcel2.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    arrayList3.add(PaymentSheet.CustomPaymentMethod.CREATOR.createFromParcel(parcel2));
                    i5++;
                    i4 = i4;
                }
                ArrayList arrayList4 = arrayList3;
                boolean z4 = parcel2.readInt() != 0;
                PaymentSheet.LinkConfiguration linkConfigurationCreateFromParcel = PaymentSheet.LinkConfiguration.CREATOR.createFromParcel(parcel2);
                FormSheetAction formSheetActionValueOf = FormSheetAction.valueOf(parcel2.readString());
                int i6 = parcel2.readInt();
                boolean z5 = z4;
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                int i7 = 0;
                while (i7 != i6) {
                    linkedHashMap.put(parcel2.readParcelable(Configuration.class.getClassLoader()), PaymentSheet.TermsDisplay.valueOf(parcel2.readString()));
                    i7++;
                    parcel2 = parcel;
                    i6 = i6;
                }
                return new Configuration(string, customerConfigurationCreateFromParcel, googlePayConfigurationCreateFromParcel, billingDetailsCreateFromParcel, addressDetailsCreateFromParcel, z, z2, appearanceCreateFromParcel, string2, billingDetailsCollectionConfigurationCreateFromParcel, arrayList2, z3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, cardBrandAcceptance, arrayList4, z5, linkConfigurationCreateFromParcel, formSheetActionValueOf, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.merchantDisplayName, configuration.merchantDisplayName) && Intrinsics.areEqual(this.customer, configuration.customer) && Intrinsics.areEqual(this.googlePay, configuration.googlePay) && Intrinsics.areEqual(this.defaultBillingDetails, configuration.defaultBillingDetails) && Intrinsics.areEqual(this.shippingDetails, configuration.shippingDetails) && this.allowsDelayedPaymentMethods == configuration.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == configuration.allowsPaymentMethodsRequiringShippingAddress && Intrinsics.areEqual(this.appearance, configuration.appearance) && Intrinsics.areEqual(this.primaryButtonLabel, configuration.primaryButtonLabel) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.preferredNetworks, configuration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == configuration.allowsRemovalOfLastSavedPaymentMethod && Intrinsics.areEqual(this.paymentMethodOrder, configuration.paymentMethodOrder) && Intrinsics.areEqual(this.externalPaymentMethods, configuration.externalPaymentMethods) && Intrinsics.areEqual(this.cardBrandAcceptance, configuration.cardBrandAcceptance) && Intrinsics.areEqual(this.customPaymentMethods, configuration.customPaymentMethods) && this.embeddedViewDisplaysMandateText == configuration.embeddedViewDisplaysMandateText && Intrinsics.areEqual(this.link, configuration.link) && this.formSheetAction == configuration.formSheetAction && Intrinsics.areEqual(this.termsDisplay, configuration.termsDisplay);
        }

        public int hashCode() {
            int iHashCode = this.merchantDisplayName.hashCode() * 31;
            PaymentSheet.CustomerConfiguration customerConfiguration = this.customer;
            int iHashCode2 = (iHashCode + (customerConfiguration == null ? 0 : customerConfiguration.hashCode())) * 31;
            PaymentSheet.GooglePayConfiguration googlePayConfiguration = this.googlePay;
            int iHashCode3 = (iHashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
            PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
            int iHashCode4 = (iHashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            int iHashCode5 = (((((((iHashCode4 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + this.appearance.hashCode()) * 31;
            String str = this.primaryButtonLabel;
            return ((((((((((((((((((((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31) + this.cardBrandAcceptance.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31) + Boolean.hashCode(this.embeddedViewDisplaysMandateText)) * 31) + this.link.hashCode()) * 31) + this.formSheetAction.hashCode()) * 31) + this.termsDisplay.hashCode();
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.merchantDisplayName + ", customer=" + this.customer + ", googlePay=" + this.googlePay + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", appearance=" + this.appearance + ", primaryButtonLabel=" + this.primaryButtonLabel + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ", paymentMethodOrder=" + this.paymentMethodOrder + ", externalPaymentMethods=" + this.externalPaymentMethods + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ", customPaymentMethods=" + this.customPaymentMethods + ", embeddedViewDisplaysMandateText=" + this.embeddedViewDisplaysMandateText + ", link=" + this.link + ", formSheetAction=" + this.formSheetAction + ", termsDisplay=" + this.termsDisplay + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.merchantDisplayName);
            PaymentSheet.CustomerConfiguration customerConfiguration = this.customer;
            if (customerConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customerConfiguration.writeToParcel(dest, flags);
            }
            PaymentSheet.GooglePayConfiguration googlePayConfiguration = this.googlePay;
            if (googlePayConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                googlePayConfiguration.writeToParcel(dest, flags);
            }
            PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingDetails.writeToParcel(dest, flags);
            }
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressDetails.writeToParcel(dest, flags);
            }
            dest.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
            dest.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
            this.appearance.writeToParcel(dest, flags);
            dest.writeString(this.primaryButtonLabel);
            this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
            List<CardBrand> list = this.preferredNetworks;
            dest.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.allowsRemovalOfLastSavedPaymentMethod ? 1 : 0);
            dest.writeStringList(this.paymentMethodOrder);
            dest.writeStringList(this.externalPaymentMethods);
            dest.writeParcelable(this.cardBrandAcceptance, flags);
            List<PaymentSheet.CustomPaymentMethod> list2 = this.customPaymentMethods;
            dest.writeInt(list2.size());
            Iterator<PaymentSheet.CustomPaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            dest.writeInt(this.embeddedViewDisplaysMandateText ? 1 : 0);
            this.link.writeToParcel(dest, flags);
            dest.writeString(this.formSheetAction.name());
            Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> map = this.termsDisplay;
            dest.writeInt(map.size());
            for (Map.Entry<PaymentMethod.Type, PaymentSheet.TermsDisplay> entry : map.entrySet()) {
                dest.writeParcelable(entry.getKey(), flags);
                dest.writeString(entry.getValue().name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(String merchantDisplayName, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentSheet.GooglePayConfiguration googlePayConfiguration, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, PaymentSheet.Appearance appearance, String str, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends CardBrand> preferredNetworks, boolean z3, List<String> paymentMethodOrder, List<String> externalPaymentMethods, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, List<PaymentSheet.CustomPaymentMethod> customPaymentMethods, boolean z4, PaymentSheet.LinkConfiguration link, FormSheetAction formSheetAction, Map<PaymentMethod.Type, ? extends PaymentSheet.TermsDisplay> termsDisplay) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(formSheetAction, "formSheetAction");
            Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
            this.merchantDisplayName = merchantDisplayName;
            this.customer = customerConfiguration;
            this.googlePay = googlePayConfiguration;
            this.defaultBillingDetails = billingDetails;
            this.shippingDetails = addressDetails;
            this.allowsDelayedPaymentMethods = z;
            this.allowsPaymentMethodsRequiringShippingAddress = z2;
            this.appearance = appearance;
            this.primaryButtonLabel = str;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.preferredNetworks = preferredNetworks;
            this.allowsRemovalOfLastSavedPaymentMethod = z3;
            this.paymentMethodOrder = paymentMethodOrder;
            this.externalPaymentMethods = externalPaymentMethods;
            this.cardBrandAcceptance = cardBrandAcceptance;
            this.customPaymentMethods = customPaymentMethods;
            this.embeddedViewDisplaysMandateText = z4;
            this.link = link;
            this.formSheetAction = formSheetAction;
            this.termsDisplay = termsDisplay;
        }

        /* renamed from: getMerchantDisplayName$paymentsheet_release, reason: from getter */
        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        /* renamed from: getCustomer$paymentsheet_release, reason: from getter */
        public final PaymentSheet.CustomerConfiguration getCustomer() {
            return this.customer;
        }

        /* renamed from: getGooglePay$paymentsheet_release, reason: from getter */
        public final PaymentSheet.GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        /* renamed from: getDefaultBillingDetails$paymentsheet_release, reason: from getter */
        public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        /* renamed from: getShippingDetails$paymentsheet_release, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        /* renamed from: getAllowsDelayedPaymentMethods$paymentsheet_release, reason: from getter */
        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        /* renamed from: getAllowsPaymentMethodsRequiringShippingAddress$paymentsheet_release, reason: from getter */
        public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        /* renamed from: getAppearance$paymentsheet_release, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: getPrimaryButtonLabel$paymentsheet_release, reason: from getter */
        public final String getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        /* renamed from: getBillingDetailsCollectionConfiguration$paymentsheet_release, reason: from getter */
        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final List<CardBrand> getPreferredNetworks$paymentsheet_release() {
            return this.preferredNetworks;
        }

        /* renamed from: getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release, reason: from getter */
        public final boolean getAllowsRemovalOfLastSavedPaymentMethod() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        public final List<String> getPaymentMethodOrder$paymentsheet_release() {
            return this.paymentMethodOrder;
        }

        public final List<String> getExternalPaymentMethods$paymentsheet_release() {
            return this.externalPaymentMethods;
        }

        /* renamed from: getCardBrandAcceptance$paymentsheet_release, reason: from getter */
        public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        public final List<PaymentSheet.CustomPaymentMethod> getCustomPaymentMethods$paymentsheet_release() {
            return this.customPaymentMethods;
        }

        /* renamed from: getEmbeddedViewDisplaysMandateText$paymentsheet_release, reason: from getter */
        public final boolean getEmbeddedViewDisplaysMandateText() {
            return this.embeddedViewDisplaysMandateText;
        }

        /* renamed from: getLink$paymentsheet_release, reason: from getter */
        public final PaymentSheet.LinkConfiguration getLink() {
            return this.link;
        }

        /* renamed from: getFormSheetAction$paymentsheet_release, reason: from getter */
        public final FormSheetAction getFormSheetAction() {
            return this.formSheetAction;
        }

        public /* synthetic */ Configuration(String str, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentSheet.GooglePayConfiguration googlePayConfiguration, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, PaymentSheet.Appearance appearance, String str2, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, boolean z3, List list2, List list3, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, List list4, boolean z4, PaymentSheet.LinkConfiguration linkConfiguration, FormSheetAction formSheetAction, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, customerConfiguration, googlePayConfiguration, billingDetails, addressDetails, z, z2, appearance, str2, billingDetailsCollectionConfiguration, list, z3, list2, list3, cardBrandAcceptance, list4, z4, linkConfiguration, formSheetAction, (i & 524288) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> getTermsDisplay$paymentsheet_release() {
            return this.termsDisplay;
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001f\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0017H\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000fJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u001a\u0010%\u001a\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&J\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration$Builder;", "", "merchantDisplayName", "", "<init>", "(Ljava/lang/String;)V", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonLabel", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "externalPaymentMethods", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "embeddedViewDisplaysMandateText", "customPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "link", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "formSheetAction", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;", "termsDisplay", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowsDelayedPaymentMethods;
            private boolean allowsPaymentMethodsRequiringShippingAddress;
            private boolean allowsRemovalOfLastSavedPaymentMethod;
            private PaymentSheet.Appearance appearance;
            private PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
            private PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
            private List<PaymentSheet.CustomPaymentMethod> customPaymentMethods;
            private PaymentSheet.CustomerConfiguration customer;
            private PaymentSheet.BillingDetails defaultBillingDetails;
            private boolean embeddedViewDisplaysMandateText;
            private List<String> externalPaymentMethods;
            private FormSheetAction formSheetAction;
            private PaymentSheet.GooglePayConfiguration googlePay;
            private PaymentSheet.LinkConfiguration link;
            private final String merchantDisplayName;
            private List<String> paymentMethodOrder;
            private List<? extends CardBrand> preferredNetworks;
            private String primaryButtonLabel;
            private AddressDetails shippingDetails;
            private Map<PaymentMethod.Type, ? extends PaymentSheet.TermsDisplay> termsDisplay;

            public Builder(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.customer = ConfigurationDefaults.INSTANCE.getCustomer();
                this.googlePay = ConfigurationDefaults.INSTANCE.getGooglePay();
                this.defaultBillingDetails = ConfigurationDefaults.INSTANCE.getBillingDetails();
                this.shippingDetails = ConfigurationDefaults.INSTANCE.getShippingDetails();
                this.appearance = ConfigurationDefaults.INSTANCE.getAppearance();
                this.primaryButtonLabel = ConfigurationDefaults.INSTANCE.getPrimaryButtonLabel();
                this.billingDetailsCollectionConfiguration = ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration();
                this.preferredNetworks = ConfigurationDefaults.INSTANCE.getPreferredNetworks();
                this.allowsRemovalOfLastSavedPaymentMethod = true;
                this.paymentMethodOrder = ConfigurationDefaults.INSTANCE.getPaymentMethodOrder();
                this.externalPaymentMethods = ConfigurationDefaults.INSTANCE.getExternalPaymentMethods();
                this.cardBrandAcceptance = ConfigurationDefaults.INSTANCE.getCardBrandAcceptance();
                this.embeddedViewDisplaysMandateText = true;
                this.customPaymentMethods = ConfigurationDefaults.INSTANCE.getCustomPaymentMethods();
                this.link = ConfigurationDefaults.INSTANCE.getLink();
                this.formSheetAction = FormSheetAction.Continue;
                this.termsDisplay = MapsKt.emptyMap();
            }

            public final Builder customer(PaymentSheet.CustomerConfiguration customer) {
                this.customer = customer;
                return this;
            }

            public final Builder googlePay(PaymentSheet.GooglePayConfiguration googlePay) {
                this.googlePay = googlePay;
                return this;
            }

            public final Builder defaultBillingDetails(PaymentSheet.BillingDetails defaultBillingDetails) {
                this.defaultBillingDetails = defaultBillingDetails;
                return this;
            }

            public final Builder shippingDetails(AddressDetails shippingDetails) {
                this.shippingDetails = shippingDetails;
                return this;
            }

            public final Builder allowsDelayedPaymentMethods(boolean allowsDelayedPaymentMethods) {
                this.allowsDelayedPaymentMethods = allowsDelayedPaymentMethods;
                return this;
            }

            public final Builder allowsPaymentMethodsRequiringShippingAddress(boolean allowsPaymentMethodsRequiringShippingAddress) {
                this.allowsPaymentMethodsRequiringShippingAddress = allowsPaymentMethodsRequiringShippingAddress;
                return this;
            }

            public final Builder appearance(PaymentSheet.Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Builder primaryButtonLabel(String primaryButtonLabel) {
                Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
                this.primaryButtonLabel = primaryButtonLabel;
                return this;
            }

            public final Builder billingDetailsCollectionConfiguration(PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
                Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
                return this;
            }

            public final Builder preferredNetworks(List<? extends CardBrand> preferredNetworks) {
                Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
                this.preferredNetworks = preferredNetworks;
                return this;
            }

            public final Builder allowsRemovalOfLastSavedPaymentMethod(boolean allowsRemovalOfLastSavedPaymentMethod) {
                this.allowsRemovalOfLastSavedPaymentMethod = allowsRemovalOfLastSavedPaymentMethod;
                return this;
            }

            public final Builder paymentMethodOrder(List<String> paymentMethodOrder) {
                Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
                this.paymentMethodOrder = paymentMethodOrder;
                return this;
            }

            public final Builder externalPaymentMethods(List<String> externalPaymentMethods) {
                Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
                this.externalPaymentMethods = externalPaymentMethods;
                return this;
            }

            public final Builder cardBrandAcceptance(PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
                Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
                this.cardBrandAcceptance = cardBrandAcceptance;
                return this;
            }

            public final Builder customPaymentMethods(List<PaymentSheet.CustomPaymentMethod> customPaymentMethods) {
                Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
                this.customPaymentMethods = customPaymentMethods;
                return this;
            }

            public final Builder embeddedViewDisplaysMandateText(boolean embeddedViewDisplaysMandateText) {
                this.embeddedViewDisplaysMandateText = embeddedViewDisplaysMandateText;
                return this;
            }

            public final Builder link(PaymentSheet.LinkConfiguration link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                return this;
            }

            public final Builder formSheetAction(FormSheetAction formSheetAction) {
                Intrinsics.checkNotNullParameter(formSheetAction, "formSheetAction");
                this.formSheetAction = formSheetAction;
                return this;
            }

            public final Builder termsDisplay(Map<PaymentMethod.Type, ? extends PaymentSheet.TermsDisplay> termsDisplay) {
                Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
                this.termsDisplay = termsDisplay;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.merchantDisplayName, this.customer, this.googlePay, this.defaultBillingDetails, this.shippingDetails, this.allowsDelayedPaymentMethods, this.allowsPaymentMethodsRequiringShippingAddress, this.appearance, this.primaryButtonLabel, this.billingDetailsCollectionConfiguration, this.preferredNetworks, this.allowsRemovalOfLastSavedPaymentMethod, this.paymentMethodOrder, this.externalPaymentMethods, this.cardBrandAcceptance, this.customPaymentMethods, this.embeddedViewDisplaysMandateText, this.link, this.formSheetAction, this.termsDisplay);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;", "", "<init>", "(Ljava/lang/String;I)V", "Continue", "Confirm", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormSheetAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FormSheetAction[] $VALUES;
        public static final FormSheetAction Continue = new FormSheetAction("Continue", 0);
        public static final FormSheetAction Confirm = new FormSheetAction("Confirm", 1);

        private static final /* synthetic */ FormSheetAction[] $values() {
            return new FormSheetAction[]{Continue, Confirm};
        }

        public static EnumEntries<FormSheetAction> getEntries() {
            return $ENTRIES;
        }

        private FormSheetAction(String str, int i) {
        }

        static {
            FormSheetAction[] formSheetActionArr$values = $values();
            $VALUES = formSheetActionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(formSheetActionArr$values);
        }

        public static FormSheetAction valueOf(String str) {
            return (FormSheetAction) Enum.valueOf(FormSheetAction.class, str);
        }

        public static FormSheetAction[] values() {
            return (FormSheetAction[]) $VALUES.clone();
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;", "", "Succeeded", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Failed;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Succeeded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConfigureResult {

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Succeeded;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Succeeded implements ConfigureResult {
            public static final int $stable = 0;
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Failed;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements ConfigureResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BU\b\u0000\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R+\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038G¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;", "", "imageLoader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/drawable/Drawable;", "label", "", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentMethodType", "mandateText", "Landroidx/compose/ui/text/AnnotatedString;", "_shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getImageLoader", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getLabel", "()Ljava/lang/String;", "getBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getPaymentMethodType", "getMandateText", "()Landroidx/compose/ui/text/AnnotatedString;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "iconDrawable$delegate", "Lkotlin/Lazy;", "shippingDetails", "getShippingDetails$annotations", "()V", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "iconPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "getIconPainter", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentOptionDisplayData {
        public static final int $stable = 8;
        private final AddressDetails _shippingDetails;
        private final PaymentSheet.BillingDetails billingDetails;

        /* renamed from: iconDrawable$delegate, reason: from kotlin metadata */
        private final Lazy iconDrawable;
        private final Function1<Continuation<? super Drawable>, Object> imageLoader;
        private final String label;
        private final AnnotatedString mandateText;
        private final String paymentMethodType;

        public static /* synthetic */ void getShippingDetails$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentOptionDisplayData)) {
                return false;
            }
            PaymentOptionDisplayData paymentOptionDisplayData = (PaymentOptionDisplayData) obj;
            return Intrinsics.areEqual(this.imageLoader, paymentOptionDisplayData.imageLoader) && Intrinsics.areEqual(this.label, paymentOptionDisplayData.label) && Intrinsics.areEqual(this.billingDetails, paymentOptionDisplayData.billingDetails) && Intrinsics.areEqual(this.paymentMethodType, paymentOptionDisplayData.paymentMethodType) && Intrinsics.areEqual(this.mandateText, paymentOptionDisplayData.mandateText) && Intrinsics.areEqual(this._shippingDetails, paymentOptionDisplayData._shippingDetails);
        }

        public int hashCode() {
            int iHashCode = ((this.imageLoader.hashCode() * 31) + this.label.hashCode()) * 31;
            PaymentSheet.BillingDetails billingDetails = this.billingDetails;
            int iHashCode2 = (((iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.paymentMethodType.hashCode()) * 31;
            AnnotatedString annotatedString = this.mandateText;
            int iHashCode3 = (iHashCode2 + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31;
            AddressDetails addressDetails = this._shippingDetails;
            return iHashCode3 + (addressDetails != null ? addressDetails.hashCode() : 0);
        }

        public String toString() {
            return "PaymentOptionDisplayData(imageLoader=" + this.imageLoader + ", label=" + this.label + ", billingDetails=" + this.billingDetails + ", paymentMethodType=" + this.paymentMethodType + ", mandateText=" + ((Object) this.mandateText) + ", _shippingDetails=" + this._shippingDetails + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentOptionDisplayData(Function1<? super Continuation<? super Drawable>, ? extends Object> imageLoader, String label, PaymentSheet.BillingDetails billingDetails, String paymentMethodType, AnnotatedString annotatedString, AddressDetails addressDetails) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.imageLoader = imageLoader;
            this.label = label;
            this.billingDetails = billingDetails;
            this.paymentMethodType = paymentMethodType;
            this.mandateText = annotatedString;
            this._shippingDetails = addressDetails;
            this.iconDrawable = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElement$PaymentOptionDisplayData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmbeddedPaymentElement.PaymentOptionDisplayData.iconDrawable_delegate$lambda$0(this.f$0);
                }
            });
        }

        public final Function1<Continuation<? super Drawable>, Object> getImageLoader() {
            return this.imageLoader;
        }

        public final String getLabel() {
            return this.label;
        }

        public final PaymentSheet.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public final AnnotatedString getMandateText() {
            return this.mandateText;
        }

        private final Drawable getIconDrawable() {
            return (Drawable) this.iconDrawable.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DelegateDrawable iconDrawable_delegate$lambda$0(PaymentOptionDisplayData paymentOptionDisplayData) {
            return new DelegateDrawable(paymentOptionDisplayData.imageLoader);
        }

        /* renamed from: getShippingDetails, reason: from getter */
        public final AddressDetails get_shippingDetails() {
            return this._shippingDetails;
        }

        public final Painter getIconPainter(Composer composer, int i) {
            composer.startReplaceGroup(1668080996);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668080996, i, -1, "com.stripe.android.paymentelement.EmbeddedPaymentElement.PaymentOptionDisplayData.<get-iconPainter> (EmbeddedPaymentElement.kt:591)");
            }
            Painter painterRememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(getIconDrawable(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painterRememberDrawablePainter;
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Canceled implements Result {
            public static final int $stable = 0;
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Completed implements Result {
            public static final int $stable = 0;
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements Result {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "", "<init>", "()V", Profile.DEFAULT_PROFILE_NAME, "ImmediateAction", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class RowSelectionBehavior {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Default extends RowSelectionBehavior {
            public static final Default INSTANCE = new Default();

            private Default() {
            }
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "didSelectPaymentOption", "Lkotlin/Function1;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getDidSelectPaymentOption", "()Lkotlin/jvm/functions/Function1;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class ImmediateAction extends RowSelectionBehavior {
            private final Function1<EmbeddedPaymentElement, Unit> didSelectPaymentOption;

            public final Function1<EmbeddedPaymentElement, Unit> getDidSelectPaymentOption() {
                return this.didSelectPaymentOption;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ImmediateAction(Function1<? super EmbeddedPaymentElement, Unit> didSelectPaymentOption) {
                Intrinsics.checkNotNullParameter(didSelectPaymentOption, "didSelectPaymentOption");
                this.didSelectPaymentOption = didSelectPaymentOption;
            }
        }

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "immediateAction", "didSelectPaymentOption", "Lkotlin/Function1;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "", "getInternalRowSelectionCallback", "Lkotlin/Function0;", "rowSelectionBehavior", PaymentSheetAppearanceKeys.EMBEDDED_PAYMENT_ELEMENT, "getInternalRowSelectionCallback$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: default, reason: not valid java name */
            public final RowSelectionBehavior m8072default() {
                return Default.INSTANCE;
            }

            public final RowSelectionBehavior immediateAction(Function1<? super EmbeddedPaymentElement, Unit> didSelectPaymentOption) {
                Intrinsics.checkNotNullParameter(didSelectPaymentOption, "didSelectPaymentOption");
                return new ImmediateAction(didSelectPaymentOption);
            }

            public final Function0<Unit> getInternalRowSelectionCallback$paymentsheet_release(final RowSelectionBehavior rowSelectionBehavior, final EmbeddedPaymentElement embeddedPaymentElement) {
                Intrinsics.checkNotNullParameter(rowSelectionBehavior, "rowSelectionBehavior");
                Intrinsics.checkNotNullParameter(embeddedPaymentElement, "embeddedPaymentElement");
                if (rowSelectionBehavior instanceof ImmediateAction) {
                    return new Function0() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElement$RowSelectionBehavior$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EmbeddedPaymentElement.RowSelectionBehavior.Companion.getInternalRowSelectionCallback$lambda$0(rowSelectionBehavior, embeddedPaymentElement);
                        }
                    };
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit getInternalRowSelectionCallback$lambda$0(RowSelectionBehavior rowSelectionBehavior, EmbeddedPaymentElement embeddedPaymentElement) {
                ((ImmediateAction) rowSelectionBehavior).getDidSelectPaymentOption().invoke(embeddedPaymentElement);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", "Landroid/os/Parcelable;", "confirmationState", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;", "customer", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "previousNewSelections", "Landroid/os/Bundle;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;Lcom/stripe/android/paymentsheet/state/CustomerState;Landroid/os/Bundle;)V", "getConfirmationState$paymentsheet_release", "()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;", "getCustomer$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/state/CustomerState;", "getPreviousNewSelections$paymentsheet_release", "()Landroid/os/Bundle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State implements Parcelable {
        private final EmbeddedConfirmationStateHolder.State confirmationState;
        private final CustomerState customer;
        private final Bundle previousNewSelections;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EmbeddedPaymentElement.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(EmbeddedConfirmationStateHolder.State.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomerState.CREATOR.createFromParcel(parcel), parcel.readBundle(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.confirmationState, state.confirmationState) && Intrinsics.areEqual(this.customer, state.customer) && Intrinsics.areEqual(this.previousNewSelections, state.previousNewSelections);
        }

        public int hashCode() {
            int iHashCode = this.confirmationState.hashCode() * 31;
            CustomerState customerState = this.customer;
            return ((iHashCode + (customerState == null ? 0 : customerState.hashCode())) * 31) + this.previousNewSelections.hashCode();
        }

        public String toString() {
            return "State(confirmationState=" + this.confirmationState + ", customer=" + this.customer + ", previousNewSelections=" + this.previousNewSelections + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.confirmationState.writeToParcel(dest, flags);
            CustomerState customerState = this.customer;
            if (customerState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customerState.writeToParcel(dest, flags);
            }
            dest.writeBundle(this.previousNewSelections);
        }

        public State(EmbeddedConfirmationStateHolder.State confirmationState, CustomerState customerState, Bundle previousNewSelections) {
            Intrinsics.checkNotNullParameter(confirmationState, "confirmationState");
            Intrinsics.checkNotNullParameter(previousNewSelections, "previousNewSelections");
            this.confirmationState = confirmationState;
            this.customer = customerState;
            this.previousNewSelections = previousNewSelections;
        }

        /* renamed from: getConfirmationState$paymentsheet_release, reason: from getter */
        public final EmbeddedConfirmationStateHolder.State getConfirmationState() {
            return this.confirmationState;
        }

        /* renamed from: getCustomer$paymentsheet_release, reason: from getter */
        public final CustomerState getCustomer() {
            return this.customer;
        }

        /* renamed from: getPreviousNewSelections$paymentsheet_release, reason: from getter */
        public final Bundle getPreviousNewSelections() {
            return this.previousNewSelections;
        }
    }

    /* compiled from: EmbeddedPaymentElement.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "activity", "Landroid/app/Activity;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "paymentElementCallbackIdentifier", "", "resultCallback", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EmbeddedPaymentElement create(Activity activity, ActivityResultCaller activityResultCaller, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, String paymentElementCallbackIdentifier, ResultCallback resultCallback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            Window window = activity.getWindow();
            EmbeddedPaymentElementSubcomponent embeddedPaymentElementSubcomponentBuild = ((EmbeddedPaymentElementViewModel) new ViewModelProvider(viewModelStoreOwner, new EmbeddedPaymentElementViewModel.Factory(paymentElementCallbackIdentifier, window != null ? Integer.valueOf(window.getStatusBarColor()) : null)).get("EmbeddedPaymentElementViewModel(instance = " + paymentElementCallbackIdentifier + ")", EmbeddedPaymentElementViewModel.class)).getEmbeddedPaymentElementSubcomponentFactory().build(activityResultCaller, lifecycleOwner, resultCallback);
            embeddedPaymentElementSubcomponentBuild.getInitializer().initialize(ActivityUtilsKt.applicationIsTaskOwner(activity));
            return embeddedPaymentElementSubcomponentBuild.getEmbeddedPaymentElement();
        }
    }

    private static final WalletButtonsContent WalletButtons$lambda$0(androidx.compose.runtime.State<WalletButtonsContent> state) {
        return state.getValue();
    }

    private static final EmbeddedContent Content$lambda$2(androidx.compose.runtime.State<EmbeddedContent> state) {
        return state.getValue();
    }
}
