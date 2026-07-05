package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001au\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        Shape shape2;
        CardColors cardColorsM2150cardColorsro_MJ88;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        int i4;
        Shape shape3;
        InteractionSource interactionSource;
        Composer composer2;
        CardElevation cardElevationM2151cardElevationaqJV_2Y;
        Modifier modifier3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        Shape shape4;
        final CardElevation cardElevation4;
        final CardColors cardColors2;
        final Modifier modifier4;
        final Shape shape5;
        final BorderStroke borderStroke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        CardElevation cardElevation5;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1179621553);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Card)P(4,5,1,3)77@3629L5,78@3674L12,79@3732L15,86@3923L30,87@3991L28,88@4062L56,89@4162L57,83@3839L460:Card.kt#uh7d8r");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i7 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                cardColorsM2150cardColorsro_MJ88 = cardColors;
                int i8 = composerStartRestartGroup.changed(cardColorsM2150cardColorsro_MJ88) ? 256 : 128;
                i3 |= i8;
            } else {
                cardColorsM2150cardColorsro_MJ88 = cardColors;
            }
            i3 |= i8;
        } else {
            cardColorsM2150cardColorsro_MJ88 = cardColors;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                Object obj = cardElevation;
                boolean zChanged = composerStartRestartGroup.changed(obj);
                cardElevation5 = obj;
                if (zChanged) {
                    i5 = 2048;
                    cardElevation2 = obj;
                }
                i3 |= i5;
            } else {
                cardElevation5 = cardElevation;
            }
            i5 = 1024;
            cardElevation2 = cardElevation5;
            i3 |= i5;
        } else {
            cardElevation2 = cardElevation;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else {
            if ((57344 & i) == 0) {
                borderStroke2 = borderStroke;
                i3 |= composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    i4 = composerStartRestartGroup.changed(content) ? 131072 : 65536;
                }
                if ((374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) == 0) {
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -113;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 4) == 0) {
                            interactionSource = null;
                            composer2 = composerStartRestartGroup;
                            cardColorsM2150cardColorsro_MJ88 = CardDefaults.INSTANCE.m2150cardColorsro_MJ88(0L, 0L, 0L, 0L, composer2, 24576, 15);
                            i3 &= -897;
                        } else {
                            interactionSource = null;
                            composer2 = composerStartRestartGroup;
                        }
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup = composer2;
                            cardElevationM2151cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            composerStartRestartGroup = composer2;
                            cardElevationM2151cardElevationaqJV_2Y = cardElevation;
                        }
                        CardElevation cardElevation6 = cardElevationM2151cardElevationaqJV_2Y;
                        modifier3 = companion;
                        cardElevation3 = cardElevation6;
                        if (i9 == 0) {
                            shape4 = shape3;
                            borderStroke3 = interactionSource;
                        } else {
                            borderStroke3 = borderStroke;
                            shape4 = shape3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        cardElevation3 = cardElevation2;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                        shape4 = shape2;
                        interactionSource = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1179621553, i3, -1, "androidx.compose.material3.Card (Card.kt:75)");
                    }
                    int i10 = i3 >> 3;
                    int i11 = (i10 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6;
                    int i12 = (i10 & 896) | 54;
                    Composer composer3 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier3, shape4, cardColorsM2150cardColorsro_MJ88.containerColor$material3_release(true, composerStartRestartGroup, i11).getValue().m3667unboximpl(), cardColorsM2150cardColorsro_MJ88.contentColor$material3_release(true, composerStartRestartGroup, i11).getValue().m3667unboximpl(), cardElevation3.tonalElevation$material3_release(true, interactionSource, composerStartRestartGroup, i12).getValue().m6131unboximpl(), cardElevation3.shadowElevation$material3_release(true, interactionSource, composerStartRestartGroup, i12).getValue().m6131unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.1
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

                        public final void invoke(Composer composer4, int i13) {
                            ComposerKt.sourceInformation(composer4, "C92@4268L25:Card.kt#uh7d8r");
                            if ((i13 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(664103990, i13, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i14 = (i3 >> 6) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer4.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            Density density = (Density) objConsume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer4.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume3 = composer4.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer4);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer4.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            composer4.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer3, 12582912 | (i3 & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 << 6) & 3670016), 0);
                    composerStartRestartGroup = composer3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cardElevation4 = cardElevation3;
                    cardColors2 = cardColorsM2150cardColorsro_MJ88;
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke4 = borderStroke3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    shape5 = shape2;
                    cardColors2 = cardColorsM2150cardColorsro_MJ88;
                    cardElevation4 = cardElevation2;
                    borderStroke4 = borderStroke2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.2
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

                    public final void invoke(Composer composer4, int i13) {
                        CardKt.Card(modifier4, shape5, cardColors2, cardElevation4, borderStroke4, content, composer4, i | 1, i2);
                    }
                });
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i4;
            if ((374491 & i3) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    CardElevation cardElevation62 = cardElevationM2151cardElevationaqJV_2Y;
                    modifier3 = companion;
                    cardElevation3 = cardElevation62;
                    if (i9 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3 >> 3;
                    int i112 = (i102 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6;
                    int i122 = (i102 & 896) | 54;
                    Composer composer32 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier3, shape4, cardColorsM2150cardColorsro_MJ88.containerColor$material3_release(true, composerStartRestartGroup, i112).getValue().m3667unboximpl(), cardColorsM2150cardColorsro_MJ88.contentColor$material3_release(true, composerStartRestartGroup, i112).getValue().m3667unboximpl(), cardElevation3.tonalElevation$material3_release(true, interactionSource, composerStartRestartGroup, i122).getValue().m6131unboximpl(), cardElevation3.shadowElevation$material3_release(true, interactionSource, composerStartRestartGroup, i122).getValue().m6131unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.1
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

                        public final void invoke(Composer composer4, int i13) {
                            ComposerKt.sourceInformation(composer4, "C92@4268L25:Card.kt#uh7d8r");
                            if ((i13 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(664103990, i13, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i14 = (i3 >> 6) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer4.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            Density density = (Density) objConsume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer4.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume3 = composer4.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer4);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer4.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            composer4.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer32, 12582912 | (i3 & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 << 6) & 3670016), 0);
                    composerStartRestartGroup = composer32;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cardElevation4 = cardElevation3;
                    cardColors2 = cardColorsM2150cardColorsro_MJ88;
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke4 = borderStroke3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        borderStroke2 = borderStroke;
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        if ((374491 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        Composer composer2;
        int i7;
        CardColors cardColorsM2150cardColorsro_MJ88;
        CardElevation cardElevationM2151cardElevationaqJV_2Y;
        int i8;
        MutableInteractionSource mutableInteractionSource3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        Shape shape4;
        CardColors cardColors3;
        Composer composer3;
        final Shape shape5;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final CardElevation cardElevation4;
        final CardColors cardColors4;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024281376);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Card)P(7,6,4,8,1,3!1,5)135@6366L5,136@6411L12,137@6469L15,139@6570L39,147@6805L23,148@6866L21,149@6930L42,150@7016L43,142@6667L519:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i11 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i12 = composerStartRestartGroup.changed(cardColors2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i3 |= i12;
                } else {
                    cardColors2 = cardColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        int i13 = composerStartRestartGroup.changed(cardElevation2) ? 131072 : 65536;
                        i3 |= i13;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i3 |= i13;
                } else {
                    cardElevation2 = cardElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((3670016 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i & 29360128) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) != 0) {
                        i9 = (i & 234881024) == 0 ? composerStartRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                        if ((191739611 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i4 == 0 ? true : z2;
                                if ((i2 & 8) == 0) {
                                    i3 &= -7169;
                                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                int i14 = i3;
                                if ((i2 & 16) == 0) {
                                    i7 = i6;
                                    composer2 = composerStartRestartGroup;
                                    i14 &= -57345;
                                    cardColorsM2150cardColorsro_MJ88 = CardDefaults.INSTANCE.m2150cardColorsro_MJ88(0L, 0L, 0L, 0L, composer2, 24576, 15);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    i7 = i6;
                                    cardColorsM2150cardColorsro_MJ88 = cardColors2;
                                }
                                if ((i2 & 32) == 0) {
                                    Composer composer4 = composer2;
                                    cardElevationM2151cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer4, 1572864, 63);
                                    composer2 = composer4;
                                    i8 = i14 & (-458753);
                                } else {
                                    cardElevationM2151cardElevationaqJV_2Y = cardElevation;
                                    i8 = i14;
                                }
                                BorderStroke borderStroke5 = i5 == 0 ? null : borderStroke;
                                if (i7 != 0) {
                                    composer2.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                cardElevation3 = cardElevationM2151cardElevationaqJV_2Y;
                                i3 = i8;
                                borderStroke3 = borderStroke5;
                                z2 = z4;
                                shape4 = shape3;
                                modifier2 = companion;
                                cardColors3 = cardColorsM2150cardColorsro_MJ88;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                shape4 = shape2;
                                cardColors3 = cardColors2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                composer2 = composerStartRestartGroup;
                                cardElevation3 = cardElevation2;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2024281376, i3, -1, "androidx.compose.material3.Card (Card.kt:131)");
                            }
                            int i15 = (i3 >> 6) & 14;
                            int i16 = i3 >> 9;
                            int i17 = (i16 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i15;
                            long jM3667unboximpl = cardColors3.containerColor$material3_release(z2, composer2, i17).getValue().m3667unboximpl();
                            long jM3667unboximpl2 = cardColors3.contentColor$material3_release(z2, composer2, i17).getValue().m3667unboximpl();
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            int i18 = i15 | ((i3 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i16 & 896);
                            float fM6131unboximpl = cardElevation3.tonalElevation$material3_release(z2, mutableInteractionSource5, composer2, i18).getValue().m6131unboximpl();
                            float fM6131unboximpl2 = cardElevation3.shadowElevation$material3_release(z2, mutableInteractionSource5, composer2, i18).getValue().m6131unboximpl();
                            CardColors cardColors5 = cardColors3;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 776921067, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.4
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

                                public final void invoke(Composer composer5, int i19) {
                                    ComposerKt.sourceInformation(composer5, "C154@7155L25:Card.kt#uh7d8r");
                                    if ((i19 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(776921067, i19, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i20 = (i3 >> 15) & 7168;
                                    composer5.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer5.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer5.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer5.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    composer5.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer5.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    composer5.startReplaceableGroup(-1163856341);
                                    ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                    function3.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i19 = i3 & 8190;
                            int i20 = i3 << 6;
                            int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
                            CardElevation cardElevation5 = cardElevation3;
                            boolean z5 = z2;
                            Composer composer5 = composer2;
                            Modifier modifier4 = modifier2;
                            SurfaceKt.m2460Surfaceo_FOJdg(onClick, modifier4, z5, shape4, jM3667unboximpl, jM3667unboximpl2, fM6131unboximpl, fM6131unboximpl2, borderStroke3, mutableInteractionSource3, composableLambda, composer5, i21, 6, 0);
                            composer3 = composer5;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape5 = shape4;
                            borderStroke4 = borderStroke3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            cardElevation4 = cardElevation5;
                            cardColors4 = cardColors5;
                            z3 = z5;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource4 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            z3 = z2;
                            shape5 = shape2;
                            cardColors4 = cardColors2;
                            cardElevation4 = cardElevation2;
                            borderStroke4 = borderStroke2;
                            composer3 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i22) {
                                CardKt.Card(onClick, modifier3, z3, shape5, cardColors4, cardElevation4, borderStroke4, mutableInteractionSource4, content, composer6, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i9;
                    if ((191739611 & i3) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 8) == 0) {
                            }
                            int i142 = i3;
                            if ((i2 & 16) == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            cardElevation3 = cardElevationM2151cardElevationaqJV_2Y;
                            i3 = i8;
                            borderStroke3 = borderStroke5;
                            z2 = z4;
                            shape4 = shape3;
                            modifier2 = companion;
                            cardColors3 = cardColorsM2150cardColorsro_MJ88;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i152 = (i3 >> 6) & 14;
                            int i162 = i3 >> 9;
                            int i172 = (i162 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i152;
                            long jM3667unboximpl3 = cardColors3.containerColor$material3_release(z2, composer2, i172).getValue().m3667unboximpl();
                            long jM3667unboximpl22 = cardColors3.contentColor$material3_release(z2, composer2, i172).getValue().m3667unboximpl();
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                            int i182 = i152 | ((i3 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i162 & 896);
                            float fM6131unboximpl3 = cardElevation3.tonalElevation$material3_release(z2, mutableInteractionSource52, composer2, i182).getValue().m6131unboximpl();
                            float fM6131unboximpl22 = cardElevation3.shadowElevation$material3_release(z2, mutableInteractionSource52, composer2, i182).getValue().m6131unboximpl();
                            CardColors cardColors52 = cardColors3;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, 776921067, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.Card.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer52, Integer num) {
                                    invoke(composer52, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer52, int i192) {
                                    ComposerKt.sourceInformation(composer52, "C154@7155L25:Card.kt#uh7d8r");
                                    if ((i192 & 11) == 2 && composer52.getSkipping()) {
                                        composer52.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(776921067, i192, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i202 = (i3 >> 15) & 7168;
                                    composer52.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer52, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer52, 0);
                                    composer52.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer52, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer52, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer52.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer52, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer52.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer52, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer52.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                                    if (!(composer52.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer52.startReusableNode();
                                    if (composer52.getInserting()) {
                                        composer52.createNode(constructor);
                                    } else {
                                        composer52.useNode();
                                    }
                                    composer52.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer52);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer52.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer52)), composer52, 0);
                                    composer52.startReplaceableGroup(2058660585);
                                    composer52.startReplaceableGroup(-1163856341);
                                    ComposerKt.sourceInformation(composer52, "C79@3994L9:Column.kt#2w3rfo");
                                    function3.invoke(ColumnScopeInstance.INSTANCE, composer52, Integer.valueOf(((i202 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                    composer52.endReplaceableGroup();
                                    composer52.endReplaceableGroup();
                                    composer52.endNode();
                                    composer52.endReplaceableGroup();
                                    composer52.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i192 = i3 & 8190;
                            int i202 = i3 << 6;
                            int i212 = i192 | (i202 & 234881024) | (i202 & 1879048192);
                            CardElevation cardElevation52 = cardElevation3;
                            boolean z52 = z2;
                            Composer composer52 = composer2;
                            Modifier modifier42 = modifier2;
                            SurfaceKt.m2460Surfaceo_FOJdg(onClick, modifier42, z52, shape4, jM3667unboximpl3, jM3667unboximpl22, fM6131unboximpl3, fM6131unboximpl22, borderStroke3, mutableInteractionSource3, composableLambda2, composer52, i212, 6, 0);
                            composer3 = composer52;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape5 = shape4;
                            borderStroke4 = borderStroke3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            cardElevation4 = cardElevation52;
                            cardColors4 = cardColors52;
                            z3 = z52;
                            modifier3 = modifier42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i9;
                if ((191739611 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i9;
            if ((191739611 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i9;
        if ((191739611 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Modifier.Companion companion;
        Shape elevatedShape;
        Composer composer2;
        CardColors cardColorsM2152elevatedCardColorsro_MJ88;
        int i4;
        CardElevation cardElevationM2153elevatedCardElevationaqJV_2Y;
        final CardElevation cardElevation3;
        final CardColors cardColors3;
        final Shape shape3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(895940201);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedCard)P(3,4!1,2)185@8633L13,186@8686L20,187@8752L23,189@8829L140:Card.kt#uh7d8r");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i6 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i6;
            } else {
                shape2 = shape;
            }
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                int i7 = composerStartRestartGroup.changed(cardColors2) ? 256 : 128;
                i3 |= i7;
            } else {
                cardColors2 = cardColors;
            }
            i3 |= i7;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i8 = composerStartRestartGroup.changed(cardElevation2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                cardElevation2 = cardElevation;
            }
            i3 |= i8;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(content) ? 16384 : 8192;
        }
        if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    i3 &= -113;
                } else {
                    elevatedShape = shape2;
                }
                if ((i2 & 4) != 0) {
                    cardColorsM2152elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m2152elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    composer2 = composerStartRestartGroup;
                    i3 &= -897;
                } else {
                    composer2 = composerStartRestartGroup;
                    cardColorsM2152elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i2 & 8) != 0) {
                    i4 = i3 & (-7169);
                    cardElevationM2153elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m2153elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(895940201, i4, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
                }
                Modifier modifier4 = companion;
                Shape shape4 = elevatedShape;
                CardColors cardColors4 = cardColorsM2152elevatedCardColorsro_MJ88;
                Card(modifier4, shape4, cardColors4, cardElevationM2153elevatedCardElevationaqJV_2Y, null, content, composer2, (i4 & 14) | 24576 | (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 896) | (i4 & 7168) | ((i4 << 3) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cardElevation3 = cardElevationM2153elevatedCardElevationaqJV_2Y;
                cardColors3 = cardColors4;
                shape3 = shape4;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                companion = modifier2;
                elevatedShape = shape2;
                composer2 = composerStartRestartGroup;
                cardColorsM2152elevatedCardColorsro_MJ88 = cardColors2;
            }
            i4 = i3;
            cardElevationM2153elevatedCardElevationaqJV_2Y = cardElevation2;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier42 = companion;
            Shape shape42 = elevatedShape;
            CardColors cardColors42 = cardColorsM2152elevatedCardColorsro_MJ88;
            Card(modifier42, shape42, cardColors42, cardElevationM2153elevatedCardElevationaqJV_2Y, null, content, composer2, (i4 & 14) | 24576 | (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 896) | (i4 & 7168) | ((i4 << 3) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            cardElevation3 = cardElevationM2153elevatedCardElevationaqJV_2Y;
            cardColors3 = cardColors42;
            shape3 = shape42;
            modifier3 = modifier42;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            shape3 = shape2;
            composer2 = composerStartRestartGroup;
            cardColors3 = cardColors2;
            cardElevation3 = cardElevation2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.ElevatedCard.1
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

            public final void invoke(Composer composer3, int i9) {
                CardKt.ElevatedCard(modifier3, shape3, cardColors3, cardElevation3, content, composer3, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape elevatedShape;
        CardColors cardColorsM2152elevatedCardColorsro_MJ88;
        CardElevation cardElevation2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        Composer composer2;
        CardElevation cardElevationM2153elevatedCardElevationaqJV_2Y;
        int i6;
        boolean z3;
        CardElevation cardElevation3;
        Shape shape2;
        CardColors cardColors2;
        final MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        final CardElevation cardElevation4;
        final CardColors cardColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850977784);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedCard)P(6,5,3,7!1,2,4)234@10976L13,235@11029L20,236@11095L23,237@11170L39,239@11263L229:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        elevatedShape = shape;
                        int i9 = composerStartRestartGroup.changed(elevatedShape) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        elevatedShape = shape;
                    }
                    i3 |= i9;
                } else {
                    elevatedShape = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColorsM2152elevatedCardColorsro_MJ88 = cardColors;
                        int i10 = composerStartRestartGroup.changed(cardColorsM2152elevatedCardColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        cardColorsM2152elevatedCardColorsro_MJ88 = cardColors;
                    }
                    i3 |= i10;
                } else {
                    cardColorsM2152elevatedCardColorsro_MJ88 = cardColors;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        int i11 = composerStartRestartGroup.changed(cardElevation2) ? 131072 : 65536;
                        i3 |= i11;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i3 |= i11;
                } else {
                    cardElevation2 = cardElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((3670016 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        i7 = (i & 29360128) == 0 ? composerStartRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 16) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i3 &= -57345;
                                    cardColorsM2152elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m2152elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                if ((i2 & 32) == 0) {
                                    cardElevationM2153elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m2153elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                                    composerStartRestartGroup = composer2;
                                    i3 &= -458753;
                                } else {
                                    composerStartRestartGroup = composer2;
                                    cardElevationM2153elevatedCardElevationaqJV_2Y = cardElevation;
                                }
                                if (i5 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean z5 = z2;
                                    i6 = i3;
                                    z3 = z5;
                                    cardElevation3 = cardElevationM2153elevatedCardElevationaqJV_2Y;
                                    shape2 = elevatedShape;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    cardColors2 = cardColorsM2152elevatedCardColorsro_MJ88;
                                } else {
                                    boolean z6 = z2;
                                    i6 = i3;
                                    z3 = z6;
                                    cardElevation3 = cardElevationM2153elevatedCardElevationaqJV_2Y;
                                    shape2 = elevatedShape;
                                    cardColors2 = cardColorsM2152elevatedCardColorsro_MJ88;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                boolean z7 = z2;
                                i6 = i3;
                                z3 = z7;
                                companion = modifier2;
                                shape2 = elevatedShape;
                                cardColors2 = cardColorsM2152elevatedCardColorsro_MJ88;
                                cardElevation3 = cardElevation2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1850977784, i6, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                            }
                            int i12 = (i6 & 14) | 1572864 | (i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752);
                            int i13 = i6 << 3;
                            Card(onClick, companion, z3, shape2, cardColors2, cardElevation3, null, mutableInteractionSource3, content, composerStartRestartGroup, i12 | (i13 & 29360128) | (i13 & 234881024), 0);
                            composer3 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            cardElevation4 = cardElevation3;
                            cardColors3 = cardColors2;
                            shape3 = shape2;
                            z4 = z3;
                            modifier3 = companion;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z4 = z2;
                            shape3 = elevatedShape;
                            composer3 = composerStartRestartGroup;
                            cardColors3 = cardColorsM2152elevatedCardColorsro_MJ88;
                            cardElevation4 = cardElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.ElevatedCard.3
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
                                CardKt.ElevatedCard(onClick, modifier3, z4, shape3, cardColors3, cardElevation4, mutableInteractionSource3, content, composer4, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((23967451 & i3) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = (i6 & 14) | 1572864 | (i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752);
                            int i132 = i6 << 3;
                            Card(onClick, companion, z3, shape2, cardColors2, cardElevation3, null, mutableInteractionSource3, content, composerStartRestartGroup, i122 | (i132 & 29360128) | (i132 & 234881024), 0);
                            composer3 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            cardElevation4 = cardElevation3;
                            cardColors3 = cardColors2;
                            shape3 = shape2;
                            z4 = z3;
                            modifier3 = companion;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) != 0) {
                }
                i3 |= i7;
                if ((23967451 & i3) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) != 0) {
            }
            i3 |= i7;
            if ((23967451 & i3) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) != 0) {
        }
        i3 |= i7;
        if ((23967451 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColorsM2154outlinedCardColorsro_MJ88;
        CardElevation cardElevationM2155outlinedCardElevationaqJV_2Y;
        BorderStroke borderStroke2;
        int i4;
        Modifier.Companion companion;
        Shape outlinedShape;
        Composer composer2;
        int i5;
        CardElevation cardElevation2;
        BorderStroke borderStrokeOutlinedCardBorder;
        Composer composer3;
        final BorderStroke borderStroke3;
        final CardElevation cardElevation3;
        final CardColors cardColors2;
        final Shape shape3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(740336179);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedCard)P(4,5,1,3)279@13027L13,280@13080L20,281@13146L23,282@13211L20,284@13285L142:Card.kt#uh7d8r");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i7 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
                int i8 = composerStartRestartGroup.changed(cardColorsM2154outlinedCardColorsro_MJ88) ? 256 : 128;
                i3 |= i8;
            } else {
                cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
            }
            i3 |= i8;
        } else {
            cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
                int i9 = composerStartRestartGroup.changed(cardElevationM2155outlinedCardElevationaqJV_2Y) ? 2048 : 1024;
                i3 |= i9;
            } else {
                cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
            }
            i3 |= i9;
        } else {
            cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                borderStroke2 = borderStroke;
                int i10 = composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                i3 |= i10;
            } else {
                borderStroke2 = borderStroke;
            }
            i3 |= i10;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = composerStartRestartGroup.changed(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) == 0) {
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i2 & 4) == 0) {
                        composer2 = composerStartRestartGroup;
                        i3 &= -897;
                        cardColorsM2154outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m2154outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup = composer2;
                        i3 &= -7169;
                        cardElevationM2155outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m2155outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                    } else {
                        composerStartRestartGroup = composer2;
                    }
                    if ((i2 & 16) == 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                        CardElevation cardElevation4 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                        i5 = i3 & (-57345);
                        cardElevation2 = cardElevation4;
                    } else {
                        CardElevation cardElevation5 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                        i5 = i3;
                        cardElevation2 = cardElevation5;
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    CardElevation cardElevation6 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                    i5 = i3;
                    cardElevation2 = cardElevation6;
                    companion = modifier2;
                    outlinedShape = shape2;
                    borderStrokeOutlinedCardBorder = borderStroke2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(740336179, i5, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
                }
                CardColors cardColors3 = cardColorsM2154outlinedCardColorsro_MJ88;
                Modifier modifier4 = companion;
                Shape shape4 = outlinedShape;
                Card(modifier4, shape4, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, content, composerStartRestartGroup, 524286 & i5, 0);
                composer3 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                borderStroke3 = borderStrokeOutlinedCardBorder;
                cardElevation3 = cardElevation2;
                cardColors2 = cardColors3;
                shape3 = shape4;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                composer3 = composerStartRestartGroup;
                cardColors2 = cardColorsM2154outlinedCardColorsro_MJ88;
                cardElevation3 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                borderStroke3 = borderStroke2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.OutlinedCard.1
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

                public final void invoke(Composer composer4, int i11) {
                    CardKt.OutlinedCard(modifier3, shape3, cardColors2, cardElevation3, borderStroke3, content, composer4, i | 1, i2);
                }
            });
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                CardColors cardColors32 = cardColorsM2154outlinedCardColorsro_MJ88;
                Modifier modifier42 = companion;
                Shape shape42 = outlinedShape;
                Card(modifier42, shape42, cardColors32, cardElevation2, borderStrokeOutlinedCardBorder, content, composerStartRestartGroup, 524286 & i5, 0);
                composer3 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                borderStroke3 = borderStrokeOutlinedCardBorder;
                cardElevation3 = cardElevation2;
                cardColors2 = cardColors32;
                shape3 = shape42;
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape outlinedShape;
        CardColors cardColorsM2154outlinedCardColorsro_MJ88;
        CardElevation cardElevationM2155outlinedCardElevationaqJV_2Y;
        BorderStroke borderStroke2;
        int i5;
        Composer composer2;
        int i6;
        BorderStroke borderStrokeOutlinedCardBorder;
        int i7;
        Modifier modifier3;
        boolean z3;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke3;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer3;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke4;
        final CardElevation cardElevation3;
        final CardColors cardColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-727137250);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedCard)P(7,6,4,8,1,3!1,5)330@15524L13,331@15577L20,332@15643L23,333@15708L27,334@15787L39,336@15880L231:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        outlinedShape = shape;
                        int i10 = composerStartRestartGroup.changed(outlinedShape) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        outlinedShape = shape;
                    }
                    i3 |= i10;
                } else {
                    outlinedShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
                        int i11 = composerStartRestartGroup.changed(cardColorsM2154outlinedCardColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
                    }
                    i3 |= i11;
                } else {
                    cardColorsM2154outlinedCardColorsro_MJ88 = cardColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
                        int i12 = composerStartRestartGroup.changed(cardElevationM2155outlinedCardElevationaqJV_2Y) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
                    }
                    i3 |= i12;
                } else {
                    cardElevationM2155outlinedCardElevationaqJV_2Y = cardElevation;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        int i13 = composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        i3 |= i13;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i3 |= i13;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    i8 = (234881024 & i) == 0 ? composerStartRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                            }
                            if ((i2 & 16) == 0) {
                                i6 = i5;
                                composer2 = composerStartRestartGroup;
                                i3 &= -57345;
                                cardColorsM2154outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m2154outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                composer2 = composerStartRestartGroup;
                                i6 = i5;
                            }
                            if ((i2 & 32) == 0) {
                                composerStartRestartGroup = composer2;
                                i3 &= -458753;
                                cardElevationM2155outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m2155outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                            } else {
                                composerStartRestartGroup = composer2;
                            }
                            if ((i2 & 64) == 0) {
                                borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                                i3 = (-3670017) & i3;
                            } else {
                                borderStrokeOutlinedCardBorder = borderStroke;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Shape shape4 = outlinedShape;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                i7 = i3;
                                z3 = z2;
                                borderStroke3 = borderStrokeOutlinedCardBorder;
                                shape2 = shape4;
                                modifier3 = modifier2;
                                cardColors2 = cardColorsM2154outlinedCardColorsro_MJ88;
                                cardElevation2 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-727137250, i7, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                                }
                                Card(onClick, modifier3, z3, shape2, cardColors2, cardElevation2, borderStroke3, mutableInteractionSource2, content, composerStartRestartGroup, 268435454 & i7, 0);
                                composer3 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                borderStroke4 = borderStroke3;
                                cardElevation3 = cardElevation2;
                                cardColors3 = cardColors2;
                                shape3 = shape2;
                                z4 = z3;
                                modifier4 = modifier3;
                            } else {
                                i7 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                cardColors2 = cardColorsM2154outlinedCardColorsro_MJ88;
                                cardElevation2 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                                borderStroke3 = borderStrokeOutlinedCardBorder;
                                shape2 = outlinedShape;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            i7 = i3;
                            modifier3 = modifier2;
                            z3 = z2;
                            shape2 = outlinedShape;
                            cardColors2 = cardColorsM2154outlinedCardColorsro_MJ88;
                            cardElevation2 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                            borderStroke3 = borderStroke2;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Card(onClick, modifier3, z3, shape2, cardColors2, cardElevation2, borderStroke3, mutableInteractionSource2, content, composerStartRestartGroup, 268435454 & i7, 0);
                        composer3 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke4 = borderStroke3;
                        cardElevation3 = cardElevation2;
                        cardColors3 = cardColors2;
                        shape3 = shape2;
                        z4 = z3;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier2;
                        z4 = z2;
                        shape3 = outlinedShape;
                        composer3 = composerStartRestartGroup;
                        cardColors3 = cardColorsM2154outlinedCardColorsro_MJ88;
                        cardElevation3 = cardElevationM2155outlinedCardElevationaqJV_2Y;
                        borderStroke4 = borderStroke2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt.OutlinedCard.3
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
                            CardKt.OutlinedCard(onClick, modifier4, z4, shape3, cardColors3, cardElevation3, borderStroke4, mutableInteractionSource3, content, composer4, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i8;
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i6 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((191739611 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((191739611 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
