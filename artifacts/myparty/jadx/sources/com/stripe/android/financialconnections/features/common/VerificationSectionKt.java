package com.stripe.android.financialconnections.features.common;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.components.TestModeBannerKt;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.StripeThemeForConnectionsKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VerificationSection.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u000fH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\u0002¨\u0006\u0014"}, d2 = {"VerificationSection", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", ViewProps.ENABLED, "", "confirmVerificationError", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/OTPElement;ZLjava/lang/Throwable;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VerificationErrorText", "error", "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;", "(Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;Landroidx/compose/runtime/Composer;I)V", "toMessage", "Lcom/stripe/android/financialconnections/ui/TextResource;", "populateTestCode", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationSectionKt {

    /* compiled from: VerificationSection.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfirmVerification.OTPError.Type.values().length];
            try {
                iArr[ConfirmVerification.OTPError.Type.EMAIL_CODE_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfirmVerification.OTPError.Type.SMS_CODE_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfirmVerification.OTPError.Type.CODE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationErrorText$lambda$5(ConfirmVerification.OTPError oTPError, int i, Composer composer, int i2) {
        VerificationErrorText(oTPError, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationSection$lambda$2(FocusRequester focusRequester, OTPElement oTPElement, boolean z, Throwable th, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VerificationSection(focusRequester, oTPElement, z, th, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationSection(final FocusRequester focusRequester, final OTPElement otpElement, final boolean z, final Throwable th, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        View view;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        VerificationSectionKt$VerificationSection$1$2$1 verificationSectionKt$VerificationSection$1$2$1RememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(otpElement, "otpElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(621147059);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(focusRequester) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(otpElement) : composerStartRestartGroup.changedInstance(otpElement) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(th) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(621147059, i3, -1, "com.stripe.android.financialconnections.features.common.VerificationSection (VerificationSection.kt:41)");
                }
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                view = (View) objConsume;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                StripeThemeForConnectionsKt.StripeThemeForConnections(ComposableLambdaKt.rememberComposableLambda(330722726, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.VerificationSectionKt$VerificationSection$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(330722726, i5, -1, "com.stripe.android.financialconnections.features.common.VerificationSection.<anonymous>.<anonymous> (VerificationSection.kt:45)");
                            }
                            composer2.startReplaceGroup(-1749159933);
                            ProvidableCompositionLocal<Boolean> localTestMode = FinancialConnectionsSheetNativeActivityKt.getLocalTestMode();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer2.consume(localTestMode);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (((Boolean) objConsume2).booleanValue()) {
                                boolean z2 = z;
                                String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_verification_useTestCode, composer2, 0);
                                OTPElement oTPElement = otpElement;
                                composer2.startReplaceGroup(-1749152957);
                                boolean zChangedInstance2 = composer2.changedInstance(oTPElement);
                                VerificationSectionKt$VerificationSection$1$1$1$1 verificationSectionKt$VerificationSection$1$1$1$1RememberedValue = composer2.rememberedValue();
                                if (zChangedInstance2 || verificationSectionKt$VerificationSection$1$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                    verificationSectionKt$VerificationSection$1$1$1$1RememberedValue = new VerificationSectionKt$VerificationSection$1$1$1$1(oTPElement);
                                    composer2.updateRememberedValue(verificationSectionKt$VerificationSection$1$1$1$1RememberedValue);
                                }
                                composer2.endReplaceGroup();
                                TestModeBannerKt.TestModeBanner(z2, strStringResource, (Function0) ((KFunction) verificationSectionKt$VerificationSection$1$1$1$1RememberedValue), null, null, composer2, 0, 24);
                                SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer2, 6);
                            }
                            composer2.endReplaceGroup();
                            float f = 8;
                            OTPElementUIKt.m8812OTPElementUIRE_urrM(z, otpElement, null, null, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getHeadingXLargeSubdued(), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), "", null, 0.0f, focusRequester, composer2, (OTPElement.$stable << 3) | 14352384, 0, 780);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(70030924);
                zChangedInstance = composerStartRestartGroup.changedInstance(th) | composerStartRestartGroup.changedInstance(view);
                verificationSectionKt$VerificationSection$1$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || verificationSectionKt$VerificationSection$1$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationSectionKt$VerificationSection$1$2$1RememberedValue = new VerificationSectionKt$VerificationSection$1$2$1(th, view, null);
                    composerStartRestartGroup.updateRememberedValue(verificationSectionKt$VerificationSection$1$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(th, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) verificationSectionKt$VerificationSection$1$2$1RememberedValue, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceGroup(70038484);
                if (th instanceof ConfirmVerification.OTPError) {
                    SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
                    VerificationErrorText((ConfirmVerification.OTPError) th, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
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
                companion = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = companion;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.VerificationSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationSectionKt.VerificationSection$lambda$2(focusRequester, otpElement, z, th, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            view = (View) objConsume2;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                StripeThemeForConnectionsKt.StripeThemeForConnections(ComposableLambdaKt.rememberComposableLambda(330722726, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.VerificationSectionKt$VerificationSection$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(330722726, i5, -1, "com.stripe.android.financialconnections.features.common.VerificationSection.<anonymous>.<anonymous> (VerificationSection.kt:45)");
                            }
                            composer2.startReplaceGroup(-1749159933);
                            ProvidableCompositionLocal<Boolean> localTestMode = FinancialConnectionsSheetNativeActivityKt.getLocalTestMode();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume22 = composer2.consume(localTestMode);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (((Boolean) objConsume22).booleanValue()) {
                                boolean z2 = z;
                                String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_verification_useTestCode, composer2, 0);
                                OTPElement oTPElement = otpElement;
                                composer2.startReplaceGroup(-1749152957);
                                boolean zChangedInstance2 = composer2.changedInstance(oTPElement);
                                VerificationSectionKt$VerificationSection$1$1$1$1 verificationSectionKt$VerificationSection$1$1$1$1RememberedValue = composer2.rememberedValue();
                                if (zChangedInstance2 || verificationSectionKt$VerificationSection$1$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                    verificationSectionKt$VerificationSection$1$1$1$1RememberedValue = new VerificationSectionKt$VerificationSection$1$1$1$1(oTPElement);
                                    composer2.updateRememberedValue(verificationSectionKt$VerificationSection$1$1$1$1RememberedValue);
                                }
                                composer2.endReplaceGroup();
                                TestModeBannerKt.TestModeBanner(z2, strStringResource, (Function0) ((KFunction) verificationSectionKt$VerificationSection$1$1$1$1RememberedValue), null, null, composer2, 0, 24);
                                SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer2, 6);
                            }
                            composer2.endReplaceGroup();
                            float f = 8;
                            OTPElementUIKt.m8812OTPElementUIRE_urrM(z, otpElement, null, null, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getHeadingXLargeSubdued(), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), "", null, 0.0f, focusRequester, composer2, (OTPElement.$stable << 3) | 14352384, 0, 780);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(70030924);
                zChangedInstance = composerStartRestartGroup.changedInstance(th) | composerStartRestartGroup.changedInstance(view);
                verificationSectionKt$VerificationSection$1$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    verificationSectionKt$VerificationSection$1$2$1RememberedValue = new VerificationSectionKt$VerificationSection$1$2$1(th, view, null);
                    composerStartRestartGroup.updateRememberedValue(verificationSectionKt$VerificationSection$1$2$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(th, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) verificationSectionKt$VerificationSection$1$2$1RememberedValue, composerStartRestartGroup, (i3 >> 9) & 14);
                    composerStartRestartGroup.startReplaceGroup(70038484);
                    if (th instanceof ConfirmVerification.OTPError) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void VerificationErrorText(final ConfirmVerification.OTPError oTPError, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(14534336);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(oTPError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(14534336, i2, -1, "com.stripe.android.financialconnections.features.common.VerificationErrorText (VerificationSection.kt:90)");
            }
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final UriHandler uriHandler = (UriHandler) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            int i3 = i2;
            TextResource message = toMessage(oTPError);
            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7644getTextCritical0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to(StringAnnotation.CLICKABLE, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7644getTextCritical0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16740350, null).toSpanStyle()));
            composerStartRestartGroup.startReplaceGroup(-862669323);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler) | ((i3 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.VerificationSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VerificationSectionKt.VerificationErrorText$lambda$4$lambda$3(uriHandler, oTPError, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m7586AnnotatedTextrm0N8CA(message, (Function1) objRememberedValue, textStyleM5615copyp1EtxEg$default, modifierFillMaxWidth$default, mapMapOf, 0, 0, composerStartRestartGroup, 3072, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.VerificationSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationSectionKt.VerificationErrorText$lambda$5(oTPError, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationErrorText$lambda$4$lambda$3(UriHandler uriHandler, ConfirmVerification.OTPError oTPError, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        uriHandler.openUri(oTPError.getSupportUrl());
        return Unit.INSTANCE;
    }

    private static final TextResource toMessage(ConfirmVerification.OTPError oTPError) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[oTPError.getType().ordinal()];
        if (i2 == 1) {
            i = R.string.stripe_verification_codeExpiredEmail;
        } else if (i2 == 2) {
            i = R.string.stripe_verification_codeExpiredSms;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.stripe_verification_codeInvalid;
        }
        return new TextResource.StringId(i, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void populateTestCode(OTPElement oTPElement) throws IOException {
        int length = "000000".length();
        for (int i = 0; i < length; i++) {
            oTPElement.getController().onAutofillDigit(String.valueOf("000000".charAt(i)));
        }
    }
}
