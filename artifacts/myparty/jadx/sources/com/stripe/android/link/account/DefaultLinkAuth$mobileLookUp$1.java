package com.stripe.android.link.account;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAuth.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAuth", f = "DefaultLinkAuth.kt", i = {0, 0, 0, 0, 0, 0, 1}, l = {103, LocationRequestCompat.QUALITY_LOW_POWER}, m = "mobileLookUp-yxL6bBk", n = {"this", "email", "emailSource", "customerId", "$this$mobileLookUp_yxL6bBk_u24lambda_u242", "startSession", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0"})
/* loaded from: classes5.dex */
final class DefaultLinkAuth$mobileLookUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAuth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAuth$mobileLookUp$1(DefaultLinkAuth defaultLinkAuth, Continuation<? super DefaultLinkAuth$mobileLookUp$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAuth;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7725mobileLookUpyxL6bBk = this.this$0.m7725mobileLookUpyxL6bBk(null, null, false, null, this);
        return objM7725mobileLookUpyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7725mobileLookUpyxL6bBk : Result.m9117boximpl(objM7725mobileLookUpyxL6bBk);
    }
}
