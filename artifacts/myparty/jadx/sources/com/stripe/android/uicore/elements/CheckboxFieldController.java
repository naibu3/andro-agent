package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CheckboxFieldController.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ=\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0002\u0010%R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006'"}, d2 = {"Lcom/stripe/android/uicore/elements/CheckboxFieldController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "labelResource", "Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;", "debugTag", "", "initialValue", "", "<init>", "(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;Z)V", "getLabelResource", "()Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;", "getDebugTag", "()Ljava/lang/String;", "hasBeenEdited", "_isChecked", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isChecked", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "onValueChange", "", "value", "ComposeUI", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "LabelResource", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxFieldController implements SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isChecked;
    private final String debugTag;
    private final StateFlow<FieldError> error;
    private boolean hasBeenEdited;
    private final LabelResource labelResource;

    public CheckboxFieldController() {
        this(null, null, false, 7, null);
    }

    public CheckboxFieldController(LabelResource labelResource, String debugTag, boolean z) {
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        this.labelResource = labelResource;
        this.debugTag = debugTag;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this._isChecked = MutableStateFlow;
        this.error = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.CheckboxFieldController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckboxFieldController.error$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final LabelResource getLabelResource() {
        return this.labelResource;
    }

    public /* synthetic */ CheckboxFieldController(LabelResource labelResource, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : labelResource, (i & 2) != 0 ? CheckboxFieldControllerKt.DEFAULT_CHECKBOX_TEST_TAG : str, (i & 4) != 0 ? false : z);
    }

    public final String getDebugTag() {
        return this.debugTag;
    }

    /* compiled from: CheckboxFieldController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;", "", "labelId", "", CardScanActivity.ARGS, "", "<init>", "(I[Ljava/lang/Object;)V", "getLabelId", "()I", "formatArgs", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LabelResource {
        public static final int $stable = 8;
        private final Object[] formatArgs;
        private final int labelId;

        public LabelResource(int i, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.labelId = i;
            this.formatArgs = args;
        }

        public final int getLabelId() {
            return this.labelId;
        }

        public final Object[] getFormatArgs() {
            return this.formatArgs;
        }
    }

    public final StateFlow<Boolean> isChecked() {
        return this._isChecked;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError error$lambda$0(CheckboxFieldController checkboxFieldController, boolean z) {
        if (z || !checkboxFieldController.hasBeenEdited) {
            return null;
        }
        return new FieldError(R.string.stripe_field_required, null, 2, null);
    }

    public final void onValueChange(boolean value) {
        if (!this.hasBeenEdited) {
            this.hasBeenEdited = true;
        }
        this._isChecked.setValue(Boolean.valueOf(value));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(-1112336061);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112336061, i, -1, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:52)");
        }
        CheckboxFieldUIKt.CheckboxFieldUI(modifier, this, z, composer, ((i >> 6) & 14) | ((i >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i << 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
