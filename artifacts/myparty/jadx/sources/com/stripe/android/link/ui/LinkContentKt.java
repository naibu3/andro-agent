package com.stripe.android.link.ui;

import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.ComposeExtensionsKt;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkAction;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.stripe.android.link.NoPaymentDetailsFoundException;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkContentKt;
import com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt;
import com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel;
import com.stripe.android.link.ui.signup.SignUpScreenKt;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.updatecard.UpdateCardScreenKt;
import com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel;
import com.stripe.android.link.ui.verification.VerificationScreenKt;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.wallet.WalletScreenKt;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkContent.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aÍ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072$\u0010\b\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\r¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2,\u0010\u000e\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u0002`\r¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u00010\t2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\t26\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\t2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010&\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010'\u001aî\u0001\u0010(\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\t2,\u0010\u000e\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u0002`\r¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u00010\t2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010&\u001a\u00020\u00162\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0003¢\u0006\u0002\u0010+\u001aX\u0010,\u001a\u00020\u00012!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010-\u001ah\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020 2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00100\u001a3\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00106\u001a)\u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u00020 2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00108\u001a¦\u0001\u00109\u001a\u00020\u00012\u0006\u0010/\u001a\u00020 2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\t2,\u0010\u000e\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u0002`\r¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u00010\t2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0003¢\u0006\u0002\u0010:\u001a\b\u0010;\u001a\u00020\u001dH\u0002\u001a\b\u0010<\u001a\u00020\u001dH\u0002¨\u0006="}, d2 = {"LinkContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "navController", "Landroidx/navigation/NavHostController;", "appBarState", "Lcom/stripe/android/link/ui/LinkAppBarState;", "bottomSheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Lcom/stripe/android/link/ui/BottomSheetContent;", "showBottomSheetContent", "hideBottomSheetContent", "Lkotlin/coroutines/Continuation;", "", "handleViewAction", "Lcom/stripe/android/link/LinkAction;", "navigate", "Lkotlin/Function2;", "Lcom/stripe/android/link/LinkScreen;", "Lkotlin/ParameterName;", "name", "route", "", "clearStack", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "getLinkAccount", "Lkotlin/Function0;", "Lcom/stripe/android/link/model/LinkAccount;", "onBackPressed", "moveToWeb", "", "goBack", "changeEmail", "initialDestination", "(Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/Composer;II)V", "Screens", "navigateAndClearStack", "onLogoutClicked", "(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SignUpRoute", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "VerificationRoute", "linkAccount", "(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UpdateCardRoute", "paymentDetailsId", "", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PaymentMethodRoute", "(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "WalletRoute", "(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "noLinkAccountResult", "noPaymentDetailsResult", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkContent$lambda$0(Modifier modifier, NavHostController navHostController, LinkAppBarState linkAppBarState, Function3 function3, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14, Function0 function0, Function0 function02, Function1 function15, Function0 function03, Function0 function04, LinkScreen linkScreen, int i, int i2, Composer composer, int i3) {
        LinkContent(modifier, navHostController, linkAppBarState, function3, function1, function12, function13, function2, function14, function0, function02, function15, function03, function04, linkScreen, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodRoute$lambda$13(LinkAccount linkAccount, Function1 function1, int i, Composer composer, int i2) {
        PaymentMethodRoute(linkAccount, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Screens$lambda$3(NavHostController navHostController, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function03, LinkScreen linkScreen, Function0 function04, int i, int i2, Composer composer, int i3) {
        Screens(navHostController, function0, function02, function1, function12, function13, function14, function15, function03, linkScreen, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignUpRoute$lambda$5(Function1 function1, Function1 function12, Function1 function13, int i, Composer composer, int i2) {
        SignUpRoute(function1, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateCardRoute$lambda$11(String str, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, Function1 function1, int i, Composer composer, int i2) {
        UpdateCardRoute(str, billingDetailsUpdateFlow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationRoute$lambda$9(LinkAccount linkAccount, Function1 function1, Function0 function0, Function0 function02, Function1 function12, int i, Composer composer, int i2) {
        VerificationRoute(linkAccount, function1, function0, function02, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletRoute$lambda$15(LinkAccount linkAccount, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i, Composer composer, int i2) {
        WalletRoute(linkAccount, function1, function12, function13, function14, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LinkContent(final Modifier modifier, final NavHostController navController, final LinkAppBarState appBarState, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> showBottomSheetContent, final Function1<? super Continuation<? super Unit>, ? extends Object> hideBottomSheetContent, final Function1<? super LinkAction, Unit> handleViewAction, final Function2<? super LinkScreen, ? super Boolean, Unit> navigate, final Function1<? super LinkActivityResult, Unit> dismissWithResult, final Function0<LinkAccount> getLinkAccount, final Function0<Unit> onBackPressed, final Function1<? super Throwable, Unit> moveToWeb, final Function0<Unit> goBack, final Function0<Unit> changeEmail, final LinkScreen initialDestination, Composer composer, final int i, final int i2) {
        int i3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(appBarState, "appBarState");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        Intrinsics.checkNotNullParameter(hideBottomSheetContent, "hideBottomSheetContent");
        Intrinsics.checkNotNullParameter(handleViewAction, "handleViewAction");
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        Intrinsics.checkNotNullParameter(getLinkAccount, "getLinkAccount");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(moveToWeb, "moveToWeb");
        Intrinsics.checkNotNullParameter(goBack, "goBack");
        Intrinsics.checkNotNullParameter(changeEmail, "changeEmail");
        Intrinsics.checkNotNullParameter(initialDestination, "initialDestination");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1876002234);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(appBarState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function32 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showBottomSheetContent) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(hideBottomSheetContent) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(handleViewAction) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigate) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismissWithResult) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(getLinkAccount) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(moveToWeb) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(goBack) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(changeEmail) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(initialDestination) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (i6 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1876002234, i5, i6, "com.stripe.android.link.ui.LinkContent (LinkContent.kt:54)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
            composer2 = composerStartRestartGroup;
            ThemeKt.DefaultLinkTheme(false, ComposableLambdaKt.rememberComposableLambda(-1041134006, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt.LinkContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1041134006, i7, -1, "com.stripe.android.link.ui.LinkContent.<anonymous> (LinkContent.kt:58)");
                        }
                        SurfaceKt.m2015SurfaceFjzlyU(modifier, null, LinkTheme.INSTANCE.getColors(composer3, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1908841358, true, new C01741(function33, coroutineScope, hideBottomSheetContent, navController, handleViewAction, appBarState, onBackPressed, getLinkAccount, goBack, navigate, dismissWithResult, showBottomSheetContent, moveToWeb, changeEmail, initialDestination), composer3, 54), composer3, 1572864, 58);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* compiled from: LinkContent.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.link.ui.LinkContentKt$LinkContent$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01741 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ LinkAppBarState $appBarState;
                    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $bottomSheetContent;
                    final /* synthetic */ Function0<Unit> $changeEmail;
                    final /* synthetic */ CoroutineScope $coroutineScope;
                    final /* synthetic */ Function1<LinkActivityResult, Unit> $dismissWithResult;
                    final /* synthetic */ Function0<LinkAccount> $getLinkAccount;
                    final /* synthetic */ Function0<Unit> $goBack;
                    final /* synthetic */ Function1<LinkAction, Unit> $handleViewAction;
                    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
                    final /* synthetic */ LinkScreen $initialDestination;
                    final /* synthetic */ Function1<Throwable, Unit> $moveToWeb;
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ Function2<LinkScreen, Boolean, Unit> $navigate;
                    final /* synthetic */ Function0<Unit> $onBackPressed;
                    final /* synthetic */ Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> $showBottomSheetContent;

                    /* JADX WARN: Multi-variable type inference failed */
                    C01741(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, CoroutineScope coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> function1, NavHostController navHostController, Function1<? super LinkAction, Unit> function12, LinkAppBarState linkAppBarState, Function0<Unit> function0, Function0<LinkAccount> function02, Function0<Unit> function03, Function2<? super LinkScreen, ? super Boolean, Unit> function2, Function1<? super LinkActivityResult, Unit> function13, Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function14, Function1<? super Throwable, Unit> function15, Function0<Unit> function04, LinkScreen linkScreen) {
                        this.$bottomSheetContent = function3;
                        this.$coroutineScope = coroutineScope;
                        this.$hideBottomSheetContent = function1;
                        this.$navController = navHostController;
                        this.$handleViewAction = function12;
                        this.$appBarState = linkAppBarState;
                        this.$onBackPressed = function0;
                        this.$getLinkAccount = function02;
                        this.$goBack = function03;
                        this.$navigate = function2;
                        this.$dismissWithResult = function13;
                        this.$showBottomSheetContent = function14;
                        this.$moveToWeb = function15;
                        this.$changeEmail = function04;
                        this.$initialDestination = linkScreen;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        final Function1<Continuation<? super Unit>, Object> function1;
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1908841358, i, -1, "com.stripe.android.link.ui.LinkContent.<anonymous>.<anonymous> (LinkContent.kt:62)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$bottomSheetContent;
                            final CoroutineScope coroutineScope = this.$coroutineScope;
                            final Function1<Continuation<? super Unit>, Object> function12 = this.$hideBottomSheetContent;
                            final NavHostController navHostController = this.$navController;
                            final Function1<LinkAction, Unit> function13 = this.$handleViewAction;
                            LinkAppBarState linkAppBarState = this.$appBarState;
                            Function0<Unit> function0 = this.$onBackPressed;
                            Function0<LinkAccount> function02 = this.$getLinkAccount;
                            Function0<Unit> function03 = this.$goBack;
                            final Function2<LinkScreen, Boolean, Unit> function2 = this.$navigate;
                            Function1<LinkActivityResult, Unit> function14 = this.$dismissWithResult;
                            Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function15 = this.$showBottomSheetContent;
                            Function1<Throwable, Unit> function16 = this.$moveToWeb;
                            Function0<Unit> function04 = this.$changeEmail;
                            LinkScreen linkScreen = this.$initialDestination;
                            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer.startReplaceGroup(1825408839);
                            boolean zChanged = composer.changed(function3) | composer.changedInstance(coroutineScope) | composer.changedInstance(function12) | composer.changedInstance(navHostController) | composer.changed(function13);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.stripe.android.link.ui.LinkContentKt$LinkContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LinkContentKt.AnonymousClass1.C01741.invoke$lambda$6$lambda$1$lambda$0(function3, coroutineScope, navHostController, function13, function12);
                                    }
                                };
                                function1 = function12;
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            } else {
                                function1 = function12;
                            }
                            composer.endReplaceGroup();
                            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composer, 0, 1);
                            LinkAppBarKt.LinkAppBar(linkAppBarState, null, function0, composer, 0, 2);
                            composer.startReplaceGroup(1825432819);
                            boolean zChanged2 = composer.changed(function2);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.LinkContentKt$LinkContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return LinkContentKt.AnonymousClass1.C01741.invoke$lambda$6$lambda$3$lambda$2(function2, (LinkScreen) obj2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function17 = (Function1) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1825446304);
                            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(function1) | composer.changed(function13);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.stripe.android.link.ui.LinkContentKt$LinkContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LinkContentKt.AnonymousClass1.C01741.invoke$lambda$6$lambda$5$lambda$4(coroutineScope, function1, function13);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            LinkContentKt.Screens(navHostController, function02, function03, function17, function14, function15, function1, function16, function04, linkScreen, (Function0) objRememberedValue3, composer, 0, 0);
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
                    public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function3 function3, CoroutineScope coroutineScope, NavHostController navHostController, Function1 function1, Function1 function12) {
                        if (function3 != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LinkContentKt$LinkContent$1$1$1$1$1$1(function12, null), 3, null);
                        } else if (!navHostController.popBackStack()) {
                            function1.invoke(LinkAction.BackPressed.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Function2 function2, LinkScreen screen) {
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        function2.invoke(screen, true);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(CoroutineScope coroutineScope, Function1 function1, Function1 function12) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LinkContentKt$LinkContent$1$1$1$3$1$1(function1, function12, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composer2, 54), composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.LinkContent$lambda$0(modifier, navController, appBarState, function3, showBottomSheetContent, hideBottomSheetContent, handleViewAction, navigate, dismissWithResult, getLinkAccount, onBackPressed, moveToWeb, goBack, changeEmail, initialDestination, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Screens(final NavHostController navHostController, final Function0<LinkAccount> function0, final Function0<Unit> function02, final Function1<? super LinkScreen, Unit> function1, final Function1<? super LinkActivityResult, Unit> function12, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function13, final Function1<? super Continuation<? super Unit>, ? extends Object> function14, final Function1<? super Throwable, Unit> function15, final Function0<Unit> function03, final LinkScreen linkScreen, final Function0<Unit> function04, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<LinkAccount> function05;
        Function0<Unit> function06;
        Function1<? super LinkScreen, Unit> function16;
        Function1<? super LinkActivityResult, Unit> function17;
        int i4;
        int i5;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1763365574);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function05 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function05) ? 32 : 16;
        } else {
            function05 = function0;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            function06 = function02;
            i3 |= composerStartRestartGroup.changedInstance(function06) ? 256 : 128;
        } else {
            function06 = function02;
        }
        if ((i & 3072) == 0) {
            function16 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function16) ? 2048 : 1024;
        } else {
            function16 = function1;
        }
        if ((i & 24576) == 0) {
            function17 = function12;
            i3 |= composerStartRestartGroup.changedInstance(function17) ? 16384 : 8192;
        } else {
            function17 = function12;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function15) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function03) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(linkScreen) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function04) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1763365574, i3, i4, "com.stripe.android.link.ui.Screens (LinkContent.kt:116)");
            }
            String route = linkScreen.getRoute();
            composerStartRestartGroup.startReplaceGroup(729798995);
            boolean zChangedInstance = ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(linkScreen) | ((234881024 & i3) == 67108864) | ((i3 & 896) == 256) | ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(function14) | ((i4 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i5 = i3;
                final Function1<? super LinkScreen, Unit> function18 = function16;
                final Function0<Unit> function07 = function06;
                final Function1<? super LinkActivityResult, Unit> function19 = function17;
                Function1 function110 = new Function1() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkContentKt.Screens$lambda$2$lambda$1(function18, function15, function19, function05, linkScreen, function03, function07, function13, function14, function04, (NavGraphBuilder) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function110);
                objRememberedValue = function110;
            } else {
                i5 = i3;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LinkNavHostKt.LinkNavHost(navHostController, route, null, (Function1) objRememberedValue, composer2, i5 & 14, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.Screens$lambda$3(navHostController, function0, function02, function1, function12, function13, function14, function15, function03, linkScreen, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Screens$lambda$2$lambda$1(final Function1 function1, final Function1 function12, final Function1 function13, final Function0 function0, final LinkScreen linkScreen, final Function0 function02, final Function0 function03, final Function1 function14, final Function1 function15, final Function0 function04, NavGraphBuilder LinkNavHost) {
        Intrinsics.checkNotNullParameter(LinkNavHost, "$this$LinkNavHost");
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.Loading.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableSingletons$LinkContentKt.INSTANCE.m7834getLambda1$paymentsheet_release(), 254, null);
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.SignUp.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-97036008, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-97036008, i, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:128)");
                }
                final Function1<LinkScreen, Unit> function16 = function1;
                final Function1<Throwable, Unit> function17 = function12;
                final Function1<LinkActivityResult, Unit> function18 = function13;
                MinScreenHeightBoxKt.MinScreenHeightBox(1.0f, ComposableLambdaKt.rememberComposableLambda(1952721389, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$1.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope MinScreenHeightBox, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(MinScreenHeightBox, "$this$MinScreenHeightBox");
                        if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1952721389, i2, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:129)");
                            }
                            LinkContentKt.SignUpRoute(function16, function17, function18, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.UpdateCard.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-663948041, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i) {
                String string;
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663948041, i, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:138)");
                }
                Bundle arguments = backStackEntry.getArguments();
                if (arguments != null && (string = arguments.getString(LinkScreen.EXTRA_PAYMENT_DETAILS)) != null) {
                    LinkContentKt.UpdateCardRoute(string, LinkScreen.INSTANCE.billingDetailsUpdateFlow(backStackEntry), function13, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13.invoke(LinkContentKt.noPaymentDetailsResult());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.Verification.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1230860074, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1230860074, i, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:151)");
                }
                final LinkAccount linkAccountInvoke = function0.invoke();
                if (linkAccountInvoke == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13.invoke(LinkContentKt.noLinkAccountResult());
                    return;
                }
                float f = Intrinsics.areEqual(linkScreen, LinkScreen.SignUp.INSTANCE) ? 1.0f : 0.0f;
                final Function1<LinkScreen, Unit> function16 = function1;
                final Function0<Unit> function05 = function02;
                final Function0<Unit> function06 = function03;
                final Function1<LinkActivityResult, Unit> function17 = function13;
                MinScreenHeightBoxKt.MinScreenHeightBox(f, ComposableLambdaKt.rememberComposableLambda(818897323, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$3.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope MinScreenHeightBox, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(MinScreenHeightBox, "$this$MinScreenHeightBox");
                        if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(818897323, i2, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:153)");
                            }
                            LinkContentKt.VerificationRoute(linkAccountInvoke, function16, function05, function06, function17, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.Wallet.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1797772107, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1797772107, i, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:164)");
                }
                LinkAccount linkAccountInvoke = function0.invoke();
                if (linkAccountInvoke == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13.invoke(LinkContentKt.noLinkAccountResult());
                } else {
                    LinkContentKt.WalletRoute(linkAccountInvoke, function1, function13, function14, function15, function04, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(LinkNavHost, LinkScreen.PaymentMethod.INSTANCE.getRoute(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1930283156, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkContentKt$Screens$1$1$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1930283156, i, -1, "com.stripe.android.link.ui.Screens.<anonymous>.<anonymous>.<anonymous> (LinkContent.kt:176)");
                }
                LinkAccount linkAccountInvoke = function0.invoke();
                if (linkAccountInvoke == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13.invoke(LinkContentKt.noLinkAccountResult());
                } else {
                    LinkContentKt.PaymentMethodRoute(linkAccountInvoke, function13, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignUpRoute(final Function1<? super LinkScreen, Unit> function1, final Function1<? super Throwable, Unit> function12, final Function1<? super LinkActivityResult, Unit> function13, Composer composer, final int i) {
        int i2;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-392330784);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392330784, i2, -1, "com.stripe.android.link.ui.SignUpRoute (LinkContent.kt:190)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                ViewModelProvider.Factory factory = SignUpViewModel.INSTANCE.factory(activityRetainedComponent, function1, function12, function13);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SignUpViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                SignUpScreenKt.SignUpScreen((SignUpViewModel) viewModel2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.SignUpRoute$lambda$5(function1, function12, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerificationRoute(final LinkAccount linkAccount, final Function1<? super LinkScreen, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super LinkActivityResult, Unit> function12, Composer composer, final int i) {
        int i2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function1<? super LinkActivityResult, Unit> function13;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-460755409);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(linkAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            function03 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i & 3072) == 0) {
            function04 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
        } else {
            function04 = function02;
        }
        if ((i & 24576) == 0) {
            function13 = function12;
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
        } else {
            function13 = function12;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460755409, i2, -1, "com.stripe.android.link.ui.VerificationRoute (LinkContent.kt:211)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                VerificationViewModel.Companion companion = VerificationViewModel.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1407202948);
                boolean z = (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkContentKt.VerificationRoute$lambda$8$lambda$7$lambda$6(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ViewModelProvider.Factory factory = companion.factory(activityRetainedComponent, linkAccount, false, (Function0) objRememberedValue, function03, function04, function13);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(VerificationViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                VerificationScreenKt.VerificationScreen((VerificationViewModel) viewModel2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.VerificationRoute$lambda$9(linkAccount, function1, function0, function02, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationRoute$lambda$8$lambda$7$lambda$6(Function1 function1) {
        function1.invoke(LinkScreen.Wallet.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateCardRoute(final String str, final LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, final Function1<? super LinkActivityResult, Unit> function1, Composer composer, final int i) {
        int i2;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1489488690);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(billingDetailsUpdateFlow) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489488690, i2, -1, "com.stripe.android.link.ui.UpdateCardRoute (LinkContent.kt:233)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                ViewModelProvider.Factory factory = UpdateCardScreenViewModel.INSTANCE.factory(activityRetainedComponent, str, billingDetailsUpdateFlow, function1);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UpdateCardScreenViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                UpdateCardScreenKt.UpdateCardScreen((UpdateCardScreenViewModel) viewModel2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.UpdateCardRoute$lambda$11(str, billingDetailsUpdateFlow, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentMethodRoute(final LinkAccount linkAccount, final Function1<? super LinkActivityResult, Unit> function1, Composer composer, final int i) {
        int i2;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(851008954);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(linkAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851008954, i2, -1, "com.stripe.android.link.ui.PaymentMethodRoute (LinkContent.kt:251)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                ViewModelProvider.Factory factory = PaymentMethodViewModel.INSTANCE.factory(activityRetainedComponent, linkAccount, function1);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PaymentMethodViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                PaymentMethodScreenKt.PaymentMethodScreen((PaymentMethodViewModel) viewModel2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.PaymentMethodRoute$lambda$13(linkAccount, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WalletRoute(final LinkAccount linkAccount, final Function1<? super LinkScreen, Unit> function1, final Function1<? super LinkActivityResult, Unit> function12, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function13, final Function1<? super Continuation<? super Unit>, ? extends Object> function14, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function15;
        Function1<? super Continuation<? super Unit>, ? extends Object> function16;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1673804274);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(linkAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function15 = function13;
            i2 |= composerStartRestartGroup.changedInstance(function15) ? 2048 : 1024;
        } else {
            function15 = function13;
        }
        if ((i & 24576) == 0) {
            function16 = function14;
            i2 |= composerStartRestartGroup.changedInstance(function16) ? 16384 : 8192;
        } else {
            function16 = function14;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673804274, i2, -1, "com.stripe.android.link.ui.WalletRoute (LinkContent.kt:272)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                ViewModelProvider.Factory factory = WalletViewModel.INSTANCE.factory(activityRetainedComponent, linkAccount, function1, function12);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(WalletViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                WalletScreenKt.WalletScreen((WalletViewModel) viewModel2, function15, function16, function0, composerStartRestartGroup, (i2 >> 6) & 8176);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkContentKt.WalletRoute$lambda$15(linkAccount, function1, function12, function13, function14, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkActivityResult noLinkAccountResult() {
        return new LinkActivityResult.Failed(new NoLinkAccountFoundException(), LinkAccountUpdate.None.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkActivityResult noPaymentDetailsResult() {
        return new LinkActivityResult.Failed(new NoPaymentDetailsFoundException(), LinkAccountUpdate.None.INSTANCE);
    }
}
