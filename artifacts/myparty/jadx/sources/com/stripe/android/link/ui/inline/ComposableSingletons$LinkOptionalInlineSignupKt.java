package com.stripe.android.link.ui.inline;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkOptionalInlineSignup.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkOptionalInlineSignupKt {
    public static final ComposableSingletons$LinkOptionalInlineSignupKt INSTANCE = new ComposableSingletons$LinkOptionalInlineSignupKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f182lambda1 = ComposableLambdaKt.composableLambdaInstance(1749904785, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1749904785, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-1.<anonymous> (LinkOptionalInlineSignup.kt:241)");
                }
                LinkOptionalInlineSignupKt.LinkOptionalInlineSignup(new SectionController(null, CollectionsKt.emptyList()), EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "", false, 2, null), PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 30, null), NameConfig.Companion.createController(""), false, SignUpState.InputtingPrimaryField, true, true, null, PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer, 920346624 | SectionController.$stable | (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f183lambda2 = ComposableLambdaKt.composableLambdaInstance(-1793392299, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1793392299, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-2.<anonymous> (LinkOptionalInlineSignup.kt:240)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7885getLambda1$paymentsheet_release(), composer, 1572864, 63);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f184lambda3 = ComposableLambdaKt.composableLambdaInstance(-293016919, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-293016919, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-3.<anonymous> (LinkOptionalInlineSignup.kt:262)");
                }
                LinkOptionalInlineSignupKt.LinkOptionalInlineSignup(new SectionController(null, CollectionsKt.emptyList()), EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "", false, 2, null), PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 30, null), NameConfig.Companion.createController(""), true, SignUpState.InputtingPrimaryField, true, true, null, PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer, 920346624 | SectionController.$stable | (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f185lambda4 = ComposableLambdaKt.composableLambdaInstance(-90794131, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-90794131, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-4.<anonymous> (LinkOptionalInlineSignup.kt:261)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7887getLambda3$paymentsheet_release(), composer, 1572864, 63);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f186lambda5 = ComposableLambdaKt.composableLambdaInstance(1031560905, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031560905, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-5.<anonymous> (LinkOptionalInlineSignup.kt:283)");
                }
                LinkOptionalInlineSignupKt.LinkOptionalInlineSignup(new SectionController(null, CollectionsKt.emptyList()), EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "email@me.co", false, 2, null), PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "5555555555", null, null, false, false, 30, null), NameConfig.Companion.createController("My Name"), false, SignUpState.InputtingRemainingFields, true, true, null, PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer, 920346624 | SectionController.$stable | (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f187lambda6 = ComposableLambdaKt.composableLambdaInstance(1832128909, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1832128909, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkOptionalInlineSignupKt.lambda-6.<anonymous> (LinkOptionalInlineSignup.kt:282)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7889getLambda5$paymentsheet_release(), composer, 1572864, 63);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7885getLambda1$paymentsheet_release() {
        return f182lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7886getLambda2$paymentsheet_release() {
        return f183lambda2;
    }

    /* renamed from: getLambda-3$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7887getLambda3$paymentsheet_release() {
        return f184lambda3;
    }

    /* renamed from: getLambda-4$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7888getLambda4$paymentsheet_release() {
        return f185lambda4;
    }

    /* renamed from: getLambda-5$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7889getLambda5$paymentsheet_release() {
        return f186lambda5;
    }

    /* renamed from: getLambda-6$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7890getLambda6$paymentsheet_release() {
        return f187lambda6;
    }
}
