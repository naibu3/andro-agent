package com.stripe.android.link;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.ScreenState;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.link.ui.FullScreenContentKt;
import com.stripe.android.link.ui.LinkAppBarState;
import com.stripe.android.link.ui.LinkContentScrollHandler;
import com.stripe.android.link.ui.LinkContentScrollHandlerKt;
import com.stripe.android.link.ui.verification.VerificationDialogKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: LinkScreenContent.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a±\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001726\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u00142\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0001¢\u0006\u0002\u0010-¨\u0006.²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"LinkScreenContent", "", "viewModel", "Lcom/stripe/android/link/LinkActivityViewModel;", "bottomSheetState", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/Composer;I)V", "LinkScreenContentBody", "screenState", "Lcom/stripe/android/link/ScreenState;", "appBarState", "Lcom/stripe/android/link/ui/LinkAppBarState;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "appearance", "Lcom/stripe/android/link/model/LinkAppearance;", "navigationChannel", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "onNavBackStackEntryChanged", "Lkotlin/Function1;", "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;", "onVerificationSucceeded", "Lkotlin/Function0;", "onDismissClicked", "onBackPressed", "navigate", "Lkotlin/Function2;", "Lcom/stripe/android/link/LinkScreen;", "Lkotlin/ParameterName;", "name", "route", "", "clearStack", "dismiss", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "getLinkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "handleViewAction", "Lcom/stripe/android/link/LinkAction;", "moveToWeb", "", "goBack", "changeEmail", "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkScreenContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkScreenContent$lambda$3(LinkActivityViewModel linkActivityViewModel, StripeBottomSheetState stripeBottomSheetState, int i, Composer composer, int i2) {
        LinkScreenContent(linkActivityViewModel, stripeBottomSheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkScreenContentBody$lambda$4(StripeBottomSheetState stripeBottomSheetState, ScreenState screenState, LinkAppBarState linkAppBarState, EventReporter eventReporter, LinkAppearance linkAppearance, SharedFlow sharedFlow, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04, Function1 function12, Function0 function05, Function1 function13, Function1 function14, Function0 function06, Function0 function07, int i, int i2, Composer composer, int i3) {
        LinkScreenContentBody(stripeBottomSheetState, screenState, linkAppBarState, eventReporter, linkAppearance, sharedFlow, function1, function0, function02, function03, function2, function04, function12, function05, function13, function14, function06, function07, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void LinkScreenContent(final LinkActivityViewModel viewModel, final StripeBottomSheetState bottomSheetState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2002168174);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(bottomSheetState) : composerStartRestartGroup.changedInstance(bottomSheetState) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2002168174, i2, -1, "com.stripe.android.link.LinkScreenContent (LinkScreenContent.kt:26)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getLinkScreenState(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(viewModel.getLinkAppBarState(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1969099289);
            boolean zChanged = composerStartRestartGroup.changed(viewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LinkContentScrollHandler(new LinkScreenContentKt$LinkScreenContent$linkContentScrollHandler$1$1(viewModel));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(LinkContentScrollHandlerKt.getLocalLinkContentScrollHandler().provides((LinkContentScrollHandler) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(114420562, true, new AnonymousClass1(viewModel, bottomSheetState, stateCollectAsState, stateCollectAsState2), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.LinkScreenContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkScreenContentKt.LinkScreenContent$lambda$3(viewModel, bottomSheetState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LinkScreenContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.LinkScreenContentKt$LinkScreenContent$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<LinkAppBarState> $appBarState$delegate;
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        final /* synthetic */ State<ScreenState> $screenState$delegate;
        final /* synthetic */ LinkActivityViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LinkActivityViewModel linkActivityViewModel, StripeBottomSheetState stripeBottomSheetState, State<? extends ScreenState> state, State<LinkAppBarState> state2) {
            this.$viewModel = linkActivityViewModel;
            this.$bottomSheetState = stripeBottomSheetState;
            this.$screenState$delegate = state;
            this.$appBarState$delegate = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            LinkAppBarState linkAppBarState;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(114420562, i, -1, "com.stripe.android.link.LinkScreenContent.<anonymous> (LinkScreenContent.kt:37)");
            }
            ScreenState screenStateLinkScreenContent$lambda$0 = LinkScreenContentKt.LinkScreenContent$lambda$0(this.$screenState$delegate);
            LinkAppBarState linkAppBarStateLinkScreenContent$lambda$1 = LinkScreenContentKt.LinkScreenContent$lambda$1(this.$appBarState$delegate);
            EventReporter eventReporter = this.$viewModel.getEventReporter();
            LinkActivityViewModel linkActivityViewModel = this.$viewModel;
            composer.startReplaceGroup(683964115);
            boolean zChangedInstance = composer.changedInstance(linkActivityViewModel);
            LinkScreenContentKt$LinkScreenContent$1$1$1 linkScreenContentKt$LinkScreenContent$1$1$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance || linkScreenContentKt$LinkScreenContent$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$1$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$1$1(linkActivityViewModel);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$1$1RememberedValue);
            }
            KFunction kFunction = (KFunction) linkScreenContentKt$LinkScreenContent$1$1$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel2 = this.$viewModel;
            composer.startReplaceGroup(683966264);
            boolean zChangedInstance2 = composer.changedInstance(linkActivityViewModel2);
            LinkScreenContentKt$LinkScreenContent$1$2$1 linkScreenContentKt$LinkScreenContent$1$2$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || linkScreenContentKt$LinkScreenContent$1$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$2$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$2$1(linkActivityViewModel2);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$2$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) linkScreenContentKt$LinkScreenContent$1$2$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel3 = this.$viewModel;
            composer.startReplaceGroup(683968450);
            boolean zChangedInstance3 = composer.changedInstance(linkActivityViewModel3);
            LinkScreenContentKt$LinkScreenContent$1$3$1 linkScreenContentKt$LinkScreenContent$1$3$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance3 || linkScreenContentKt$LinkScreenContent$1$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$3$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$3$1(linkActivityViewModel3);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$3$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) linkScreenContentKt$LinkScreenContent$1$3$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel4 = this.$viewModel;
            composer.startReplaceGroup(683969796);
            boolean zChangedInstance4 = composer.changedInstance(linkActivityViewModel4);
            LinkScreenContentKt$LinkScreenContent$1$4$1 linkScreenContentKt$LinkScreenContent$1$4$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance4 || linkScreenContentKt$LinkScreenContent$1$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$4$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$4$1(linkActivityViewModel4);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$4$1RememberedValue);
            }
            Function2 function2 = (Function2) linkScreenContentKt$LinkScreenContent$1$4$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel5 = this.$viewModel;
            composer.startReplaceGroup(683971176);
            boolean zChangedInstance5 = composer.changedInstance(linkActivityViewModel5);
            LinkScreenContentKt$LinkScreenContent$1$5$1 linkScreenContentKt$LinkScreenContent$1$5$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance5 || linkScreenContentKt$LinkScreenContent$1$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$5$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$5$1(linkActivityViewModel5);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$5$1RememberedValue);
            }
            KFunction kFunction4 = (KFunction) linkScreenContentKt$LinkScreenContent$1$5$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel6 = this.$viewModel;
            composer.startReplaceGroup(683973000);
            boolean zChangedInstance6 = composer.changedInstance(linkActivityViewModel6);
            LinkScreenContentKt$LinkScreenContent$1$6$1 linkScreenContentKt$LinkScreenContent$1$6$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance6 || linkScreenContentKt$LinkScreenContent$1$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$6$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$6$1(linkActivityViewModel6);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$6$1RememberedValue);
            }
            KFunction kFunction5 = (KFunction) linkScreenContentKt$LinkScreenContent$1$6$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel7 = this.$viewModel;
            composer.startReplaceGroup(683977484);
            boolean zChangedInstance7 = composer.changedInstance(linkActivityViewModel7);
            LinkScreenContentKt$LinkScreenContent$1$7$1 linkScreenContentKt$LinkScreenContent$1$7$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance7 || linkScreenContentKt$LinkScreenContent$1$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$7$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$7$1(linkActivityViewModel7);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$7$1RememberedValue);
            }
            KFunction kFunction6 = (KFunction) linkScreenContentKt$LinkScreenContent$1$7$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel8 = this.$viewModel;
            composer.startReplaceGroup(683979173);
            boolean zChangedInstance8 = composer.changedInstance(linkActivityViewModel8);
            LinkScreenContentKt$LinkScreenContent$1$8$1 linkScreenContentKt$LinkScreenContent$1$8$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance8 || linkScreenContentKt$LinkScreenContent$1$8$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$8$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$8$1(linkActivityViewModel8);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$8$1RememberedValue);
            }
            KFunction kFunction7 = (KFunction) linkScreenContentKt$LinkScreenContent$1$8$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel9 = this.$viewModel;
            composer.startReplaceGroup(683980546);
            boolean zChangedInstance9 = composer.changedInstance(linkActivityViewModel9);
            LinkScreenContentKt$LinkScreenContent$1$9$1 linkScreenContentKt$LinkScreenContent$1$9$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance9 || linkScreenContentKt$LinkScreenContent$1$9$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$9$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$9$1(linkActivityViewModel9);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$9$1RememberedValue);
            }
            KFunction kFunction8 = (KFunction) linkScreenContentKt$LinkScreenContent$1$9$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel10 = this.$viewModel;
            composer.startReplaceGroup(683981991);
            boolean zChangedInstance10 = composer.changedInstance(linkActivityViewModel10);
            LinkScreenContentKt$LinkScreenContent$1$10$1 linkScreenContentKt$LinkScreenContent$1$10$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance10 || linkScreenContentKt$LinkScreenContent$1$10$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$10$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$10$1(linkActivityViewModel10);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$10$1RememberedValue);
            }
            KFunction kFunction9 = (KFunction) linkScreenContentKt$LinkScreenContent$1$10$1RememberedValue;
            composer.endReplaceGroup();
            LinkActivityViewModel linkActivityViewModel11 = this.$viewModel;
            composer.startReplaceGroup(683984077);
            boolean zChangedInstance11 = composer.changedInstance(linkActivityViewModel11);
            LinkScreenContentKt$LinkScreenContent$1$11$1 linkScreenContentKt$LinkScreenContent$1$11$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance11 || linkScreenContentKt$LinkScreenContent$1$11$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkScreenContentKt$LinkScreenContent$1$11$1RememberedValue = new LinkScreenContentKt$LinkScreenContent$1$11$1(linkActivityViewModel11);
                composer.updateRememberedValue(linkScreenContentKt$LinkScreenContent$1$11$1RememberedValue);
            }
            KFunction kFunction10 = (KFunction) linkScreenContentKt$LinkScreenContent$1$11$1RememberedValue;
            composer.endReplaceGroup();
            SharedFlow<NavigationIntent> navigationFlow = this.$viewModel.getNavigationFlow();
            LinkAppearance linkAppearance = this.$viewModel.getLinkConfiguration().getLinkAppearance();
            StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
            Function1 function1 = (Function1) kFunction10;
            Function0 function0 = (Function0) kFunction;
            Function0 function02 = (Function0) kFunction2;
            Function0 function03 = (Function0) kFunction3;
            Function0 function04 = (Function0) kFunction4;
            Function1 function12 = (Function1) kFunction5;
            composer.startReplaceGroup(683974758);
            boolean zChangedInstance12 = composer.changedInstance(this.$viewModel);
            final LinkActivityViewModel linkActivityViewModel12 = this.$viewModel;
            Object objRememberedValue = composer.rememberedValue();
            if (!zChangedInstance12) {
                linkAppBarState = linkAppBarStateLinkScreenContent$lambda$1;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                LinkScreenContentKt.LinkScreenContentBody(stripeBottomSheetState, screenStateLinkScreenContent$lambda$0, linkAppBarState, eventReporter, linkAppearance, navigationFlow, function1, function0, function02, function03, function2, function04, function12, (Function0) objRememberedValue, (Function1) kFunction6, (Function1) kFunction7, (Function0) kFunction8, (Function0) kFunction9, composer, StripeBottomSheetState.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            linkAppBarState = linkAppBarStateLinkScreenContent$lambda$1;
            objRememberedValue = new Function0() { // from class: com.stripe.android.link.LinkScreenContentKt$LinkScreenContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return linkActivityViewModel12.getLinkAccount();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
            composer.endReplaceGroup();
            LinkScreenContentKt.LinkScreenContentBody(stripeBottomSheetState, screenStateLinkScreenContent$lambda$0, linkAppBarState, eventReporter, linkAppearance, navigationFlow, function1, function0, function02, function03, function2, function04, function12, (Function0) objRememberedValue, (Function1) kFunction6, (Function1) kFunction7, (Function0) kFunction8, (Function0) kFunction9, composer, StripeBottomSheetState.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
    }

    public static final void LinkScreenContentBody(final StripeBottomSheetState bottomSheetState, ScreenState screenState, final LinkAppBarState appBarState, final EventReporter eventReporter, final LinkAppearance linkAppearance, final SharedFlow<? extends NavigationIntent> navigationChannel, final Function1<? super NavBackStackEntryUpdate, Unit> onNavBackStackEntryChanged, final Function0<Unit> onVerificationSucceeded, final Function0<Unit> onDismissClicked, final Function0<Unit> onBackPressed, final Function2<? super LinkScreen, ? super Boolean, Unit> navigate, final Function0<Unit> dismiss, final Function1<? super LinkActivityResult, Unit> dismissWithResult, final Function0<LinkAccount> getLinkAccount, final Function1<? super LinkAction, Unit> handleViewAction, final Function1<? super Throwable, Unit> moveToWeb, final Function0<Unit> goBack, final Function0<Unit> changeEmail, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        ScreenState screenState2;
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(appBarState, "appBarState");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(onNavBackStackEntryChanged, "onNavBackStackEntryChanged");
        Intrinsics.checkNotNullParameter(onVerificationSucceeded, "onVerificationSucceeded");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        Intrinsics.checkNotNullParameter(getLinkAccount, "getLinkAccount");
        Intrinsics.checkNotNullParameter(handleViewAction, "handleViewAction");
        Intrinsics.checkNotNullParameter(moveToWeb, "moveToWeb");
        Intrinsics.checkNotNullParameter(goBack, "goBack");
        Intrinsics.checkNotNullParameter(changeEmail, "changeEmail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-157105575);
        if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(bottomSheetState) : composerStartRestartGroup.changedInstance(bottomSheetState) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(screenState) : composerStartRestartGroup.changedInstance(screenState) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(appBarState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(eventReporter) : composerStartRestartGroup.changedInstance(eventReporter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(linkAppearance) : composerStartRestartGroup.changedInstance(linkAppearance) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigationChannel) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavBackStackEntryChanged) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onVerificationSucceeded) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(navigate) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismiss) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissWithResult) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(getLinkAccount) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(handleViewAction) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(moveToWeb) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(goBack) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(changeEmail) ? 8388608 : 4194304;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (4793491 & i6) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-157105575, i5, i6, "com.stripe.android.link.LinkScreenContentBody (LinkScreenContent.kt:82)");
            }
            if (screenState instanceof ScreenState.FullScreen) {
                composerStartRestartGroup.startReplaceGroup(-33649408);
                Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, LinkActivityKt.FULL_SCREEN_CONTENT_TAG);
                LinkScreen initialDestination = ((ScreenState.FullScreen) screenState).getInitialDestination();
                int i7 = i5 << 3;
                int i8 = (i7 & 57344) | (StripeBottomSheetState.$stable << 3) | 6 | (i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i7 & 7168) | ((i5 >> 12) & 458752);
                int i9 = i6 << 3;
                FullScreenContentKt.FullScreenContent(modifierTestTag, bottomSheetState, initialDestination, appBarState, eventReporter, onBackPressed, moveToWeb, goBack, onNavBackStackEntryChanged, navigationChannel, handleViewAction, navigate, dismiss, dismissWithResult, getLinkAccount, changeEmail, composerStartRestartGroup, i8 | (i9 & 3670016) | (i9 & 29360128) | ((i5 << 6) & 234881024) | ((i5 << 12) & 1879048192), ((i6 >> 12) & 14) | (i9 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | ((i6 >> 6) & 458752));
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                screenState2 = screenState;
            } else {
                composer2 = composerStartRestartGroup;
                screenState2 = screenState;
                if (Intrinsics.areEqual(screenState2, ScreenState.Loading.INSTANCE)) {
                    composer2.startReplaceGroup(-1247983208);
                    composer2.endReplaceGroup();
                } else {
                    if (!(screenState2 instanceof ScreenState.VerificationDialog)) {
                        composer2.startReplaceGroup(-1248012691);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-32709643);
                    VerificationDialogKt.VerificationDialog(TestTagKt.testTag(Modifier.INSTANCE, LinkActivityKt.VERIFICATION_DIALOG_CONTENT_TAG), ((ScreenState.VerificationDialog) screenState2).getLinkAccount(), linkAppearance, onVerificationSucceeded, changeEmail, onDismissClicked, dismissWithResult, composer2, ((i5 >> 6) & 896) | 6 | ((i5 >> 12) & 7168) | ((i6 >> 9) & 57344) | ((i5 >> 9) & 458752) | ((i6 << 12) & 3670016));
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            screenState2 = screenState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ScreenState screenState3 = screenState2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.LinkScreenContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkScreenContentKt.LinkScreenContentBody$lambda$4(bottomSheetState, screenState3, appBarState, eventReporter, linkAppearance, navigationChannel, onNavBackStackEntryChanged, onVerificationSucceeded, onDismissClicked, onBackPressed, navigate, dismiss, dismissWithResult, getLinkAccount, handleViewAction, moveToWeb, goBack, changeEmail, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenState LinkScreenContent$lambda$0(State<? extends ScreenState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAppBarState LinkScreenContent$lambda$1(State<LinkAppBarState> state) {
        return state.getValue();
    }
}
