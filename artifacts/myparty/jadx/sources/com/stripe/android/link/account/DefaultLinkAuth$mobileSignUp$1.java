package com.stripe.android.link.account;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAuth.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAuth", f = "DefaultLinkAuth.kt", i = {0, 0, 0, 0, 0, 0, 0, 1}, l = {81, 82}, m = "mobileSignUp-hUnOzRk", n = {"this", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "name", "consentAction", "$this$mobileSignUp_hUnOzRk_u24lambda_u240", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0"})
/* loaded from: classes5.dex */
final class DefaultLinkAuth$mobileSignUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAuth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAuth$mobileSignUp$1(DefaultLinkAuth defaultLinkAuth, Continuation<? super DefaultLinkAuth$mobileSignUp$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAuth;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7726mobileSignUphUnOzRk = this.this$0.m7726mobileSignUphUnOzRk(null, null, null, null, null, this);
        return objM7726mobileSignUphUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7726mobileSignUphUnOzRk : Result.m9117boximpl(objM7726mobileSignUphUnOzRk);
    }
}
