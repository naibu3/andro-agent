package com.stripe.android.financialconnections.navigation;

import android.net.Uri;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.navigation.bottomsheet.BackstackSafeContentKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destination.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0000\u001a$\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000\u001a$\u0010\f\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¨\u0006\r"}, d2 = {"appendParamValues", "", NativeProtocol.WEB_DIALOG_PARAMS, "", ComposeNavigator.NAME, "", "Landroidx/navigation/NavGraphBuilder;", ShareConstants.DESTINATION, "Lcom/stripe/android/financialconnections/navigation/Destination;", "deepLinks", "", "Landroidx/navigation/NavDeepLink;", "bottomSheet", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DestinationKt {
    public static final String appendParamValues(String str, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                builderBuildUpon.appendQueryParameter(key, value);
            }
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, Destination destination, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        composable(navGraphBuilder, destination, list);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, final Destination destination, List<NavDeepLink> deepLinks) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        NavGraphBuilderKt.composable$default(navGraphBuilder, destination.getFullRoute(), destination.getArguments(), deepLinks, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1589095604, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.DestinationKt.composable.1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1589095604, i, -1, "com.stripe.android.financialconnections.navigation.composable.<anonymous> (Destination.kt:263)");
                }
                destination.Composable(it, composer, (i >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 248, null);
    }

    public static /* synthetic */ void bottomSheet$default(NavGraphBuilder navGraphBuilder, Destination destination, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        bottomSheet(navGraphBuilder, destination, list);
    }

    public static final void bottomSheet(NavGraphBuilder navGraphBuilder, final Destination destination, List<NavDeepLink> deepLinks) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        com.stripe.android.financialconnections.navigation.bottomsheet.NavGraphBuilderKt.bottomSheet(navGraphBuilder, destination.getFullRoute(), destination.getArguments(), deepLinks, ComposableLambdaKt.composableLambdaInstance(2065068697, true, new Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.DestinationKt.bottomSheet.1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(columnScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope bottomSheet, final NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(bottomSheet, "$this$bottomSheet");
                Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2065068697, i, -1, "com.stripe.android.financialconnections.navigation.bottomSheet.<anonymous> (Destination.kt:276)");
                }
                final Destination destination2 = destination;
                BackstackSafeContentKt.LifecycleAwareContent(navBackStackEntry, ComposableLambdaKt.rememberComposableLambda(-1233877248, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.DestinationKt.bottomSheet.1.1
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
                            ComposerKt.traceEventStart(-1233877248, i2, -1, "com.stripe.android.financialconnections.navigation.bottomSheet.<anonymous>.<anonymous> (Destination.kt:277)");
                        }
                        destination2.Composable(navBackStackEntry, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ((i >> 3) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
