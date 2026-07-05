package com.stripe.android.financialconnections.features.common;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthPreviewParameterProvider;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SharedPartnerAuth.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001aM\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0013\u001aM\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u0015\u001ac\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u001e\u001ac\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010#\u001a\u0015\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010'\u001aO\u0010(\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010*\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010+\u001a\u001f\u0010,\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020.H\u0003¢\u0006\u0002\u0010/\u001a\u001d\u00100\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u00101\u001a\u00020\tH\u0003¢\u0006\u0002\u00102\u001a\u0017\u00103\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u00104\u001a\u0017\u00105\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u00104\"\u000e\u00106\u001a\u000207X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u000207X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020:X\u0082T¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"SharedPartnerAuth", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;", "onContinueClick", "Lkotlin/Function0;", "onCancelClick", "onClickableTextClick", "Lkotlin/Function1;", "", "onWebAuthFlowFinished", "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;", "onViewEffectLaunched", "inModal", "", "(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "SharedPartnerAuthContent", "(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SharedPartnerLoading", "(ZLandroidx/compose/runtime/Composer;I)V", "SharedPartnerAuthBody", "(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LoadedContent", "showInModal", "isRelinkSession", "authenticationStatus", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;", "payload", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;", "(ZZLcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PrePaneContent", "showSecondaryButton", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "(ZZLcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PrepaneImage", "bodyItem", "Lcom/stripe/android/financialconnections/model/Entry$Image;", "(Lcom/stripe/android/financialconnections/model/Entry$Image;Landroidx/compose/runtime/Composer;I)V", "PrepaneFooter", "status", "oAuthPrepane", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/OauthPrepane;ZZLandroidx/compose/runtime/Composer;I)V", "PrepaneHeader", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/financialconnections/model/OauthPrepane;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GifWebView", "gifUrl", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PartnerAuthPreview", "(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Landroidx/compose/runtime/Composer;I)V", "PartnerAuthDrawerPreview", "PHONE_BACKGROUND_WIDTH_DP", "", "PHONE_BACKGROUND_HEIGHT_DP", "WEBVIEW_ALPHA", "", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPartnerAuthKt {
    private static final int PHONE_BACKGROUND_HEIGHT_DP = 200;
    private static final int PHONE_BACKGROUND_WIDTH_DP = 240;
    private static final float WEBVIEW_ALPHA = 0.99f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifWebView$lambda$39(Modifier modifier, String str, int i, Composer composer, int i2) {
        GifWebView(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$9(boolean z, boolean z2, Async async, SharedPartnerAuthState.Payload payload, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        LoadedContent(z, z2, async, payload, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PartnerAuthDrawerPreview$lambda$41(SharedPartnerAuthState sharedPartnerAuthState, int i, Composer composer, int i2) {
        PartnerAuthDrawerPreview(sharedPartnerAuthState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PartnerAuthPreview$lambda$40(SharedPartnerAuthState sharedPartnerAuthState, int i, Composer composer, int i2) {
        PartnerAuthPreview(sharedPartnerAuthState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrePaneContent$lambda$14(boolean z, boolean z2, OauthPrepane oauthPrepane, Async async, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        PrePaneContent(z, z2, oauthPrepane, async, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneFooter$lambda$22(Function0 function0, Function0 function02, Async async, OauthPrepane oauthPrepane, boolean z, boolean z2, int i, Composer composer, int i2) {
        PrepaneFooter(function0, function02, async, oauthPrepane, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneHeader$lambda$31(OauthPrepane oauthPrepane, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrepaneHeader(oauthPrepane, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneImage$lambda$16(Entry.Image image, int i, Composer composer, int i2) {
        PrepaneImage(image, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SharedPartnerAuth$lambda$3(SharedPartnerAuthState sharedPartnerAuthState, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, boolean z, int i, Composer composer, int i2) {
        SharedPartnerAuth(sharedPartnerAuthState, function0, function02, function1, function12, function03, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SharedPartnerAuthBody$lambda$8(SharedPartnerAuthState sharedPartnerAuthState, boolean z, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        SharedPartnerAuthBody(sharedPartnerAuthState, z, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SharedPartnerAuthContent$lambda$4(SharedPartnerAuthState sharedPartnerAuthState, boolean z, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SharedPartnerAuthContent(sharedPartnerAuthState, z, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SharedPartnerLoading$lambda$5(boolean z, int i, Composer composer, int i2) {
        SharedPartnerLoading(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SharedPartnerAuth(final SharedPartnerAuthState state, final Function0<Unit> onContinueClick, final Function0<Unit> onCancelClick, final Function1<? super String, Unit> onClickableTextClick, final Function1<? super WebAuthFlowState, Unit> onWebAuthFlowFinished, final Function0<Unit> onViewEffectLaunched, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onWebAuthFlowFinished, "onWebAuthFlowFinished");
        Intrinsics.checkNotNullParameter(onViewEffectLaunched, "onViewEffectLaunched");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1861935187);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWebAuthFlowFinished) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewEffectLaunched) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1861935187, i2, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuth (SharedPartnerAuth.kt:79)");
            }
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = ComposeExtensionsKt.collectAsState(financialConnectionsSheetNativeViewModelParentViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((FinancialConnectionsSheetNativeState) obj).getWebAuthFlow();
                }
            }, composerStartRestartGroup, 0);
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            UriHandler uriHandler = (UriHandler) objConsume;
            Object value = stateCollectAsState.getValue();
            composerStartRestartGroup.startReplaceGroup(1738859714);
            boolean zChanged = ((i2 & 57344) == 16384) | composerStartRestartGroup.changed(stateCollectAsState);
            SharedPartnerAuthKt$SharedPartnerAuth$1$1 sharedPartnerAuthKt$SharedPartnerAuth$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || sharedPartnerAuthKt$SharedPartnerAuth$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                sharedPartnerAuthKt$SharedPartnerAuth$1$1RememberedValue = new SharedPartnerAuthKt$SharedPartnerAuth$1$1(onWebAuthFlowFinished, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(sharedPartnerAuthKt$SharedPartnerAuth$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sharedPartnerAuthKt$SharedPartnerAuth$1$1RememberedValue, composerStartRestartGroup, 0);
            SharedPartnerAuthState.ViewEffect viewEffect = state.getViewEffect();
            composerStartRestartGroup.startReplaceGroup(1738862551);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(2079611257);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel) | ((458752 & i2) == 131072);
                SharedPartnerAuthKt$SharedPartnerAuth$2$1$1 sharedPartnerAuthKt$SharedPartnerAuth$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || sharedPartnerAuthKt$SharedPartnerAuth$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    sharedPartnerAuthKt$SharedPartnerAuth$2$1$1RememberedValue = new SharedPartnerAuthKt$SharedPartnerAuth$2$1$1(viewEffect, uriHandler, financialConnectionsSheetNativeViewModelParentViewModel, onViewEffectLaunched, null);
                    composerStartRestartGroup.updateRememberedValue(sharedPartnerAuthKt$SharedPartnerAuth$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sharedPartnerAuthKt$SharedPartnerAuth$2$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = (i2 & 14) | ((i2 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i2 >> 3) & 896);
            int i4 = i2 << 6;
            SharedPartnerAuthContent(state, z, onClickableTextClick, onContinueClick, onCancelClick, composerStartRestartGroup, (i4 & 57344) | i3 | (i4 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.SharedPartnerAuth$lambda$3(state, onContinueClick, onCancelClick, onClickableTextClick, onWebAuthFlowFinished, onViewEffectLaunched, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SharedPartnerAuthContent(SharedPartnerAuthState sharedPartnerAuthState, boolean z, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final SharedPartnerAuthState sharedPartnerAuthState2;
        final boolean z2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        final Function1<? super String, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(919704421);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sharedPartnerAuthState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919704421, i2, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuthContent (SharedPartnerAuth.kt:115)");
            }
            SharedPartnerAuthBody(sharedPartnerAuthState, z, function02, function0, function1, composerStartRestartGroup, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 >> 6) & 896) | (i2 & 7168) | ((i2 << 6) & 57344));
            sharedPartnerAuthState2 = sharedPartnerAuthState;
            z2 = z;
            function03 = function02;
            function04 = function0;
            function12 = function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function02;
            function04 = function0;
            function12 = function1;
            z2 = z;
            sharedPartnerAuthState2 = sharedPartnerAuthState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.SharedPartnerAuthContent$lambda$4(sharedPartnerAuthState2, z2, function12, function04, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SharedPartnerLoading(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(210017713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210017713, i2, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerLoading (SharedPartnerAuth.kt:126)");
            }
            LoadingContentKt.LoadingShimmerEffect(ComposableLambdaKt.rememberComposableLambda(-644126576, true, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt.SharedPartnerLoading.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer2, Integer num) {
                    invoke(brush, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Brush shimmerBrush, Composer composer2, int i3) {
                    int i4;
                    int i5;
                    int i6;
                    float f;
                    Intrinsics.checkNotNullParameter(shimmerBrush, "shimmerBrush");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(shimmerBrush) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644126576, i4, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerLoading.<anonymous> (SharedPartnerAuth.kt:128)");
                        }
                        float f2 = 24;
                        Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f2), 0.0f, 2, null);
                        boolean z2 = z;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), composer2, 6);
                        float f3 = 56;
                        float f4 = 8;
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f3)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        float f5 = 16;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f5)), composer2, 6);
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(32)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f5)), composer2, 6);
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(f5)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f4)), composer2, 6);
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), Dp.m6117constructorimpl(f5)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        if (z2) {
                            composer2.startReplaceGroup(1921528449);
                            SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f5)), composer2, 6);
                            composer2.endReplaceGroup();
                            i6 = 6;
                            i5 = 1;
                            f = f3;
                        } else {
                            composer2.startReplaceGroup(1921606724);
                            i5 = 1;
                            i6 = 6;
                            f = f3;
                            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        int i7 = i6;
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, null), Dp.m6117constructorimpl(f)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f5)), composer2, i7);
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, null), Dp.m6117constructorimpl(f)), shimmerBrush, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f4)), 0.0f, 4, null), composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), composer2, i7);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.SharedPartnerLoading$lambda$5(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SharedPartnerAuthBody(final SharedPartnerAuthState sharedPartnerAuthState, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Function0<Unit> function03;
        Function1<? super String, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1730645656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sharedPartnerAuthState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function03 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function02;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730645656, i3, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuthBody (SharedPartnerAuth.kt:194)");
            }
            Unit unit = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SharedPartnerAuthState.Payload payloadInvoke = sharedPartnerAuthState.getPayload().invoke();
            composerStartRestartGroup.startReplaceGroup(59793805);
            if (payloadInvoke != null) {
                LoadedContent(z, sharedPartnerAuthState.isNetworkingRelinkSession(), sharedPartnerAuthState.getAuthenticationStatus(), payloadInvoke, function03, function0, function12, composerStartRestartGroup, (3670016 & (i3 << 6)) | ((i3 >> 3) & 14) | ((i3 << 3) & 57344) | ((i3 << 9) & 458752));
                unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(59793311);
            if (unit == null) {
                SharedPartnerLoading(z, composerStartRestartGroup, (i3 >> 3) & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.SharedPartnerAuthBody$lambda$8(sharedPartnerAuthState, z, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LoadedContent(final boolean z, final boolean z2, final Async<SharedPartnerAuthState.AuthenticationStatus> async, final SharedPartnerAuthState.Payload payload, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        TextUpdate text;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160710015);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(async) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(payload) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160710015, i2, -1, "com.stripe.android.financialconnections.features.common.LoadedContent (SharedPartnerAuth.kt:219)");
            }
            if (!(async instanceof Async.Uninitialized) && !(async instanceof Async.Loading) && !(async instanceof Async.Fail) && !(async instanceof Async.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean zIsOAuth = payload.getAuthSession().isOAuth();
            if (zIsOAuth) {
                composerStartRestartGroup.startReplaceGroup(2095288812);
                int i3 = i2;
                boolean z3 = !z2;
                Display display = payload.getAuthSession().getDisplay();
                OauthPrepane oauthPrepane = (display == null || (text = display.getText()) == null) ? null : text.getOauthPrepane();
                if (oauthPrepane != null) {
                    PrePaneContent(z, z3, oauthPrepane, async, function0, function02, function1, composerStartRestartGroup, (i3 & 14) | ((i3 << 3) & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int i4 = i2;
                if (zIsOAuth) {
                    composerStartRestartGroup.startReplaceGroup(483230257);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(483250676);
                SharedPartnerLoading(z, composerStartRestartGroup, i4 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.LoadedContent$lambda$9(z, z2, async, payload, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PrePaneContent(final boolean z, final boolean z2, final OauthPrepane oauthPrepane, final Async<SharedPartnerAuthState.AuthenticationStatus> async, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Async<SharedPartnerAuthState.AuthenticationStatus> async2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2095317573);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(oauthPrepane) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            async2 = async;
            i2 |= composerStartRestartGroup.changed(async2) ? 2048 : 1024;
        } else {
            async2 = async;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            function04 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2095317573, i3, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent (SharedPartnerAuth.kt:251)");
            }
            composerStartRestartGroup.startReplaceGroup(-516887030);
            boolean z3 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, Dp.m6117constructorimpl(z ? 0 : 24), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PaddingValues paddingValues = (PaddingValues) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(24));
            final Async<SharedPartnerAuthState.AuthenticationStatus> async3 = async2;
            final Function0<Unit> function05 = function04;
            final Function0<Unit> function06 = function03;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1484300552, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt.PrePaneContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1484300552, i4, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent.<anonymous> (SharedPartnerAuth.kt:284)");
                        }
                        SharedPartnerAuthKt.PrepaneFooter(function06, function05, async3, oauthPrepane, z, z2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-516875767);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(oauthPrepane) | ((3670016 & i3) == 1048576);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SharedPartnerAuthKt.PrePaneContent$lambda$13$lambda$12(oauthPrepane, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LayoutKt.LazyLayout(null, paddingValues, z, false, false, horizontalOrVerticalM900spacedBy0680j_4, false, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue2, composerStartRestartGroup, ((i3 << 6) & 896) | 100859904, JfifUtil.MARKER_EOI);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.PrePaneContent$lambda$14(z, z2, oauthPrepane, async, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrePaneContent$lambda$13$lambda$12(final OauthPrepane oauthPrepane, final Function1 function1, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(-1236118734, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrePaneContent$2$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1236118734, i, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent.<anonymous>.<anonymous>.<anonymous> (SharedPartnerAuth.kt:263)");
                    }
                    SharedPartnerAuthKt.PrepaneHeader(oauthPrepane, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(24), 0.0f, 2, null), composer, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        final List<Entry> entries = oauthPrepane.getBody().getEntries();
        final SharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$1 sharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$1 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Entry entry) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Entry) obj);
            }
        };
        LazyLayout.items(entries.size(), null, new Function1<Integer, Object>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return sharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$1.invoke(entries.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrePaneContent$lambda$13$lambda$12$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                Entry entry = (Entry) entries.get(i);
                composer.startReplaceGroup(733266074);
                if (entry instanceof Entry.Image) {
                    composer.startReplaceGroup(854939010);
                    SharedPartnerAuthKt.PrepaneImage((Entry.Image) entry, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    if (!(entry instanceof Entry.Text)) {
                        composer.startReplaceGroup(854937737);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(733377952);
                    TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(((Entry.Text) entry).getContent())), function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(24), 0.0f, 2, null), null, 0, 0, composer, 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void PrepaneImage(final Entry.Image bodyItem, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bodyItem, "bodyItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-103760569);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bodyItem) : composerStartRestartGroup.changedInstance(bodyItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103760569, i2, -1, "com.stripe.android.financialconnections.features.common.PrepaneImage (SharedPartnerAuth.kt:297)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifierM1051height3ABfNKs = SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(200));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1051height3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BoxKt.Box(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m3606horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU()), Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 0);
            float f = 8;
            BoxKt.Box(SizeKt.fillMaxHeight$default(SizeKt.m1070width3ABfNKs(BackgroundKt.m575backgroundbw27NRU$default(Modifier.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), null, 2, null), Dp.m6117constructorimpl(f)), 0.0f, 1, null), composerStartRestartGroup, 0);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(PHONE_BACKGROUND_WIDTH_DP)), 0.0f, 1, null);
            String str = bodyItem.getContent().getDefault();
            Intrinsics.checkNotNull(str);
            GifWebView(modifierFillMaxHeight$default, str, composerStartRestartGroup, 6);
            BoxKt.Box(SizeKt.fillMaxHeight$default(SizeKt.m1070width3ABfNKs(BackgroundKt.m575backgroundbw27NRU$default(Modifier.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), null, 2, null), Dp.m6117constructorimpl(f)), 0.0f, 1, null), composerStartRestartGroup, 0);
            BoxKt.Box(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m3606horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU()), Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 1.0f, false, 2, null), 0.0f, 1, null), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.PrepaneImage$lambda$16(bodyItem, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrepaneFooter(final Function0<Unit> function0, final Function0<Unit> function02, final Async<SharedPartnerAuthState.AuthenticationStatus> async, final OauthPrepane oauthPrepane, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        boolean z3;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(599226916);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(async) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(oauthPrepane) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(599226916, i2, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter (SharedPartnerAuth.kt:366)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            FinancialConnectionsButton.Type.Primary primary = FinancialConnectionsButton.Type.Primary.INSTANCE;
            boolean z4 = async instanceof Async.Loading;
            if (!z4) {
                z3 = false;
                boolean z5 = !z4;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-942494077);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SharedPartnerAuthKt.PrepaneFooter$lambda$21$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i3 = i2;
                ButtonKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth$default(TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null), "prepane_cta"), 0.0f, 1, null), primary, null, z5, z3, ComposableLambdaKt.rememberComposableLambda(15284403, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrepaneFooter$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                        if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(15284403, i4, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter.<anonymous>.<anonymous> (SharedPartnerAuth.kt:380)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            OauthPrepane oauthPrepane2 = oauthPrepane;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            androidx.compose.material.TextKt.m2076Text4IGK_g(oauthPrepane2.getCta().getText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130558);
                            Image icon = oauthPrepane2.getCta().getIcon();
                            String str = icon != null ? icon.getDefault() : null;
                            composer2.startReplaceGroup(1446064965);
                            if (str != null) {
                                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composer2, 6);
                                ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composer2.consume(localImageLoader);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                StripeImageKt.StripeImage(str, (StripeImageLoader) objConsume, null, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), null, null, null, null, false, ComposableSingletons$SharedPartnerAuthKt.INSTANCE.m7342getLambda1$financial_connections_release(), null, composer2, (StripeImageLoader.$stable << 3) | 805309824, 0, 1520);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1573248, 8);
                composerStartRestartGroup.startReplaceGroup(-942467055);
                if (z2) {
                    FinancialConnectionsButton.Type.Secondary secondary = FinancialConnectionsButton.Type.Secondary.INSTANCE;
                    boolean z6 = !z4;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-942459517);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SharedPartnerAuthKt.PrepaneFooter$lambda$21$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion3, false, (Function1) objRememberedValue2, 1, null), "cancel_cta"), 0.0f, 1, null), secondary, null, z6, false, ComposableLambdaKt.rememberComposableLambda(-1729200370, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrepaneFooter$1$4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                            int i5;
                            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                            if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1729200370, i4, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter.<anonymous>.<anonymous> (SharedPartnerAuth.kt:410)");
                                }
                                if (z) {
                                    i5 = R.string.stripe_prepane_cancel_cta;
                                } else {
                                    i5 = R.string.stripe_prepane_choose_different_bank_cta;
                                }
                                androidx.compose.material.TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(i5, composer2, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130558);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 1573248, 40);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                SharedPartnerAuthState.AuthenticationStatus authenticationStatus = (SharedPartnerAuthState.AuthenticationStatus) ((Async.Loading) async).invoke();
                if ((authenticationStatus != null ? authenticationStatus.getAction() : null) == SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING) {
                    z3 = true;
                }
                boolean z52 = !z4;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-942494077);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i32 = i2;
                ButtonKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth$default(TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion22, false, (Function1) objRememberedValue, 1, null), "prepane_cta"), 0.0f, 1, null), primary, null, z52, z3, ComposableLambdaKt.rememberComposableLambda(15284403, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PrepaneFooter$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                        if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(15284403, i4, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter.<anonymous>.<anonymous> (SharedPartnerAuth.kt:380)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            OauthPrepane oauthPrepane2 = oauthPrepane;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion32);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            androidx.compose.material.TextKt.m2076Text4IGK_g(oauthPrepane2.getCta().getText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130558);
                            Image icon = oauthPrepane2.getCta().getIcon();
                            String str = icon != null ? icon.getDefault() : null;
                            composer2.startReplaceGroup(1446064965);
                            if (str != null) {
                                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composer2, 6);
                                ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composer2.consume(localImageLoader);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                StripeImageKt.StripeImage(str, (StripeImageLoader) objConsume, null, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), null, null, null, null, false, ComposableSingletons$SharedPartnerAuthKt.INSTANCE.m7342getLambda1$financial_connections_release(), null, composer2, (StripeImageLoader.$stable << 3) | 805309824, 0, 1520);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i32 & 14) | 1573248, 8);
                composerStartRestartGroup.startReplaceGroup(-942467055);
                if (z2) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.PrepaneFooter$lambda$22(function0, function02, async, oauthPrepane, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneFooter$lambda$21$lambda$18$lambda$17(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneFooter$lambda$21$lambda$20$lambda$19(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrepaneHeader(final OauthPrepane oauthPrepane, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String str;
        Object objRememberedValue3;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1907905063);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(oauthPrepane) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1907905063, i3, -1, "com.stripe.android.financialconnections.features.common.PrepaneHeader (SharedPartnerAuth.kt:429)");
                }
                String title = oauthPrepane.getTitle();
                composerStartRestartGroup.startReplaceGroup(1488310525);
                zChanged = composerStartRestartGroup.changed(title);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TextResource.Text(ServerDrivenUiKt.fromHtml(oauthPrepane.getTitle()));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TextResource.Text text = (TextResource.Text) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String subtitle = oauthPrepane.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(1488313411);
                zChanged2 = composerStartRestartGroup.changed(subtitle);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(oauthPrepane.getSubtitle()));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                TextResource.Text text2 = (TextResource.Text) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Image institutionIcon = oauthPrepane.getInstitutionIcon();
                str = institutionIcon == null ? institutionIcon.getDefault() : null;
                composerStartRestartGroup.startReplaceGroup(-1009299465);
                if (str != null) {
                    InstitutionIconKt.InstitutionIcon(str, null, false, composerStartRestartGroup, 0, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                TextResource.Text text3 = text;
                composerStartRestartGroup.startReplaceGroup(-1009294727);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SharedPartnerAuthKt.PrepaneHeader$lambda$30$lambda$27$lambda$26((String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                TextKt.m7586AnnotatedTextrm0N8CA(text3, (Function1) objRememberedValue3, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, 48, 120);
                TextResource.Text text4 = text2;
                composerStartRestartGroup.startReplaceGroup(-1009287783);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SharedPartnerAuthKt.PrepaneHeader$lambda$30$lambda$29$lambda$28((String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                TextKt.m7586AnnotatedTextrm0N8CA(text4, (Function1) objRememberedValue4, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, 48, 120);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SharedPartnerAuthKt.PrepaneHeader$lambda$31(oauthPrepane, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String title2 = oauthPrepane.getTitle();
            composerStartRestartGroup.startReplaceGroup(1488310525);
            zChanged = composerStartRestartGroup.changed(title2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new TextResource.Text(ServerDrivenUiKt.fromHtml(oauthPrepane.getTitle()));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                TextResource.Text text5 = (TextResource.Text) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String subtitle2 = oauthPrepane.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(1488313411);
                zChanged2 = composerStartRestartGroup.changed(subtitle2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(oauthPrepane.getSubtitle()));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    TextResource.Text text22 = (TextResource.Text) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting()) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        Image institutionIcon2 = oauthPrepane.getInstitutionIcon();
                        if (institutionIcon2 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1009299465);
                        if (str != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TextResource.Text text32 = text5;
                        composerStartRestartGroup.startReplaceGroup(-1009294727);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TextKt.m7586AnnotatedTextrm0N8CA(text32, (Function1) objRememberedValue3, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, 48, 120);
                        TextResource.Text text42 = text22;
                        composerStartRestartGroup.startReplaceGroup(-1009287783);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TextKt.m7586AnnotatedTextrm0N8CA(text42, (Function1) objRememberedValue4, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, 48, 120);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneHeader$lambda$30$lambda$27$lambda$26(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrepaneHeader$lambda$30$lambda$29$lambda$28(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void GifWebView(final Modifier modifier, final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1283678679);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283678679, i2, -1, "com.stripe.android.financialconnections.features.common.GifWebView (SharedPartnerAuth.kt:460)");
            }
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
            composerStartRestartGroup.startReplaceGroup(407251254);
            boolean z = (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                StringBuilder sb = new StringBuilder("<html><head><style>img{width:100%; height:auto;}</style></head><body style=\"margin: 0; padding: 0\">");
                sb.append("<img src=\"" + str + "\" style=\"width:100%;height:auto;\" />");
                sb.append("</body></html>");
                objRememberedValue = sb.toString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final String str2 = (String) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final int iM3711toArgb8_81llA = ColorKt.m3711toArgb8_81llA(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU());
            Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(modifier, Color.INSTANCE.m3692getTransparent0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(407267044);
            boolean zChanged = composerStartRestartGroup.changed(iM3711toArgb8_81llA) | composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(str2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SharedPartnerAuthKt.GifWebView$lambda$36$lambda$35(iM3711toArgb8_81llA, zBooleanValue, str2, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(407293971);
            boolean zChanged2 = composerStartRestartGroup.changed(str2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SharedPartnerAuthKt.GifWebView$lambda$38$lambda$37(str2, (WebView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM575backgroundbw27NRU$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.GifWebView$lambda$39(modifier, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView GifWebView$lambda$36$lambda$35(int i, boolean z, String str, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebView webView = new WebView(it);
        webView.setBackgroundColor(i);
        webView.setAlpha(WEBVIEW_ALPHA);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!z) {
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setVerticalFadingEdgeEnabled(false);
        }
        webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifWebView$lambda$38$lambda$37(String str, WebView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
        return Unit.INSTANCE;
    }

    /* compiled from: SharedPartnerAuth.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C08811 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SharedPartnerAuthState $state;

        C08811(SharedPartnerAuthState sharedPartnerAuthState) {
            this.$state = sharedPartnerAuthState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-315590463, i, -1, "com.stripe.android.financialconnections.features.common.PartnerAuthPreview.<anonymous> (SharedPartnerAuth.kt:507)");
                }
                SharedPartnerAuthState sharedPartnerAuthState = this.$state;
                composer.startReplaceGroup(-880661830);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SharedPartnerAuthKt.C08811.invoke$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-880660742);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-880659718);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SharedPartnerAuthKt.SharedPartnerAuthContent(sharedPartnerAuthState, false, function1, function0, (Function0) objRememberedValue3, composer, 28080);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void PartnerAuthPreview(@PreviewParameter(provider = PartnerAuthPreviewParameterProvider.class) final SharedPartnerAuthState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2134336496);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2134336496, i2, -1, "com.stripe.android.financialconnections.features.common.PartnerAuthPreview (SharedPartnerAuth.kt:505)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(-315590463, true, new C08811(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.PartnerAuthPreview$lambda$40(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SharedPartnerAuth.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthDrawerPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SharedPartnerAuthState $state;

        AnonymousClass1(SharedPartnerAuthState sharedPartnerAuthState) {
            this.$state = sharedPartnerAuthState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-371692144, i, -1, "com.stripe.android.financialconnections.features.common.PartnerAuthDrawerPreview.<anonymous> (SharedPartnerAuth.kt:526)");
                }
                Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(Modifier.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7630getBackground0d7_KjU(), null, 2, null);
                SharedPartnerAuthState sharedPartnerAuthState = this.$state;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM575backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceGroup(-1183341592);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthDrawerPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SharedPartnerAuthKt.AnonymousClass1.invoke$lambda$6$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1183340376);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthDrawerPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1183339224);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$PartnerAuthDrawerPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SharedPartnerAuthKt.SharedPartnerAuthContent(sharedPartnerAuthState, true, function1, function0, (Function0) objRememberedValue3, composer, 28080);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void PartnerAuthDrawerPreview(@PreviewParameter(provider = PartnerAuthPreviewParameterProvider.class) final SharedPartnerAuthState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(949393823);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949393823, i2, -1, "com.stripe.android.financialconnections.features.common.PartnerAuthDrawerPreview (SharedPartnerAuth.kt:524)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(-371692144, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SharedPartnerAuthKt.PartnerAuthDrawerPreview$lambda$41(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
