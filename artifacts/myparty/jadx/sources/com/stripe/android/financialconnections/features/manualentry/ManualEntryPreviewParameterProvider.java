package com.stripe.android.financialconnections.features.manualentry;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.login.LoginLogger;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ManualEntryPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", NewHtcHomeBadger.COUNT, "", "getCount", "()I", "loading", LoginLogger.EVENT_EXTRAS_FAILURE, "canonical", "testMode", "fieldFailure", "PreviewState", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntryPreviewParameterProvider implements PreviewParameterProvider<PreviewState> {
    public static final int $stable = 8;
    private final Sequence<PreviewState> values = SequencesKt.sequenceOf(canonical(), loading(), failure(), fieldFailure(), testMode());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewState> getValues() {
        return this.values;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return super.getCount();
    }

    private final PreviewState loading() {
        return new PreviewState(new ManualEntryState(new Async.Success(new ManualEntryState.Payload(true, false, false)), new Async.Loading(null, 1, null)), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    private final PreviewState failure() {
        return new PreviewState(new ManualEntryState(new Async.Success(new ManualEntryState.Payload(true, false, false)), new Async.Fail(new APIException(null, null, 0, "Test bank accounts cannot be used in live mode", null, 23, null))), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    private final PreviewState canonical() {
        return new PreviewState(new ManualEntryState(new Async.Success(new ManualEntryState.Payload(true, false, false)), Async.Uninitialized.INSTANCE), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    private final PreviewState testMode() {
        return new PreviewState(new ManualEntryState(new Async.Success(new ManualEntryState.Payload(true, false, true)), Async.Uninitialized.INSTANCE), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    private final PreviewState fieldFailure() {
        return new PreviewState(new ManualEntryState(new Async.Success(new ManualEntryState.Payload(true, false, false)), Async.Uninitialized.INSTANCE), "123456789", "123456789", "123456789", Integer.valueOf(R.string.stripe_validation_no_us_routing), Integer.valueOf(R.string.stripe_validation_no_us_routing), Integer.valueOf(R.string.stripe_validation_no_us_routing));
    }

    /* compiled from: ManualEntryPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JZ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "routing", "", "account", "accountConfirm", "routingError", "", "accountError", "accountConfirmError", "<init>", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getState", "()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "getRouting", "()Ljava/lang/String;", "getAccount", "getAccountConfirm", "getRoutingError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccountError", "getAccountConfirmError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryPreviewParameterProvider$PreviewState;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreviewState {
        public static final int $stable = 0;
        private final String account;
        private final String accountConfirm;
        private final Integer accountConfirmError;
        private final Integer accountError;
        private final String routing;
        private final Integer routingError;
        private final ManualEntryState state;

        public static /* synthetic */ PreviewState copy$default(PreviewState previewState, ManualEntryState manualEntryState, String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                manualEntryState = previewState.state;
            }
            if ((i & 2) != 0) {
                str = previewState.routing;
            }
            if ((i & 4) != 0) {
                str2 = previewState.account;
            }
            if ((i & 8) != 0) {
                str3 = previewState.accountConfirm;
            }
            if ((i & 16) != 0) {
                num = previewState.routingError;
            }
            if ((i & 32) != 0) {
                num2 = previewState.accountError;
            }
            if ((i & 64) != 0) {
                num3 = previewState.accountConfirmError;
            }
            Integer num4 = num2;
            Integer num5 = num3;
            Integer num6 = num;
            String str4 = str2;
            return previewState.copy(manualEntryState, str, str4, str3, num6, num4, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final ManualEntryState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRouting() {
            return this.routing;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountConfirm() {
            return this.accountConfirm;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getRoutingError() {
            return this.routingError;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getAccountError() {
            return this.accountError;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getAccountConfirmError() {
            return this.accountConfirmError;
        }

        public final PreviewState copy(ManualEntryState state, String routing, String account, String accountConfirm, Integer routingError, Integer accountError, Integer accountConfirmError) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(routing, "routing");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(accountConfirm, "accountConfirm");
            return new PreviewState(state, routing, account, accountConfirm, routingError, accountError, accountConfirmError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewState)) {
                return false;
            }
            PreviewState previewState = (PreviewState) other;
            return Intrinsics.areEqual(this.state, previewState.state) && Intrinsics.areEqual(this.routing, previewState.routing) && Intrinsics.areEqual(this.account, previewState.account) && Intrinsics.areEqual(this.accountConfirm, previewState.accountConfirm) && Intrinsics.areEqual(this.routingError, previewState.routingError) && Intrinsics.areEqual(this.accountError, previewState.accountError) && Intrinsics.areEqual(this.accountConfirmError, previewState.accountConfirmError);
        }

        public int hashCode() {
            int iHashCode = ((((((this.state.hashCode() * 31) + this.routing.hashCode()) * 31) + this.account.hashCode()) * 31) + this.accountConfirm.hashCode()) * 31;
            Integer num = this.routingError;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.accountError;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.accountConfirmError;
            return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "PreviewState(state=" + this.state + ", routing=" + this.routing + ", account=" + this.account + ", accountConfirm=" + this.accountConfirm + ", routingError=" + this.routingError + ", accountError=" + this.accountError + ", accountConfirmError=" + this.accountConfirmError + ")";
        }

        public PreviewState(ManualEntryState state, String routing, String account, String accountConfirm, Integer num, Integer num2, Integer num3) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(routing, "routing");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(accountConfirm, "accountConfirm");
            this.state = state;
            this.routing = routing;
            this.account = account;
            this.accountConfirm = accountConfirm;
            this.routingError = num;
            this.accountError = num2;
            this.accountConfirmError = num3;
        }

        public /* synthetic */ PreviewState(ManualEntryState manualEntryState, String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(manualEntryState, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
        }

        public final ManualEntryState getState() {
            return this.state;
        }

        public final String getRouting() {
            return this.routing;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getAccountConfirm() {
            return this.accountConfirm;
        }

        public final Integer getRoutingError() {
            return this.routingError;
        }

        public final Integer getAccountError() {
            return this.accountError;
        }

        public final Integer getAccountConfirmError() {
            return this.accountConfirmError;
        }
    }
}
