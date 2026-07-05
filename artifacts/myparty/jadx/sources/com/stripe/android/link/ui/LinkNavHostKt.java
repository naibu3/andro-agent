package com.stripe.android.link.ui;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.ui.LinkNavHostKt;
import com.stripe.android.link.utils.AnimationsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkNavHost.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\f\u001a,\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, d2 = {"LinkNavHost", "", "navController", "Landroidx/navigation/NavHostController;", "startDestination", "", "modifier", "Landroidx/compose/ui/Modifier;", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LocalLinkScreenSizeInternal", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/DpSize;", "LocalLinkScreenSize", "Landroidx/compose/runtime/CompositionLocal;", "getLocalLinkScreenSize", "()Landroidx/compose/runtime/CompositionLocal;", "ProvideLinkScreenSize", "size", "Landroidx/compose/ui/unit/IntSize;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ProvideLinkScreenSize-gCN15gs", "(Landroidx/compose/ui/unit/IntSize;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "screenSize"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkNavHostKt {
    private static final CompositionLocal<DpSize> LocalLinkScreenSize;
    private static final ProvidableCompositionLocal<DpSize> LocalLinkScreenSizeInternal;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkNavHost$lambda$3(NavHostController navHostController, String str, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        LinkNavHost(navHostController, str, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DpSize LocalLinkScreenSizeInternal$lambda$4() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideLinkScreenSize_gCN15gs$lambda$7(IntSize intSize, Function2 function2, int i, Composer composer, int i2) {
        m7862ProvideLinkScreenSizegCN15gs(intSize, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LinkNavHost(final NavHostController navController, final String startDestination, Modifier modifier, final Function1<? super NavGraphBuilder, Unit> builder, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1633503243);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(startDestination) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(builder) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633503243, i3, -1, "com.stripe.android.link.ui.LinkNavHost (LinkNavHost.kt:35)");
            }
            boolean z = !Intrinsics.areEqual(WindowInsets_androidKt.getImeAnimationSource(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsets_androidKt.getImeAnimationTarget(WindowInsets.INSTANCE, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceGroup(-228117693);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier4 = modifier3;
            m7862ProvideLinkScreenSizegCN15gs(LinkNavHost$lambda$1(mutableState), ComposableLambdaKt.rememberComposableLambda(-1551798703, true, new AnonymousClass1(modifier4, z, navController, startDestination, builder, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkNavHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkNavHostKt.LinkNavHost$lambda$3(navController, startDestination, modifier2, builder, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LinkNavHost.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.LinkNavHostKt$LinkNavHost$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<NavGraphBuilder, Unit> $builder;
        final /* synthetic */ boolean $isImeAnimating;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<IntSize> $screenSize$delegate;
        final /* synthetic */ String $startDestination;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Modifier modifier, boolean z, NavHostController navHostController, String str, Function1<? super NavGraphBuilder, Unit> function1, MutableState<IntSize> mutableState) {
            this.$modifier = modifier;
            this.$isImeAnimating = z;
            this.$navController = navHostController;
            this.$startDestination = str;
            this.$builder = function1;
            this.$screenSize$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Function1 function1;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551798703, i, -1, "com.stripe.android.link.ui.LinkNavHost.<anonymous> (LinkNavHost.kt:43)");
            }
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1647448970);
            final MutableState<IntSize> mutableState = this.$screenSize$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.LinkNavHostKt$LinkNavHost$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkNavHostKt.AnonymousClass1.invoke$lambda$1$lambda$0(mutableState, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, (Function1) objRememberedValue);
            composer.startReplaceGroup(1647472411);
            if (this.$isImeAnimating) {
                function1 = null;
            } else {
                composer.startReplaceGroup(1647474877);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.LinkNavHostKt$LinkNavHost$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkNavHostKt.AnonymousClass1.invoke$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
            }
            Function1 function12 = function1;
            composer.endReplaceGroup();
            NavHostController navHostController = this.$navController;
            String str = this.$startDestination;
            composer.startReplaceGroup(1647453570);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.link.ui.LinkNavHostKt$LinkNavHost$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkNavHostKt.AnonymousClass1.invoke$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1647455938);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.link.ui.LinkNavHostKt$LinkNavHost$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkNavHostKt.AnonymousClass1.invoke$lambda$7$lambda$6((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            NavHostKt.NavHost(navHostController, str, modifierOnSizeChanged, null, null, function13, (Function1) objRememberedValue4, null, null, function12, this.$builder, composer, 1769472, 0, 408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, IntSize intSize) {
            LinkNavHostKt.LinkNavHost$lambda$2(mutableState, intSize);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnterTransition invoke$lambda$5$lambda$4(AnimatedContentTransitionScope NavHost) {
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            return AnimationsKt.getLinkScreenTransition().getTargetContentEnter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExitTransition invoke$lambda$7$lambda$6(AnimatedContentTransitionScope NavHost) {
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            return AnimationsKt.getLinkScreenTransition().getInitialContentExit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SizeTransform invoke$lambda$3$lambda$2(AnimatedContentTransitionScope NavHost) {
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            return AnimationsKt.getLinkScreenTransition().getSizeTransform();
        }
    }

    private static final IntSize LinkNavHost$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue();
    }

    static {
        ProvidableCompositionLocal<DpSize> providableCompositionLocalCompositionLocalOf$default = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.stripe.android.link.ui.LinkNavHostKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkNavHostKt.LocalLinkScreenSizeInternal$lambda$4();
            }
        }, 1, null);
        LocalLinkScreenSizeInternal = providableCompositionLocalCompositionLocalOf$default;
        LocalLinkScreenSize = providableCompositionLocalCompositionLocalOf$default;
    }

    public static final CompositionLocal<DpSize> getLocalLinkScreenSize() {
        return LocalLinkScreenSize;
    }

    /* renamed from: ProvideLinkScreenSize-gCN15gs, reason: not valid java name */
    public static final void m7862ProvideLinkScreenSizegCN15gs(final IntSize intSize, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        DpSize dpSizeM6203boximpl;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-649629311);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(intSize) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649629311, i2, -1, "com.stripe.android.link.ui.ProvideLinkScreenSize (LinkNavHost.kt:73)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume;
            if (intSize != null) {
                long packedValue = intSize.getPackedValue();
                dpSizeM6203boximpl = DpSize.m6203boximpl(DpKt.m6139DpSizeYgX7TsA(density.mo709toDpu2uoSUM(IntSize.m6287getWidthimpl(packedValue)), density.mo709toDpu2uoSUM(IntSize.m6286getHeightimpl(packedValue))));
            } else {
                dpSizeM6203boximpl = null;
            }
            CompositionLocalKt.CompositionLocalProvider(LocalLinkScreenSizeInternal.provides(dpSizeM6203boximpl), content, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkNavHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkNavHostKt.ProvideLinkScreenSize_gCN15gs$lambda$7(intSize, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkNavHost$lambda$2(MutableState<IntSize> mutableState, IntSize intSize) {
        mutableState.setValue(intSize);
    }
}
