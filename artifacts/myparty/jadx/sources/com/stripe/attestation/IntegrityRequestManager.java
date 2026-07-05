package com.stripe.attestation;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IntegrityStandardRequestManager.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/attestation/IntegrityRequestManager;", "", "prepare", "Lkotlin/Result;", "", "prepare-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestToken", "", "requestIdentifier", "requestToken-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IntegrityRequestManager {
    /* renamed from: prepare-IoAF18A, reason: not valid java name */
    Object mo8934prepareIoAF18A(Continuation<? super Result<Unit>> continuation);

    /* renamed from: requestToken-gIAlu-s, reason: not valid java name */
    Object mo8935requestTokengIAlus(String str, Continuation<? super Result<String>> continuation);

    /* compiled from: IntegrityStandardRequestManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: requestToken-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m8936requestTokengIAlus$default(IntegrityRequestManager integrityRequestManager, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToken-gIAlu-s");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return integrityRequestManager.mo8935requestTokengIAlus(str, continuation);
        }
    }
}
