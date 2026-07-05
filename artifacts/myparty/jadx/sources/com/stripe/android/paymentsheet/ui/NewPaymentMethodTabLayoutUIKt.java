package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewPaymentMethodTabLayoutUI.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ae\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006)"}, d2 = {"TEST_TAG_LIST", "", "getTEST_TAG_LIST$annotations", "()V", "NewPaymentMethodTabLayoutUI", "", "paymentMethods", "", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "selectedIndex", "", "isEnabled", "", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "onItemSelectedListener", "Lkotlin/Function1;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;IZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "rememberViewWidth", "Landroidx/compose/ui/unit/Dp;", ViewProps.MAX_WIDTH, "numberOfPaymentMethods", "rememberViewWidth-kHDZbjc", "(FILandroidx/compose/runtime/Composer;I)F", "calculateViewWidth", "calculateViewWidth-D5KLDUw", "(FI)F", "computeItemWidthWhenExceedingMaxWidth", "availableWidth", "minItemWidth", PaymentSheetAppearanceKeys.SPACING, "lastCardPeekAmount", "", "computeItemWidthWhenExceedingMaxWidth-DRUOcmI", "(FFFF)F", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewPaymentMethodTabLayoutUIKt {
    public static final String TEST_TAG_LIST = "PaymentMethodsUITestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewPaymentMethodTabLayoutUI$lambda$1(List list, int i, boolean z, PaymentMethodIncentive paymentMethodIncentive, Function1 function1, StripeImageLoader stripeImageLoader, Modifier modifier, LazyListState lazyListState, int i2, int i3, Composer composer, int i4) {
        NewPaymentMethodTabLayoutUI(list, i, z, paymentMethodIncentive, function1, stripeImageLoader, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_LIST$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewPaymentMethodTabLayoutUI(final List<SupportedPaymentMethod> paymentMethods, final int i, final boolean z, final PaymentMethodIncentive paymentMethodIncentive, final Function1<? super SupportedPaymentMethod, Unit> onItemSelectedListener, final StripeImageLoader imageLoader, Modifier modifier, LazyListState lazyListState, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        Modifier.Companion companion;
        boolean zBooleanValue;
        boolean zChanged;
        NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1 newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerStartRestartGroup = composer.startRestartGroup(2088551377);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(paymentMethods) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(paymentMethodIncentive) : composerStartRestartGroup.changedInstance(paymentMethodIncentive) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onItemSelectedListener) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= (262144 & i2) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        lazyListStateRememberLazyListState = lazyListState;
                        int i6 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 8388608 : 4194304;
                        i4 |= i6;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    i4 |= i6;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        companion = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088551377, i4, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI (NewPaymentMethodTabLayoutUI.kt:44)");
                    }
                    ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    zBooleanValue = ((Boolean) objConsume).booleanValue();
                    Integer numValueOf = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceGroup(-132449225);
                    zChanged = ((((i4 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i4 & 12582912) == 8388608) | composerStartRestartGroup.changed(zBooleanValue) | ((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32);
                    newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue = new NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1(zBooleanValue, lazyListStateRememberLazyListState, i, null);
                        composerStartRestartGroup.updateRememberedValue(newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue, composerStartRestartGroup, (i4 >> 3) & 14);
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(TestTagKt.testTag(companion, "PaymentMethodsUITestTag1"), null, false, ComposableLambdaKt.rememberComposableLambda(645124923, true, new AnonymousClass2(paymentMethods, lazyListStateRememberLazyListState, z2, i, paymentMethodIncentive, imageLoader, onItemSelectedListener), composerStartRestartGroup, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = companion;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NewPaymentMethodTabLayoutUIKt.NewPaymentMethodTabLayoutUI$lambda$1(paymentMethods, i, z, paymentMethodIncentive, onItemSelectedListener, imageLoader, modifier3, lazyListState2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 1572864;
            modifier2 = modifier;
            if ((i2 & 12582912) == 0) {
            }
            if ((i4 & 4793491) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Boolean> localInspectionMode2 = InspectionModeKt.getLocalInspectionMode();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localInspectionMode2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    zBooleanValue = ((Boolean) objConsume2).booleanValue();
                    Integer numValueOf2 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceGroup(-132449225);
                    if (((i4 & 29360128) ^ 12582912) <= 8388608) {
                        zChanged = ((((i4 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i4 & 12582912) == 8388608) | composerStartRestartGroup.changed(zBooleanValue) | ((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32);
                        newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue = new NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1(zBooleanValue, lazyListStateRememberLazyListState, i, null);
                            composerStartRestartGroup.updateRememberedValue(newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue, composerStartRestartGroup, (i4 >> 3) & 14);
                            composer2 = composerStartRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(TestTagKt.testTag(companion, "PaymentMethodsUITestTag1"), null, false, ComposableLambdaKt.rememberComposableLambda(645124923, true, new AnonymousClass2(paymentMethods, lazyListStateRememberLazyListState, z2, i, paymentMethodIncentive, imageLoader, onItemSelectedListener), composerStartRestartGroup, 54), composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = companion;
                        }
                    } else {
                        zChanged = ((((i4 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i4 & 12582912) == 8388608) | composerStartRestartGroup.changed(zBooleanValue) | ((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32);
                        newPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
            }
            final LazyListState lazyListState22 = lazyListStateRememberLazyListState;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 12582912) == 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        final LazyListState lazyListState222 = lazyListStateRememberLazyListState;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: NewPaymentMethodTabLayoutUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ StripeImageLoader $imageLoader;
        final /* synthetic */ PaymentMethodIncentive $incentive;
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ Function1<SupportedPaymentMethod, Unit> $onItemSelectedListener;
        final /* synthetic */ List<SupportedPaymentMethod> $paymentMethods;
        final /* synthetic */ int $selectedIndex;
        final /* synthetic */ LazyListState $state;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<SupportedPaymentMethod> list, LazyListState lazyListState, boolean z, int i, PaymentMethodIncentive paymentMethodIncentive, StripeImageLoader stripeImageLoader, Function1<? super SupportedPaymentMethod, Unit> function1) {
            this.$paymentMethods = list;
            this.$state = lazyListState;
            this.$isEnabled = z;
            this.$selectedIndex = i;
            this.$incentive = paymentMethodIncentive;
            this.$imageLoader = stripeImageLoader;
            this.$onItemSelectedListener = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(645124923, i2, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI.<anonymous> (NewPaymentMethodTabLayoutUI.kt:61)");
                }
                final float fM8473rememberViewWidthkHDZbjc = NewPaymentMethodTabLayoutUIKt.m8473rememberViewWidthkHDZbjc(BoxWithConstraints.mo929getMaxWidthD9Ej5fM(), this.$paymentMethods.size(), composer, 0);
                PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(PaymentMethodsUISpacing.INSTANCE.m8480getCarouselInnerPaddingD9Ej5fM());
                Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, NewPaymentMethodTabLayoutUIKt.TEST_TAG_LIST);
                LazyListState lazyListState = this.$state;
                Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM900spacedBy0680j_4;
                boolean z = this.$isEnabled;
                composer.startReplaceGroup(844404947);
                boolean zChangedInstance = composer.changedInstance(this.$paymentMethods) | composer.changed(this.$selectedIndex) | composer.changedInstance(this.$incentive) | composer.changed(fM8473rememberViewWidthkHDZbjc) | composer.changedInstance(this.$imageLoader) | composer.changed(this.$isEnabled) | composer.changed(this.$onItemSelectedListener);
                final List<SupportedPaymentMethod> list = this.$paymentMethods;
                final int i3 = this.$selectedIndex;
                final PaymentMethodIncentive paymentMethodIncentive = this.$incentive;
                final StripeImageLoader stripeImageLoader = this.$imageLoader;
                final boolean z2 = this.$isEnabled;
                final Function1<SupportedPaymentMethod, Unit> function1 = this.$onItemSelectedListener;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NewPaymentMethodTabLayoutUIKt.AnonymousClass2.invoke$lambda$3$lambda$2(list, i3, paymentMethodIncentive, fM8473rememberViewWidthkHDZbjc, stripeImageLoader, z2, function1, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyRow(modifierTestTag, lazyListState, outerFormInsets, false, horizontalOrVertical, null, null, z, (Function1) objRememberedValue, composer, 24582, LocationRequestCompat.QUALITY_LOW_POWER);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(final List list, final int i, final PaymentMethodIncentive paymentMethodIncentive, final float f, final StripeImageLoader stripeImageLoader, final boolean z, final Function1 function1, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    list.get(i2);
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, final int i2, Composer composer, int i3) {
                    int i4;
                    int i5;
                    boolean z2;
                    PaymentMethodIncentive paymentMethodIncentiveTakeIfMatches;
                    ComposerKt.sourceInformation(composer, "C188@8866L26:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if ((i4 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) list.get(i2);
                    composer.startReplaceGroup(-1071139681);
                    Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, NewPaymentMethodTabLayoutUIKt.TEST_TAG_LIST + supportedPaymentMethod.getCode());
                    int i6 = i4;
                    int iIcon = supportedPaymentMethod.icon(composer, 0);
                    String strIconUrl = supportedPaymentMethod.iconUrl(composer, 0);
                    String strResolve = ResolvableStringComposeUtilsKt.resolve(supportedPaymentMethod.getDisplayName(), composer, 0);
                    if (i2 == i) {
                        i5 = i6;
                        z2 = true;
                    } else {
                        i5 = i6;
                        z2 = false;
                    }
                    boolean iconRequiresTinting = supportedPaymentMethod.getIconRequiresTinting();
                    PaymentMethodIncentive paymentMethodIncentive2 = paymentMethodIncentive;
                    String displayText = (paymentMethodIncentive2 == null || (paymentMethodIncentiveTakeIfMatches = paymentMethodIncentive2.takeIfMatches(supportedPaymentMethod.getCode())) == null) ? null : paymentMethodIncentiveTakeIfMatches.getDisplayText();
                    float f2 = f;
                    StripeImageLoader stripeImageLoader2 = stripeImageLoader;
                    int i7 = i5;
                    String str = displayText;
                    boolean z3 = z;
                    composer.startReplaceGroup(1073846733);
                    boolean zChanged = ((((i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer.changed(i2)) || (i7 & 48) == 32) | composer.changed(function1) | composer.changedInstance(list);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        final List list2 = list;
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(list2.get(i2));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    NewPaymentMethodTabKt.m8469NewPaymentMethodTabjFuDa88(f2, iIcon, strIconUrl, stripeImageLoader2, strResolve, z2, z3, iconRequiresTinting, str, modifierTestTag, (Function0) objRememberedValue, composer, StripeImageLoader.$stable << 9, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rememberViewWidth-kHDZbjc, reason: not valid java name */
    public static final float m8473rememberViewWidthkHDZbjc(float f, int i, Composer composer, int i2) {
        composer.startReplaceGroup(-709663121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709663121, i2, -1, "com.stripe.android.paymentsheet.ui.rememberViewWidth (NewPaymentMethodTabLayoutUI.kt:100)");
        }
        composer.startReplaceGroup(1221344931);
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(f)) || (i2 & 6) == 4) | ((((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Dp.m6115boximpl(m8471calculateViewWidthD5KLDUw(f, i));
            composer.updateRememberedValue(objRememberedValue);
        }
        float fM6131unboximpl = ((Dp) objRememberedValue).m6131unboximpl();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM6131unboximpl;
    }

    /* renamed from: calculateViewWidth-D5KLDUw, reason: not valid java name */
    public static final float m8471calculateViewWidthD5KLDUw(float f, int i) {
        float fM6117constructorimpl = Dp.m6117constructorimpl(f - Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getEnd() + StripeTheme.INSTANCE.getFormInsets().getStart()));
        float fM6117constructorimpl2 = Dp.m6117constructorimpl(90);
        float f2 = i;
        float fM6117constructorimpl3 = Dp.m6117constructorimpl(fM6117constructorimpl2 * f2);
        float fM6117constructorimpl4 = Dp.m6117constructorimpl(PaymentMethodsUISpacing.INSTANCE.m8480getCarouselInnerPaddingD9Ej5fM() * (i - 1));
        if (Dp.m6116compareTo0680j_4(Dp.m6117constructorimpl(fM6117constructorimpl3 + fM6117constructorimpl4), fM6117constructorimpl) <= 0) {
            return Dp.m6117constructorimpl(Dp.m6117constructorimpl(fM6117constructorimpl - fM6117constructorimpl4) / f2);
        }
        Iterator it = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)}).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Dp dpM6115boximpl = Dp.m6115boximpl(m8472computeItemWidthWhenExceedingMaxWidthDRUOcmI(fM6117constructorimpl, fM6117constructorimpl2, PaymentMethodsUISpacing.INSTANCE.m8480getCarouselInnerPaddingD9Ej5fM(), ((Number) it.next()).floatValue()));
        while (it.hasNext()) {
            Dp dpM6115boximpl2 = Dp.m6115boximpl(m8472computeItemWidthWhenExceedingMaxWidthDRUOcmI(fM6117constructorimpl, fM6117constructorimpl2, PaymentMethodsUISpacing.INSTANCE.m8480getCarouselInnerPaddingD9Ej5fM(), ((Number) it.next()).floatValue()));
            if (dpM6115boximpl.compareTo(dpM6115boximpl2) > 0) {
                dpM6115boximpl = dpM6115boximpl2;
            }
        }
        return dpM6115boximpl.m6131unboximpl();
    }

    /* renamed from: computeItemWidthWhenExceedingMaxWidth-DRUOcmI, reason: not valid java name */
    private static final float m8472computeItemWidthWhenExceedingMaxWidthDRUOcmI(float f, float f2, float f3, float f4) {
        return Dp.m6117constructorimpl(Dp.m6117constructorimpl(f - Dp.m6117constructorimpl(f3 * ((int) (Dp.m6117constructorimpl(Dp.m6117constructorimpl(f - f2) - Dp.m6117constructorimpl(f2 * f4)) / Dp.m6117constructorimpl(f2 + f3))))) / ((r3 + 1) + f4));
    }
}
