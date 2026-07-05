package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0340  */
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
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        PaddingValues contentPadding;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        int i9;
        int i10;
        ButtonColors buttonColorsM2138buttonColorsro_MJ88;
        ButtonElevation buttonElevationM2139buttonElevationR_JCAzs;
        PaddingValues paddingValues2;
        ButtonColors buttonColors3;
        boolean z3;
        Shape shape3;
        BorderStroke borderStroke3;
        int i11;
        ButtonElevation buttonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        final Shape shape4;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final PaddingValues paddingValues3;
        final ButtonColors buttonColors4;
        final ButtonElevation buttonElevation3;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(650121315);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Button)P(8,7,5,9,1,4!1,3,6)120@6345L5,121@6394L14,122@6459L17,125@6629L39,128@6751L23,129@6811L21,132@7033L1012:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
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
                        int i14 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i15 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((458752 & i) == 0) {
                    i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(buttonElevation)) ? 131072 : 65536;
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
                        contentPadding = paddingValues;
                    } else {
                        contentPadding = paddingValues;
                        if ((i & 29360128) == 0) {
                            i3 |= composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 234881024) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            i12 = (i & 1879048192) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                            if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape2 = ButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    }
                                    if ((i2 & 16) == 0) {
                                        composer2 = composerStartRestartGroup;
                                        i9 = i6;
                                        i10 = i8;
                                        buttonColorsM2138buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2138buttonColorsro_MJ88(0L, 0L, 0L, 0L, composer2, 24576, 15);
                                        i3 &= -57345;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        i9 = i6;
                                        i10 = i8;
                                        buttonColorsM2138buttonColorsro_MJ88 = buttonColors2;
                                    }
                                    if ((i2 & 32) == 0) {
                                        Composer composer4 = composer2;
                                        buttonElevationM2139buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m2139buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                        composerStartRestartGroup = composer4;
                                        i3 &= -458753;
                                    } else {
                                        composerStartRestartGroup = composer2;
                                        buttonElevationM2139buttonElevationR_JCAzs = buttonElevation;
                                    }
                                    BorderStroke borderStroke5 = i5 == 0 ? null : borderStroke;
                                    if (i9 != 0) {
                                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    }
                                    if (i10 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        ButtonElevation buttonElevation4 = buttonElevationM2139buttonElevationR_JCAzs;
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                        buttonColors3 = buttonColorsM2138buttonColorsro_MJ88;
                                        i11 = i3;
                                        buttonElevation2 = buttonElevation4;
                                        paddingValues2 = contentPadding;
                                        z3 = z2;
                                        shape3 = shape2;
                                        borderStroke3 = borderStroke5;
                                    } else {
                                        paddingValues2 = contentPadding;
                                        buttonColors3 = buttonColorsM2138buttonColorsro_MJ88;
                                        z3 = z2;
                                        shape3 = shape2;
                                        borderStroke3 = borderStroke5;
                                        i11 = i3;
                                        buttonElevation2 = buttonElevationM2139buttonElevationR_JCAzs;
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
                                    paddingValues2 = contentPadding;
                                    i11 = i3;
                                    z3 = z2;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    borderStroke3 = borderStroke2;
                                    buttonElevation2 = buttonElevation;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(650121315, i11, -1, "androidx.compose.material3.Button (Button.kt:116)");
                                }
                                int i16 = (i11 >> 6) & 14;
                                int i17 = i11 >> 9;
                                int i18 = (i17 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i16;
                                long jM3667unboximpl = buttonColors3.containerColor$material3_release(z3, composerStartRestartGroup, i18).getValue().m3667unboximpl();
                                final long jM3667unboximpl2 = buttonColors3.contentColor$material3_release(z3, composerStartRestartGroup, i18).getValue().m3667unboximpl();
                                composerStartRestartGroup.startReplaceableGroup(823570087);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "130@6876L43");
                                State<Dp> stateShadowElevation$material3_release = buttonElevation2 != null ? null : buttonElevation2.shadowElevation$material3_release(z3, mutableInteractionSource3, composerStartRestartGroup, i16 | ((i11 >> 21) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i17 & 896));
                                composerStartRestartGroup.endReplaceableGroup();
                                float fM6131unboximpl = stateShadowElevation$material3_release == null ? stateShadowElevation$material3_release.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0);
                                composerStartRestartGroup.startReplaceableGroup(823570182);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "131@6971L42");
                                State<Dp> state = buttonElevation2 != null ? buttonElevation2.tonalElevation$material3_release(z3, mutableInteractionSource3, composerStartRestartGroup, i16 | ((i11 >> 21) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i17 & 896)) : null;
                                composerStartRestartGroup.endReplaceableGroup();
                                float fM6131unboximpl2 = state == null ? state.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0);
                                final PaddingValues paddingValues4 = paddingValues2;
                                final int i19 = i11;
                                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2
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

                                    public final void invoke(Composer composer5, int i20) {
                                        ComposerKt.sourceInformation(composer5, "C144@7388L651:Button.kt#uh7d8r");
                                        if ((i20 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(956488494, i20, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:143)");
                                            }
                                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(jM3667unboximpl2))};
                                            final PaddingValues paddingValues5 = paddingValues4;
                                            final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            final int i21 = i19;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582292974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
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
                                                    ComposerKt.sourceInformation(composer6, "C145@7507L10,145@7468L561:Button.kt#uh7d8r");
                                                    if ((i22 & 11) != 2 || !composer6.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1582292974, i22, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:144)");
                                                        }
                                                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer6, 6).getLabelLarge();
                                                        final PaddingValues paddingValues6 = paddingValues5;
                                                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                        final int i23 = i21;
                                                        TextKt.ProvideTextStyle(labelLarge, ComposableLambdaKt.composableLambda(composer6, -2136309793, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                invoke(composer7, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer7, int i24) {
                                                                ComposerKt.sourceInformation(composer7, "C146@7548L467:Button.kt#uh7d8r");
                                                                if ((i24 & 11) != 2 || !composer7.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-2136309793, i24, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:145)");
                                                                    }
                                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1049defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2147getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2146getMinHeightD9Ej5fM()), paddingValues6);
                                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                    int i25 = ((i23 >> 18) & 7168) | 432;
                                                                    composer7.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer7, 54);
                                                                    composer7.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume = composer7.consume(localDensity);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    Density density = (Density) objConsume;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume2 = composer7.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume3 = composer7.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer7.startReusableNode();
                                                                    if (composer7.getInserting()) {
                                                                        composer7.createNode(constructor);
                                                                    } else {
                                                                        composer7.useNode();
                                                                    }
                                                                    composer7.disableReusing();
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer7);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer7.enableReusing();
                                                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer7)), composer7, 0);
                                                                    composer7.startReplaceableGroup(2058660585);
                                                                    composer7.startReplaceableGroup(-678309503);
                                                                    ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                                    function33.invoke(RowScopeInstance.INSTANCE, composer7, Integer.valueOf(((i25 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endNode();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer7.skipToGroupEnd();
                                                            }
                                                        }), composer6, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer6.skipToGroupEnd();
                                                }
                                            }), composer5, 56);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                };
                                ButtonColors buttonColors5 = buttonColors3;
                                float f = fM6131unboximpl;
                                Modifier modifier4 = modifier2;
                                ButtonElevation buttonElevation5 = buttonElevation2;
                                SurfaceKt.m2460Surfaceo_FOJdg(onClick, modifier4, z3, shape3, jM3667unboximpl, jM3667unboximpl2, fM6131unboximpl2, f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956488494, true, function2), composerStartRestartGroup, (i19 & 8190) | ((i19 << 6) & 234881024) | ((i19 << 3) & 1879048192), 6, 0);
                                composer3 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                paddingValues3 = paddingValues4;
                                buttonColors4 = buttonColors5;
                                buttonElevation3 = buttonElevation5;
                                z4 = z3;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                boolean z5 = z2;
                                paddingValues3 = contentPadding;
                                z4 = z5;
                                modifier3 = modifier2;
                                shape4 = shape2;
                                buttonColors4 = buttonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                composer3 = composerStartRestartGroup;
                                borderStroke4 = borderStroke2;
                                buttonElevation3 = buttonElevation;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3
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

                                public final void invoke(Composer composer5, int i20) {
                                    ButtonKt.Button(onClick, modifier3, z4, shape4, buttonColors4, buttonElevation3, borderStroke4, paddingValues3, mutableInteractionSource4, content, composer5, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i12;
                        if ((1533916891 & i3) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
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
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i162 = (i11 >> 6) & 14;
                                int i172 = i11 >> 9;
                                int i182 = (i172 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i162;
                                long jM3667unboximpl3 = buttonColors3.containerColor$material3_release(z3, composerStartRestartGroup, i182).getValue().m3667unboximpl();
                                final long jM3667unboximpl22 = buttonColors3.contentColor$material3_release(z3, composerStartRestartGroup, i182).getValue().m3667unboximpl();
                                composerStartRestartGroup.startReplaceableGroup(823570087);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "130@6876L43");
                                if (buttonElevation2 != null) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                if (stateShadowElevation$material3_release == null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(823570182);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "131@6971L42");
                                if (buttonElevation2 != null) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                if (state == null) {
                                }
                                final PaddingValues paddingValues42 = paddingValues2;
                                final int i192 = i11;
                                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2
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

                                    public final void invoke(Composer composer5, int i20) {
                                        ComposerKt.sourceInformation(composer5, "C144@7388L651:Button.kt#uh7d8r");
                                        if ((i20 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(956488494, i20, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:143)");
                                            }
                                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(jM3667unboximpl22))};
                                            final PaddingValues paddingValues5 = paddingValues42;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                            final int i21 = i192;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582292974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
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
                                                    ComposerKt.sourceInformation(composer6, "C145@7507L10,145@7468L561:Button.kt#uh7d8r");
                                                    if ((i22 & 11) != 2 || !composer6.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1582292974, i22, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:144)");
                                                        }
                                                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer6, 6).getLabelLarge();
                                                        final PaddingValues paddingValues6 = paddingValues5;
                                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                                        final int i23 = i21;
                                                        TextKt.ProvideTextStyle(labelLarge, ComposableLambdaKt.composableLambda(composer6, -2136309793, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                invoke(composer7, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer7, int i24) {
                                                                ComposerKt.sourceInformation(composer7, "C146@7548L467:Button.kt#uh7d8r");
                                                                if ((i24 & 11) != 2 || !composer7.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-2136309793, i24, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:145)");
                                                                    }
                                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1049defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2147getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2146getMinHeightD9Ej5fM()), paddingValues6);
                                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                    int i25 = ((i23 >> 18) & 7168) | 432;
                                                                    composer7.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer7, 54);
                                                                    composer7.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume = composer7.consume(localDensity);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    Density density = (Density) objConsume;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume2 = composer7.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object objConsume3 = composer7.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer7.startReusableNode();
                                                                    if (composer7.getInserting()) {
                                                                        composer7.createNode(constructor);
                                                                    } else {
                                                                        composer7.useNode();
                                                                    }
                                                                    composer7.disableReusing();
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer7);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer7.enableReusing();
                                                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer7)), composer7, 0);
                                                                    composer7.startReplaceableGroup(2058660585);
                                                                    composer7.startReplaceableGroup(-678309503);
                                                                    ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                                    function33.invoke(RowScopeInstance.INSTANCE, composer7, Integer.valueOf(((i25 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endNode();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer7.skipToGroupEnd();
                                                            }
                                                        }), composer6, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer6.skipToGroupEnd();
                                                }
                                            }), composer5, 56);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                };
                                ButtonColors buttonColors52 = buttonColors3;
                                float f2 = fM6131unboximpl;
                                Modifier modifier42 = modifier2;
                                ButtonElevation buttonElevation52 = buttonElevation2;
                                SurfaceKt.m2460Surfaceo_FOJdg(onClick, modifier42, z3, shape3, jM3667unboximpl3, jM3667unboximpl22, fM6131unboximpl2, f2, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956488494, true, function22), composerStartRestartGroup, (i192 & 8190) | ((i192 << 6) & 234881024) | ((i192 << 3) & 1879048192), 6, 0);
                                composer3 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                paddingValues3 = paddingValues42;
                                buttonColors4 = buttonColors52;
                                buttonElevation3 = buttonElevation52;
                                z4 = z3;
                                modifier3 = modifier42;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 512) == 0) {
                    }
                    i3 |= i12;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 512) == 0) {
                }
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
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
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 512) == 0) {
            }
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
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
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 512) == 0) {
        }
        i3 |= i12;
        if ((1533916891 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0273  */
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
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape elevatedShape;
        ButtonColors buttonColorsM2140elevatedButtonColorsro_MJ88;
        ButtonElevation buttonElevationM2141elevatedButtonElevationR_JCAzs;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        BorderStroke borderStroke3;
        int i9;
        boolean z3;
        Shape shape2;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer3;
        final MutableInteractionSource mutableInteractionSource3;
        final PaddingValues paddingValues3;
        final BorderStroke borderStroke4;
        final ButtonElevation buttonElevation3;
        final ButtonColors buttonColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1466887385);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedButton)P(8,7,5,9,1,4!1,3,6)211@10912L13,212@10969L22,213@11042L25,216@11220L39,219@11314L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                        int i12 = composerStartRestartGroup.changed(elevatedShape) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        elevatedShape = shape;
                    }
                    i3 |= i12;
                } else {
                    elevatedShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsM2140elevatedButtonColorsro_MJ88 = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColorsM2140elevatedButtonColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColorsM2140elevatedButtonColorsro_MJ88 = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColorsM2140elevatedButtonColorsro_MJ88 = buttonColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM2141elevatedButtonElevationR_JCAzs = buttonElevation;
                        int i14 = composerStartRestartGroup.changed(buttonElevationM2141elevatedButtonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        buttonElevationM2141elevatedButtonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i14;
                } else {
                    buttonElevationM2141elevatedButtonElevationR_JCAzs = buttonElevation;
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
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        i8 = i7;
                    } else {
                        i8 = i7;
                        if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    if ((i2 & 512) != 0) {
                        i10 = (1879048192 & i) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                        if ((1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    elevatedShape = ButtonDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 16) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i3 &= -57345;
                                    buttonColorsM2140elevatedButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2140elevatedButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                if ((i2 & 32) == 0) {
                                    composerStartRestartGroup = composer2;
                                    buttonElevationM2141elevatedButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m2141elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = (-458753) & i3;
                                } else {
                                    composerStartRestartGroup = composer2;
                                }
                                BorderStroke borderStroke5 = i5 == 0 ? null : borderStroke;
                                PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean z5 = z2;
                                    borderStroke3 = borderStroke5;
                                    i9 = i3;
                                    z3 = z5;
                                    Shape shape4 = elevatedShape;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2140elevatedButtonColorsro_MJ88;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    shape2 = shape4;
                                    buttonElevation2 = buttonElevationM2141elevatedButtonElevationR_JCAzs;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1466887385, i9, -1, "androidx.compose.material3.ElevatedButton (Button.kt:207)");
                                    }
                                    Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                                    composer3 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    paddingValues3 = paddingValues2;
                                    borderStroke4 = borderStroke3;
                                    buttonElevation3 = buttonElevation2;
                                    buttonColors3 = buttonColors2;
                                    shape3 = shape2;
                                    z4 = z3;
                                    modifier4 = modifier3;
                                } else {
                                    boolean z6 = z2;
                                    borderStroke3 = borderStroke5;
                                    i9 = i3;
                                    z3 = z6;
                                    shape2 = elevatedShape;
                                    buttonElevation2 = buttonElevationM2141elevatedButtonElevationR_JCAzs;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2140elevatedButtonColorsro_MJ88;
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
                                i9 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                shape2 = elevatedShape;
                                buttonColors2 = buttonColorsM2140elevatedButtonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM2141elevatedButtonElevationR_JCAzs;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                            composer3 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            paddingValues3 = paddingValues2;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation2;
                            buttonColors3 = buttonColors2;
                            shape3 = shape2;
                            z4 = z3;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape3 = elevatedShape;
                            buttonColors3 = buttonColorsM2140elevatedButtonColorsro_MJ88;
                            composer3 = composerStartRestartGroup;
                            buttonElevation3 = buttonElevationM2141elevatedButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = paddingValues;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.ElevatedButton.2
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

                            public final void invoke(Composer composer4, int i15) {
                                ButtonKt.ElevatedButton(onClick, modifier4, z4, shape3, buttonColors3, buttonElevation3, borderStroke4, paddingValues3, mutableInteractionSource3, content, composer4, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i10;
                    if ((1533916891 & i3) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
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
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
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
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) != 306783378) {
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
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) != 306783378) {
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
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0273  */
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
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape filledTonalShape;
        ButtonColors buttonColorsM2142filledTonalButtonColorsro_MJ88;
        ButtonElevation buttonElevationM2143filledTonalButtonElevationR_JCAzs;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        BorderStroke borderStroke3;
        int i9;
        boolean z3;
        Shape shape2;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer3;
        final MutableInteractionSource mutableInteractionSource3;
        final PaddingValues paddingValues3;
        final BorderStroke borderStroke4;
        final ButtonElevation buttonElevation3;
        final ButtonColors buttonColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717924381);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledTonalButton)P(8,7,5,9,1,4!1,3,6)281@14550L16,282@14610L25,283@14686L28,286@14867L39,289@14961L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                        filledTonalShape = shape;
                        int i12 = composerStartRestartGroup.changed(filledTonalShape) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        filledTonalShape = shape;
                    }
                    i3 |= i12;
                } else {
                    filledTonalShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsM2142filledTonalButtonColorsro_MJ88 = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColorsM2142filledTonalButtonColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColorsM2142filledTonalButtonColorsro_MJ88 = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColorsM2142filledTonalButtonColorsro_MJ88 = buttonColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM2143filledTonalButtonElevationR_JCAzs = buttonElevation;
                        int i14 = composerStartRestartGroup.changed(buttonElevationM2143filledTonalButtonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        buttonElevationM2143filledTonalButtonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i14;
                } else {
                    buttonElevationM2143filledTonalButtonElevationR_JCAzs = buttonElevation;
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
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        i8 = i7;
                    } else {
                        i8 = i7;
                        if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    if ((i2 & 512) != 0) {
                        i10 = (1879048192 & i) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                        if ((1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    filledTonalShape = ButtonDefaults.INSTANCE.getFilledTonalShape(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 16) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i3 &= -57345;
                                    buttonColorsM2142filledTonalButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2142filledTonalButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                if ((i2 & 32) == 0) {
                                    composerStartRestartGroup = composer2;
                                    buttonElevationM2143filledTonalButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m2143filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = (-458753) & i3;
                                } else {
                                    composerStartRestartGroup = composer2;
                                }
                                BorderStroke borderStroke5 = i5 == 0 ? null : borderStroke;
                                PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean z5 = z2;
                                    borderStroke3 = borderStroke5;
                                    i9 = i3;
                                    z3 = z5;
                                    Shape shape4 = filledTonalShape;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2142filledTonalButtonColorsro_MJ88;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    shape2 = shape4;
                                    buttonElevation2 = buttonElevationM2143filledTonalButtonElevationR_JCAzs;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1717924381, i9, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:277)");
                                    }
                                    Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                                    composer3 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    paddingValues3 = paddingValues2;
                                    borderStroke4 = borderStroke3;
                                    buttonElevation3 = buttonElevation2;
                                    buttonColors3 = buttonColors2;
                                    shape3 = shape2;
                                    z4 = z3;
                                    modifier4 = modifier3;
                                } else {
                                    boolean z6 = z2;
                                    borderStroke3 = borderStroke5;
                                    i9 = i3;
                                    z3 = z6;
                                    shape2 = filledTonalShape;
                                    buttonElevation2 = buttonElevationM2143filledTonalButtonElevationR_JCAzs;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2142filledTonalButtonColorsro_MJ88;
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
                                i9 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                shape2 = filledTonalShape;
                                buttonColors2 = buttonColorsM2142filledTonalButtonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM2143filledTonalButtonElevationR_JCAzs;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                            composer3 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            paddingValues3 = paddingValues2;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation2;
                            buttonColors3 = buttonColors2;
                            shape3 = shape2;
                            z4 = z3;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape3 = filledTonalShape;
                            buttonColors3 = buttonColorsM2142filledTonalButtonColorsro_MJ88;
                            composer3 = composerStartRestartGroup;
                            buttonElevation3 = buttonElevationM2143filledTonalButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = paddingValues;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.FilledTonalButton.2
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

                            public final void invoke(Composer composer4, int i15) {
                                ButtonKt.FilledTonalButton(onClick, modifier4, z4, shape3, buttonColors3, buttonElevation3, borderStroke4, paddingValues3, mutableInteractionSource3, content, composer4, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i10;
                    if ((1533916891 & i3) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
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
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
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
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) != 306783378) {
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
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) != 306783378) {
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
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape outlinedShape;
        ButtonColors buttonColorsM2148outlinedButtonColorsro_MJ88;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        BorderStroke outlinedButtonBorder;
        BorderStroke borderStroke3;
        int i9;
        boolean z3;
        Shape shape2;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource2;
        final MutableInteractionSource mutableInteractionSource3;
        final PaddingValues paddingValues3;
        final BorderStroke borderStroke4;
        final ButtonElevation buttonElevation4;
        final ButtonColors buttonColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694808287);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedButton)P(8,7,5,9,1,4!1,3,6)350@18094L13,351@18151L22,353@18258L20,355@18397L39,358@18491L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                        int i12 = composerStartRestartGroup.changed(outlinedShape) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        outlinedShape = shape;
                    }
                    i3 |= i12;
                } else {
                    outlinedShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsM2148outlinedButtonColorsro_MJ88 = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColorsM2148outlinedButtonColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColorsM2148outlinedButtonColorsro_MJ88 = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColorsM2148outlinedButtonColorsro_MJ88 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            int i14 = composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i3 |= i14;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        i8 = i7;
                    } else {
                        i8 = i7;
                        if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    if ((i2 & 512) != 0) {
                        i10 = (1879048192 & i) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                        if ((1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    outlinedShape = ButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    buttonColorsM2148outlinedButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2148outlinedButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                }
                                if (i5 != 0) {
                                    buttonElevation2 = null;
                                }
                                if ((i2 & 64) == 0) {
                                    outlinedButtonBorder = ButtonDefaults.INSTANCE.getOutlinedButtonBorder(composerStartRestartGroup, 6);
                                    i3 = (-3670017) & i3;
                                } else {
                                    outlinedButtonBorder = borderStroke;
                                }
                                PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean z5 = z2;
                                    borderStroke3 = outlinedButtonBorder;
                                    i9 = i3;
                                    z3 = z5;
                                    Shape shape4 = outlinedShape;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2148outlinedButtonColorsro_MJ88;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    shape2 = shape4;
                                    buttonElevation3 = buttonElevation2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1694808287, i9, -1, "androidx.compose.material3.OutlinedButton (Button.kt:346)");
                                    }
                                    Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    paddingValues3 = paddingValues2;
                                    borderStroke4 = borderStroke3;
                                    buttonElevation4 = buttonElevation3;
                                    buttonColors3 = buttonColors2;
                                    shape3 = shape2;
                                    z4 = z3;
                                    modifier4 = modifier3;
                                } else {
                                    boolean z6 = z2;
                                    borderStroke3 = outlinedButtonBorder;
                                    i9 = i3;
                                    z3 = z6;
                                    shape2 = outlinedShape;
                                    buttonElevation3 = buttonElevation2;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    buttonColors2 = buttonColorsM2148outlinedButtonColorsro_MJ88;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                i9 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                shape2 = outlinedShape;
                                buttonColors2 = buttonColorsM2148outlinedButtonColorsro_MJ88;
                                buttonElevation3 = buttonElevation2;
                                borderStroke3 = borderStroke2;
                                paddingValues2 = paddingValues;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i9, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            paddingValues3 = paddingValues2;
                            borderStroke4 = borderStroke3;
                            buttonElevation4 = buttonElevation3;
                            buttonColors3 = buttonColors2;
                            shape3 = shape2;
                            z4 = z3;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape3 = outlinedShape;
                            buttonColors3 = buttonColorsM2148outlinedButtonColorsro_MJ88;
                            buttonElevation4 = buttonElevation2;
                            borderStroke4 = borderStroke2;
                            paddingValues3 = paddingValues;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.OutlinedButton.2
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

                            public final void invoke(Composer composer2, int i15) {
                                ButtonKt.OutlinedButton(onClick, modifier4, z4, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i10;
                    if ((1533916891 & i3) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((3670016 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((3670016 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((3670016 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape textShape;
        ButtonColors buttonColorsM2149textButtonColorsro_MJ88;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        BorderStroke borderStroke3;
        int i10;
        boolean z3;
        Shape shape2;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource2;
        final MutableInteractionSource mutableInteractionSource3;
        final PaddingValues paddingValues3;
        final BorderStroke borderStroke4;
        final ButtonElevation buttonElevation4;
        final ButtonColors buttonColors3;
        final Shape shape3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2106428362);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextButton)P(8,7,5,9,1,4!1,3,6)421@21760L9,422@21813L18,426@22034L39,429@22128L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
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
                        textShape = shape;
                        int i13 = composerStartRestartGroup.changed(textShape) ? 2048 : 1024;
                        i3 |= i13;
                    } else {
                        textShape = shape;
                    }
                    i3 |= i13;
                } else {
                    textShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsM2149textButtonColorsro_MJ88 = buttonColors;
                        int i14 = composerStartRestartGroup.changed(buttonColorsM2149textButtonColorsro_MJ88) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        buttonColorsM2149textButtonColorsro_MJ88 = buttonColors;
                    }
                    i3 |= i14;
                } else {
                    buttonColorsM2149textButtonColorsro_MJ88 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((3670016 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                            i9 = i8;
                        } else {
                            i9 = i8;
                            if ((i & 234881024) == 0) {
                                i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                        }
                        if ((i2 & 512) == 0) {
                            i11 = (1879048192 & i) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                            if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        textShape = ButtonDefaults.INSTANCE.getTextShape(composerStartRestartGroup, 6);
                                    }
                                    if ((i2 & 16) != 0) {
                                        buttonColorsM2149textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2149textButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                        i3 = (-57345) & i3;
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    BorderStroke borderStroke5 = i6 == 0 ? borderStroke : null;
                                    PaddingValues textButtonContentPadding = i7 == 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                    if (i9 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        boolean z5 = z2;
                                        borderStroke3 = borderStroke5;
                                        i10 = i3;
                                        z3 = z5;
                                        Shape shape4 = textShape;
                                        paddingValues2 = textButtonContentPadding;
                                        modifier3 = modifier2;
                                        buttonColors2 = buttonColorsM2149textButtonColorsro_MJ88;
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        shape2 = shape4;
                                        buttonElevation3 = buttonElevation2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2106428362, i10, -1, "androidx.compose.material3.TextButton (Button.kt:417)");
                                        }
                                        Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i10, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        paddingValues3 = paddingValues2;
                                        borderStroke4 = borderStroke3;
                                        buttonElevation4 = buttonElevation3;
                                        buttonColors3 = buttonColors2;
                                        shape3 = shape2;
                                        z4 = z3;
                                        modifier4 = modifier3;
                                    } else {
                                        boolean z6 = z2;
                                        borderStroke3 = borderStroke5;
                                        i10 = i3;
                                        z3 = z6;
                                        shape2 = textShape;
                                        buttonElevation3 = buttonElevation2;
                                        paddingValues2 = textButtonContentPadding;
                                        modifier3 = modifier2;
                                        buttonColors2 = buttonColorsM2149textButtonColorsro_MJ88;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    i10 = i3;
                                    modifier3 = modifier2;
                                    z3 = z2;
                                    shape2 = textShape;
                                    buttonColors2 = buttonColorsM2149textButtonColorsro_MJ88;
                                    buttonElevation3 = buttonElevation2;
                                    borderStroke3 = borderStroke2;
                                    paddingValues2 = paddingValues;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Button(onClick, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, content, composerStartRestartGroup, 2147483646 & i10, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                paddingValues3 = paddingValues2;
                                borderStroke4 = borderStroke3;
                                buttonElevation4 = buttonElevation3;
                                buttonColors3 = buttonColors2;
                                shape3 = shape2;
                                z4 = z3;
                                modifier4 = modifier3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier4 = modifier2;
                                z4 = z2;
                                shape3 = textShape;
                                buttonColors3 = buttonColorsM2149textButtonColorsro_MJ88;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.TextButton.2
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

                                public final void invoke(Composer composer2, int i15) {
                                    ButtonKt.TextButton(onClick, modifier4, z4, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i11;
                        if ((1533916891 & i3) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i12 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    i3 |= i11;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i2 & 512) == 0) {
                }
                i3 |= i11;
                if ((1533916891 & i3) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i11;
            if ((1533916891 & i3) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i11;
        if ((1533916891 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
