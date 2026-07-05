package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingDetailsFormUI.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u008a\u0084\u0002"}, d2 = {"BillingDetailsFormUI", "", "form", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;", "onValuesChanged", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "(Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingDetailsFormUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BillingDetailsFormUI$lambda$2(BillingDetailsForm billingDetailsForm, Function1 function1, int i, Composer composer, int i2) {
        BillingDetailsFormUI(billingDetailsForm, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BillingDetailsFormUI(final BillingDetailsForm form, final Function1<? super BillingDetailsFormState, Unit> onValuesChanged, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(onValuesChanged, "onValuesChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1097081514);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(form) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValuesChanged) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1097081514, i3, -1, "com.stripe.android.paymentsheet.ui.BillingDetailsFormUI (BillingDetailsFormUI.kt:14)");
            }
            boolean z = false;
            SectionElementUIKt.SectionElementUI(true, form.getAddressSectionElement(), BillingDetailsFormUI$lambda$0(StateFlowsComposeKt.collectAsState(form.getHiddenElements(), null, composerStartRestartGroup, 0, 1)), null, null, composerStartRestartGroup, (SectionElement.$stable << 3) | 3078, 16);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1288901972);
            boolean z2 = (i3 & 14) == 4;
            if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            BillingDetailsFormUIKt$BillingDetailsFormUI$1$1 billingDetailsFormUIKt$BillingDetailsFormUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || billingDetailsFormUIKt$BillingDetailsFormUI$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                billingDetailsFormUIKt$BillingDetailsFormUI$1$1RememberedValue = new BillingDetailsFormUIKt$BillingDetailsFormUI$1$1(form, onValuesChanged, null);
                composerStartRestartGroup.updateRememberedValue(billingDetailsFormUIKt$BillingDetailsFormUI$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) billingDetailsFormUIKt$BillingDetailsFormUI$1$1RememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.BillingDetailsFormUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BillingDetailsFormUIKt.BillingDetailsFormUI$lambda$2(form, onValuesChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Set<IdentifierSpec> BillingDetailsFormUI$lambda$0(State<? extends Set<IdentifierSpec>> state) {
        return state.getValue();
    }
}
