package androidx.compose.material3;

import android.content.res.Resources;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aò\u0001\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*2\u0006\u0010+\u001a\u00020,2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*H\u0001¢\u0006\u0002\u0010=\u001a<\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0011\u0010C\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a\u0012\u0010F\u001a\u00020\u00012\b\u0010G\u001a\u0004\u0018\u00010HH\u0000\u001a\u0012\u0010I\u001a\u00020\u00012\b\u0010G\u001a\u0004\u0018\u00010HH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0013\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0016\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u001aX\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"AnimationDuration", "", "ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "supportingText", "singleLine", "", ViewProps.ENABLED, "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", UriUtil.LOCAL_CONTENT_SCHEME, "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m6117constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m6117constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6117constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:108:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues contentPadding, final TextFieldColors colors, final Function2<? super Composer, ? super Integer, Unit> container, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        boolean zChanged;
        Object objRememberedValue;
        InputPhase inputPhase;
        Function3<InputPhase, Composer, Integer, Color> function3;
        TextStyle bodyLarge;
        final boolean z5;
        final boolean z6;
        Function3<InputPhase, Composer, Integer, Color> function32;
        long jM5632getColor0d7_KjU;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z8;
        final boolean z9;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(container, "container");
        Composer composerStartRestartGroup = composer.startRestartGroup(4948732);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CommonDecorationBox)P(13,14,4,15,7,9,8,12,11,10,3,6,5,2)80@3165L105,84@3320L25,95@3704L10,*107@4336L10,108@4430L22,102@4047L5619:TextFieldImpl.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(function2) ? 16384 : 8192;
        }
        int i16 = i3 & 32;
        if (i16 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function26 = function22;
        } else {
            function26 = function22;
            if ((i & 458752) == 0) {
                i4 |= composerStartRestartGroup.changed(function26) ? 131072 : 65536;
            }
        }
        int i17 = i3 & 64;
        if (i17 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= composerStartRestartGroup.changed(function23) ? 1048576 : 524288;
        }
        int i18 = i3 & 128;
        if (i18 != 0) {
            i4 |= 12582912;
        } else {
            if ((i & 29360128) == 0) {
                i5 = i18;
                i4 |= composerStartRestartGroup.changed(function24) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else {
                if ((i & 234881024) == 0) {
                    i7 = i6;
                    i4 |= composerStartRestartGroup.changed(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else {
                    if ((i & 1879048192) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 14) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                        i14 = i13;
                    } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                        i14 = i13;
                        i12 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                    } else {
                        i14 = i13;
                    }
                    int i19 = i12;
                    if ((i3 & 4096) == 0) {
                        i19 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                    } else if ((i2 & 896) == 0) {
                        i19 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
                    }
                    if ((i3 & 8192) == 0) {
                        i19 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i19 |= composerStartRestartGroup.changed(contentPadding) ? 2048 : 1024;
                    }
                    if ((i3 & 16384) == 0) {
                        i19 |= 24576;
                    } else if ((57344 & i2) == 0) {
                        i19 |= composerStartRestartGroup.changed(colors) ? 16384 : 8192;
                    }
                    if ((32768 & i3) != 0) {
                        if ((458752 & i2) == 0) {
                            i15 = composerStartRestartGroup.changed(container) ? 131072 : 65536;
                        }
                        if ((1533916891 & i4) != 306783378 || (374491 & i19) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i16 != 0) {
                                function26 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function212 = i17 == 0 ? null : function23;
                            Function2<? super Composer, ? super Integer, Unit> function213 = i5 == 0 ? null : function24;
                            Function2<? super Composer, ? super Integer, Unit> function214 = i7 == 0 ? function25 : null;
                            z4 = i9 == 0 ? false : z;
                            final Function2<? super Composer, ? super Integer, Unit> function215 = function214;
                            boolean z10 = i11 == 0 ? true : z2;
                            boolean z11 = i14 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                function27 = function212;
                            } else {
                                function27 = function212;
                                ComposerKt.traceEventStart(4948732, i4, i19, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:62)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final String text = ((TransformedText) objRememberedValue).getText().getText();
                            if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i19 >> 6) & 14).getValue().booleanValue()) {
                                inputPhase = InputPhase.Focused;
                            } else {
                                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                            }
                            final int i20 = i19;
                            final boolean z12 = z10;
                            final boolean z13 = z11;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = function26;
                            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                                    return Color.m3647boximpl(m2521invokeXeAY9LY(inputPhase2, composer3, num.intValue()));
                                }

                                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                                public final long m2521invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    composer3.startReplaceableGroup(-379813807);
                                    ComposerKt.sourceInformation(composer3, "C92@3608L47:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-379813807, i21, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                                    }
                                    TextFieldColors textFieldColors = colors;
                                    boolean z14 = z12;
                                    boolean z15 = z13;
                                    InteractionSource interactionSource2 = interactionSource;
                                    int i22 = i20;
                                    long jM3667unboximpl = textFieldColors.labelColor$material3_release(z14, z15, interactionSource2, composer3, (i22 & 1022) | ((i22 >> 3) & 7168)).getValue().m3667unboximpl();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return jM3667unboximpl;
                                }
                            };
                            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            bodyLarge = typography.getBodyLarge();
                            final TextStyle bodySmall = typography.getBodySmall();
                            if ((Color.m3658equalsimpl0(bodyLarge.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()) || Color.m3658equalsimpl0(bodySmall.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU())) && (Color.m3658equalsimpl0(bodyLarge.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()) || !Color.m3658equalsimpl0(bodySmall.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()))) {
                                z5 = z4;
                                z6 = false;
                            } else {
                                z5 = z4;
                                z6 = true;
                            }
                            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-646388305);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "*104@4143L10,105@4237L22");
                            long jM5632getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodySmall().m5632getColor0d7_KjU();
                            if (z6 && jM5632getColor0d7_KjU2 == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                function32 = function3;
                                jM5632getColor0d7_KjU2 = function32.invoke(inputPhase, composerStartRestartGroup, 0).m3667unboximpl();
                            } else {
                                function32 = function3;
                            }
                            long j = jM5632getColor0d7_KjU2;
                            composerStartRestartGroup.endReplaceableGroup();
                            jM5632getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyLarge().m5632getColor0d7_KjU();
                            if (z6 && jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                jM5632getColor0d7_KjU = function32.invoke(inputPhase, composerStartRestartGroup, 0).m3667unboximpl();
                            }
                            final int i21 = i4;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function213;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function27;
                            boolean z14 = z5;
                            textFieldTransitionScope.m2530TransitionDTcfvLk(inputPhase, j, jM5632getColor0d7_KjU, function32, function2 == null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1915872767, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.3

                                /* compiled from: TextFieldImpl.kt */
                                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[TextFieldType.values().length];
                                        iArr[TextFieldType.Filled.ordinal()] = 1;
                                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(6);
                                }

                                @Override // kotlin.jvm.functions.Function6
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) throws Resources.NotFoundException {
                                    m2519invokeRIQooxk(f.floatValue(), color.m3667unboximpl(), color2.m3667unboximpl(), f2.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                                public final void m2519invokeRIQooxk(final float f, long j2, final long j3, final float f2, Composer composer3, int i22) throws Resources.NotFoundException {
                                    int i23;
                                    long j4;
                                    int i24;
                                    final float f3;
                                    ComposableLambda composableLambda;
                                    ComposableLambda composableLambda2;
                                    ComposableLambda composableLambda3;
                                    ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)143@5979L30,144@6065L43,146@6148L53,153@6449L54,161@6768L56:TextFieldImpl.kt#uh7d8r");
                                    if ((i22 & 14) == 0) {
                                        i23 = (composer3.changed(f) ? 4 : 2) | i22;
                                    } else {
                                        i23 = i22;
                                    }
                                    if ((i22 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                                        j4 = j2;
                                        i23 |= composer3.changed(j4) ? 32 : 16;
                                    } else {
                                        j4 = j2;
                                    }
                                    if ((i22 & 896) == 0) {
                                        i23 |= composer3.changed(j3) ? 256 : 128;
                                    }
                                    if ((i22 & 7168) == 0) {
                                        i23 |= composer3.changed(f2) ? 2048 : 1024;
                                    }
                                    if ((46811 & i23) != 9362 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1915872767, i23, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
                                        }
                                        final Function2<Composer, Integer, Unit> function219 = function2;
                                        if (function219 != null) {
                                            final boolean z15 = z6;
                                            final int i25 = i23;
                                            final long j5 = j4;
                                            f3 = f;
                                            i24 = i25;
                                            composableLambda = ComposableLambdaKt.composableLambda(composer3, 1199990137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                                public final void invoke(Composer composer4, int i26) {
                                                    ComposerKt.sourceInformation(composer4, "C*117@4809L10,118@4865L10,123@5078L49:TextFieldImpl.kt#uh7d8r");
                                                    if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1199990137, i26, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
                                                        }
                                                        TextStyle textStyleLerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodySmall(), f);
                                                        boolean z16 = z15;
                                                        long j6 = j5;
                                                        if (z16) {
                                                            textStyleLerp = TextStyle.m5611copyHL5avdY$default(textStyleLerp, j6, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                                        }
                                                        TextFieldImplKt.m2518DecorationKTwxG1Y(j3, textStyleLerp, function219, composer4, (i25 >> 6) & 14, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            });
                                        } else {
                                            i24 = i23;
                                            f3 = f;
                                            composableLambda = null;
                                        }
                                        if (function216 == null || text.length() != 0) {
                                            composableLambda2 = null;
                                        } else {
                                            final TextFieldColors textFieldColors = colors;
                                            final boolean z16 = z12;
                                            final int i26 = i20;
                                            final Function2<Composer, Integer, Unit> function220 = function216;
                                            final int i27 = i21;
                                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1472145357, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                                    invoke(modifier, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Modifier modifier, Composer composer4, int i28) {
                                                    int i29;
                                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                                    ComposerKt.sourceInformation(composer4, "C130@5353L341:TextFieldImpl.kt#uh7d8r");
                                                    if ((i28 & 14) == 0) {
                                                        i29 = (composer4.changed(modifier) ? 4 : 2) | i28;
                                                    } else {
                                                        i29 = i28;
                                                    }
                                                    if ((i29 & 91) != 18 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1472145357, i28, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:129)");
                                                        }
                                                        Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                        TextFieldColors textFieldColors2 = textFieldColors;
                                                        boolean z17 = z16;
                                                        int i30 = i26;
                                                        Function2<Composer, Integer, Unit> function221 = function220;
                                                        int i31 = i27;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlpha);
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
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(828149203);
                                                        ComposerKt.sourceInformation(composer4, "C132@5487L25,133@5575L10,131@5425L247:TextFieldImpl.kt#uh7d8r");
                                                        TextFieldImplKt.m2518DecorationKTwxG1Y(textFieldColors2.placeholderColor$material3_release(z17, composer4, (i30 & 14) | ((i30 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), function221, composer4, (i31 >> 9) & 896, 0);
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
                                            });
                                        }
                                        final String strM2449getStringNWtq28 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2441getDefaultErrorMessageadMyvUU(), composer3, 6);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Object objValueOf = Boolean.valueOf(z13);
                                        final boolean z17 = z13;
                                        composer3.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer3.changed(objValueOf) | composer3.changed(strM2449getStringNWtq28);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    if (z17) {
                                                        SemanticsPropertiesKt.error(semantics, strM2449getStringNWtq28);
                                                    }
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue2, 1, null);
                                        TextFieldColors textFieldColors2 = colors;
                                        boolean z18 = z12;
                                        boolean z19 = z13;
                                        InteractionSource interactionSource2 = interactionSource;
                                        int i28 = i20;
                                        final long jM3667unboximpl = textFieldColors2.leadingIconColor$material3_release(z18, z19, interactionSource2, composer3, (i28 & 1022) | ((i28 >> 3) & 7168)).getValue().m3667unboximpl();
                                        final Function2<Composer, Integer, Unit> function221 = function218;
                                        ComposableLambda composableLambda4 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 175497959, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                            public final void invoke(Composer composer4, int i29) {
                                                ComposerKt.sourceInformation(composer4, "C149@6327L57:TextFieldImpl.kt#uh7d8r");
                                                if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(175497959, i29, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:148)");
                                                }
                                                TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl, null, function221, composer4, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }) : null;
                                        TextFieldColors textFieldColors3 = colors;
                                        boolean z20 = z12;
                                        boolean z21 = z13;
                                        InteractionSource interactionSource3 = interactionSource;
                                        int i29 = i20;
                                        final long jM3667unboximpl2 = textFieldColors3.trailingIconColor$material3_release(z20, z21, interactionSource3, composer3, ((i29 >> 3) & 7168) | (i29 & 1022)).getValue().m3667unboximpl();
                                        final Function2<Composer, Integer, Unit> function222 = function217;
                                        ComposableLambda composableLambda5 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -432498573, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                            public final void invoke(Composer composer4, int i30) {
                                                ComposerKt.sourceInformation(composer4, "C156@6631L58:TextFieldImpl.kt#uh7d8r");
                                                if ((i30 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-432498573, i30, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:155)");
                                                }
                                                TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl2, null, function222, composer4, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }) : null;
                                        TextFieldColors textFieldColors4 = colors;
                                        boolean z22 = z12;
                                        boolean z23 = z13;
                                        InteractionSource interactionSource4 = interactionSource;
                                        int i30 = i20;
                                        final long jM3667unboximpl3 = textFieldColors4.supportingTextColor$material3_release(z22, z23, interactionSource4, composer3, ((i30 >> 3) & 7168) | (i30 & 1022)).getValue().m3667unboximpl();
                                        final Function2<Composer, Integer, Unit> function223 = function215;
                                        if (function223 != null) {
                                            final TextStyle textStyle = bodySmall;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -1269483524, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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

                                                public final void invoke(Composer composer4, int i31) {
                                                    ComposerKt.sourceInformation(composer4, "C164@6956L84:TextFieldImpl.kt#uh7d8r");
                                                    if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1269483524, i31, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                                    }
                                                    TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl3, textStyle, function223, composer4, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            });
                                        } else {
                                            composableLambda3 = null;
                                        }
                                        int i31 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                                        if (i31 == 1) {
                                            ComposableLambda composableLambda6 = composableLambda5;
                                            composer3.startReplaceableGroup(404041480);
                                            ComposerKt.sourceInformation(composer3, "177@7397L588");
                                            final Function2<Composer, Integer, Unit> function224 = container;
                                            final int i32 = i20;
                                            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer3, 1566950173, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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

                                                public final void invoke(Composer composer4, int i33) {
                                                    ComposerKt.sourceInformation(composer4, "C171@7210L151:TextFieldImpl.kt#uh7d8r");
                                                    if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1566950173, i33, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                                        }
                                                        Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                        Function2<Composer, Integer, Unit> function225 = function224;
                                                        int i34 = i32;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierLayoutId);
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
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1634460887);
                                                        ComposerKt.sourceInformation(composer4, "C173@7328L11:TextFieldImpl.kt#uh7d8r");
                                                        function225.invoke(composer4, Integer.valueOf((i34 >> 15) & 14));
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
                                            });
                                            Function2<Composer, Integer, Unit> function225 = innerTextField;
                                            boolean z24 = z5;
                                            PaddingValues paddingValues = contentPadding;
                                            int i33 = i21;
                                            TextFieldKt.TextFieldLayout(modifierSemantics$default, function225, composableLambda, composableLambda2, composableLambda4, composableLambda6, z24, f, composableLambda7, composableLambda3, paddingValues, composer3, (3670016 & (i33 >> 9)) | ((i33 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 100663296 | (29360128 & (i24 << 21)), (i20 >> 9) & 14);
                                            composer3.endReplaceableGroup();
                                            Unit unit = Unit.INSTANCE;
                                        } else if (i31 == 2) {
                                            composer3.startReplaceableGroup(404042394);
                                            ComposerKt.sourceInformation(composer3, "193@8107L38,214@9036L420,205@8574L1062");
                                            composer3.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3473boximpl(Size.INSTANCE.m3494getZeroNHjbRc()), null, 2, null);
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer3.endReplaceableGroup();
                                            final MutableState mutableState = (MutableState) objRememberedValue3;
                                            final PaddingValues paddingValues2 = contentPadding;
                                            final Function2<Composer, Integer, Unit> function226 = container;
                                            final int i34 = i20;
                                            ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, 787383072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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

                                                public final void invoke(Composer composer4, int i35) {
                                                    ComposerKt.sourceInformation(composer4, "C195@8236L302:TextFieldImpl.kt#uh7d8r");
                                                    if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(787383072, i35, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
                                                        }
                                                        Modifier modifierM2396outlineCutout12SF9DM = OutlinedTextFieldKt.m2396outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                        Function2<Composer, Integer, Unit> function227 = function226;
                                                        int i36 = i34;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM2396outlineCutout12SF9DM);
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
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1492929242);
                                                        ComposerKt.sourceInformation(composer4, "C201@8505L11:TextFieldImpl.kt#uh7d8r");
                                                        function227.invoke(composer4, Integer.valueOf((i36 >> 15) & 14));
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
                                            });
                                            Function2<Composer, Integer, Unit> function227 = innerTextField;
                                            ComposableLambda composableLambda9 = composableLambda2;
                                            boolean z25 = z5;
                                            Object objValueOf2 = Float.valueOf(f3);
                                            composer3.startReplaceableGroup(511388516);
                                            ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                            boolean zChanged3 = composer3.changed(objValueOf2) | composer3.changed(mutableState);
                                            Object objRememberedValue4 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                        m2520invokeuvyYCjk(size.getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                    public final void m2520invokeuvyYCjk(long j6) {
                                                        float fM3485getWidthimpl = Size.m3485getWidthimpl(j6) * f3;
                                                        float fM3482getHeightimpl = Size.m3482getHeightimpl(j6) * f3;
                                                        if (Size.m3485getWidthimpl(mutableState.getValue().getPackedValue()) == fM3485getWidthimpl && Size.m3482getHeightimpl(mutableState.getValue().getPackedValue()) == fM3482getHeightimpl) {
                                                            return;
                                                        }
                                                        mutableState.setValue(Size.m3473boximpl(SizeKt.Size(fM3485getWidthimpl, fM3482getHeightimpl)));
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer3.endReplaceableGroup();
                                            ComposableLambda composableLambda10 = composableLambda4;
                                            PaddingValues paddingValues3 = contentPadding;
                                            int i35 = i21;
                                            ComposableLambda composableLambda11 = composableLambda;
                                            OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierSemantics$default, function227, composableLambda9, composableLambda11, composableLambda10, composableLambda5, z25, f3, (Function1) objRememberedValue4, composableLambda8, composableLambda3, paddingValues3, composer3, ((i35 >> 9) & 3670016) | ((i35 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 805306368 | ((i24 << 21) & 29360128), (i20 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                            composer3.endReplaceableGroup();
                                            Unit unit2 = Unit.INSTANCE;
                                        } else {
                                            composer3.startReplaceableGroup(404044016);
                                            composer3.endReplaceableGroup();
                                            Unit unit3 = Unit.INSTANCE;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, 1769472);
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function28 = function217;
                            z7 = z13;
                            function29 = function215;
                            z8 = z14;
                            z9 = z12;
                            function210 = function216;
                            function211 = function218;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function28 = function24;
                            z8 = z;
                            z9 = z2;
                            z7 = z3;
                            function210 = function26;
                            composer2 = composerStartRestartGroup;
                            function211 = function23;
                            function29 = function25;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.4
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

                            public final void invoke(Composer composer3, int i22) {
                                TextFieldImplKt.CommonDecorationBox(type, value, innerTextField, visualTransformation, function2, function210, function211, function28, function29, z8, z9, z7, interactionSource, contentPadding, colors, container, composer3, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i19 |= i15;
                    if ((1533916891 & i4) != 306783378) {
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function2152 = function214;
                        if (i11 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            final String text2 = ((TransformedText) objRememberedValue).getText().getText();
                            if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i19 >> 6) & 14).getValue().booleanValue()) {
                            }
                            final int i202 = i19;
                            final boolean z122 = z10;
                            final boolean z132 = z11;
                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function26;
                            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                                    return Color.m3647boximpl(m2521invokeXeAY9LY(inputPhase2, composer3, num.intValue()));
                                }

                                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                                public final long m2521invokeXeAY9LY(InputPhase it, Composer composer3, int i212) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    composer3.startReplaceableGroup(-379813807);
                                    ComposerKt.sourceInformation(composer3, "C92@3608L47:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-379813807, i212, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                                    }
                                    TextFieldColors textFieldColors = colors;
                                    boolean z142 = z122;
                                    boolean z15 = z132;
                                    InteractionSource interactionSource2 = interactionSource;
                                    int i22 = i202;
                                    long jM3667unboximpl = textFieldColors.labelColor$material3_release(z142, z15, interactionSource2, composer3, (i22 & 1022) | ((i22 >> 3) & 7168)).getValue().m3667unboximpl();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return jM3667unboximpl;
                                }
                            };
                            Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            bodyLarge = typography2.getBodyLarge();
                            final TextStyle bodySmall2 = typography2.getBodySmall();
                            if (Color.m3658equalsimpl0(bodyLarge.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU())) {
                                z5 = z4;
                                z6 = false;
                                TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(-646388305);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "*104@4143L10,105@4237L22");
                                long jM5632getColor0d7_KjU22 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodySmall().m5632getColor0d7_KjU();
                                if (z6) {
                                    function32 = function3;
                                    long j2 = jM5632getColor0d7_KjU22;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    jM5632getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyLarge().m5632getColor0d7_KjU();
                                    if (z6) {
                                        jM5632getColor0d7_KjU = function32.invoke(inputPhase, composerStartRestartGroup, 0).m3667unboximpl();
                                    }
                                    final int i212 = i4;
                                    final Function2<? super Composer, ? super Integer, Unit> function2172 = function213;
                                    final Function2<? super Composer, ? super Integer, Unit> function2182 = function27;
                                    boolean z142 = z5;
                                    textFieldTransitionScope2.m2530TransitionDTcfvLk(inputPhase, j2, jM5632getColor0d7_KjU, function32, function2 == null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1915872767, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.3

                                        /* compiled from: TextFieldImpl.kt */
                                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                        /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[TextFieldType.values().length];
                                                iArr[TextFieldType.Filled.ordinal()] = 1;
                                                iArr[TextFieldType.Outlined.ordinal()] = 2;
                                                $EnumSwitchMapping$0 = iArr;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(6);
                                        }

                                        @Override // kotlin.jvm.functions.Function6
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) throws Resources.NotFoundException {
                                            m2519invokeRIQooxk(f.floatValue(), color.m3667unboximpl(), color2.m3667unboximpl(), f2.floatValue(), composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-RIQooxk, reason: not valid java name */
                                        public final void m2519invokeRIQooxk(final float f, long j22, final long j3, final float f2, Composer composer3, int i22) throws Resources.NotFoundException {
                                            int i23;
                                            long j4;
                                            int i24;
                                            final float f3;
                                            ComposableLambda composableLambda;
                                            ComposableLambda composableLambda2;
                                            ComposableLambda composableLambda3;
                                            ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)143@5979L30,144@6065L43,146@6148L53,153@6449L54,161@6768L56:TextFieldImpl.kt#uh7d8r");
                                            if ((i22 & 14) == 0) {
                                                i23 = (composer3.changed(f) ? 4 : 2) | i22;
                                            } else {
                                                i23 = i22;
                                            }
                                            if ((i22 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                                                j4 = j22;
                                                i23 |= composer3.changed(j4) ? 32 : 16;
                                            } else {
                                                j4 = j22;
                                            }
                                            if ((i22 & 896) == 0) {
                                                i23 |= composer3.changed(j3) ? 256 : 128;
                                            }
                                            if ((i22 & 7168) == 0) {
                                                i23 |= composer3.changed(f2) ? 2048 : 1024;
                                            }
                                            if ((46811 & i23) != 9362 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1915872767, i23, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)");
                                                }
                                                final Function2<? super Composer, ? super Integer, Unit> function219 = function2;
                                                if (function219 != null) {
                                                    final boolean z15 = z6;
                                                    final int i25 = i23;
                                                    final long j5 = j4;
                                                    f3 = f;
                                                    i24 = i25;
                                                    composableLambda = ComposableLambdaKt.composableLambda(composer3, 1199990137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                                        public final void invoke(Composer composer4, int i26) {
                                                            ComposerKt.sourceInformation(composer4, "C*117@4809L10,118@4865L10,123@5078L49:TextFieldImpl.kt#uh7d8r");
                                                            if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1199990137, i26, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
                                                                }
                                                                TextStyle textStyleLerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodySmall(), f);
                                                                boolean z16 = z15;
                                                                long j6 = j5;
                                                                if (z16) {
                                                                    textStyleLerp = TextStyle.m5611copyHL5avdY$default(textStyleLerp, j6, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                                                }
                                                                TextFieldImplKt.m2518DecorationKTwxG1Y(j3, textStyleLerp, function219, composer4, (i25 >> 6) & 14, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    });
                                                } else {
                                                    i24 = i23;
                                                    f3 = f;
                                                    composableLambda = null;
                                                }
                                                if (function2162 == null || text2.length() != 0) {
                                                    composableLambda2 = null;
                                                } else {
                                                    final TextFieldColors textFieldColors = colors;
                                                    final boolean z16 = z122;
                                                    final int i26 = i202;
                                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function2162;
                                                    final int i27 = i212;
                                                    composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1472145357, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                                            invoke(modifier, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Modifier modifier, Composer composer4, int i28) {
                                                            int i29;
                                                            Intrinsics.checkNotNullParameter(modifier, "modifier");
                                                            ComposerKt.sourceInformation(composer4, "C130@5353L341:TextFieldImpl.kt#uh7d8r");
                                                            if ((i28 & 14) == 0) {
                                                                i29 = (composer4.changed(modifier) ? 4 : 2) | i28;
                                                            } else {
                                                                i29 = i28;
                                                            }
                                                            if ((i29 & 91) != 18 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1472145357, i28, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:129)");
                                                                }
                                                                Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                                TextFieldColors textFieldColors2 = textFieldColors;
                                                                boolean z17 = z16;
                                                                int i30 = i26;
                                                                Function2<Composer, Integer, Unit> function221 = function220;
                                                                int i31 = i27;
                                                                composer4.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlpha);
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
                                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer4.enableReusing();
                                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                                composer4.startReplaceableGroup(2058660585);
                                                                composer4.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer4.startReplaceableGroup(828149203);
                                                                ComposerKt.sourceInformation(composer4, "C132@5487L25,133@5575L10,131@5425L247:TextFieldImpl.kt#uh7d8r");
                                                                TextFieldImplKt.m2518DecorationKTwxG1Y(textFieldColors2.placeholderColor$material3_release(z17, composer4, (i30 & 14) | ((i30 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), function221, composer4, (i31 >> 9) & 896, 0);
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
                                                    });
                                                }
                                                final String strM2449getStringNWtq28 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2441getDefaultErrorMessageadMyvUU(), composer3, 6);
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Object objValueOf = Boolean.valueOf(z132);
                                                final boolean z17 = z132;
                                                composer3.startReplaceableGroup(511388516);
                                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                                boolean zChanged2 = composer3.changed(objValueOf) | composer3.changed(strM2449getStringNWtq28);
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                            if (z17) {
                                                                SemanticsPropertiesKt.error(semantics, strM2449getStringNWtq28);
                                                            }
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer3.endReplaceableGroup();
                                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue2, 1, null);
                                                TextFieldColors textFieldColors2 = colors;
                                                boolean z18 = z122;
                                                boolean z19 = z132;
                                                InteractionSource interactionSource2 = interactionSource;
                                                int i28 = i202;
                                                final long jM3667unboximpl = textFieldColors2.leadingIconColor$material3_release(z18, z19, interactionSource2, composer3, (i28 & 1022) | ((i28 >> 3) & 7168)).getValue().m3667unboximpl();
                                                final Function2<? super Composer, ? super Integer, Unit> function221 = function2182;
                                                ComposableLambda composableLambda4 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 175497959, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                                    public final void invoke(Composer composer4, int i29) {
                                                        ComposerKt.sourceInformation(composer4, "C149@6327L57:TextFieldImpl.kt#uh7d8r");
                                                        if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(175497959, i29, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:148)");
                                                        }
                                                        TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl, null, function221, composer4, 0, 2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }) : null;
                                                TextFieldColors textFieldColors3 = colors;
                                                boolean z20 = z122;
                                                boolean z21 = z132;
                                                InteractionSource interactionSource3 = interactionSource;
                                                int i29 = i202;
                                                final long jM3667unboximpl2 = textFieldColors3.trailingIconColor$material3_release(z20, z21, interactionSource3, composer3, ((i29 >> 3) & 7168) | (i29 & 1022)).getValue().m3667unboximpl();
                                                final Function2<? super Composer, ? super Integer, Unit> function222 = function2172;
                                                ComposableLambda composableLambda5 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -432498573, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                                    public final void invoke(Composer composer4, int i30) {
                                                        ComposerKt.sourceInformation(composer4, "C156@6631L58:TextFieldImpl.kt#uh7d8r");
                                                        if ((i30 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-432498573, i30, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:155)");
                                                        }
                                                        TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl2, null, function222, composer4, 0, 2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }) : null;
                                                TextFieldColors textFieldColors4 = colors;
                                                boolean z22 = z122;
                                                boolean z23 = z132;
                                                InteractionSource interactionSource4 = interactionSource;
                                                int i30 = i202;
                                                final long jM3667unboximpl3 = textFieldColors4.supportingTextColor$material3_release(z22, z23, interactionSource4, composer3, ((i30 >> 3) & 7168) | (i30 & 1022)).getValue().m3667unboximpl();
                                                final Function2<? super Composer, ? super Integer, Unit> function223 = function2152;
                                                if (function223 != null) {
                                                    final TextStyle textStyle = bodySmall2;
                                                    composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -1269483524, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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

                                                        public final void invoke(Composer composer4, int i31) {
                                                            ComposerKt.sourceInformation(composer4, "C164@6956L84:TextFieldImpl.kt#uh7d8r");
                                                            if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1269483524, i31, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                                            }
                                                            TextFieldImplKt.m2518DecorationKTwxG1Y(jM3667unboximpl3, textStyle, function223, composer4, 0, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    composableLambda3 = null;
                                                }
                                                int i31 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                                                if (i31 == 1) {
                                                    ComposableLambda composableLambda6 = composableLambda5;
                                                    composer3.startReplaceableGroup(404041480);
                                                    ComposerKt.sourceInformation(composer3, "177@7397L588");
                                                    final Function2<? super Composer, ? super Integer, Unit> function224 = container;
                                                    final int i32 = i202;
                                                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer3, 1566950173, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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

                                                        public final void invoke(Composer composer4, int i33) {
                                                            ComposerKt.sourceInformation(composer4, "C171@7210L151:TextFieldImpl.kt#uh7d8r");
                                                            if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1566950173, i33, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                                                }
                                                                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                                Function2<Composer, Integer, Unit> function225 = function224;
                                                                int i34 = i32;
                                                                composer4.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierLayoutId);
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
                                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer4.enableReusing();
                                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                                composer4.startReplaceableGroup(2058660585);
                                                                composer4.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer4.startReplaceableGroup(1634460887);
                                                                ComposerKt.sourceInformation(composer4, "C173@7328L11:TextFieldImpl.kt#uh7d8r");
                                                                function225.invoke(composer4, Integer.valueOf((i34 >> 15) & 14));
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
                                                    });
                                                    Function2<Composer, Integer, Unit> function225 = innerTextField;
                                                    boolean z24 = z5;
                                                    PaddingValues paddingValues = contentPadding;
                                                    int i33 = i212;
                                                    TextFieldKt.TextFieldLayout(modifierSemantics$default, function225, composableLambda, composableLambda2, composableLambda4, composableLambda6, z24, f, composableLambda7, composableLambda3, paddingValues, composer3, (3670016 & (i33 >> 9)) | ((i33 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 100663296 | (29360128 & (i24 << 21)), (i202 >> 9) & 14);
                                                    composer3.endReplaceableGroup();
                                                    Unit unit = Unit.INSTANCE;
                                                } else if (i31 == 2) {
                                                    composer3.startReplaceableGroup(404042394);
                                                    ComposerKt.sourceInformation(composer3, "193@8107L38,214@9036L420,205@8574L1062");
                                                    composer3.startReplaceableGroup(-492369756);
                                                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                                    Object objRememberedValue3 = composer3.rememberedValue();
                                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3473boximpl(Size.INSTANCE.m3494getZeroNHjbRc()), null, 2, null);
                                                        composer3.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    final MutableState<Size> mutableState = (MutableState) objRememberedValue3;
                                                    final PaddingValues paddingValues2 = contentPadding;
                                                    final Function2<? super Composer, ? super Integer, Unit> function226 = container;
                                                    final int i34 = i202;
                                                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, 787383072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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

                                                        public final void invoke(Composer composer4, int i35) {
                                                            ComposerKt.sourceInformation(composer4, "C195@8236L302:TextFieldImpl.kt#uh7d8r");
                                                            if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(787383072, i35, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
                                                                }
                                                                Modifier modifierM2396outlineCutout12SF9DM = OutlinedTextFieldKt.m2396outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                                Function2<Composer, Integer, Unit> function227 = function226;
                                                                int i36 = i34;
                                                                composer4.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM2396outlineCutout12SF9DM);
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
                                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer4.enableReusing();
                                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer4)), composer4, 0);
                                                                composer4.startReplaceableGroup(2058660585);
                                                                composer4.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer4.startReplaceableGroup(1492929242);
                                                                ComposerKt.sourceInformation(composer4, "C201@8505L11:TextFieldImpl.kt#uh7d8r");
                                                                function227.invoke(composer4, Integer.valueOf((i36 >> 15) & 14));
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
                                                    });
                                                    Function2<Composer, Integer, Unit> function227 = innerTextField;
                                                    ComposableLambda composableLambda9 = composableLambda2;
                                                    boolean z25 = z5;
                                                    Object objValueOf2 = Float.valueOf(f3);
                                                    composer3.startReplaceableGroup(511388516);
                                                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                                    boolean zChanged3 = composer3.changed(objValueOf2) | composer3.changed(mutableState);
                                                    Object objRememberedValue4 = composer3.rememberedValue();
                                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                                m2520invokeuvyYCjk(size.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                            public final void m2520invokeuvyYCjk(long j6) {
                                                                float fM3485getWidthimpl = Size.m3485getWidthimpl(j6) * f3;
                                                                float fM3482getHeightimpl = Size.m3482getHeightimpl(j6) * f3;
                                                                if (Size.m3485getWidthimpl(mutableState.getValue().getPackedValue()) == fM3485getWidthimpl && Size.m3482getHeightimpl(mutableState.getValue().getPackedValue()) == fM3482getHeightimpl) {
                                                                    return;
                                                                }
                                                                mutableState.setValue(Size.m3473boximpl(SizeKt.Size(fM3485getWidthimpl, fM3482getHeightimpl)));
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    ComposableLambda composableLambda10 = composableLambda4;
                                                    PaddingValues paddingValues3 = contentPadding;
                                                    int i35 = i212;
                                                    ComposableLambda composableLambda11 = composableLambda;
                                                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierSemantics$default, function227, composableLambda9, composableLambda11, composableLambda10, composableLambda5, z25, f3, (Function1) objRememberedValue4, composableLambda8, composableLambda3, paddingValues3, composer3, ((i35 >> 9) & 3670016) | ((i35 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 805306368 | ((i24 << 21) & 29360128), (i202 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                                    composer3.endReplaceableGroup();
                                                    Unit unit2 = Unit.INSTANCE;
                                                } else {
                                                    composer3.startReplaceableGroup(404044016);
                                                    composer3.endReplaceableGroup();
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composerStartRestartGroup, 1769472);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function28 = function2172;
                                    z7 = z132;
                                    function29 = function2152;
                                    z8 = z142;
                                    z9 = z122;
                                    function210 = function2162;
                                    function211 = function2182;
                                }
                            } else {
                                z5 = z4;
                                z6 = false;
                                TextFieldTransitionScope textFieldTransitionScope22 = TextFieldTransitionScope.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(-646388305);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "*104@4143L10,105@4237L22");
                                long jM5632getColor0d7_KjU222 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodySmall().m5632getColor0d7_KjU();
                                if (z6) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                int i192 = i12;
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((32768 & i3) != 0) {
                }
                i192 |= i15;
                if ((1533916891 & i4) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i6;
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            int i1922 = i12;
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((32768 & i3) != 0) {
            }
            i1922 |= i15;
            if ((1533916891 & i4) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i18;
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i19222 = i12;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((32768 & i3) != 0) {
        }
        i19222 |= i15;
        if ((1533916891 & i4) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m2518DecorationKTwxG1Y(final long j, TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520066345);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2):TextFieldImpl.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1449369305, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$contentWithColor$1
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

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C242@9959L118:TextFieldImpl.kt#uh7d8r");
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1449369305, i5, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:241)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j))}, content, composer2, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceableGroup(1830466317);
                ComposerKt.sourceInformation(composerStartRestartGroup, "247@10112L46");
                TextKt.ProvideTextStyle(textStyle, composableLambda, composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(1830466369);
                ComposerKt.sourceInformation(composerStartRestartGroup, "247@10164L18");
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$1
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

            public final void invoke(Composer composer2, int i5) {
                TextFieldImplKt.m2518DecorationKTwxG1Y(j, textStyle2, content, composer2, i | 1, i2);
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m1049defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
