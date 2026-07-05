package com.stripe.android.financialconnections.features.common;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import expo.modules.notifications.service.NotificationsService;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ErrorContent.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\t\u001a1\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0014\u001a?\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u001a2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u001b\u001an\u0010\u001c\u001a\u00020\u00012\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010#2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010#H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'¨\u0006("}, d2 = {"UnclassifiedErrorContent", "", "allowManualEntry", "", "onCtaClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "InstitutionUnknownErrorContent", "onSelectAnotherBank", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InstitutionUnplannedDowntimeErrorContent", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "onEnterDetailsManually", "(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InstitutionPlannedDowntimeErrorContent", "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NoSupportedPaymentMethodTypeAccountsErrorContent", "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NoAccountsAvailableErrorContent", "Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "onTryAgain", "(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AccountNumberRetrievalErrorContent", "Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;", "(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "iconContent", "Landroidx/compose/runtime/Composable;", "title", "", UriUtil.LOCAL_CONTENT_SCHEME, "primaryCta", "Lkotlin/Pair;", "secondaryCta", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Landroidx/compose/runtime/Composer;II)V", "NoAccountsAvailableErrorContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountNumberRetrievalErrorContent$lambda$11(AccountNumberRetrievalError accountNumberRetrievalError, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AccountNumberRetrievalErrorContent(accountNumberRetrievalError, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$16(Function2 function2, String str, String str2, Pair pair, Pair pair2, int i, int i2, Composer composer, int i3) {
        ErrorContent(function2, str, str2, pair, pair2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstitutionPlannedDowntimeErrorContent$lambda$5(InstitutionPlannedDowntimeError institutionPlannedDowntimeError, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InstitutionPlannedDowntimeErrorContent(institutionPlannedDowntimeError, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstitutionUnknownErrorContent$lambda$1(Function0 function0, int i, Composer composer, int i2) {
        InstitutionUnknownErrorContent(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstitutionUnplannedDowntimeErrorContent$lambda$2(InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InstitutionUnplannedDowntimeErrorContent(institutionUnplannedDowntimeError, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoAccountsAvailableErrorContent$lambda$10(AccountLoadError accountLoadError, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        NoAccountsAvailableErrorContent(accountLoadError, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoAccountsAvailableErrorContentPreview$lambda$17(int i, Composer composer, int i2) {
        NoAccountsAvailableErrorContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoSupportedPaymentMethodTypeAccountsErrorContent$lambda$6(AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError, Function0 function0, int i, Composer composer, int i2) {
        NoSupportedPaymentMethodTypeAccountsErrorContent(accountNoneEligibleForPaymentMethodError, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnclassifiedErrorContent$lambda$0(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        UnclassifiedErrorContent(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UnclassifiedErrorContent(final boolean z, final Function0<Unit> onCtaClick, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-406772431);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-406772431, i3, -1, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContent (ErrorContent.kt:43)");
            }
            ErrorContent(ComposableSingletons$ErrorContentKt.INSTANCE.m7320getLambda1$financial_connections_release(), StringResources_androidKt.stringResource(R.string.stripe_error_generic_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_error_generic_desc, composerStartRestartGroup, 0), new Pair(StringResources_androidKt.stringResource(z ? R.string.stripe_error_cta_manual_entry : R.string.stripe_error_cta_close, composerStartRestartGroup, 0), onCtaClick), null, composerStartRestartGroup, 6, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.UnclassifiedErrorContent$lambda$0(z, onCtaClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InstitutionUnknownErrorContent(final Function0<Unit> onSelectAnotherBank, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Composer composerStartRestartGroup = composer.startRestartGroup(517513307);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517513307, i2, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnknownErrorContent (ErrorContent.kt:65)");
            }
            ErrorContent(ComposableSingletons$ErrorContentKt.INSTANCE.m7321getLambda2$financial_connections_release(), StringResources_androidKt.stringResource(R.string.stripe_error_generic_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_error_unplanned_downtime_desc, composerStartRestartGroup, 0), new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_select_another_bank, composerStartRestartGroup, 0), onSelectAnotherBank), null, composerStartRestartGroup, 6, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.InstitutionUnknownErrorContent$lambda$1(onSelectAnotherBank, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InstitutionUnplannedDowntimeErrorContent(final InstitutionUnplannedDowntimeError exception, final Function0<Unit> onSelectAnotherBank, final Function0<Unit> onEnterDetailsManually, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Composer composerStartRestartGroup = composer.startRestartGroup(1547189329);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(exception) : composerStartRestartGroup.changedInstance(exception) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547189329, i2, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent (ErrorContent.kt:87)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1017903923, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.InstitutionUnplannedDowntimeErrorContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String str;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1017903923, i3, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent.<anonymous> (ErrorContent.kt:90)");
                    }
                    Image icon = exception.getInstitution().getIcon();
                    if (icon == null || (str = icon.getDefault()) == null) {
                        str = "";
                    }
                    InstitutionIconKt.InstitutionIcon(str, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_error_unplanned_downtime_title, new Object[]{exception.getInstitution().getName()}, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_error_unplanned_downtime_desc, composerStartRestartGroup, 0);
            Pair pair = new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_select_another_bank, composerStartRestartGroup, 0), onSelectAnotherBank);
            composerStartRestartGroup.startReplaceGroup(604420527);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_manual_entry, composerStartRestartGroup, 0), onEnterDetailsManually) : null;
            composerStartRestartGroup.endReplaceGroup();
            ErrorContent(composableLambdaRememberComposableLambda, strStringResource, strStringResource2, pair, pair2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.InstitutionUnplannedDowntimeErrorContent$lambda$2(exception, onSelectAnotherBank, onEnterDetailsManually, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InstitutionPlannedDowntimeErrorContent(final InstitutionPlannedDowntimeError exception, final Function0<Unit> onSelectAnotherBank, final Function0<Unit> onEnterDetailsManually, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Composer composerStartRestartGroup = composer.startRestartGroup(118813745);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(exception) : composerStartRestartGroup.changedInstance(exception) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118813745, i2, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent (ErrorContent.kt:117)");
            }
            composerStartRestartGroup.startReplaceGroup(1764459747);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Locale(androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent().getLanguage());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Locale locale = (Locale) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            long backUpAt = exception.getBackUpAt();
            composerStartRestartGroup.startReplaceGroup(1764462309);
            boolean zChanged = composerStartRestartGroup.changed(backUpAt);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale).format(Long.valueOf(exception.getBackUpAt()));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(443511827, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.InstitutionPlannedDowntimeErrorContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String str;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(443511827, i3, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent.<anonymous> (ErrorContent.kt:124)");
                    }
                    Image icon = exception.getInstitution().getIcon();
                    if (icon == null || (str = icon.getDefault()) == null) {
                        str = "";
                    }
                    InstitutionIconKt.InstitutionIcon(str, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_error_planned_downtime_title, new Object[]{exception.getInstitution().getName()}, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_error_planned_downtime_desc, new Object[]{(String) objRememberedValue2}, composerStartRestartGroup, 0);
            Pair pair = new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_select_another_bank, composerStartRestartGroup, 0), onSelectAnotherBank);
            composerStartRestartGroup.startReplaceGroup(1764484744);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_manual_entry, composerStartRestartGroup, 0), onEnterDetailsManually) : null;
            composerStartRestartGroup.endReplaceGroup();
            ErrorContent(composableLambdaRememberComposableLambda, strStringResource, strStringResource2, pair, pair2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.InstitutionPlannedDowntimeErrorContent$lambda$5(exception, onSelectAnotherBank, onEnterDetailsManually, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NoSupportedPaymentMethodTypeAccountsErrorContent(final AccountNoneEligibleForPaymentMethodError exception, final Function0<Unit> onSelectAnotherBank, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621855517);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(exception) : composerStartRestartGroup.changedInstance(exception) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621855517, i2, -1, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent (ErrorContent.kt:153)");
            }
            ErrorContent(ComposableLambdaKt.rememberComposableLambda(-919686847, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.NoSupportedPaymentMethodTypeAccountsErrorContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String str;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-919686847, i3, -1, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent.<anonymous> (ErrorContent.kt:156)");
                    }
                    Image icon = exception.getInstitution().getIcon();
                    if (icon == null || (str = icon.getDefault()) == null) {
                        str = "";
                    }
                    InstitutionIconKt.InstitutionIcon(str, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), StringResources_androidKt.stringResource(R.string.stripe_account_picker_error_no_payment_method_title, composerStartRestartGroup, 0), TextKt.pluralStringResource(R.string.stripe_account_picker_error_no_payment_method_desc_singular, R.string.stripe_account_picker_error_no_payment_method_desc_plural, exception.getAccountsCount(), new Object[]{String.valueOf(exception.getAccountsCount()), exception.getInstitution().getName(), exception.getMerchantName()}, composerStartRestartGroup, 0), new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_select_another_bank, composerStartRestartGroup, 0), onSelectAnotherBank), null, composerStartRestartGroup, 24582, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.NoSupportedPaymentMethodTypeAccountsErrorContent$lambda$6(exception, onSelectAnotherBank, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NoAccountsAvailableErrorContent(final AccountLoadError exception, final Function0<Unit> onSelectAnotherBank, final Function0<Unit> onEnterDetailsManually, final Function0<Unit> onTryAgain, Composer composer, final int i) {
        int i2;
        Pair pair;
        int i3;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Intrinsics.checkNotNullParameter(onTryAgain, "onTryAgain");
        Composer composerStartRestartGroup = composer.startRestartGroup(-162660842);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(exception) : composerStartRestartGroup.changedInstance(exception) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTryAgain) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-162660842, i2, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent (ErrorContent.kt:183)");
            }
            boolean showManualEntry = exception.getShowManualEntry();
            boolean canRetry = exception.getCanRetry();
            composerStartRestartGroup.startReplaceGroup(689653208);
            boolean zChanged = composerStartRestartGroup.changed(showManualEntry) | composerStartRestartGroup.changed(canRetry);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (exception.getCanRetry()) {
                    pair = new Pair(TuplesKt.to(Integer.valueOf(R.string.stripe_error_cta_retry), onTryAgain), TuplesKt.to(Integer.valueOf(R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank));
                } else if (exception.getShowManualEntry()) {
                    pair = new Pair(TuplesKt.to(Integer.valueOf(R.string.stripe_error_cta_manual_entry), onEnterDetailsManually), TuplesKt.to(Integer.valueOf(R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank));
                } else {
                    pair = new Pair(TuplesKt.to(Integer.valueOf(R.string.stripe_error_cta_select_another_bank), onSelectAnotherBank), null);
                }
                objRememberedValue = pair;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Pair pair2 = (Pair) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Pair pair3 = (Pair) pair2.component1();
            Pair pair4 = (Pair) pair2.component2();
            boolean showManualEntry2 = exception.getShowManualEntry();
            boolean canRetry2 = exception.getCanRetry();
            composerStartRestartGroup.startReplaceGroup(689678160);
            boolean zChanged2 = composerStartRestartGroup.changed(showManualEntry2) | composerStartRestartGroup.changed(canRetry2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (exception.getCanRetry()) {
                    i3 = R.string.stripe_accounts_error_desc_retry;
                } else {
                    i3 = exception.getShowManualEntry() ? R.string.stripe_accounts_error_desc_manualentry : R.string.stripe_accounts_error_desc_no_retry;
                }
                objRememberedValue2 = Integer.valueOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2003844872, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.NoAccountsAvailableErrorContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    String str;
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2003844872, i4, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent.<anonymous> (ErrorContent.kt:217)");
                    }
                    Image icon = exception.getInstitution().getIcon();
                    if (icon == null || (str = icon.getDefault()) == null) {
                        str = "";
                    }
                    InstitutionIconKt.InstitutionIcon(str, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_account_picker_error_no_account_available_title, new Object[]{exception.getInstitution().getName()}, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(iIntValue, composerStartRestartGroup, 0);
            Pair pair5 = TuplesKt.to(StringResources_androidKt.stringResource(((Number) pair3.getFirst()).intValue(), composerStartRestartGroup, 0), pair3.getSecond());
            composerStartRestartGroup.startReplaceGroup(689702879);
            Pair pair6 = pair4 != null ? TuplesKt.to(StringResources_androidKt.stringResource(((Number) pair4.getFirst()).intValue(), composerStartRestartGroup, 0), pair4.getSecond()) : null;
            composerStartRestartGroup.endReplaceGroup();
            ErrorContent(composableLambdaRememberComposableLambda, strStringResource, strStringResource2, pair5, pair6, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.NoAccountsAvailableErrorContent$lambda$10(exception, onSelectAnotherBank, onEnterDetailsManually, onTryAgain, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccountNumberRetrievalErrorContent(final AccountNumberRetrievalError exception, final Function0<Unit> onSelectAnotherBank, final Function0<Unit> onEnterDetailsManually, Composer composer, final int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(onSelectAnotherBank, "onSelectAnotherBank");
        Intrinsics.checkNotNullParameter(onEnterDetailsManually, "onEnterDetailsManually");
        Composer composerStartRestartGroup = composer.startRestartGroup(1714910993);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(exception) : composerStartRestartGroup.changedInstance(exception) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1714910993, i2, -1, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent (ErrorContent.kt:234)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1439106829, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.AccountNumberRetrievalErrorContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    String str;
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439106829, i4, -1, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent.<anonymous> (ErrorContent.kt:237)");
                    }
                    Image icon = exception.getInstitution().getIcon();
                    if (icon == null || (str = icon.getDefault()) == null) {
                        str = "";
                    }
                    InstitutionIconKt.InstitutionIcon(str, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_attachlinkedpaymentaccount_error_title, composerStartRestartGroup, 0);
            boolean showManualEntry = exception.getShowManualEntry();
            if (showManualEntry) {
                i3 = R.string.stripe_attachlinkedpaymentaccount_error_desc_manual_entry;
            } else {
                if (showManualEntry) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.stripe_attachlinkedpaymentaccount_error_desc;
            }
            String strStringResource2 = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0);
            Pair pair = new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_select_another_bank, composerStartRestartGroup, 0), onSelectAnotherBank);
            composerStartRestartGroup.startReplaceGroup(1375135147);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(StringResources_androidKt.stringResource(R.string.stripe_error_cta_manual_entry, composerStartRestartGroup, 0), onEnterDetailsManually) : null;
            composerStartRestartGroup.endReplaceGroup();
            ErrorContent(composableLambdaRememberComposableLambda, strStringResource, strStringResource2, pair, pair2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.AccountNumberRetrievalErrorContent$lambda$11(exception, onSelectAnotherBank, onEnterDetailsManually, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorContent(final Function2<? super Composer, ? super Integer, Unit> function2, final String title, final String content, Pair<String, ? extends Function0<Unit>> pair, Pair<String, ? extends Function0<Unit>> pair2, Composer composer, final int i, final int i2) {
        int i3;
        Pair<String, ? extends Function0<Unit>> pair3;
        int i4;
        Pair<String, ? extends Function0<Unit>> pair4;
        View view;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z;
        Object objRememberedValue2;
        Composer composer2;
        final Pair<String, ? extends Function0<Unit>> pair5;
        final Pair<String, ? extends Function0<Unit>> pair6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1729518300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(content) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                pair3 = pair;
                i3 |= composerStartRestartGroup.changed(pair3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    pair4 = pair2;
                    i3 |= composerStartRestartGroup.changed(pair4) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    final Pair<String, ? extends Function0<Unit>> pair7 = i5 == 0 ? null : pair3;
                    final Pair<String, ? extends Function0<Unit>> pair8 = i4 == 0 ? null : pair4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1729518300, i3, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:270)");
                    }
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    view = (View) objConsume;
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1418135344);
                    zChangedInstance = composerStartRestartGroup.changedInstance(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function2) new ErrorContentKt$ErrorContent$1$1(view, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(176489385, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.ErrorContent.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(176489385, i6, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous> (ErrorContent.kt:299)");
                                }
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
                                Pair<String, Function0<Unit>> pair9 = pair8;
                                Pair<String, Function0<Unit>> pair10 = pair7;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer3, 6);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(447239311);
                                if (pair9 != null) {
                                    final String strComponent1 = pair9.component1();
                                    ButtonKt.FinancialConnectionsButton(pair9.component2(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Secondary.INSTANCE, null, false, false, ComposableLambdaKt.rememberComposableLambda(-2095261279, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$2$1$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope FinancialConnectionsButton, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2095261279, i7, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:309)");
                                            }
                                            androidx.compose.material.TextKt.m2076Text4IGK_g(strComponent1, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 1573296, 56);
                                }
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(447252493);
                                if (pair10 != null) {
                                    final String strComponent12 = pair10.component1();
                                    ButtonKt.FinancialConnectionsButton(pair10.component2(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Primary.INSTANCE, null, false, false, ComposableLambdaKt.rememberComposableLambda(-648515254, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$2$1$2$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope FinancialConnectionsButton, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-648515254, i7, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:319)");
                                            }
                                            androidx.compose.material.TextKt.m2076Text4IGK_g(strComponent12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 1573296, 56);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1418127973);
                    z = ((i3 & 14) != 4) | ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | ((i3 & 896) == 256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ErrorContentKt.ErrorContent$lambda$15$lambda$14(function2, title, content, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Pair<String, ? extends Function0<Unit>> pair9 = pair7;
                    Pair<String, ? extends Function0<Unit>> pair10 = pair8;
                    composer2 = composerStartRestartGroup;
                    LayoutKt.LazyLayout(null, null, false, false, false, horizontalOrVerticalM900spacedBy0680j_4, false, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue2, composer2, 100859904, 223);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    pair5 = pair9;
                    pair6 = pair10;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    pair5 = pair3;
                    pair6 = pair4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ErrorContentKt.ErrorContent$lambda$16(function2, title, content, pair5, pair6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            pair4 = pair2;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localView2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                view = (View) objConsume2;
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1418135344);
                zChangedInstance = composerStartRestartGroup.changedInstance(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = (Function2) new ErrorContentKt$ErrorContent$1$1(view, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(176489385, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt.ErrorContent.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(176489385, i6, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous> (ErrorContent.kt:299)");
                                }
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_422 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
                                Pair<String, Function0<Unit>> pair92 = pair8;
                                Pair<String, Function0<Unit>> pair102 = pair7;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_422, Alignment.INSTANCE.getStart(), composer3, 6);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(447239311);
                                if (pair92 != null) {
                                    final String strComponent1 = pair92.component1();
                                    ButtonKt.FinancialConnectionsButton(pair92.component2(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Secondary.INSTANCE, null, false, false, ComposableLambdaKt.rememberComposableLambda(-2095261279, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$2$1$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope FinancialConnectionsButton, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2095261279, i7, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:309)");
                                            }
                                            androidx.compose.material.TextKt.m2076Text4IGK_g(strComponent1, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 1573296, 56);
                                }
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(447252493);
                                if (pair102 != null) {
                                    final String strComponent12 = pair102.component1();
                                    ButtonKt.FinancialConnectionsButton(pair102.component2(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Primary.INSTANCE, null, false, false, ComposableLambdaKt.rememberComposableLambda(-648515254, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$2$1$2$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope FinancialConnectionsButton, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-648515254, i7, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:319)");
                                            }
                                            androidx.compose.material.TextKt.m2076Text4IGK_g(strComponent12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 1573296, 56);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1418127973);
                    z = ((i3 & 14) != 4) | ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | ((i3 & 896) == 256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ErrorContentKt.ErrorContent$lambda$15$lambda$14(function2, title, content, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Pair<String, ? extends Function0<Unit>> pair92 = pair7;
                        Pair<String, ? extends Function0<Unit>> pair102 = pair8;
                        composer2 = composerStartRestartGroup;
                        LayoutKt.LazyLayout(null, null, false, false, false, horizontalOrVerticalM900spacedBy0680j_42, false, null, composableLambdaRememberComposableLambda2, (Function1) objRememberedValue2, composer2, 100859904, 223);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        pair5 = pair92;
                        pair6 = pair102;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        pair3 = pair;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        pair4 = pair2;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$15$lambda$14(final Function2 function2, final String str, final String str2, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        if (function2 != null) {
            LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(-483299155, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$3$1$1$1
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
                        ComposerKt.traceEventStart(-483299155, i, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:281)");
                    }
                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1024paddingqDBjuR0$default);
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
                    function22.invoke(composer, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(-248203053, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$3$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-248203053, i, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:284)");
                    }
                    TextStyle headingXLarge = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge();
                    androidx.compose.material.TextKt.m2076Text4IGK_g(str, (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, headingXLarge, composer, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(1392310012, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$3$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1392310012, i, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:291)");
                    }
                    TextStyle bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getBodyMedium();
                    androidx.compose.material.TextKt.m2076Text4IGK_g(str2, (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, composer, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final void NoAccountsAvailableErrorContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-437381441);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-437381441, i, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContentPreview (ErrorContent.kt:329)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$ErrorContentKt.INSTANCE.m7324getLambda5$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ErrorContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorContentKt.NoAccountsAvailableErrorContentPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
