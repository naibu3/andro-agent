package com.reactnativestripesdk;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativestripesdk.utils.KeepJsAwakeTask;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.EmbeddedPaymentElementKtxKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001e\u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\b\u0010)\u001a\u00020*H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020.X\u008a\u008e\u0002"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementView;", "Lcom/reactnativestripesdk/StripeAbstractComposeView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "latestIntentConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "getLatestIntentConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "setLatestIntentConfig", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V", "latestElementConfig", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "getLatestElementConfig", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "setLatestElementConfig", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V", "rowSelectionBehaviorType", "Landroidx/compose/runtime/MutableState;", "Lcom/reactnativestripesdk/RowSelectionBehaviorType;", "getRowSelectionBehaviorType", "()Landroidx/compose/runtime/MutableState;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "events", "Lkotlinx/coroutines/channels/Channel;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "reportHeightChange", "height", "", "configure", "config", "intentConfig", "confirm", "clearPaymentOption", "requireStripeSdkModule", "Lcom/reactnativestripesdk/StripeSdkModule;", "Event", "stripe_stripe-react-native_release", "type", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementView extends StripeAbstractComposeView {
    public static final int $stable = 8;
    private final Channel<Event> events;
    private EmbeddedPaymentElement.Configuration latestElementConfig;
    private PaymentSheet.IntentConfiguration latestIntentConfig;
    private final MutableState<RowSelectionBehaviorType> rowSelectionBehaviorType;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$22(EmbeddedPaymentElementView embeddedPaymentElementView, int i, Composer composer, int i2) {
        embeddedPaymentElementView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmbeddedPaymentElementView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;", "", "Configure", "Confirm", "ClearPaymentOption", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$ClearPaymentOption;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Confirm;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface Event {

        /* compiled from: EmbeddedPaymentElementView.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "<init>", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V", "getConfiguration", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "getIntentConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Configure implements Event {
            public static final int $stable = PaymentSheet.IntentConfiguration.$stable | EmbeddedPaymentElement.Configuration.$stable;
            private final EmbeddedPaymentElement.Configuration configuration;
            private final PaymentSheet.IntentConfiguration intentConfiguration;

            public static /* synthetic */ Configure copy$default(Configure configure, EmbeddedPaymentElement.Configuration configuration, PaymentSheet.IntentConfiguration intentConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    configuration = configure.configuration;
                }
                if ((i & 2) != 0) {
                    intentConfiguration = configure.intentConfiguration;
                }
                return configure.copy(configuration, intentConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final EmbeddedPaymentElement.Configuration getConfiguration() {
                return this.configuration;
            }

            /* renamed from: component2, reason: from getter */
            public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
                return this.intentConfiguration;
            }

            public final Configure copy(EmbeddedPaymentElement.Configuration configuration, PaymentSheet.IntentConfiguration intentConfiguration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                return new Configure(configuration, intentConfiguration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Configure)) {
                    return false;
                }
                Configure configure = (Configure) other;
                return Intrinsics.areEqual(this.configuration, configure.configuration) && Intrinsics.areEqual(this.intentConfiguration, configure.intentConfiguration);
            }

            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.intentConfiguration.hashCode();
            }

            public String toString() {
                return "Configure(configuration=" + this.configuration + ", intentConfiguration=" + this.intentConfiguration + ")";
            }

            public Configure(EmbeddedPaymentElement.Configuration configuration, PaymentSheet.IntentConfiguration intentConfiguration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                this.configuration = configuration;
                this.intentConfiguration = intentConfiguration;
            }

            public final EmbeddedPaymentElement.Configuration getConfiguration() {
                return this.configuration;
            }

            public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
                return this.intentConfiguration;
            }
        }

        /* compiled from: EmbeddedPaymentElementView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Confirm;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Confirm implements Event {
            public static final int $stable = 0;
            public static final Confirm INSTANCE = new Confirm();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirm)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2015371187;
            }

            public String toString() {
                return "Confirm";
            }

            private Confirm() {
            }
        }

        /* compiled from: EmbeddedPaymentElementView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$ClearPaymentOption;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ClearPaymentOption implements Event {
            public static final int $stable = 0;
            public static final ClearPaymentOption INSTANCE = new ClearPaymentOption();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClearPaymentOption)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 942531873;
            }

            public String toString() {
                return "ClearPaymentOption";
            }

            private ClearPaymentOption() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedPaymentElementView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rowSelectionBehaviorType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.events = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    public final PaymentSheet.IntentConfiguration getLatestIntentConfig() {
        return this.latestIntentConfig;
    }

    public final void setLatestIntentConfig(PaymentSheet.IntentConfiguration intentConfiguration) {
        this.latestIntentConfig = intentConfiguration;
    }

    public final EmbeddedPaymentElement.Configuration getLatestElementConfig() {
        return this.latestElementConfig;
    }

    public final void setLatestElementConfig(EmbeddedPaymentElement.Configuration configuration) {
        this.latestElementConfig = configuration;
    }

    public final MutableState<RowSelectionBehaviorType> getRowSelectionBehaviorType() {
        return this.rowSelectionBehaviorType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemedReactContext getReactContext() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (ThemedReactContext) context;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        EmbeddedPaymentElement.RowSelectionBehavior rowSelectionBehaviorImmediateAction;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1568793355);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)72@2797L37,73@2860L24,76@2937L3046,156@6009L3284,233@9314L39,234@9372L43,239@9491L1182,239@9470L1203,276@10704L312,276@10679L337,287@11049L7,293@11156L508,307@11674L142,289@11062L794:EmbeddedPaymentElementView.kt#iypzlo");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1568793355, i2, -1, "com.reactnativestripesdk.EmbeddedPaymentElementView.Content (EmbeddedPaymentElementView.kt:71)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = this.rowSelectionBehaviorType;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(5004770);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function2() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmbeddedPaymentElementView.Content$lambda$5$lambda$4(this.f$0, coroutineScope, (PaymentSheet.CustomPaymentMethod) obj, (PaymentMethod.BillingDetails) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function2 function2 = (Function2) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            RowSelectionBehaviorType rowSelectionBehaviorTypeContent$lambda$1 = Content$lambda$1(mutableState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(rowSelectionBehaviorTypeContent$lambda$1 != null ? rowSelectionBehaviorTypeContent$lambda$1.ordinal() : -1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                EmbeddedPaymentElement.Builder builderConfirmCustomPaymentMethodCallback = new EmbeddedPaymentElement.Builder(new EmbeddedPaymentElementView$Content$builder$1$1(this), new EmbeddedPaymentElement.ResultCallback() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda1
                    @Override // com.stripe.android.paymentelement.EmbeddedPaymentElement.ResultCallback
                    public final void onResult(EmbeddedPaymentElement.Result result) {
                        EmbeddedPaymentElementView.Content$lambda$9$lambda$7(this.f$0, result);
                    }
                }).confirmCustomPaymentMethodCallback(new EmbeddedPaymentElementView$sam$com_stripe_android_paymentelement_ConfirmCustomPaymentMethodCallback$0(function2));
                if (Content$lambda$1(mutableState) == RowSelectionBehaviorType.Default) {
                    rowSelectionBehaviorImmediateAction = EmbeddedPaymentElement.RowSelectionBehavior.INSTANCE.m8072default();
                } else {
                    rowSelectionBehaviorImmediateAction = EmbeddedPaymentElement.RowSelectionBehavior.INSTANCE.immediateAction(new Function1() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EmbeddedPaymentElementView.Content$lambda$9$lambda$8(this.f$0, (EmbeddedPaymentElement) obj);
                        }
                    });
                }
                objRememberedValue4 = builderConfirmCustomPaymentMethodCallback.rowSelectionBehavior(rowSelectionBehaviorImmediateAction);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EmbeddedPaymentElement embeddedPaymentElementRememberEmbeddedPaymentElement = EmbeddedPaymentElementKtxKt.rememberEmbeddedPaymentElement((EmbeddedPaymentElement.Builder) objRememberedValue4, composerStartRestartGroup, EmbeddedPaymentElement.Builder.$stable);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(embeddedPaymentElementRememberEmbeddedPaymentElement);
            EmbeddedPaymentElementView$Content$1$1 embeddedPaymentElementView$Content$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || embeddedPaymentElementView$Content$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                embeddedPaymentElementView$Content$1$1RememberedValue = new EmbeddedPaymentElementView$Content$1$1(this, embeddedPaymentElementRememberEmbeddedPaymentElement, null);
                composerStartRestartGroup.updateRememberedValue(embeddedPaymentElementView$Content$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) embeddedPaymentElementView$Content$1$1RememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(embeddedPaymentElementRememberEmbeddedPaymentElement) | composerStartRestartGroup.changedInstance(this);
            EmbeddedPaymentElementView$Content$2$1 embeddedPaymentElementView$Content$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || embeddedPaymentElementView$Content$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                embeddedPaymentElementView$Content$2$1RememberedValue = new EmbeddedPaymentElementView$Content$2$1(embeddedPaymentElementRememberEmbeddedPaymentElement, this, null);
                composerStartRestartGroup.updateRememberedValue(embeddedPaymentElementView$Content$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(embeddedPaymentElementRememberEmbeddedPaymentElement, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) embeddedPaymentElementView$Content$2$1RememberedValue, composerStartRestartGroup, EmbeddedPaymentElement.$stable);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            Modifier modifierM1054requiredHeight3ABfNKs = SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(Content$lambda$11(mutableIntState)));
            composerStartRestartGroup.startReplaceGroup(5004770);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function3() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return EmbeddedPaymentElementView.Content$lambda$17$lambda$16(mutableIntState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierLayout = LayoutModifierKt.layout(modifierM1054requiredHeight3ABfNKs, (Function3) objRememberedValue6);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp");
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(density);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EmbeddedPaymentElementView.Content$lambda$20$lambda$19(this.f$0, density, mutableIntState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnPlaced = OnPlacedModifierKt.onPlaced(modifierLayout, (Function1) objRememberedValue7);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPlaced);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 633093154, "C315@11841L9:EmbeddedPaymentElementView.kt#iypzlo");
            embeddedPaymentElementRememberEmbeddedPaymentElement.Content(composerStartRestartGroup, EmbeddedPaymentElement.$stable);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmbeddedPaymentElementView.Content$lambda$22(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final RowSelectionBehaviorType Content$lambda$1(MutableState<RowSelectionBehaviorType> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$5$lambda$4(EmbeddedPaymentElementView embeddedPaymentElementView, CoroutineScope coroutineScope, PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(customPaymentMethod, "customPaymentMethod");
        Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
        try {
            Intent intent = new Intent(embeddedPaymentElementView.getReactContext(), (Class<?>) CustomPaymentMethodActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            embeddedPaymentElementView.getReactContext().startActivity(intent);
        } catch (Exception e) {
            Log.e("StripeReactNative", "Failed to start CustomPaymentMethodActivity", e);
        }
        try {
            StripeSdkModule stripeSdkModuleRequireStripeSdkModule = embeddedPaymentElementView.requireStripeSdkModule();
            KeepJsAwakeTask keepJsAwakeTask = new KeepJsAwakeTask(embeddedPaymentElementView.getReactContext().getReactApplicationContext());
            keepJsAwakeTask.start();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1(stripeSdkModuleRequireStripeSdkModule, customPaymentMethod, billingDetails, keepJsAwakeTask, embeddedPaymentElementView, null), 3, null);
            return Unit.INSTANCE;
        } catch (IllegalArgumentException e2) {
            Log.e("StripeReactNative", "StripeSdkModule not found for CPM callback", e2);
            CustomPaymentMethodActivity.INSTANCE.finishCurrent();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$9$lambda$7(EmbeddedPaymentElementView embeddedPaymentElementView, EmbeddedPaymentElement.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (result instanceof EmbeddedPaymentElement.Result.Completed) {
            writableMapCreateMap.putString("status", "completed");
        } else if (result instanceof EmbeddedPaymentElement.Result.Canceled) {
            writableMapCreateMap.putString("status", "canceled");
        } else {
            if (!(result instanceof EmbeddedPaymentElement.Result.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            writableMapCreateMap.putString("status", "failed");
            String message = ((EmbeddedPaymentElement.Result.Failed) result).getError().getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            writableMapCreateMap.putString("error", message);
        }
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        embeddedPaymentElementView.requireStripeSdkModule().emitEmbeddedPaymentElementFormSheetConfirmComplete(writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9$lambda$8(EmbeddedPaymentElementView embeddedPaymentElementView, EmbeddedPaymentElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        embeddedPaymentElementView.requireStripeSdkModule().emitEmbeddedPaymentElementRowSelectionImmediateAction();
        return Unit.INSTANCE;
    }

    private static final int Content$lambda$11(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult Content$lambda$17$lambda$16(MutableIntState mutableIntState, MeasureScope layout, final Measurable measurable, final Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final int iMinIntrinsicHeight = measurable.minIntrinsicHeight(Constraints.m6070getMaxWidthimpl(constraints.getValue()));
        mutableIntState.setIntValue(iMinIntrinsicHeight);
        return MeasureScope.layout$default(layout, Constraints.m6070getMaxWidthimpl(constraints.getValue()), iMinIntrinsicHeight, null, new Function1() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmbeddedPaymentElementView.Content$lambda$17$lambda$16$lambda$15(measurable, constraints, iMinIntrinsicHeight, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$17$lambda$16$lambda$15(Measurable measurable, Constraints constraints, int i, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.m5058placeRelative70tqf50$default(layout, measurable.mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(constraints.getValue(), 0, 0, i, i, 3, null)), IntOffset.INSTANCE.m6255getZeronOccac(), 0.0f, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$20$lambda$19(EmbeddedPaymentElementView embeddedPaymentElementView, Density density, MutableIntState mutableIntState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        embeddedPaymentElementView.reportHeightChange(density.mo709toDpu2uoSUM(Content$lambda$11(mutableIntState)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportHeightChange(float height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", height);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        requireStripeSdkModule().emitEmbeddedPaymentElementDidUpdateHeight(writableMapCreateMap);
    }

    public final void configure(EmbeddedPaymentElement.Configuration config, PaymentSheet.IntentConfiguration intentConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(intentConfig, "intentConfig");
        this.events.mo10639trySendJP2dKIU(new Event.Configure(config, intentConfig));
    }

    public final void confirm() {
        this.events.mo10639trySendJP2dKIU(Event.Confirm.INSTANCE);
    }

    public final void clearPaymentOption() {
        this.events.mo10639trySendJP2dKIU(Event.ClearPaymentOption.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeSdkModule requireStripeSdkModule() {
        NativeModule nativeModule = getReactContext().getNativeModule((Class<NativeModule>) StripeSdkModule.class);
        if (nativeModule != null) {
            return (StripeSdkModule) nativeModule;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
