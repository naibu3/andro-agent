package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a©\u0001\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a8\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\rH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "MaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "MinWidth", "TextPadding", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", PaymentSheetAppearanceKeys.ICON, "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogFlowRow", "mainAxisSpacing", "crossAxisSpacing", UriUtil.LOCAL_CONTENT_SCHEME, "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float MinWidth = Dp.m6117constructorimpl(280);
    private static final float MaxWidth = Dp.m6117constructorimpl(560);

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2117AlertDialogContent4hvqGtA(final Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final long j, final float f, final long j2, final long j3, final long j4, final long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        long j6;
        int i6;
        long j7;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Composer composerStartRestartGroup = composer.startRestartGroup(1522575799);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialogContent)P(1,5,3,9,7,6,2:c#ui.graphics.Color,11:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.Color,10:c#ui.graphics.Color,8:c#ui.graphics.Color)52@1872L2730:AlertDialog.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(buttons) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function24 = function2;
                    i4 |= composerStartRestartGroup.changed(function24) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function25 = function22;
                        i4 |= composerStartRestartGroup.changed(function25) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 57344) == 0) {
                            function26 = function23;
                            i4 |= composerStartRestartGroup.changed(function26) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            if ((i & 458752) == 0) {
                                i5 = composerStartRestartGroup.changed(shape) ? 131072 : 65536;
                            }
                            if ((i3 & 64) == 0) {
                                i4 |= 1572864;
                            } else if ((i & 3670016) == 0) {
                                i4 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
                            }
                            if ((i3 & 128) == 0) {
                                i4 |= 12582912;
                            } else {
                                if ((i & 29360128) == 0) {
                                    i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 |= 100663296;
                                    j6 = j2;
                                } else {
                                    j6 = j2;
                                    if ((i & 234881024) == 0) {
                                        i4 |= composerStartRestartGroup.changed(j6) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                }
                                if ((i3 & 512) == 0) {
                                    if ((i & 1879048192) == 0) {
                                        i6 = i4 | (composerStartRestartGroup.changed(j3) ? 536870912 : 268435456);
                                    }
                                    if ((i3 & 1024) == 0) {
                                        i7 = i2 | 6;
                                        j7 = j4;
                                    } else {
                                        j7 = j4;
                                        if ((i2 & 14) == 0) {
                                            i7 = i2 | (composerStartRestartGroup.changed(j7) ? 4 : 2);
                                        } else {
                                            i7 = i2;
                                        }
                                    }
                                    int i10 = i7;
                                    if ((i3 & 2048) == 0) {
                                        i8 = i10 | 48;
                                    } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                                        i8 = i10 | (composerStartRestartGroup.changed(j5) ? 32 : 16);
                                    } else {
                                        i8 = i10;
                                    }
                                    if ((1533916891 & i6) == 306783378 || (i8 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1522575799, i6, i8, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:38)");
                                        }
                                        composer2 = composerStartRestartGroup;
                                        final int i11 = i6;
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                                        final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
                                        final long j8 = j7;
                                        final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
                                        final long j9 = j6;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i12) {
                                                ComposerKt.sourceInformation(composer3, "C58@2022L2574:AlertDialog.kt#uh7d8r");
                                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2126308228, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:57)");
                                                    }
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1069sizeInqDBjuR0$default(Modifier.INSTANCE, AlertDialogKt.MinWidth, 0.0f, AlertDialogKt.MaxWidth, 0.0f, 10, null), AlertDialogKt.DialogPadding);
                                                    final Function2<Composer, Integer, Unit> function210 = function27;
                                                    final Function2<Composer, Integer, Unit> function211 = function28;
                                                    final Function2<Composer, Integer, Unit> function212 = function29;
                                                    long j10 = j3;
                                                    final int i13 = i11;
                                                    long j11 = j8;
                                                    long j12 = j5;
                                                    long j13 = j9;
                                                    final Function2<Composer, Integer, Unit> function213 = buttons;
                                                    composer3.startReplaceableGroup(-483455358);
                                                    ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composer3.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Density density = (Density) objConsume;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume2 = composer3.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume3 = composer3.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    composer3.disableReusing();
                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer3.enableReusing();
                                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    composer3.startReplaceableGroup(-1163856341);
                                                    ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                                    final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    composer3.startReplaceableGroup(-1370717838);
                                                    ComposerKt.sourceInformation(composer3, "C111@4213L373:AlertDialog.kt#uh7d8r");
                                                    composer3.startReplaceableGroup(76440864);
                                                    ComposerKt.sourceInformation(composer3, "*64@2220L339");
                                                    if (function210 != null) {
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j10))}, ComposableLambdaKt.composableLambda(composer3, 934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i14) {
                                                                ComposerKt.sourceInformation(composer4, "C65@2312L229:AlertDialog.kt#uh7d8r");
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(934657765, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:64)");
                                                                    }
                                                                    Modifier modifierAlign = columnScopeInstance.align(PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.IconPadding), Alignment.INSTANCE.getCenterHorizontally());
                                                                    Function2<Composer, Integer, Unit> function214 = function210;
                                                                    int i15 = i13;
                                                                    composer4.startReplaceableGroup(733328855);
                                                                    ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume4 = composer4.consume(localDensity2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    Density density2 = (Density) objConsume4;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume5 = composer4.consume(localLayoutDirection2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume6 = composer4.consume(localViewConfiguration2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer4.startReusableNode();
                                                                    if (composer4.getInserting()) {
                                                                        composer4.createNode(constructor2);
                                                                    } else {
                                                                        composer4.useNode();
                                                                    }
                                                                    composer4.disableReusing();
                                                                    Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer4);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer4.enableReusing();
                                                                    function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    composer4.startReplaceableGroup(-2137368960);
                                                                    ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    composer4.startReplaceableGroup(-1552328981);
                                                                    ComposerKt.sourceInformation(composer4, "C70@2513L6:AlertDialog.kt#uh7d8r");
                                                                    function214.invoke(composer4, Integer.valueOf((i15 >> 6) & 14));
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endNode();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }), composer3, 56);
                                                        Unit unit = Unit.INSTANCE;
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    composer3.startReplaceableGroup(76441259);
                                                    ComposerKt.sourceInformation(composer3, "*75@2615L895");
                                                    if (function211 != null) {
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j11))}, ComposableLambdaKt.composableLambda(composer3, 1845262876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i14) {
                                                                ComposerKt.sourceInformation(composer4, "C76@2738L10,77@2806L686:AlertDialog.kt#uh7d8r");
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1845262876, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:75)");
                                                                    }
                                                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getHeadlineFont());
                                                                    final ColumnScope columnScope = columnScopeInstance;
                                                                    final Function2<Composer, Integer, Unit> function214 = function210;
                                                                    final Function2<Composer, Integer, Unit> function215 = function211;
                                                                    final int i15 = i13;
                                                                    TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer4, 483464909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                            invoke(composer5, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer5, int i16) {
                                                                            Alignment.Horizontal centerHorizontally;
                                                                            ComposerKt.sourceInformation(composer5, "C78@2860L610:AlertDialog.kt#uh7d8r");
                                                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(483464909, i16, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:77)");
                                                                                }
                                                                                ColumnScope columnScope2 = columnScope;
                                                                                Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.TitlePadding);
                                                                                if (function214 == null) {
                                                                                    centerHorizontally = Alignment.INSTANCE.getStart();
                                                                                } else {
                                                                                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                                                }
                                                                                Modifier modifierAlign = columnScope2.align(modifierPadding2, centerHorizontally);
                                                                                Function2<Composer, Integer, Unit> function216 = function215;
                                                                                int i17 = i15;
                                                                                composer5.startReplaceableGroup(733328855);
                                                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                                composer5.startReplaceableGroup(-1323940314);
                                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume4 = composer5.consume(localDensity2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                Density density2 = (Density) objConsume4;
                                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                                    ComposablesKt.invalidApplier();
                                                                                }
                                                                                composer5.startReusableNode();
                                                                                if (composer5.getInserting()) {
                                                                                    composer5.createNode(constructor2);
                                                                                } else {
                                                                                    composer5.useNode();
                                                                                }
                                                                                composer5.disableReusing();
                                                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                                composer5.enableReusing();
                                                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                                composer5.startReplaceableGroup(2058660585);
                                                                                composer5.startReplaceableGroup(-2137368960);
                                                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                composer5.startReplaceableGroup(1708709843);
                                                                                ComposerKt.sourceInformation(composer5, "C90@3437L7:AlertDialog.kt#uh7d8r");
                                                                                function216.invoke(composer5, Integer.valueOf((i17 >> 9) & 14));
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endNode();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            composer5.skipToGroupEnd();
                                                                        }
                                                                    }), composer4, 48);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }), composer3, 56);
                                                        Unit unit3 = Unit.INSTANCE;
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    composer3.startReplaceableGroup(76442209);
                                                    ComposerKt.sourceInformation(composer3, "*96@3565L621");
                                                    if (function212 != null) {
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j12))}, ComposableLambdaKt.composableLambda(composer3, 613970333, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i14) {
                                                                ComposerKt.sourceInformation(composer4, "C98@3711L10,99@3785L383:AlertDialog.kt#uh7d8r");
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(613970333, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:96)");
                                                                    }
                                                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getSupportingTextFont());
                                                                    final ColumnScope columnScope = columnScopeInstance;
                                                                    final Function2<Composer, Integer, Unit> function214 = function212;
                                                                    final int i15 = i13;
                                                                    TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer4, -747827634, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                            invoke(composer5, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer5, int i16) {
                                                                            ComposerKt.sourceInformation(composer5, "C100@3839L307:AlertDialog.kt#uh7d8r");
                                                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-747827634, i16, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:99)");
                                                                                }
                                                                                ColumnScope columnScope2 = columnScope;
                                                                                Modifier modifierAlign = columnScope2.align(PaddingKt.padding(columnScope2.weight(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.TextPadding), Alignment.INSTANCE.getStart());
                                                                                Function2<Composer, Integer, Unit> function215 = function214;
                                                                                int i17 = i15;
                                                                                composer5.startReplaceableGroup(733328855);
                                                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                                composer5.startReplaceableGroup(-1323940314);
                                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume4 = composer5.consume(localDensity2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                Density density2 = (Density) objConsume4;
                                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                                Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                                    ComposablesKt.invalidApplier();
                                                                                }
                                                                                composer5.startReusableNode();
                                                                                if (composer5.getInserting()) {
                                                                                    composer5.createNode(constructor2);
                                                                                } else {
                                                                                    composer5.useNode();
                                                                                }
                                                                                composer5.disableReusing();
                                                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                                composer5.enableReusing();
                                                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                                composer5.startReplaceableGroup(2058660585);
                                                                                composer5.startReplaceableGroup(-2137368960);
                                                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                composer5.startReplaceableGroup(477417300);
                                                                                ComposerKt.sourceInformation(composer5, "C106@4114L6:AlertDialog.kt#uh7d8r");
                                                                                function215.invoke(composer5, Integer.valueOf((i17 >> 12) & 14));
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endNode();
                                                                                composer5.endReplaceableGroup();
                                                                                composer5.endReplaceableGroup();
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            composer5.skipToGroupEnd();
                                                                        }
                                                                    }), composer4, 48);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }), composer3, 56);
                                                        Unit unit5 = Unit.INSTANCE;
                                                        Unit unit6 = Unit.INSTANCE;
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    Modifier modifierAlign = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
                                                    composer3.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume4 = composer3.consume(localDensity2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Density density2 = (Density) objConsume4;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume5 = composer3.consume(localLayoutDirection2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object objConsume6 = composer3.consume(localViewConfiguration2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor2);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    composer3.disableReusing();
                                                    Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer3);
                                                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer3.enableReusing();
                                                    function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    composer3.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer3.startReplaceableGroup(1902704376);
                                                    ComposerKt.sourceInformation(composer3, "C112@4277L295:AlertDialog.kt#uh7d8r");
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j13))}, ComposableLambdaKt.composableLambda(composer3, -433542216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$4$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i14) {
                                                            ComposerKt.sourceInformation(composer4, "C114@4425L10,115@4500L54:AlertDialog.kt#uh7d8r");
                                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-433542216, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:112)");
                                                                }
                                                                TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getActionLabelTextFont()), function213, composer4, (i13 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 56);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        });
                                        int i12 = i11 >> 12;
                                        Modifier modifier5 = modifier4;
                                        SurfaceKt.m2457SurfaceT9BRK9s(modifier5, shape, j, 0L, f, 0.0f, null, composableLambda, composer2, ((i11 >> 3) & 14) | 12582912 | (i12 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i12 & 896) | ((i11 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier5;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        composer2 = composerStartRestartGroup;
                                        modifier3 = modifier2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        return;
                                    }
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i13) {
                                            AlertDialogKt.m2117AlertDialogContent4hvqGtA(buttons, modifier3, function2, function22, function23, shape, j, f, j2, j3, j4, j5, composer3, i | 1, i2, i3);
                                        }
                                    });
                                    return;
                                }
                                i4 |= 805306368;
                                i6 = i4;
                                if ((i3 & 1024) == 0) {
                                }
                                int i102 = i7;
                                if ((i3 & 2048) == 0) {
                                }
                                if ((1533916891 & i6) == 306783378) {
                                    if (i9 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = composerStartRestartGroup;
                                    final int i112 = i6;
                                    final Function2<? super Composer, ? super Integer, Unit> function272 = function24;
                                    final Function2<? super Composer, ? super Integer, Unit> function282 = function25;
                                    final long j82 = j7;
                                    final Function2<? super Composer, ? super Integer, Unit> function292 = function26;
                                    final long j92 = j6;
                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i122) {
                                            ComposerKt.sourceInformation(composer3, "C58@2022L2574:AlertDialog.kt#uh7d8r");
                                            if ((i122 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2126308228, i122, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:57)");
                                                }
                                                Modifier modifierPadding = PaddingKt.padding(SizeKt.m1069sizeInqDBjuR0$default(Modifier.INSTANCE, AlertDialogKt.MinWidth, 0.0f, AlertDialogKt.MaxWidth, 0.0f, 10, null), AlertDialogKt.DialogPadding);
                                                final Function2<? super Composer, ? super Integer, Unit> function210 = function272;
                                                final Function2<? super Composer, ? super Integer, Unit> function211 = function282;
                                                final Function2<? super Composer, ? super Integer, Unit> function212 = function292;
                                                long j10 = j3;
                                                final int i13 = i112;
                                                long j11 = j82;
                                                long j12 = j5;
                                                long j13 = j92;
                                                final Function2<? super Composer, ? super Integer, Unit> function213 = buttons;
                                                composer3.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) objConsume;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume2 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume3 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                                final ColumnScope columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-1370717838);
                                                ComposerKt.sourceInformation(composer3, "C111@4213L373:AlertDialog.kt#uh7d8r");
                                                composer3.startReplaceableGroup(76440864);
                                                ComposerKt.sourceInformation(composer3, "*64@2220L339");
                                                if (function210 != null) {
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j10))}, ComposableLambdaKt.composableLambda(composer3, 934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i14) {
                                                            ComposerKt.sourceInformation(composer4, "C65@2312L229:AlertDialog.kt#uh7d8r");
                                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(934657765, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:64)");
                                                                }
                                                                Modifier modifierAlign = columnScopeInstance.align(PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.IconPadding), Alignment.INSTANCE.getCenterHorizontally());
                                                                Function2<Composer, Integer, Unit> function214 = function210;
                                                                int i15 = i13;
                                                                composer4.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                                composer4.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume4 = composer4.consume(localDensity2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                Density density2 = (Density) objConsume4;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume5 = composer4.consume(localLayoutDirection2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume6 = composer4.consume(localViewConfiguration2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer4.startReusableNode();
                                                                if (composer4.getInserting()) {
                                                                    composer4.createNode(constructor2);
                                                                } else {
                                                                    composer4.useNode();
                                                                }
                                                                composer4.disableReusing();
                                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer4);
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer4.enableReusing();
                                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                                composer4.startReplaceableGroup(2058660585);
                                                                composer4.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer4.startReplaceableGroup(-1552328981);
                                                                ComposerKt.sourceInformation(composer4, "C70@2513L6:AlertDialog.kt#uh7d8r");
                                                                function214.invoke(composer4, Integer.valueOf((i15 >> 6) & 14));
                                                                composer4.endReplaceableGroup();
                                                                composer4.endReplaceableGroup();
                                                                composer4.endReplaceableGroup();
                                                                composer4.endNode();
                                                                composer4.endReplaceableGroup();
                                                                composer4.endReplaceableGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 56);
                                                    Unit unit = Unit.INSTANCE;
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                                composer3.endReplaceableGroup();
                                                composer3.startReplaceableGroup(76441259);
                                                ComposerKt.sourceInformation(composer3, "*75@2615L895");
                                                if (function211 != null) {
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j11))}, ComposableLambdaKt.composableLambda(composer3, 1845262876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i14) {
                                                            ComposerKt.sourceInformation(composer4, "C76@2738L10,77@2806L686:AlertDialog.kt#uh7d8r");
                                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1845262876, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:75)");
                                                                }
                                                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getHeadlineFont());
                                                                final ColumnScope columnScope = columnScopeInstance;
                                                                final Function2<? super Composer, ? super Integer, Unit> function214 = function210;
                                                                final Function2<? super Composer, ? super Integer, Unit> function215 = function211;
                                                                final int i15 = i13;
                                                                TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer4, 483464909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                        invoke(composer5, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer5, int i16) {
                                                                        Alignment.Horizontal centerHorizontally;
                                                                        ComposerKt.sourceInformation(composer5, "C78@2860L610:AlertDialog.kt#uh7d8r");
                                                                        if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(483464909, i16, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:77)");
                                                                            }
                                                                            ColumnScope columnScope2 = columnScope;
                                                                            Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.TitlePadding);
                                                                            if (function214 == null) {
                                                                                centerHorizontally = Alignment.INSTANCE.getStart();
                                                                            } else {
                                                                                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                                            }
                                                                            Modifier modifierAlign = columnScope2.align(modifierPadding2, centerHorizontally);
                                                                            Function2<Composer, Integer, Unit> function216 = function215;
                                                                            int i17 = i15;
                                                                            composer5.startReplaceableGroup(733328855);
                                                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                            composer5.startReplaceableGroup(-1323940314);
                                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume4 = composer5.consume(localDensity2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            Density density2 = (Density) objConsume4;
                                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer5.startReusableNode();
                                                                            if (composer5.getInserting()) {
                                                                                composer5.createNode(constructor2);
                                                                            } else {
                                                                                composer5.useNode();
                                                                            }
                                                                            composer5.disableReusing();
                                                                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                            composer5.enableReusing();
                                                                            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                            composer5.startReplaceableGroup(2058660585);
                                                                            composer5.startReplaceableGroup(-2137368960);
                                                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                            composer5.startReplaceableGroup(1708709843);
                                                                            ComposerKt.sourceInformation(composer5, "C90@3437L7:AlertDialog.kt#uh7d8r");
                                                                            function216.invoke(composer5, Integer.valueOf((i17 >> 9) & 14));
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endNode();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer5.skipToGroupEnd();
                                                                    }
                                                                }), composer4, 48);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 56);
                                                    Unit unit3 = Unit.INSTANCE;
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                                composer3.endReplaceableGroup();
                                                composer3.startReplaceableGroup(76442209);
                                                ComposerKt.sourceInformation(composer3, "*96@3565L621");
                                                if (function212 != null) {
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j12))}, ComposableLambdaKt.composableLambda(composer3, 613970333, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i14) {
                                                            ComposerKt.sourceInformation(composer4, "C98@3711L10,99@3785L383:AlertDialog.kt#uh7d8r");
                                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(613970333, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:96)");
                                                                }
                                                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getSupportingTextFont());
                                                                final ColumnScope columnScope = columnScopeInstance;
                                                                final Function2<? super Composer, ? super Integer, Unit> function214 = function212;
                                                                final int i15 = i13;
                                                                TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer4, -747827634, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                        invoke(composer5, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer5, int i16) {
                                                                        ComposerKt.sourceInformation(composer5, "C100@3839L307:AlertDialog.kt#uh7d8r");
                                                                        if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-747827634, i16, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:99)");
                                                                            }
                                                                            ColumnScope columnScope2 = columnScope;
                                                                            Modifier modifierAlign = columnScope2.align(PaddingKt.padding(columnScope2.weight(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.TextPadding), Alignment.INSTANCE.getStart());
                                                                            Function2<Composer, Integer, Unit> function215 = function214;
                                                                            int i17 = i15;
                                                                            composer5.startReplaceableGroup(733328855);
                                                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                            composer5.startReplaceableGroup(-1323940314);
                                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume4 = composer5.consume(localDensity2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            Density density2 = (Density) objConsume4;
                                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                            Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer5.startReusableNode();
                                                                            if (composer5.getInserting()) {
                                                                                composer5.createNode(constructor2);
                                                                            } else {
                                                                                composer5.useNode();
                                                                            }
                                                                            composer5.disableReusing();
                                                                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                            composer5.enableReusing();
                                                                            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                            composer5.startReplaceableGroup(2058660585);
                                                                            composer5.startReplaceableGroup(-2137368960);
                                                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                            composer5.startReplaceableGroup(477417300);
                                                                            ComposerKt.sourceInformation(composer5, "C106@4114L6:AlertDialog.kt#uh7d8r");
                                                                            function215.invoke(composer5, Integer.valueOf((i17 >> 12) & 14));
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endNode();
                                                                            composer5.endReplaceableGroup();
                                                                            composer5.endReplaceableGroup();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer5.skipToGroupEnd();
                                                                    }
                                                                }), composer4, 48);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 56);
                                                    Unit unit5 = Unit.INSTANCE;
                                                    Unit unit6 = Unit.INSTANCE;
                                                }
                                                composer3.endReplaceableGroup();
                                                Modifier modifierAlign = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume4 = composer3.consume(localDensity2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density2 = (Density) objConsume4;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume5 = composer3.consume(localLayoutDirection2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object objConsume6 = composer3.consume(localViewConfiguration2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer3);
                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(1902704376);
                                                ComposerKt.sourceInformation(composer3, "C112@4277L295:AlertDialog.kt#uh7d8r");
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j13))}, ComposableLambdaKt.composableLambda(composer3, -433542216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$4$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i14) {
                                                        ComposerKt.sourceInformation(composer4, "C114@4425L10,115@4500L54:AlertDialog.kt#uh7d8r");
                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-433542216, i14, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:112)");
                                                            }
                                                            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DialogTokens.INSTANCE.getActionLabelTextFont()), function213, composer4, (i13 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 56);
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    int i122 = i112 >> 12;
                                    Modifier modifier52 = modifier4;
                                    SurfaceKt.m2457SurfaceT9BRK9s(modifier52, shape, j, 0L, f, 0.0f, null, composableLambda2, composer2, ((i112 >> 3) & 14) | 12582912 | (i122 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i122 & 896) | ((i112 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            if ((i3 & 256) != 0) {
                            }
                            if ((i3 & 512) == 0) {
                            }
                            i6 = i4;
                            if ((i3 & 1024) == 0) {
                            }
                            int i1022 = i7;
                            if ((i3 & 2048) == 0) {
                            }
                            if ((1533916891 & i6) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i4 |= i5;
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        i6 = i4;
                        if ((i3 & 1024) == 0) {
                        }
                        int i10222 = i7;
                        if ((i3 & 2048) == 0) {
                        }
                        if ((1533916891 & i6) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function26 = function23;
                    if ((i3 & 32) != 0) {
                    }
                    i4 |= i5;
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i6 = i4;
                    if ((i3 & 1024) == 0) {
                    }
                    int i102222 = i7;
                    if ((i3 & 2048) == 0) {
                    }
                    if ((1533916891 & i6) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function25 = function22;
                if ((i3 & 16) == 0) {
                }
                function26 = function23;
                if ((i3 & 32) != 0) {
                }
                i4 |= i5;
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i6 = i4;
                if ((i3 & 1024) == 0) {
                }
                int i1022222 = i7;
                if ((i3 & 2048) == 0) {
                }
                if ((1533916891 & i6) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function24 = function2;
            if ((i3 & 8) != 0) {
            }
            function25 = function22;
            if ((i3 & 16) == 0) {
            }
            function26 = function23;
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i6 = i4;
            if ((i3 & 1024) == 0) {
            }
            int i10222222 = i7;
            if ((i3 & 2048) == 0) {
            }
            if ((1533916891 & i6) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        function24 = function2;
        if ((i3 & 8) != 0) {
        }
        function25 = function22;
        if ((i3 & 16) == 0) {
        }
        function26 = function23;
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i6 = i4;
        if ((i3 & 1024) == 0) {
        }
        int i102222222 = i7;
        if ((i3 & 2048) == 0) {
        }
        if ((1533916891 & i6) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m2118AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)132@4860L3239:AlertDialog.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:127)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo377measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> measurables, long j) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    Ref.IntRef intRef;
                    Ref.IntRef intRef2;
                    Ref.IntRef intRef3;
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = arrayList5;
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    ArrayList arrayList8 = new ArrayList();
                    Ref.IntRef intRef6 = new Ref.IntRef();
                    Ref.IntRef intRef7 = new Ref.IntRef();
                    Iterator<? extends Measurable> it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable placeableMo4993measureBRTryo0 = it.next().mo4993measureBRTryo0(j);
                        ArrayList arrayList9 = arrayList8;
                        arrayList8 = arrayList9;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList9, intRef6, Layout, f, j, placeableMo4993measureBRTryo0)) {
                            Layout = measureScope;
                            arrayList = arrayList4;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            intRef = intRef7;
                            intRef2 = intRef6;
                            intRef3 = intRef5;
                        } else {
                            Layout = measureScope;
                            arrayList = arrayList4;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            intRef = intRef7;
                            intRef2 = intRef6;
                            intRef3 = intRef5;
                            measure_3p2s80s$startNewSequence(arrayList, intRef3, Layout, f2, arrayList8, arrayList3, intRef, arrayList2, intRef4, intRef2);
                        }
                        if (!arrayList8.isEmpty()) {
                            intRef2.element += Layout.mo706roundToPx0680j_4(f);
                        }
                        arrayList8.add(placeableMo4993measureBRTryo0);
                        intRef2.element += placeableMo4993measureBRTryo0.getWidth();
                        intRef.element = Math.max(intRef.element, placeableMo4993measureBRTryo0.getHeight());
                        intRef5 = intRef3;
                        arrayList7 = arrayList3;
                        intRef7 = intRef;
                        intRef6 = intRef2;
                        arrayList6 = arrayList2;
                        arrayList4 = arrayList;
                    }
                    final ArrayList arrayList10 = arrayList4;
                    final ArrayList arrayList11 = arrayList6;
                    ArrayList arrayList12 = arrayList7;
                    Ref.IntRef intRef8 = intRef7;
                    Ref.IntRef intRef9 = intRef6;
                    Ref.IntRef intRef10 = intRef5;
                    if (!arrayList8.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList10, intRef10, Layout, f2, arrayList8, arrayList12, intRef8, arrayList11, intRef4, intRef9);
                    }
                    final int iMax = Math.max(intRef4.element, Constraints.m6072getMinWidthimpl(j));
                    int iMax2 = Math.max(intRef10.element, Constraints.m6071getMinHeightimpl(j));
                    final float f3 = f;
                    return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope layout = placementScope;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<List<Placeable>> list = arrayList10;
                            MeasureScope measureScope2 = measureScope;
                            float f4 = f3;
                            int i3 = iMax;
                            List<Integer> list2 = arrayList11;
                            int i4 = 0;
                            for (Object obj : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                List list3 = (List) obj;
                                int size = list3.size();
                                int[] iArr = new int[size];
                                int i6 = 0;
                                while (i6 < size) {
                                    iArr[i6] = ((Placeable) list3.get(i6)).getWidth() + (i6 < CollectionsKt.getLastIndex(list3) ? measureScope2.mo706roundToPx0680j_4(f4) : 0);
                                    i6++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size];
                                for (int i7 = 0; i7 < size; i7++) {
                                    iArr2[i7] = 0;
                                }
                                bottom.arrange(measureScope2, i3, iArr, iArr2);
                                int i8 = 0;
                                for (Object obj2 : list3) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Placeable.PlacementScope.place$default(layout, (Placeable) obj2, iArr2[i8], list2.get(i4).intValue(), 0.0f, 4, null);
                                    layout = placementScope;
                                    i8 = i9;
                                    iArr2 = iArr2;
                                }
                                layout = placementScope;
                                i4 = i5;
                            }
                        }
                    }, 4, null);
                }

                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                    return list.isEmpty() || (intRef.element + measureScope.mo706roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m6070getMaxWidthimpl(j);
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        intRef.element += measureScope.mo706roundToPx0680j_4(f3);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(intRef2.element));
                    list4.add(Integer.valueOf(intRef.element));
                    intRef.element += intRef2.element;
                    intRef3.element = Math.max(intRef3.element, intRef4.element);
                    list2.clear();
                    intRef4.element = 0;
                    intRef2.element = 0;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2907L7,75@2962L7,76@3021L7,77@3033L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                AlertDialogKt.m2118AlertDialogFlowRowixp7dh8(f, f2, content, composer2, i | 1);
            }
        });
    }

    static {
        float f = 24;
        DialogPadding = PaddingKt.m1013PaddingValues0680j_4(Dp.m6117constructorimpl(f));
        float f2 = 16;
        IconPadding = PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f2), 7, null);
        TitlePadding = PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f2), 7, null);
        TextPadding = PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f), 7, null);
    }
}
