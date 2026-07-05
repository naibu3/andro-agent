package com.stripe.android.paymentsheet.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.facebook.common.util.UriUtil;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporter;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporterKt;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporterKt;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporterKt;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: EventReporterProviderUtil.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"EventReporterProvider", "", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EventReporterProviderUtilKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventReporterProvider$lambda$4(EventReporter eventReporter, Function2 function2, int i, Composer composer, int i2) {
        EventReporterProvider(eventReporter, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EventReporterProvider(final EventReporter eventReporter, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(388083719);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(eventReporter) : composerStartRestartGroup.changedInstance(eventReporter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388083719, i2, -1, "com.stripe.android.paymentsheet.utils.EventReporterProvider (EventReporterProviderUtil.kt:14)");
            }
            ProvidedValue[] providedValueArr = new ProvidedValue[4];
            ProvidableCompositionLocal<Function1<String, Unit>> localAutofillEventReporter = TextFieldUIKt.getLocalAutofillEventReporter();
            composerStartRestartGroup.startReplaceGroup(-1981017114);
            int i3 = i2 & 14;
            boolean z = false;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(eventReporter));
            EventReporterProviderUtilKt$EventReporterProvider$1$1 eventReporterProviderUtilKt$EventReporterProvider$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || eventReporterProviderUtilKt$EventReporterProvider$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                eventReporterProviderUtilKt$EventReporterProvider$1$1RememberedValue = new EventReporterProviderUtilKt$EventReporterProvider$1$1(eventReporter);
                composerStartRestartGroup.updateRememberedValue(eventReporterProviderUtilKt$EventReporterProvider$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            providedValueArr[0] = localAutofillEventReporter.provides((KFunction) eventReporterProviderUtilKt$EventReporterProvider$1$1RememberedValue);
            ProvidableCompositionLocal<CardNumberCompletedEventReporter> localCardNumberCompletedEventReporter = CardNumberCompletedEventReporterKt.getLocalCardNumberCompletedEventReporter();
            composerStartRestartGroup.startReplaceGroup(-1981014479);
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(eventReporter));
            EventReporterProviderUtilKt$EventReporterProvider$2$1 eventReporterProviderUtilKt$EventReporterProvider$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || eventReporterProviderUtilKt$EventReporterProvider$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                eventReporterProviderUtilKt$EventReporterProvider$2$1RememberedValue = new EventReporterProviderUtilKt$EventReporterProvider$2$1(eventReporter);
                composerStartRestartGroup.updateRememberedValue(eventReporterProviderUtilKt$EventReporterProvider$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            providedValueArr[1] = localCardNumberCompletedEventReporter.provides(new EventReporterProviderUtilKt$sam$com_stripe_android_ui_core_elements_events_CardNumberCompletedEventReporter$0((Function0) ((KFunction) eventReporterProviderUtilKt$EventReporterProvider$2$1RememberedValue)));
            ProvidableCompositionLocal<CardBrandDisallowedReporter> localCardBrandDisallowedReporter = CardBrandDisallowedReporterKt.getLocalCardBrandDisallowedReporter();
            composerStartRestartGroup.startReplaceGroup(-1981011656);
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(eventReporter));
            EventReporterProviderUtilKt$EventReporterProvider$3$1 eventReporterProviderUtilKt$EventReporterProvider$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || eventReporterProviderUtilKt$EventReporterProvider$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                eventReporterProviderUtilKt$EventReporterProvider$3$1RememberedValue = new EventReporterProviderUtilKt$EventReporterProvider$3$1(eventReporter);
                composerStartRestartGroup.updateRememberedValue(eventReporterProviderUtilKt$EventReporterProvider$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            providedValueArr[2] = localCardBrandDisallowedReporter.provides(new EventReporterProviderUtilKt$sam$com_stripe_android_ui_core_elements_events_CardBrandDisallowedReporter$0((Function1) ((KFunction) eventReporterProviderUtilKt$EventReporterProvider$3$1RememberedValue)));
            ProvidableCompositionLocal<AnalyticsEventReporter> localAnalyticsEventReporter = AnalyticsEventReporterKt.getLocalAnalyticsEventReporter();
            composerStartRestartGroup.startReplaceGroup(-1981008788);
            if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(eventReporter))) {
                z = true;
            }
            EventReporterProviderUtilKt$EventReporterProvider$4$1 eventReporterProviderUtilKt$EventReporterProvider$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || eventReporterProviderUtilKt$EventReporterProvider$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                eventReporterProviderUtilKt$EventReporterProvider$4$1RememberedValue = new EventReporterProviderUtilKt$EventReporterProvider$4$1(eventReporter);
                composerStartRestartGroup.updateRememberedValue(eventReporterProviderUtilKt$EventReporterProvider$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            providedValueArr[3] = localAnalyticsEventReporter.provides(new EventReporterProviderUtilKt$sam$com_stripe_android_ui_core_elements_events_AnalyticsEventReporter$0((Function1) ((KFunction) eventReporterProviderUtilKt$EventReporterProvider$4$1RememberedValue)));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(94700359, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.utils.EventReporterProviderUtilKt.EventReporterProvider.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(94700359, i4, -1, "com.stripe.android.paymentsheet.utils.EventReporterProvider.<anonymous> (EventReporterProviderUtil.kt:21)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.utils.EventReporterProviderUtilKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventReporterProviderUtilKt.EventReporterProvider$lambda$4(eventReporter, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
