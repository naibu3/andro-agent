package com.stripe.android.financialconnections.features.success;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: SuccessPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "canonical", "customMessage", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuccessPreviewParameterProvider implements PreviewParameterProvider<SuccessState> {
    public static final int $stable = 8;
    private final Sequence<SuccessState> values = SequencesKt.sequenceOf(canonical(), customMessage());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<SuccessState> getValues() {
        return this.values;
    }

    private final SuccessState canonical() {
        return new SuccessState(new Async.Success(new SuccessState.Payload("Stripe", new TextResource.StringId(R.string.stripe_success_pane_title, null, 2, null), new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, 3, null, 8, null), false)), Async.Uninitialized.INSTANCE);
    }

    private final SuccessState customMessage() {
        return new SuccessState(new Async.Success(new SuccessState.Payload("Stripe", new TextResource.Text("Success"), new TextResource.Text("You can expect micro-deposits to account ••••1234 in 1-2 days and an email with further instructions."), false)), Async.Uninitialized.INSTANCE);
    }
}
