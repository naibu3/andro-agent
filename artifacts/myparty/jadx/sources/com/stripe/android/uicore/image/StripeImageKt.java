package com.stripe.android.uicore.image;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeImage.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a§\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u0015H\u0002\"\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"StripeImage", "", "url", "", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "contentDescription", "modifier", "Landroidx/compose/ui/Modifier;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "debugPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "alignment", "Landroidx/compose/ui/Alignment;", "disableAnimations", "", "errorContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "loadingContent", "(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculateBoxSize", "Lkotlin/Pair;", "", "TEST_TAG_IMAGE_FROM_URL", "getTEST_TAG_IMAGE_FROM_URL$annotations", "()V", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeImageKt {
    public static final String TEST_TAG_IMAGE_FROM_URL = "StripeImageFromUrl";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StripeImage$lambda$0(String str, StripeImageLoader stripeImageLoader, String str2, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z, Function3 function3, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        StripeImage(str, stripeImageLoader, str2, modifier, contentScale, colorFilter, painter, alignment, z, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_IMAGE_FROM_URL$annotations() {
    }

    /* compiled from: StripeImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.uicore.image.StripeImageKt$StripeImage$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ Painter $debugPainter;
        final /* synthetic */ boolean $disableAnimations;
        final /* synthetic */ Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $errorContent;
        final /* synthetic */ StripeImageLoader $imageLoader;
        final /* synthetic */ Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $loadingContent;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ String $url;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, StripeImageLoader stripeImageLoader, boolean z, Painter painter, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function32, Modifier modifier, String str2, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
            this.$url = str;
            this.$imageLoader = stripeImageLoader;
            this.$disableAnimations = z;
            this.$debugPainter = painter;
            this.$errorContent = function3;
            this.$loadingContent = function32;
            this.$modifier = modifier;
            this.$contentDescription = str2;
            this.$alignment = alignment;
            this.$contentScale = contentScale;
            this.$colorFilter = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1080821659, i2, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)");
                }
                ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localInspectionMode);
                ComposerKt.sourceInformationMarkerEnd(composer);
                boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
                Pair pairCalculateBoxSize = StripeImageKt.calculateBoxSize(BoxWithConstraints);
                int iIntValue = ((Number) pairCalculateBoxSize.component1()).intValue();
                int iIntValue2 = ((Number) pairCalculateBoxSize.component2()).intValue();
                composer.startReplaceGroup(-406660964);
                Painter painter = this.$debugPainter;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (!zBooleanValue || painter == null) ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(StripeImageState.Loading.INSTANCE, null, 2, null) : SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StripeImageState.Success(painter), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-406646816);
                if (!zBooleanValue) {
                    String str = this.$url;
                    composer.startReplaceGroup(-406645276);
                    boolean zChangedInstance = composer.changedInstance(this.$imageLoader) | composer.changed(this.$url) | composer.changed(iIntValue) | composer.changed(iIntValue2);
                    StripeImageLoader stripeImageLoader = this.$imageLoader;
                    String str2 = this.$url;
                    StripeImageKt$StripeImage$1$1$1 stripeImageKt$StripeImage$1$1$1RememberedValue = composer.rememberedValue();
                    if (zChangedInstance || stripeImageKt$StripeImage$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        stripeImageKt$StripeImage$1$1$1RememberedValue = new StripeImageKt$StripeImage$1$1$1(stripeImageLoader, str2, iIntValue, iIntValue2, mutableState, null);
                        composer.updateRememberedValue(stripeImageKt$StripeImage$1$1$1RememberedValue);
                    }
                    composer.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) stripeImageKt$StripeImage$1$1$1RememberedValue, composer, 0);
                }
                composer.endReplaceGroup();
                Object value = mutableState.getValue();
                composer.startReplaceGroup(-406627749);
                boolean zChanged = composer.changed(this.$disableAnimations);
                final boolean z = this.$disableAnimations;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.image.StripeImageKt$StripeImage$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StripeImageKt.AnonymousClass1.invoke$lambda$3$lambda$2(z, (StripeImageState) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function3 = this.$errorContent;
                final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function32 = this.$loadingContent;
                final Modifier modifier = this.$modifier;
                final String str3 = this.$contentDescription;
                final Alignment alignment = this.$alignment;
                final ContentScale contentScale = this.$contentScale;
                final ColorFilter colorFilter = this.$colorFilter;
                AnimatedContentKt.AnimatedContent(value, null, null, null, "loading_image_animation", function1, ComposableLambdaKt.rememberComposableLambda(-333910497, true, new Function4<AnimatedContentScope, StripeImageState, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.image.StripeImageKt.StripeImage.1.3
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, StripeImageState stripeImageState, Composer composer2, Integer num) {
                        invoke(animatedContentScope, stripeImageState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, StripeImageState it, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-333910497, i3, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:101)");
                        }
                        if (Intrinsics.areEqual(it, StripeImageState.Error.INSTANCE)) {
                            composer2.startReplaceGroup(-1892457249);
                            function3.invoke(BoxWithConstraints, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (Intrinsics.areEqual(it, StripeImageState.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(-1892455903);
                            function32.invoke(BoxWithConstraints, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(it instanceof StripeImageState.Success)) {
                                composer2.startReplaceGroup(-1892457968);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1463465790);
                            ImageKt.Image(((StripeImageState.Success) it).getPainter(), str3, TestTagKt.testTag(modifier, StripeImageKt.TEST_TAG_IMAGE_FROM_URL), alignment, contentScale, 0.0f, colorFilter, composer2, 0, 32);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1597440, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$3$lambda$2(boolean z, StripeImageState targetState) {
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (z) {
                return true;
            }
            return targetState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StripeImage(final String url, final StripeImageLoader imageLoader, final String str, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        Modifier modifier2;
        int i5;
        ContentScale fit;
        int i6;
        ColorFilter colorFilter2;
        int i7;
        Painter painter2;
        int i8;
        Alignment alignment2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final Painter painter3;
        final Modifier modifier3;
        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function33;
        final ContentScale contentScale2;
        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function34;
        final ColorFilter colorFilter3;
        final Alignment alignment3;
        final boolean z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerStartRestartGroup = composer.startRestartGroup(-957894735);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(imageLoader) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            str2 = str;
        } else {
            str2 = str;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    fit = contentScale;
                    i4 |= composerStartRestartGroup.changed(fit) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((196608 & i) == 0) {
                        colorFilter2 = colorFilter;
                        i4 |= composerStartRestartGroup.changed(colorFilter2) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        painter2 = painter;
                    } else {
                        painter2 = painter;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(painter2) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        alignment2 = alignment;
                    } else {
                        alignment2 = alignment;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(alignment2) ? 8388608 : 4194304;
                        }
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i11 = i3 & 512;
                        if (i11 == 0) {
                            if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            i13 = i3 & 1024;
                            if (i13 == 0) {
                                i14 = i13;
                                i15 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i14 = i13;
                                i15 = i2 | (composerStartRestartGroup.changedInstance(function32) ? 4 : 2);
                            } else {
                                i14 = i13;
                                i15 = i2;
                            }
                            if ((i4 & 306783379) == 306783378 || (i15 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    fit = ContentScale.INSTANCE.getFit();
                                }
                                ColorFilter colorFilter4 = i6 == 0 ? null : colorFilter2;
                                if (i7 != 0) {
                                    painter2 = null;
                                }
                                Alignment center = i8 == 0 ? Alignment.INSTANCE.getCenter() : alignment2;
                                boolean z3 = i10 == 0 ? false : z;
                                Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3M8871getLambda1$stripe_ui_core_release = i12 == 0 ? ComposableSingletons$StripeImageKt.INSTANCE.m8871getLambda1$stripe_ui_core_release() : function3;
                                Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3M8872getLambda2$stripe_ui_core_release = i14 == 0 ? ComposableSingletons$StripeImageKt.INSTANCE.m8872getLambda2$stripe_ui_core_release() : function32;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-957894735, i4, i15, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:59)");
                                }
                                boolean z4 = z3;
                                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(1080821659, true, new AnonymousClass1(url, imageLoader, z4, painter2, function3M8871getLambda1$stripe_ui_core_release, function3M8872getLambda2$stripe_ui_core_release, modifier2, str2, center, fit, colorFilter4), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                Modifier modifier4 = modifier2;
                                painter3 = painter2;
                                modifier3 = modifier4;
                                ContentScale contentScale3 = fit;
                                function33 = function3M8871getLambda1$stripe_ui_core_release;
                                contentScale2 = contentScale3;
                                ColorFilter colorFilter5 = colorFilter4;
                                function34 = function3M8872getLambda2$stripe_ui_core_release;
                                colorFilter3 = colorFilter5;
                                alignment3 = center;
                                z2 = z4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                Modifier modifier5 = modifier2;
                                painter3 = painter2;
                                modifier3 = modifier5;
                                z2 = z;
                                function34 = function32;
                                alignment3 = alignment2;
                                contentScale2 = fit;
                                composer2 = composerStartRestartGroup;
                                colorFilter3 = colorFilter2;
                                function33 = function3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return StripeImageKt.StripeImage$lambda$0(url, imageLoader, str, modifier3, contentScale2, colorFilter3, painter3, alignment3, z2, function33, function34, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i12 = i11;
                        i13 = i3 & 1024;
                        if (i13 == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            if (i16 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            boolean z42 = z3;
                            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(1080821659, true, new AnonymousClass1(url, imageLoader, z42, painter2, function3M8871getLambda1$stripe_ui_core_release, function3M8872getLambda2$stripe_ui_core_release, modifier2, str2, center, fit, colorFilter4), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier42 = modifier2;
                            painter3 = painter2;
                            modifier3 = modifier42;
                            ContentScale contentScale32 = fit;
                            function33 = function3M8871getLambda1$stripe_ui_core_release;
                            contentScale2 = contentScale32;
                            ColorFilter colorFilter52 = colorFilter4;
                            function34 = function3M8872getLambda2$stripe_ui_core_release;
                            colorFilter3 = colorFilter52;
                            alignment3 = center;
                            z2 = z42;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                colorFilter2 = colorFilter;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fit = contentScale;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            colorFilter2 = colorFilter;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        fit = contentScale;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        colorFilter2 = colorFilter;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> calculateBoxSize(BoxWithConstraintsScope boxWithConstraintsScope) {
        int iM6070getMaxWidthimpl = (Constraints.m6070getMaxWidthimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk()) <= IntSize.m6287getWidthimpl(IntSize.INSTANCE.m6292getZeroYbymL2g()) || Constraints.m6070getMaxWidthimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk()) >= ((int) Dp.INSTANCE.m6136getInfinityD9Ej5fM())) ? -1 : Constraints.m6070getMaxWidthimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk());
        int iM6069getMaxHeightimpl = (Constraints.m6069getMaxHeightimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk()) <= IntSize.m6286getHeightimpl(IntSize.INSTANCE.m6292getZeroYbymL2g()) || Constraints.m6069getMaxHeightimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk()) >= ((int) Dp.INSTANCE.m6136getInfinityD9Ej5fM())) ? -1 : Constraints.m6069getMaxHeightimpl(boxWithConstraintsScope.mo927getConstraintsmsEJaDk());
        if (iM6070getMaxWidthimpl == -1) {
            iM6070getMaxWidthimpl = iM6069getMaxHeightimpl;
        }
        if (iM6069getMaxHeightimpl == -1) {
            iM6069getMaxHeightimpl = iM6070getMaxWidthimpl;
        }
        return new Pair<>(Integer.valueOf(iM6070getMaxWidthimpl), Integer.valueOf(iM6069getMaxHeightimpl));
    }
}
