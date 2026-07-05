package com.stripe.android.stripe3ds2.security;

import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;

/* compiled from: MessageTransformerFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;", "", NamedConstantsKt.IS_LIVE_MODE, "", "<init>", "(Z)V", "create", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageTransformerFactory {
    private final boolean isLiveMode;

    public MessageTransformerFactory(boolean z) {
        this.isLiveMode = z;
    }

    public final MessageTransformer create() {
        return new DefaultMessageTransformer(this.isLiveMode);
    }
}
