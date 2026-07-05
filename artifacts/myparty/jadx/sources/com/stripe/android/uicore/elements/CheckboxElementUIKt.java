package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.uicore.elements.menu.CheckboxKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckboxElementUI.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"CheckboxElementUI", "", "modifier", "Landroidx/compose/ui/Modifier;", "automationTestTag", "", "isChecked", "", "label", "isEnabled", "onValueChange", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxElementUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxElementUI$lambda$2(Modifier modifier, String str, boolean z, String str2, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        CheckboxElementUI(modifier, str, z, str2, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxElementUI(Modifier modifier, String str, boolean z, final String label, boolean z2, final Function1<? super Boolean, Unit> onValueChange, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        boolean z3;
        int i5;
        final boolean z4;
        final Modifier.Companion companion;
        final String str3;
        final boolean z5;
        int i6;
        final String strStringResource;
        boolean zChanged;
        Object objRememberedValue;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1416537179);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(label) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        str3 = i8 == 0 ? "" : str2;
                        z5 = i4 == 0 ? false : z3;
                        if (i5 != 0) {
                            z4 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1416537179, i3, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:26)");
                        }
                        if (!z5) {
                            i6 = R.string.selected;
                        } else {
                            i6 = R.string.not_selected;
                        }
                        strStringResource = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1147868861, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt.CheckboxElementUI.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1147868861, i9, -1, "com.stripe.android.uicore.elements.CheckboxElementUI.<anonymous> (CheckboxElementUI.kt:37)");
                                    }
                                    CheckboxKt.Checkbox(z5, null, null, z4, composer2, 48, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-893479454, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt.CheckboxElementUI.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-893479454, i9, -1, "com.stripe.android.uicore.elements.CheckboxElementUI.<anonymous> (CheckboxElementUI.kt:44)");
                                    }
                                    H6TextKt.H6Text(label, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), false, composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(-1271028331);
                        zChanged = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | composerStartRestartGroup.changed(strStringResource);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckboxElementUIKt.CheckboxElementUI$lambda$1$lambda$0(str3, strStringResource, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        CenteredTextLayoutKt.CenteredTextLayout(composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, SizeKt.fillMaxWidth$default(ToggleableKt.m1278toggleableXHw0xAI(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), z5, z4, Role.m5405boximpl(Role.INSTANCE.m5413getCheckboxo7Vup1c()), onValueChange), 0.0f, 1, null), composerStartRestartGroup, 54, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        str3 = str2;
                        z6 = z3;
                    }
                    final boolean z7 = z4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CheckboxElementUIKt.CheckboxElementUI$lambda$2(companion, str3, z6, label, z7, onValueChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z4 = z2;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!z5) {
                    }
                    strStringResource = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1147868861, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt.CheckboxElementUI.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1147868861, i9, -1, "com.stripe.android.uicore.elements.CheckboxElementUI.<anonymous> (CheckboxElementUI.kt:37)");
                                }
                                CheckboxKt.Checkbox(z5, null, null, z4, composer2, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(-893479454, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt.CheckboxElementUI.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-893479454, i9, -1, "com.stripe.android.uicore.elements.CheckboxElementUI.<anonymous> (CheckboxElementUI.kt:44)");
                                }
                                H6TextKt.H6Text(label, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), false, composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1271028331);
                    zChanged = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | composerStartRestartGroup.changed(strStringResource);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.CheckboxElementUIKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CheckboxElementUIKt.CheckboxElementUI$lambda$1$lambda$0(str3, strStringResource, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        CenteredTextLayoutKt.CenteredTextLayout(composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, SizeKt.fillMaxWidth$default(ToggleableKt.m1278toggleableXHw0xAI(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), z5, z4, Role.m5405boximpl(Role.INSTANCE.m5413getCheckboxo7Vup1c()), onValueChange), 0.0f, 1, null), composerStartRestartGroup, 54, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z6 = z5;
                    }
                }
                final boolean z72 = z4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i2 & 8) != 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            final boolean z722 = z4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i2 & 8) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        final boolean z7222 = z4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxElementUI$lambda$1$lambda$0(String str, String str2, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, str);
        SemanticsPropertiesKt.setStateDescription(semantics, str2);
        return Unit.INSTANCE;
    }
}
