package com.stripe.android.financialconnections.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredModalKt;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt;
import com.stripe.android.financialconnections.features.consent.ConsentScreenKt;
import com.stripe.android.financialconnections.features.error.ErrorScreenKt;
import com.stripe.android.financialconnections.features.exit.ExitModalKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreenKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetKt;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt;
import com.stripe.android.financialconnections.features.success.SuccessScreenKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destination.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$DestinationKt {
    public static final ComposableSingletons$DestinationKt INSTANCE = new ComposableSingletons$DestinationKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f105lambda1 = ComposableLambdaKt.composableLambdaInstance(1079878273, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1079878273, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-1.<anonymous> (Destination.kt:95)");
            }
            InstitutionPickerScreenKt.InstitutionPickerScreen(it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f116lambda2 = ComposableLambdaKt.composableLambdaInstance(1970641677, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970641677, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-2.<anonymous> (Destination.kt:101)");
            }
            ConsentScreenKt.ConsentScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f121lambda3 = ComposableLambdaKt.composableLambdaInstance(-734344057, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-734344057, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-3.<anonymous> (Destination.kt:107)");
            }
            IDConsentContentKt.IDConsentContentScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f122lambda4 = ComposableLambdaKt.composableLambdaInstance(1516541222, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1516541222, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-4.<anonymous> (Destination.kt:113)");
            }
            PartnerAuthScreenKt.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, true, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f123lambda5 = ComposableLambdaKt.composableLambdaInstance(-1823417641, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1823417641, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-5.<anonymous> (Destination.kt:119)");
            }
            PartnerAuthScreenKt.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, false, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f124lambda6 = ComposableLambdaKt.composableLambdaInstance(-610989204, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-610989204, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-6.<anonymous> (Destination.kt:125)");
            }
            AccountPickerScreenKt.AccountPickerScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f125lambda7 = ComposableLambdaKt.composableLambdaInstance(633501636, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(633501636, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-7.<anonymous> (Destination.kt:131)");
            }
            SuccessScreenKt.SuccessScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f126lambda8 = ComposableLambdaKt.composableLambdaInstance(-1053306213, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1053306213, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-8.<anonymous> (Destination.kt:137)");
            }
            ManualEntryScreenKt.ManualEntryScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f127lambda9 = ComposableLambdaKt.composableLambdaInstance(-258743460, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258743460, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-9.<anonymous> (Destination.kt:143)");
            }
            AttachPaymentScreenKt.AttachPaymentScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f106lambda10 = ComposableLambdaKt.composableLambdaInstance(256068251, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256068251, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-10.<anonymous> (Destination.kt:149)");
            }
            NetworkingLinkSignupScreenKt.NetworkingLinkSignupScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f107lambda11 = ComposableLambdaKt.composableLambdaInstance(-1533051144, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533051144, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-11.<anonymous> (Destination.kt:155)");
            }
            NetworkingLinkSignupScreenKt.NetworkingLinkSignupScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f108lambda12 = ComposableLambdaKt.composableLambdaInstance(-247343796, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-12$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-247343796, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-12.<anonymous> (Destination.kt:167)");
            }
            NetworkingLinkLoginWarmupScreenKt.NetworkingLinkLoginWarmupScreen(it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f109lambda13 = ComposableLambdaKt.composableLambdaInstance(528080184, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-13$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(528080184, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-13.<anonymous> (Destination.kt:173)");
            }
            NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-14, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f110lambda14 = ComposableLambdaKt.composableLambdaInstance(1575816320, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-14$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1575816320, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-14.<anonymous> (Destination.kt:179)");
            }
            NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-15, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f111lambda15 = ComposableLambdaKt.composableLambdaInstance(1350225286, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-15$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1350225286, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-15.<anonymous> (Destination.kt:185)");
            }
            LinkAccountPickerScreenKt.LinkAccountPickerScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-16, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f112lambda16 = ComposableLambdaKt.composableLambdaInstance(2048073477, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-16$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2048073477, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-16.<anonymous> (Destination.kt:191)");
            }
            LinkStepUpVerificationScreenKt.LinkStepUpVerificationScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-17, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f113lambda17 = ComposableLambdaKt.composableLambdaInstance(-404597064, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-17$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404597064, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-17.<anonymous> (Destination.kt:197)");
            }
            ResetScreenKt.ResetScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-18, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f114lambda18 = ComposableLambdaKt.composableLambdaInstance(-361367997, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-18$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361367997, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-18.<anonymous> (Destination.kt:203)");
            }
            ExitModalKt.ExitModal(it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-19, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f115lambda19 = ComposableLambdaKt.composableLambdaInstance(-1040114807, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-19$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040114807, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-19.<anonymous> (Destination.kt:209)");
            }
            NoticeSheetKt.NoticeSheet(it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-20, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f117lambda20 = ComposableLambdaKt.composableLambdaInstance(-513144654, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-20$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513144654, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-20.<anonymous> (Destination.kt:215)");
            }
            AccountUpdateRequiredModalKt.AccountUpdateRequiredModal(it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-21, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f118lambda21 = ComposableLambdaKt.composableLambdaInstance(1233481887, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-21$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233481887, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-21.<anonymous> (Destination.kt:221)");
            }
            ErrorScreenKt.ErrorScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-22, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f119lambda22 = ComposableLambdaKt.composableLambdaInstance(1251583312, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-22$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1251583312, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-22.<anonymous> (Destination.kt:227)");
            }
            PartnerAuthScreenKt.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, false, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-23, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f120lambda23 = ComposableLambdaKt.composableLambdaInstance(554929450, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$lambda-23$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(554929450, i, -1, "com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt.lambda-23.<anonymous> (Destination.kt:233)");
            }
            ManualEntrySuccessScreenKt.ManualEntrySuccessScreen(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7509getLambda1$financial_connections_release() {
        return f105lambda1;
    }

    /* renamed from: getLambda-10$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7510getLambda10$financial_connections_release() {
        return f106lambda10;
    }

    /* renamed from: getLambda-11$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7511getLambda11$financial_connections_release() {
        return f107lambda11;
    }

    /* renamed from: getLambda-12$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7512getLambda12$financial_connections_release() {
        return f108lambda12;
    }

    /* renamed from: getLambda-13$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7513getLambda13$financial_connections_release() {
        return f109lambda13;
    }

    /* renamed from: getLambda-14$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7514getLambda14$financial_connections_release() {
        return f110lambda14;
    }

    /* renamed from: getLambda-15$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7515getLambda15$financial_connections_release() {
        return f111lambda15;
    }

    /* renamed from: getLambda-16$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7516getLambda16$financial_connections_release() {
        return f112lambda16;
    }

    /* renamed from: getLambda-17$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7517getLambda17$financial_connections_release() {
        return f113lambda17;
    }

    /* renamed from: getLambda-18$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7518getLambda18$financial_connections_release() {
        return f114lambda18;
    }

    /* renamed from: getLambda-19$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7519getLambda19$financial_connections_release() {
        return f115lambda19;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7520getLambda2$financial_connections_release() {
        return f116lambda2;
    }

    /* renamed from: getLambda-20$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7521getLambda20$financial_connections_release() {
        return f117lambda20;
    }

    /* renamed from: getLambda-21$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7522getLambda21$financial_connections_release() {
        return f118lambda21;
    }

    /* renamed from: getLambda-22$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7523getLambda22$financial_connections_release() {
        return f119lambda22;
    }

    /* renamed from: getLambda-23$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7524getLambda23$financial_connections_release() {
        return f120lambda23;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7525getLambda3$financial_connections_release() {
        return f121lambda3;
    }

    /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7526getLambda4$financial_connections_release() {
        return f122lambda4;
    }

    /* renamed from: getLambda-5$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7527getLambda5$financial_connections_release() {
        return f123lambda5;
    }

    /* renamed from: getLambda-6$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7528getLambda6$financial_connections_release() {
        return f124lambda6;
    }

    /* renamed from: getLambda-7$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7529getLambda7$financial_connections_release() {
        return f125lambda7;
    }

    /* renamed from: getLambda-8$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7530getLambda8$financial_connections_release() {
        return f126lambda8;
    }

    /* renamed from: getLambda-9$financial_connections_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m7531getLambda9$financial_connections_release() {
        return f127lambda9;
    }
}
