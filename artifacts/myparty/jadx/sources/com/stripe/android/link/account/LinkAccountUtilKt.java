package com.stripe.android.link.account;

import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConsumerShippingAddress;
import com.stripe.android.model.ConsumerShippingAddresses;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAccountUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u000b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "Lcom/stripe/android/link/account/LinkAccountManager;", "getLinkAccountUpdate", "(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;", "updateLinkAccount", "", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "loadDefaultShippingAddress", "Lcom/stripe/android/model/ConsumerShippingAddress;", "(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountUtilKt {

    /* compiled from: LinkAccountUtil.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.LinkAccountUtilKt", f = "LinkAccountUtil.kt", i = {0}, l = {17}, m = "loadDefaultShippingAddress", n = {"$this$loadDefaultShippingAddress"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.account.LinkAccountUtilKt$loadDefaultShippingAddress$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkAccountUtilKt.loadDefaultShippingAddress(null, this);
        }
    }

    public static final LinkAccountUpdate getLinkAccountUpdate(LinkAccountManager linkAccountManager) {
        Intrinsics.checkNotNullParameter(linkAccountManager, "<this>");
        return linkAccountManager.getLinkAccountInfo().getValue();
    }

    public static final void updateLinkAccount(LinkAccountUpdate linkAccountUpdate, LinkAccountHolder linkAccountHolder) {
        Intrinsics.checkNotNullParameter(linkAccountUpdate, "<this>");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        if (linkAccountUpdate instanceof LinkAccountUpdate.Value) {
            linkAccountHolder.set((LinkAccountUpdate.Value) linkAccountUpdate);
        } else if (!Intrinsics.areEqual(linkAccountUpdate, LinkAccountUpdate.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object loadDefaultShippingAddress(LinkAccountManager linkAccountManager, Continuation<? super ConsumerShippingAddress> continuation) {
        AnonymousClass1 anonymousClass1;
        ConsumerShippingAddresses cachedShippingAddresses;
        Object objMo7712listShippingAddressesIoAF18A;
        Iterator<T> it;
        Object next;
        ConsumerShippingAddress consumerShippingAddress;
        ConsumerShippingAddress consumerShippingAddress2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedShippingAddresses = linkAccountManager.getCachedShippingAddresses();
            if (cachedShippingAddresses == null) {
                anonymousClass1.L$0 = linkAccountManager;
                anonymousClass1.label = 1;
                objMo7712listShippingAddressesIoAF18A = linkAccountManager.mo7712listShippingAddressesIoAF18A(anonymousClass1);
                if (objMo7712listShippingAddressesIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            linkAccountManager.setCachedShippingAddresses(cachedShippingAddresses);
            it = cachedShippingAddresses.getAddresses().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ConsumerShippingAddress) next).isDefault()) {
                    break;
                }
            }
            consumerShippingAddress = (ConsumerShippingAddress) next;
            if (consumerShippingAddress == null) {
                consumerShippingAddress = (ConsumerShippingAddress) CollectionsKt.firstOrNull((List) cachedShippingAddresses.getAddresses());
            }
            consumerShippingAddress2 = consumerShippingAddress;
            if (consumerShippingAddress2 != null) {
                return null;
            }
            LinkAccount account = linkAccountManager.getLinkAccountInfo().getValue().getAccount();
            return ConsumerShippingAddress.copy$default(consumerShippingAddress2, null, false, null, account != null ? account.getUnredactedPhoneNumber() : null, 7, null);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        linkAccountManager = (LinkAccountManager) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        objMo7712listShippingAddressesIoAF18A = ((Result) obj).getValue();
        if (Result.m9124isFailureimpl(objMo7712listShippingAddressesIoAF18A)) {
            objMo7712listShippingAddressesIoAF18A = null;
        }
        cachedShippingAddresses = (ConsumerShippingAddresses) objMo7712listShippingAddressesIoAF18A;
        if (cachedShippingAddresses == null) {
            return null;
        }
        linkAccountManager.setCachedShippingAddresses(cachedShippingAddresses);
        it = cachedShippingAddresses.getAddresses().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        consumerShippingAddress = (ConsumerShippingAddress) next;
        if (consumerShippingAddress == null) {
        }
        consumerShippingAddress2 = consumerShippingAddress;
        if (consumerShippingAddress2 != null) {
        }
    }
}
