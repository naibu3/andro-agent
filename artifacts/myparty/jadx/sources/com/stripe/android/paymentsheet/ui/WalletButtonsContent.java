package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.link.ui.LinkButtonKt;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.link.ui.verification.VerificationViewState;
import com.stripe.android.link.ui.wallet.LinkInline2FASectionKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.paymentsheet.ui.WalletButtonsInteractor;
import com.stripe.android.shoppay.ShopPayButtonKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletButtonsContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "", "interactor", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;)V", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "ResendCodeNotificationEffect", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;", "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WalletButtonsContent {
    public static final int $stable = 0;
    private final WalletButtonsInteractor interactor;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(WalletButtonsContent walletButtonsContent, int i, Composer composer, int i2) {
        walletButtonsContent.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResendCodeNotificationEffect$lambda$6(WalletButtonsContent walletButtonsContent, WalletButtonsInteractor.State state, int i, Composer composer, int i2) {
        walletButtonsContent.ResendCodeNotificationEffect(state, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public WalletButtonsContent(WalletButtonsInteractor interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
    }

    public final void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1207900989);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1207900989, i2, -1, "com.stripe.android.paymentsheet.ui.WalletButtonsContent.Content (WalletButtonsContent.kt:28)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.interactor.getState(), null, composerStartRestartGroup, 0, 1);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2019279709);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WalletButtonsContent.Content$lambda$3$lambda$2(this.f$0, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            ResendCodeNotificationEffect(Content$lambda$0(stateCollectAsState), composerStartRestartGroup, (i2 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            if (Content$lambda$0(stateCollectAsState).getHasContent()) {
                StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(507559454, true, new AnonymousClass2(stateCollectAsState, this), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 127);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletButtonsContent.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Content$lambda$3$lambda$2(final WalletButtonsContent walletButtonsContent, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        walletButtonsContent.interactor.handleViewAction(WalletButtonsInteractor.ViewAction.OnShown.INSTANCE);
        return new DisposableEffectResult() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.this$0.interactor.handleViewAction(WalletButtonsInteractor.ViewAction.OnHidden.INSTANCE);
            }
        };
    }

    /* compiled from: WalletButtonsContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<WalletButtonsInteractor.State> $state$delegate;
        final /* synthetic */ WalletButtonsContent this$0;

        AnonymousClass2(State<WalletButtonsInteractor.State> state, WalletButtonsContent walletButtonsContent) {
            this.$state$delegate = state;
            this.this$0 = walletButtonsContent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            Composer composer2 = composer;
            if ((i & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(507559454, i, -1, "com.stripe.android.paymentsheet.ui.WalletButtonsContent.Content.<anonymous> (WalletButtonsContent.kt:44)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                State<WalletButtonsInteractor.State> state = this.$state$delegate;
                final WalletButtonsContent walletButtonsContent = this.this$0;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                WalletButtonsInteractor.State.LinkOtpState link2FAState = WalletButtonsContent.Content$lambda$0(state).getLink2FAState();
                composer2.startReplaceGroup(-1616967722);
                int i3 = 1;
                if (link2FAState != null) {
                    VerificationViewState viewState = link2FAState.getViewState();
                    OTPElement otpElement = link2FAState.getOtpElement();
                    composer2.startReplaceGroup(1524930366);
                    boolean zChanged = composer2.changed(walletButtonsContent);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WalletButtonsContent.AnonymousClass2.invoke$lambda$10$lambda$2$lambda$1$lambda$0(walletButtonsContent);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    LinkInline2FASectionKt.LinkInline2FASection(viewState, otpElement, (Function0) objRememberedValue, null, composer2, OTPElement.$stable << 3, 8);
                    composer2.startReplaceGroup(-1616958289);
                    if (WalletButtonsContent.Content$lambda$0(state).getWalletButtons().size() > 1) {
                        WalletsDividerKt.WalletsDivider(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_or_use, composer2, 0), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1616949583);
                for (final WalletButtonsInteractor.WalletButton walletButton : WalletButtonsContent.Content$lambda$0(state).getWalletButtons()) {
                    if (walletButton instanceof WalletButtonsInteractor.WalletButton.GooglePay) {
                        composer2.startReplaceGroup(28677035);
                        PrimaryButton.State.Ready ready = PrimaryButton.State.Ready.INSTANCE;
                        WalletButtonsInteractor.WalletButton.GooglePay googlePay = (WalletButtonsInteractor.WalletButton.GooglePay) walletButton;
                        boolean allowCreditCards = googlePay.getAllowCreditCards();
                        GooglePayButtonType googlePayButtonType = googlePay.getGooglePayButtonType();
                        GooglePayJsonFactory.BillingAddressParameters billingAddressParameters = googlePay.getBillingAddressParameters();
                        boolean buttonsEnabled = WalletButtonsContent.Content$lambda$0(state).getButtonsEnabled();
                        CardBrandFilter cardBrandFilter = googlePay.getCardBrandFilter();
                        PrimaryButton.State.Ready ready2 = ready;
                        composer2.startReplaceGroup(1524961467);
                        boolean zChanged2 = composer2.changed(walletButtonsContent) | composer2.changedInstance(walletButton);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WalletButtonsContent.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$4$lambda$3(walletButtonsContent, walletButton);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Composer composer3 = composer2;
                        i2 = i3;
                        GooglePayButtonKt.GooglePayButton(ready2, allowCreditCards, googlePayButtonType, billingAddressParameters, buttonsEnabled, (Function0) objRememberedValue2, null, cardBrandFilter, composer3, (GooglePayJsonFactory.BillingAddressParameters.$stable << 9) | 6, 64);
                        composer2 = composer3;
                        composer2.endReplaceGroup();
                    } else {
                        i2 = i3;
                        if (walletButton instanceof WalletButtonsInteractor.WalletButton.Link) {
                            composer2.startReplaceGroup(1524974726);
                            LinkButtonState state2 = ((WalletButtonsInteractor.WalletButton.Link) walletButton).getState();
                            boolean buttonsEnabled2 = WalletButtonsContent.Content$lambda$0(state).getButtonsEnabled();
                            composer2.startReplaceGroup(1524980027);
                            boolean zChanged3 = composer2.changed(walletButtonsContent) | composer2.changedInstance(walletButton);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$2$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletButtonsContent.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$6$lambda$5(walletButtonsContent, walletButton);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            LinkButtonKt.LinkButton(state2, buttonsEnabled2, (Function0) objRememberedValue3, null, composer2, 0, 8);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(walletButton instanceof WalletButtonsInteractor.WalletButton.ShopPay)) {
                                composer2.startReplaceGroup(1524943598);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1524990041);
                            composer2.startReplaceGroup(1524990475);
                            boolean zChanged4 = composer2.changed(walletButtonsContent) | composer2.changedInstance(walletButton);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$Content$2$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletButtonsContent.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$8$lambda$7(walletButtonsContent, walletButton);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            ShopPayButtonKt.ShopPayButton(null, (Function0) objRememberedValue4, composer2, 0, i2);
                            composer2.endReplaceGroup();
                        }
                    }
                    i3 = i2;
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0(WalletButtonsContent walletButtonsContent) {
            walletButtonsContent.interactor.handleViewAction(WalletButtonsInteractor.ViewAction.OnResendCode.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$4$lambda$3(WalletButtonsContent walletButtonsContent, WalletButtonsInteractor.WalletButton walletButton) {
            walletButtonsContent.interactor.handleViewAction(new WalletButtonsInteractor.ViewAction.OnButtonPressed(walletButton));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$6$lambda$5(WalletButtonsContent walletButtonsContent, WalletButtonsInteractor.WalletButton walletButton) {
            walletButtonsContent.interactor.handleViewAction(new WalletButtonsInteractor.ViewAction.OnButtonPressed(walletButton));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(WalletButtonsContent walletButtonsContent, WalletButtonsInteractor.WalletButton walletButton) {
            walletButtonsContent.interactor.handleViewAction(new WalletButtonsInteractor.ViewAction.OnButtonPressed(walletButton));
            return Unit.INSTANCE;
        }
    }

    private final void ResendCodeNotificationEffect(final WalletButtonsInteractor.State state, Composer composer, final int i) {
        int i2;
        VerificationViewState viewState;
        Composer composerStartRestartGroup = composer.startRestartGroup(805643521);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805643521, i2, -1, "com.stripe.android.paymentsheet.ui.WalletButtonsContent.ResendCodeNotificationEffect (WalletButtonsContent.kt:99)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            WalletButtonsInteractor.State.LinkOtpState link2FAState = state.getLink2FAState();
            Boolean boolValueOf = (link2FAState == null || (viewState = link2FAState.getViewState()) == null) ? null : Boolean.valueOf(viewState.getDidSendNewCode());
            composerStartRestartGroup.startReplaceGroup(128114475);
            boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(context);
            WalletButtonsContent$ResendCodeNotificationEffect$1$1 walletButtonsContent$ResendCodeNotificationEffect$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || walletButtonsContent$ResendCodeNotificationEffect$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletButtonsContent$ResendCodeNotificationEffect$1$1RememberedValue = new WalletButtonsContent$ResendCodeNotificationEffect$1$1(state, context, this, null);
                composerStartRestartGroup.updateRememberedValue(walletButtonsContent$ResendCodeNotificationEffect$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) walletButtonsContent$ResendCodeNotificationEffect$1$1RememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.WalletButtonsContent$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletButtonsContent.ResendCodeNotificationEffect$lambda$6(this.f$0, state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletButtonsInteractor.State Content$lambda$0(State<WalletButtonsInteractor.State> state) {
        return state.getValue();
    }
}
