package com.stripe.android.polling;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IntentStatusPoller.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/polling/IntentStatusPoller;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/model/StripeIntent$Status;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "startPolling", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "forcePoll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopPolling", "Config", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IntentStatusPoller {
    Object forcePoll(Continuation<? super StripeIntent.Status> continuation);

    StateFlow<StripeIntent.Status> getState();

    void startPolling(CoroutineScope scope);

    void stopPolling();

    /* compiled from: IntentStatusPoller.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/polling/IntentStatusPoller$Config;", "", "clientSecret", "", "maxAttempts", "", "<init>", "(Ljava/lang/String;I)V", "getClientSecret", "()Ljava/lang/String;", "getMaxAttempts", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {
        public static final int $stable = 0;
        private final String clientSecret;
        private final int maxAttempts;

        public static /* synthetic */ Config copy$default(Config config, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = config.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = config.maxAttempts;
            }
            return config.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public final Config copy(String clientSecret, int maxAttempts) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Config(clientSecret, maxAttempts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.clientSecret, config.clientSecret) && this.maxAttempts == config.maxAttempts;
        }

        public int hashCode() {
            return (this.clientSecret.hashCode() * 31) + Integer.hashCode(this.maxAttempts);
        }

        public String toString() {
            return "Config(clientSecret=" + this.clientSecret + ", maxAttempts=" + this.maxAttempts + ")";
        }

        public Config(String clientSecret, int i) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.maxAttempts = i;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }
    }
}
