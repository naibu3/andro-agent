package com.stripe.android.ui.core.elements;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.H6TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleDialogElementUI.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0002\u0010\u000f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TEST_TAG_DIALOG_CONFIRM_BUTTON", "", "TEST_TAG_DIALOG_DISMISS_BUTTON", "TEST_TAG_SIMPLE_DIALOG", "SimpleDialogElementUI", "", "titleText", "messageText", "confirmText", "dismissText", "destructive", "", "onConfirmListener", "Lkotlin/Function0;", "onDismissListener", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleDialogElementUIKt {
    public static final String TEST_TAG_DIALOG_CONFIRM_BUTTON = "simple_dialog_confirm_button";
    public static final String TEST_TAG_DIALOG_DISMISS_BUTTON = "simple_dialog_dismiss_button";
    public static final String TEST_TAG_SIMPLE_DIALOG = "simple_dialog";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleDialogElementUI$lambda$0(String str, String str2, String str3, String str4, boolean z, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        SimpleDialogElementUI(str, str2, str3, str4, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: SimpleDialogElementUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $confirmText;
        final /* synthetic */ boolean $destructive;
        final /* synthetic */ String $dismissText;
        final /* synthetic */ String $messageText;
        final /* synthetic */ Function0<Unit> $onConfirmListener;
        final /* synthetic */ Function0<Unit> $onDismissListener;
        final /* synthetic */ String $titleText;

        AnonymousClass1(String str, Function0<Unit> function0, Function0<Unit> function02, String str2, boolean z, String str3, String str4) {
            this.$messageText = str;
            this.$onDismissListener = function0;
            this.$onConfirmListener = function02;
            this.$confirmText = str2;
            this.$destructive = z;
            this.$dismissText = str3;
            this.$titleText = str4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1760112139, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:35)");
                }
                Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, SimpleDialogElementUIKt.TEST_TAG_SIMPLE_DIALOG);
                final String str = this.$messageText;
                composer.startReplaceGroup(-1105761405);
                ComposableLambda composableLambdaRememberComposableLambda = str == null ? null : ComposableLambdaKt.rememberComposableLambda(-1639783005, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1639783005, i2, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:45)");
                        }
                        H6TextKt.H6Text(str, null, false, composer2, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54);
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1105766663);
                boolean zChanged = composer.changed(this.$onDismissListener);
                final Function0<Unit> function0 = this.$onDismissListener;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SimpleDialogElementUIKt.AnonymousClass1.invoke$lambda$2$lambda$1(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(746698413, true, new AnonymousClass3(this.$onConfirmListener, this.$confirmText, this.$destructive), composer, 54);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1029376661, true, new AnonymousClass4(this.$onDismissListener, this.$dismissText), composer, 54);
                final String str2 = this.$titleText;
                AndroidAlertDialog_androidKt.m1753AlertDialog6oU6zVQ(function02, composableLambdaRememberComposableLambda2, modifierTestTag, composableLambdaRememberComposableLambda3, ComposableLambdaKt.rememberComposableLambda(-1917414198, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt.SimpleDialogElementUI.1.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1917414198, i2, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:41)");
                        }
                        H4TextKt.H4Text(str2, null, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composableLambdaRememberComposableLambda, null, 0L, 0L, null, composer, 28080, 960);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* compiled from: SimpleDialogElementUI.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ String $confirmText;
            final /* synthetic */ boolean $destructive;
            final /* synthetic */ Function0<Unit> $onConfirmListener;

            AnonymousClass3(Function0<Unit> function0, String str, boolean z) {
                this.$onConfirmListener = function0;
                this.$confirmText = str;
                this.$destructive = z;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(746698413, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:49)");
                    }
                    Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, SimpleDialogElementUIKt.TEST_TAG_DIALOG_CONFIRM_BUTTON);
                    composer.startReplaceGroup(-1803938456);
                    boolean zChanged = composer.changed(this.$onConfirmListener);
                    final Function0<Unit> function0 = this.$onConfirmListener;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SimpleDialogElementUIKt.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function02 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    final String str = this.$confirmText;
                    final boolean z = this.$destructive;
                    ButtonKt.TextButton(function02, modifierTestTag, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1995969808, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt.SimpleDialogElementUI.1.3.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TextButton, Composer composer2, int i2) {
                            long jM3693getUnspecified0d7_KjU;
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1995969808, i2, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:55)");
                                }
                                String str2 = str;
                                composer2.startReplaceGroup(399781910);
                                if (z) {
                                    jM3693getUnspecified0d7_KjU = MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1827getError0d7_KjU();
                                } else {
                                    jM3693getUnspecified0d7_KjU = Color.INSTANCE.m3693getUnspecified0d7_KjU();
                                }
                                composer2.endReplaceGroup();
                                TextKt.m2076Text4IGK_g(str2, (Modifier) null, jM3693getUnspecified0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1(), composer2, 0, 0, 65530);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: SimpleDialogElementUI.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ String $dismissText;
            final /* synthetic */ Function0<Unit> $onDismissListener;

            AnonymousClass4(Function0<Unit> function0, String str) {
                this.$onDismissListener = function0;
                this.$dismissText = str;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1029376661, i, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:67)");
                    }
                    Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, SimpleDialogElementUIKt.TEST_TAG_DIALOG_DISMISS_BUTTON);
                    composer.startReplaceGroup(-1803917432);
                    boolean zChanged = composer.changed(this.$onDismissListener);
                    final Function0<Unit> function0 = this.$onDismissListener;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$1$4$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SimpleDialogElementUIKt.AnonymousClass1.AnonymousClass4.invoke$lambda$1$lambda$0(function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function02 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    final String str = this.$dismissText;
                    ButtonKt.TextButton(function02, modifierTestTag, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(219894734, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt.SimpleDialogElementUI.1.4.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TextButton, Composer composer2, int i2) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(219894734, i2, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:73)");
                                }
                                TextKt.m2076Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1(), composer2, 0, 0, 65534);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimpleDialogElementUI(final String titleText, final String str, final String confirmText, final String dismissText, boolean z, final Function0<Unit> onConfirmListener, final Function0<Unit> onDismissListener, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        boolean z2;
        final boolean z3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        Intrinsics.checkNotNullParameter(onConfirmListener, "onConfirmListener");
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-165056289);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(titleText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(confirmText) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(dismissText) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onConfirmListener) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismissListener) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-165056289, i3, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str3 = str2;
                    z3 = z4;
                    composer2 = composerStartRestartGroup;
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1760112139, true, new AnonymousClass1(str3, onDismissListener, onConfirmListener, confirmText, z3, dismissText, titleText), composerStartRestartGroup, 54), composer2, 12582912, 127);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SimpleDialogElementUIKt.SimpleDialogElementUI$lambda$0(titleText, str, confirmText, dismissText, z3, onConfirmListener, onDismissListener, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                String str32 = str2;
                z3 = z4;
                composer2 = composerStartRestartGroup;
                StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1760112139, true, new AnonymousClass1(str32, onDismissListener, onConfirmListener, confirmText, z3, dismissText, titleText), composerStartRestartGroup, 54), composer2, 12582912, 127);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
