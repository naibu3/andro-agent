package com.stripe.android.uicore.elements.compat;

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
import androidx.compose.runtime.RecomposeScopeImplKt;
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

/* compiled from: CompatTextField.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¯\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2e\u0010\u0010\u001aa\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u0015\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/uicore/elements/compat/TextFieldTransitionScope;", "", "<init>", "()V", "Transition", "", "inputState", "Lcom/stripe/android/uicore/elements/compat/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Lcom/stripe/android/uicore/elements/compat/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: CompatTextField.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Transition_DTcfvLk$lambda$7(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j, long j2, Function3 function3, boolean z, Function6 function6, int i, Composer composer, int i2) {
        textFieldTransitionScope.m8870TransitionDTcfvLk(inputPhase, j, j2, function3, z, function6, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8870TransitionDTcfvLk(final InputPhase inputState, long j, final long j2, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, final boolean z, final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        long j3;
        Transition transition;
        float f;
        Float f2;
        InputPhase inputPhase;
        int i3;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        ColorSpace colorSpaceM3661getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        Color color;
        ColorSpace colorSpaceM3661getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-791965669);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(contentColor) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-791965669, i2, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition (CompatTextField.kt:584)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", composerStartRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer3.startReplaceGroup(-1820270483);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1820270483, i7, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:592)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
            InputPhase inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceGroup(-1082240119);
            if (ComposerKt.isTraceInProgress()) {
                transition = transitionUpdateTransition;
                ComposerKt.traceEventStart(-1082240119, 0, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:594)");
            } else {
                transition = transitionUpdateTransition;
            }
            int i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
            float f5 = 1.0f;
            if (i7 == 1) {
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                InputPhase inputPhase3 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-1082240119);
                if (ComposerKt.isTraceInProgress()) {
                    f2 = fValueOf;
                    inputPhase = inputPhase3;
                    i3 = -1;
                    ComposerKt.traceEventStart(-1082240119, 0, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:594)");
                } else {
                    f2 = fValueOf;
                    inputPhase = inputPhase3;
                    i3 = -1;
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
                if (i4 == 1) {
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Transition transition2 = transition;
                    State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer3, int i8) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceGroup(831788644);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(831788644, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:604)");
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
                            composer3.endReplaceGroup();
                            return tweenSpecTween;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                    InputPhase inputPhase4 = (InputPhase) transition2.getCurrentState();
                    composerStartRestartGroup.startReplaceGroup(1758344392);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1758344392, 0, i3, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:622)");
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                    if (i5 == 1) {
                        f4 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf2 = Float.valueOf(f4);
                        InputPhase inputPhase5 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceGroup(1758344392);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1758344392, 0, i3, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:622)");
                        }
                        i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z) {
                            }
                            f5 = 0.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, fValueOf2, Float.valueOf(f5), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return invoke(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer3.startReplaceGroup(412246452);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(412246452, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:630)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase6 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceGroup(-15504215);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-15504215, 0, i3, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:633)");
                        }
                        long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()] == 1 ? j3 : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j4);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                        InputPhase inputPhase7 = (InputPhase) transition2.getCurrentState();
                        composerStartRestartGroup.startReplaceGroup(-15504215);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-15504215, 0, i3, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:633)");
                        }
                        long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] != 1 ? j3 : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Color colorM3647boximpl = Color.m3647boximpl(j5);
                        InputPhase inputPhase8 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceGroup(-15504215);
                        if (ComposerKt.isTraceInProgress()) {
                            color = colorM3647boximpl;
                        } else {
                            color = colorM3647boximpl;
                            ComposerKt.traceEventStart(-15504215, 0, i3, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:633)");
                        }
                        long j6 = WhenMappings.$EnumSwitchMapping$0[inputPhase8.ordinal()] != 1 ? j3 : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition2, color, Color.m3647boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelContentColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return invoke(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer3.startReplaceGroup(1054273641);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1054273641, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:640)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        int i8 = (i2 & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        colorSpaceM3661getColorSpaceimpl2 = Color.m3661getColorSpaceimpl(contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf((i8 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).m3667unboximpl());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                        Object currentState = transition2.getCurrentState();
                        int i9 = ((((i8 << 3) & 57344) | 3072) >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                        composer2 = composerStartRestartGroup;
                        State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transition2, contentColor.invoke(currentState, composerStartRestartGroup, Integer.valueOf(i9)), contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf(i9)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m3647boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation3)), Color.m3647boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation4)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation2)), composer2, Integer.valueOf(57344 & (i2 >> 3)));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i5 == 2) {
                            if (z) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Float fValueOf22 = Float.valueOf(f4);
                            InputPhase inputPhase52 = (InputPhase) transition2.getTargetState();
                            composerStartRestartGroup.startReplaceGroup(1758344392);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()];
                            if (i6 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transition2, fValueOf22, Float.valueOf(f5), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer3, int i82) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer3.startReplaceGroup(412246452);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(412246452, i82, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:630)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase62 = (InputPhase) transition2.getTargetState();
                            composerStartRestartGroup.startReplaceGroup(-15504215);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j4);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                                InputPhase inputPhase72 = (InputPhase) transition2.getCurrentState();
                                composerStartRestartGroup.startReplaceGroup(-15504215);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Color colorM3647boximpl2 = Color.m3647boximpl(j5);
                                InputPhase inputPhase82 = (InputPhase) transition2.getTargetState();
                                composerStartRestartGroup.startReplaceGroup(-15504215);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase82.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                State stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transition2, color, Color.m3647boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return invoke(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer3, int i82) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer3.startReplaceGroup(1054273641);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1054273641, i82, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:640)");
                                        }
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return tweenSpecTween$default;
                                    }
                                };
                                int i82 = (i2 & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                colorSpaceM3661getColorSpaceimpl2 = Color.m3661getColorSpaceimpl(contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf((i82 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).m3667unboximpl());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3661getColorSpaceimpl2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                                    Object currentState2 = transition2.getCurrentState();
                                    int i92 = ((((i82 << 3) & 57344) | 3072) >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                    composer2 = composerStartRestartGroup;
                                    State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transition2, contentColor.invoke(currentState2, composerStartRestartGroup, Integer.valueOf(i92)), contentColor.invoke(transition2.getTargetState(), composerStartRestartGroup, Integer.valueOf(i92)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m3647boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation32)), Color.m3647boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation42)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation22)), composer2, Integer.valueOf(57344 & (i2 >> 3)));
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                        } else if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f4 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf222 = Float.valueOf(f4);
                        InputPhase inputPhase522 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceGroup(1758344392);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()];
                        if (i6 != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        State stateCreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transition2, fValueOf222, Float.valueOf(f5), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return invoke(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer3, int i822) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer3.startReplaceGroup(412246452);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(412246452, i822, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:630)");
                                }
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return tweenSpecTween$default;
                            }
                        };
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase622 = (InputPhase) transition2.getTargetState();
                        composerStartRestartGroup.startReplaceGroup(-15504215);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()] == 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorSpaceM3661getColorSpaceimpl = Color.m3661getColorSpaceimpl(j4);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(colorSpaceM3661getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Transition transition22 = transition;
                    State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transition22, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer3, int i83) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceGroup(831788644);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(831788644, i83, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:604)");
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
                            composer3.endReplaceGroup();
                            return tweenSpecTween;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                    InputPhase inputPhase42 = (InputPhase) transition22.getCurrentState();
                    composerStartRestartGroup.startReplaceGroup(1758344392);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                    if (i5 == 1) {
                    }
                } else {
                    f3 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Transition transition222 = transition;
                    State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transition222, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer3, int i83) {
                            TweenSpec tweenSpecTween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceGroup(831788644);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(831788644, i83, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:604)");
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
                            composer3.endReplaceGroup();
                            return tweenSpecTween;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
                    InputPhase inputPhase422 = (InputPhase) transition222.getCurrentState();
                    composerStartRestartGroup.startReplaceGroup(1758344392);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                    if (i5 == 1) {
                    }
                }
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf3 = Float.valueOf(f);
                InputPhase inputPhase32 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-1082240119);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
                if (i4 == 1) {
                }
            } else {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf32 = Float.valueOf(f);
                InputPhase inputPhase322 = (InputPhase) transition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-1082240119);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
                if (i4 == 1) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j7 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldTransitionScope.Transition_DTcfvLk$lambda$7(this.f$0, inputState, j7, j2, contentColor, z, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }
}
