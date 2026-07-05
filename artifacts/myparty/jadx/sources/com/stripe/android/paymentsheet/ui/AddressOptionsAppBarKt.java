package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressOptionsAppBar.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AddressOptionsAppBar", "", "isRootScreen", "", "onButtonClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressOptionsAppBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressOptionsAppBar$lambda$0(boolean z, Function0 function0, int i, Composer composer, int i2) {
        AddressOptionsAppBar(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AddressOptionsAppBar(final boolean z, final Function0<Unit> onButtonClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-111772214);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111772214, i2, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:20)");
            }
            AppBarKt.m1762TopAppBarHsRjFd4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU(), 0L, Dp.m6117constructorimpl(0), null, ComposableLambdaKt.rememberComposableLambda(663677113, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt.AddressOptionsAppBar.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TopAppBar, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                    if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(663677113, i3, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:26)");
                        }
                        Function0<Unit> function0 = onButtonClick;
                        final boolean z2 = z;
                        IconButtonKt.IconButton(function0, null, false, null, ComposableLambdaKt.rememberComposableLambda(782248533, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt.AddressOptionsAppBar.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                int i5;
                                int i6;
                                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(782248533, i4, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous>.<anonymous> (AddressOptionsAppBar.kt:29)");
                                    }
                                    if (z2) {
                                        i5 = R.drawable.stripe_ic_paymentsheet_close;
                                    } else {
                                        i5 = R.drawable.stripe_ic_paymentsheet_back;
                                    }
                                    Painter painterPainterResource = PainterResources_androidKt.painterResource(i5, composer3, 0);
                                    if (z2) {
                                        i6 = R.string.stripe_paymentsheet_close;
                                    } else {
                                        i6 = com.stripe.android.ui.core.R.string.stripe_back;
                                    }
                                    IconKt.m1925Iconww6aTOc(painterPainterResource, StringResources_androidKt.stringResource(i6, composer3, 0), (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer3, MaterialTheme.$stable).m8724getAppBarIcon0d7_KjU(), composer3, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 24576, 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 199686, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressOptionsAppBarKt.AddressOptionsAppBar$lambda$0(z, onButtonClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
