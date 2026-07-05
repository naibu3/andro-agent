package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.stripe.android.financialconnections.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkLoginWarmupScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$NetworkingLinkLoginWarmupScreenKt {
    public static final ComposableSingletons$NetworkingLinkLoginWarmupScreenKt INSTANCE = new ComposableSingletons$NetworkingLinkLoginWarmupScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f98lambda1 = ComposableLambdaKt.composableLambdaInstance(1685113889, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1685113889, i, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt.lambda-1.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:80)");
            }
            NetworkingLinkLoginWarmupScreenKt.HeaderSection(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f99lambda2 = ComposableLambdaKt.composableLambdaInstance(-540276609, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FinancialConnectionsButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540276609, i, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt.lambda-2.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:139)");
            }
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_networking_link_login_warmup_cta_continue, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7437getLambda1$financial_connections_release() {
        return f98lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7438getLambda2$financial_connections_release() {
        return f99lambda2;
    }
}
