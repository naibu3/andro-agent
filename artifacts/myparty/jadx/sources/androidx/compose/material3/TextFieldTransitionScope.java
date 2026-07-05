package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material3/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ef  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2530TransitionDTcfvLk(final InputPhase inputState, final long j, final long j2, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, final boolean z, final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Transition transition;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        ColorSpace colorSpaceM3661getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        ColorSpace colorSpaceM3661getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933643487);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)271@11066L59,273@11167L325,284@11539L1101,312@12688L299,322@13033L186,328@13229L140:TextFieldImpl.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(contentColor) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1933643487, i2, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:255)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", composerStartRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-943297137);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-943297137, i6, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:275)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1399891485);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            composerStartRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            InputPhase inputPhase = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-698152717);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                transition = transitionUpdateTransition;
                ComposerKt.traceEventStart(-698152717, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            } else {
                transition = transitionUpdateTransition;
            }
            int i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
            float f4 = 1.0f;
            if (i6 == 1) {
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f);
                InputPhase inputPhase2 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-698152717);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-698152717, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
                }
                i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                if (i3 == 1) {
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Transition transition2 = transition;
                    State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i7) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(1721367864);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1721367864, i7, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
                            }
                            if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tweenSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tweenSpecTween;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1399891485);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    composerStartRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    InputPhase inputPhase3 = (InputPhase) transition2.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1128980564);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1128980564, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                    if (i4 == 1) {
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf2 = Float.valueOf(f3);
                        InputPhase inputPhase4 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1128980564);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1128980564, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
                        }
                        i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z) {
                            }
                            f4 = 0.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceableGroup(1103405032);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1103405032, i7, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-1462136984);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase5 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1888369619);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1888369619, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                        }
                        long j3 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()] == 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j3);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(1847725064);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                        InputPhase inputPhase6 = (InputPhase) transition2.getCurrentState();
                        composerStartRestartGroup.startReplaceableGroup(1888369619);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1888369619, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                        }
                        long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()] != 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Color colorM3647boximpl = Color.m3647boximpl(j4);
                        InputPhase inputPhase7 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1888369619);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1888369619, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                        }
                        long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] != 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition2, colorM3647boximpl, Color.m3647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceableGroup(-172466157);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-172466157, i7, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:323)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        int i7 = (i2 & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        composerStartRestartGroup.startReplaceableGroup(-1462136984);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                        colorSpaceM3661getColorSpaceimpl2 = Color.m3661getColorSpaceimpl(contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf((i7 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).m3667unboximpl());
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1847725064);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                        Object currentState = transition2.getCurrentState();
                        int i8 = ((((i7 << 3) & 57344) | 3136) >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                        State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transition2, contentColor.invoke(currentState, composerStartRestartGroup, Integer.valueOf(i8)), contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf(i8)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        content.invoke(Float.valueOf(m2526Transition_DTcfvLk$lambda1(stateCreateTransitionAnimation)), Color.m3647boximpl(m2528Transition_DTcfvLk$lambda5(stateCreateTransitionAnimation3)), Color.m3647boximpl(m2529Transition_DTcfvLk$lambda6(stateCreateTransitionAnimation4)), Float.valueOf(m2527Transition_DTcfvLk$lambda3(stateCreateTransitionAnimation2)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i4 == 2) {
                            if (z) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Float fValueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase42 = (InputPhase) transition2.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(1128980564);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                            if (i5 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transition2, fValueOf22, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(1103405032);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1103405032, i72, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceableGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-1462136984);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase52 = (InputPhase) transition2.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(1888369619);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j3);
                            composerStartRestartGroup.startReplaceableGroup(-3686930);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                                composerStartRestartGroup.startReplaceableGroup(1847725064);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                InputPhase inputPhase62 = (InputPhase) transition2.getCurrentState();
                                composerStartRestartGroup.startReplaceableGroup(1888369619);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Color colorM3647boximpl2 = Color.m3647boximpl(j4);
                                InputPhase inputPhase72 = (InputPhase) transition2.getTargetState();
                                composerStartRestartGroup.startReplaceableGroup(1888369619);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                State stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transition2, colorM3647boximpl2, Color.m3647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-172466157);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-172466157, i72, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:323)");
                                        }
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceableGroup();
                                        return tweenSpecTween$default;
                                    }
                                };
                                int i72 = (i2 & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                composerStartRestartGroup.startReplaceableGroup(-1462136984);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                colorSpaceM3661getColorSpaceimpl2 = Color.m3661getColorSpaceimpl(contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf((i72 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).m3667unboximpl());
                                composerStartRestartGroup.startReplaceableGroup(-3686930);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(1847725064);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                    Object currentState2 = transition2.getCurrentState();
                                    int i82 = ((((i72 << 3) & 57344) | 3136) >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                    State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transition2, contentColor.invoke(currentState2, composerStartRestartGroup, Integer.valueOf(i82)), contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf(i82)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    content.invoke(Float.valueOf(m2526Transition_DTcfvLk$lambda1(stateCreateTransitionAnimation)), Color.m3647boximpl(m2528Transition_DTcfvLk$lambda5(stateCreateTransitionAnimation32)), Color.m3647boximpl(m2529Transition_DTcfvLk$lambda6(stateCreateTransitionAnimation42)), Float.valueOf(m2527Transition_DTcfvLk$lambda3(stateCreateTransitionAnimation22)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                        } else if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f3 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf222 = Float.valueOf(f3);
                        InputPhase inputPhase422 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1128980564);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                        if (i5 != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transition2, fValueOf222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i722) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceableGroup(1103405032);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1103405032, i722, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-1462136984);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase522 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1888369619);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()] == 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j3);
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Transition transition22 = transition;
                    State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transition22, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i73) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(1721367864);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1721367864, i73, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
                            }
                            if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tweenSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tweenSpecTween;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1399891485);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    composerStartRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    InputPhase inputPhase32 = (InputPhase) transition22.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1128980564);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
                    if (i4 == 1) {
                    }
                } else {
                    f2 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Transition transition222 = transition;
                    State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transition222, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i73) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(1721367864);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1721367864, i73, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
                            }
                            if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tweenSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tweenSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tweenSpecTween;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(1399891485);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    composerStartRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    InputPhase inputPhase322 = (InputPhase) transition222.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1128980564);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase322.ordinal()];
                    if (i4 == 1) {
                    }
                }
            } else if (i6 != 2) {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf3 = Float.valueOf(f);
                InputPhase inputPhase22 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-698152717);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase22.ordinal()];
                if (i3 == 1) {
                }
            } else {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf32 = Float.valueOf(f);
                InputPhase inputPhase222 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-698152717);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase222.ordinal()];
                if (i3 == 1) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$1
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

            public final void invoke(Composer composer2, int i9) {
                this.$tmp0_rcvr.m2530TransitionDTcfvLk(inputState, j, j2, contentColor, z, content, composer2, i | 1);
            }
        });
    }

    /* renamed from: Transition_DTcfvLk$lambda-1, reason: not valid java name */
    private static final float m2526Transition_DTcfvLk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3, reason: not valid java name */
    private static final float m2527Transition_DTcfvLk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5, reason: not valid java name */
    private static final long m2528Transition_DTcfvLk$lambda5(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-6, reason: not valid java name */
    private static final long m2529Transition_DTcfvLk$lambda6(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }
}
