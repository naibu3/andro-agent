package com.stripe.android.link.gate;

import com.stripe.android.link.LinkConfiguration;
import kotlin.Metadata;

/* compiled from: LinkGate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b`\u0018\u00002\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/gate/LinkGate;", "", "useNativeLink", "", "getUseNativeLink", "()Z", "useAttestationEndpoints", "getUseAttestationEndpoints", "suppress2faModal", "getSuppress2faModal", "useInlineOtpInWalletButtons", "getUseInlineOtpInWalletButtons", "showRuxInFlowController", "getShowRuxInFlowController", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkGate {

    /* compiled from: LinkGate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/gate/LinkGate$Factory;", "", "create", "Lcom/stripe/android/link/gate/LinkGate;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        LinkGate create(LinkConfiguration configuration);
    }

    boolean getShowRuxInFlowController();

    boolean getSuppress2faModal();

    boolean getUseAttestationEndpoints();

    boolean getUseInlineOtpInWalletButtons();

    boolean getUseNativeLink();
}
