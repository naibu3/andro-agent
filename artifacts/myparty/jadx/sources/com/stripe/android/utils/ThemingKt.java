package com.stripe.android.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.util.UriUtil;
import com.google.accompanist.themeadapter.appcompat.AppCompatTheme;
import com.google.accompanist.themeadapter.material.MdcTheme;
import com.google.accompanist.themeadapter.material.R;
import com.google.accompanist.themeadapter.material3.Mdc3Theme;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theming.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"AppCompatOrMdcTheme", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppCompatOrMdcTheme$lambda$4(Function2 function2, int i, Composer composer, int i2) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AppCompatOrMdcTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppCompatOrMdcTheme(Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1640440780);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1640440780, i2, -1, "com.stripe.android.utils.AppCompatOrMdcTheme (Theming.kt:15)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1777320314);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.ThemeAdapterMaterialTheme);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.ThemeAdapterMaterialTheme_isMaterialTheme);
                typedArrayObtainStyledAttributes.recycle();
                objRememberedValue = Boolean.valueOf(zHasValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1777312629);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(com.google.accompanist.themeadapter.material3.R.styleable.ThemeAdapterMaterial3Theme);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
                boolean zHasValue2 = typedArrayObtainStyledAttributes2.hasValue(com.google.accompanist.themeadapter.material3.R.styleable.ThemeAdapterMaterial3Theme_isMaterial3Theme);
                typedArrayObtainStyledAttributes2.recycle();
                objRememberedValue2 = Boolean.valueOf(zHasValue2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean zBooleanValue2 = ((Boolean) objRememberedValue2).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceGroup(738119044);
                function2 = content;
                MdcTheme.MdcTheme(null, false, false, false, false, false, function2, composerStartRestartGroup, (i2 << 18) & 3670016, 63);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function2 = content;
                if (zBooleanValue2) {
                    composerStartRestartGroup.startReplaceGroup(738189507);
                    Mdc3Theme.Mdc3Theme(null, false, false, false, false, false, function2, composerStartRestartGroup, (i2 << 18) & 3670016, 63);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(738239262);
                    AppCompatTheme.AppCompatTheme(null, false, false, null, function2, composerStartRestartGroup, (i2 << 12) & 57344, 15);
                    function2 = function2;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = content;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.utils.ThemingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemingKt.AppCompatOrMdcTheme$lambda$4(function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
