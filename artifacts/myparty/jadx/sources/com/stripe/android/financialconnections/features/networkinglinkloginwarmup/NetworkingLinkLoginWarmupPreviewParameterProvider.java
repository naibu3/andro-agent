package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: NetworkingLinkLoginWarmupPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "canonical", "loading", "payloadError", "disablingError", "disablingNetworking", "instantDebits", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkLoginWarmupPreviewParameterProvider implements PreviewParameterProvider<NetworkingLinkLoginWarmupState> {
    public static final int $stable = 8;
    private final Sequence<NetworkingLinkLoginWarmupState> values = SequencesKt.sequenceOf(canonical(), loading(), disablingNetworking(), payloadError(), disablingError(), instantDebits());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<NetworkingLinkLoginWarmupState> getValues() {
        return this.values;
    }

    private final NetworkingLinkLoginWarmupState canonical() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Success(new NetworkingLinkLoginWarmupState.Payload("Test", "email@test.com", "emai•••@test.com", false, "sessionId")), Async.Uninitialized.INSTANCE, null, false, 39, null);
    }

    private final NetworkingLinkLoginWarmupState loading() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Loading(null, 1, null), Async.Uninitialized.INSTANCE, null, false, 39, null);
    }

    private final NetworkingLinkLoginWarmupState payloadError() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Fail(new Exception("Error")), Async.Uninitialized.INSTANCE, null, false, 39, null);
    }

    private final NetworkingLinkLoginWarmupState disablingError() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Success(new NetworkingLinkLoginWarmupState.Payload("Test", "email@test.com", "emai•••@test.com", false, "sessionId")), new Async.Fail(new Exception("Error")), null, false, 39, null);
    }

    private final NetworkingLinkLoginWarmupState disablingNetworking() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Success(new NetworkingLinkLoginWarmupState.Payload("Test", "email@test.com", "emai•••@test.com", false, "sessionId")), new Async.Loading(null, 1, null), null, false, 39, null);
    }

    private final NetworkingLinkLoginWarmupState instantDebits() {
        return new NetworkingLinkLoginWarmupState(null, null, null, new Async.Success(new NetworkingLinkLoginWarmupState.Payload("Test", "email@test.com", "emai•••@test.com", false, "sessionId")), Async.Uninitialized.INSTANCE, null, true, 39, null);
    }
}
