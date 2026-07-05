package com.stripe.android.financialconnections.features.generic;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import defpackage.Alignment;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.Size;
import defpackage.VerticalAlignment;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: GenericScreenPreviewParameterProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "canonical", "twoButtons", "modal", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "LFinancialConnectionsGenericInfoScreen$Options;", "footer", "LFinancialConnectionsGenericInfoScreen$Footer;", "body", "LFinancialConnectionsGenericInfoScreen$Body;", "header", "LFinancialConnectionsGenericInfoScreen$Header;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GenericScreenPreviewParameterProvider implements PreviewParameterProvider<GenericScreenState> {
    public static final int $stable = 8;
    private final Sequence<GenericScreenState> values = SequencesKt.sequenceOf(canonical(), twoButtons(), modal());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<GenericScreenState> getValues() {
        return this.values;
    }

    private final GenericScreenState canonical() {
        return new GenericScreenState(new FinancialConnectionsGenericInfoScreen("sampleScreen1", header(), body(), footer(), options()), false);
    }

    private final GenericScreenState twoButtons() {
        return new GenericScreenState(new FinancialConnectionsGenericInfoScreen("sampleScreen1", header(), body(), FinancialConnectionsGenericInfoScreen.Footer.copy$default(footer(), null, null, new FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction("secondaryCta1", "Secondary Action", null), null, 11, null), options()), false);
    }

    private final GenericScreenState modal() {
        return GenericScreenState.copy$default(canonical(), null, true, 1, null);
    }

    private final FinancialConnectionsGenericInfoScreen.Options options() {
        return new FinancialConnectionsGenericInfoScreen.Options(true, VerticalAlignment.Default);
    }

    private final FinancialConnectionsGenericInfoScreen.Footer footer() {
        return new FinancialConnectionsGenericInfoScreen.Footer("Sample Disclaimer", new FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction("primaryCta1", "Primary Action", null), null, null);
    }

    private final FinancialConnectionsGenericInfoScreen.Body body() {
        return new FinancialConnectionsGenericInfoScreen.Body(CollectionsKt.listOf(new FinancialConnectionsGenericInfoScreen.Body.Entry.Text("1", "Sample Text", Alignment.Center, Size.Medium)));
    }

    private final FinancialConnectionsGenericInfoScreen.Header header() {
        return new FinancialConnectionsGenericInfoScreen.Header("Sample Title", "Sample Subtitle", null, Alignment.Center);
    }
}
