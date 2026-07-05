package com.reactnativestripesdk;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.soloader.Elf64;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* compiled from: ReactNativeCustomerAdapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140,H\u0096@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%H\u0096@¢\u0006\u0002\u00100J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%H\u0096@¢\u0006\u0002\u00100J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020!0,2\b\u00103\u001a\u0004\u0018\u000104H\u0096@¢\u0006\u0002\u00105J\u0016\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040,H\u0096@¢\u0006\u0002\u0010-J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020%0,H\u0096@¢\u0006\u0002\u0010-J$\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%2\u0006\u00109\u001a\u00020:H\u0096A¢\u0006\u0002\u0010;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R$\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\u0012\u0010<\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;", "Lcom/stripe/android/customersheet/CustomerAdapter;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "adapter", "overridesFetchPaymentMethods", "", "overridesAttachPaymentMethod", "overridesDetachPaymentMethod", "overridesSetSelectedPaymentOption", "overridesFetchSelectedPaymentOption", "overridesSetupIntentClientSecretForCustomerAttach", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/customersheet/CustomerAdapter;ZZZZZZ)V", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "stripeSdkModule", "Lcom/reactnativestripesdk/StripeSdkModule;", "fetchPaymentMethodsCallback", "Lkotlinx/coroutines/CompletableDeferred;", "", "Lcom/stripe/android/model/PaymentMethod;", "getFetchPaymentMethodsCallback$stripe_stripe_react_native_release", "()Lkotlinx/coroutines/CompletableDeferred;", "setFetchPaymentMethodsCallback$stripe_stripe_react_native_release", "(Lkotlinx/coroutines/CompletableDeferred;)V", "attachPaymentMethodCallback", "getAttachPaymentMethodCallback$stripe_stripe_react_native_release", "setAttachPaymentMethodCallback$stripe_stripe_react_native_release", "detachPaymentMethodCallback", "getDetachPaymentMethodCallback$stripe_stripe_react_native_release", "setDetachPaymentMethodCallback$stripe_stripe_react_native_release", "setSelectedPaymentOptionCallback", "", "getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "setSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "fetchSelectedPaymentOptionCallback", "", "getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "setFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "setupIntentClientSecretForCustomerAttachCallback", "getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release", "setSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release", "retrievePaymentMethods", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "paymentMethodId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "setSelectedPaymentOption", "paymentOption", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSelectedPaymentOption", "setupIntentClientSecretForCustomerAttach", "updatePaymentMethod", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canCreateSetupIntents", "getCanCreateSetupIntents", "()Z", "paymentMethodTypes", "getPaymentMethodTypes", "()Ljava/util/List;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReactNativeCustomerAdapter implements CustomerAdapter {
    public static final int $stable = 8;
    private final CustomerAdapter adapter;
    private CompletableDeferred<PaymentMethod> attachPaymentMethodCallback;
    private final ReactApplicationContext context;
    private CompletableDeferred<PaymentMethod> detachPaymentMethodCallback;
    private CompletableDeferred<List<PaymentMethod>> fetchPaymentMethodsCallback;
    private CompletableDeferred<String> fetchSelectedPaymentOptionCallback;
    private final boolean overridesAttachPaymentMethod;
    private final boolean overridesDetachPaymentMethod;
    private final boolean overridesFetchPaymentMethods;
    private final boolean overridesFetchSelectedPaymentOption;
    private final boolean overridesSetSelectedPaymentOption;
    private final boolean overridesSetupIntentClientSecretForCustomerAttach;
    private CompletableDeferred<Unit> setSelectedPaymentOptionCallback;
    private CompletableDeferred<String> setupIntentClientSecretForCustomerAttachCallback;
    private final StripeSdkModule stripeSdkModule;

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {48, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "attachPaymentMethod", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$attachPaymentMethod$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.attachPaymentMethod(null, this);
        }
    }

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "detachPaymentMethod", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$detachPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C07241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07241(Continuation<? super C07241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.detachPaymentMethod(null, this);
        }
    }

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {34, 39}, m = "retrievePaymentMethods", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$retrievePaymentMethods$1, reason: invalid class name and case insensitive filesystem */
    static final class C07251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07251(Continuation<? super C07251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.retrievePaymentMethods(this);
        }
    }

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {89, 100}, m = "retrieveSelectedPaymentOption", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C07261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07261(Continuation<? super C07261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.retrieveSelectedPaymentOption(this);
        }
    }

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {76, 81}, m = "setSelectedPaymentOption", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$setSelectedPaymentOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C07271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07271(Continuation<? super C07271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.setSelectedPaymentOption(null, this);
        }
    }

    /* compiled from: ReactNativeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 113}, m = "setupIntentClientSecretForCustomerAttach", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1, reason: invalid class name and case insensitive filesystem */
    static final class C07281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07281(Continuation<? super C07281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeCustomerAdapter.this.setupIntentClientSecretForCustomerAttach(this);
        }
    }

    @Override // com.stripe.android.customersheet.CustomerAdapter
    public boolean getCanCreateSetupIntents() {
        return this.adapter.getCanCreateSetupIntents();
    }

    @Override // com.stripe.android.customersheet.CustomerAdapter
    public List<String> getPaymentMethodTypes() {
        return this.adapter.getPaymentMethodTypes();
    }

    @Override // com.stripe.android.customersheet.CustomerAdapter
    public Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
        return this.adapter.updatePaymentMethod(str, paymentMethodUpdateParams, continuation);
    }

    public ReactNativeCustomerAdapter(ReactApplicationContext context, CustomerAdapter adapter, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.context = context;
        this.adapter = adapter;
        this.overridesFetchPaymentMethods = z;
        this.overridesAttachPaymentMethod = z2;
        this.overridesDetachPaymentMethod = z3;
        this.overridesSetSelectedPaymentOption = z4;
        this.overridesFetchSelectedPaymentOption = z5;
        this.overridesSetupIntentClientSecretForCustomerAttach = z6;
        this.stripeSdkModule = (StripeSdkModule) context.getNativeModule(StripeSdkModule.class);
    }

    public final ReactApplicationContext getContext() {
        return this.context;
    }

    public final CompletableDeferred<List<PaymentMethod>> getFetchPaymentMethodsCallback$stripe_stripe_react_native_release() {
        return this.fetchPaymentMethodsCallback;
    }

    public final void setFetchPaymentMethodsCallback$stripe_stripe_react_native_release(CompletableDeferred<List<PaymentMethod>> completableDeferred) {
        this.fetchPaymentMethodsCallback = completableDeferred;
    }

    public final CompletableDeferred<PaymentMethod> getAttachPaymentMethodCallback$stripe_stripe_react_native_release() {
        return this.attachPaymentMethodCallback;
    }

    public final void setAttachPaymentMethodCallback$stripe_stripe_react_native_release(CompletableDeferred<PaymentMethod> completableDeferred) {
        this.attachPaymentMethodCallback = completableDeferred;
    }

    public final CompletableDeferred<PaymentMethod> getDetachPaymentMethodCallback$stripe_stripe_react_native_release() {
        return this.detachPaymentMethodCallback;
    }

    public final void setDetachPaymentMethodCallback$stripe_stripe_react_native_release(CompletableDeferred<PaymentMethod> completableDeferred) {
        this.detachPaymentMethodCallback = completableDeferred;
    }

    public final CompletableDeferred<Unit> getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release() {
        return this.setSelectedPaymentOptionCallback;
    }

    public final void setSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release(CompletableDeferred<Unit> completableDeferred) {
        this.setSelectedPaymentOptionCallback = completableDeferred;
    }

    public final CompletableDeferred<String> getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release() {
        return this.fetchSelectedPaymentOptionCallback;
    }

    public final void setFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release(CompletableDeferred<String> completableDeferred) {
        this.fetchSelectedPaymentOptionCallback = completableDeferred;
    }

    public final CompletableDeferred<String> getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release() {
        return this.setupIntentClientSecretForCustomerAttachCallback;
    }

    public final void setSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release(CompletableDeferred<String> completableDeferred) {
        this.setupIntentClientSecretForCustomerAttachCallback = completableDeferred;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePaymentMethods(Continuation<? super CustomerAdapter.Result<List<PaymentMethod>>> continuation) {
        C07251 c07251;
        if (continuation instanceof C07251) {
            c07251 = (C07251) continuation;
            if ((c07251.label & Integer.MIN_VALUE) != 0) {
                c07251.label -= Integer.MIN_VALUE;
            } else {
                c07251 = new C07251(continuation);
            }
        }
        Object objAwait = c07251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07251.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (this.overridesFetchPaymentMethods) {
                CompletableDeferred<List<PaymentMethod>> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.fetchPaymentMethodsCallback = completableDeferredCompletableDeferred$default;
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterFetchPaymentMethodsCallback();
                }
                c07251.label = 1;
                objAwait = completableDeferredCompletableDeferred$default.await(c07251);
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                c07251.label = 2;
                Object objRetrievePaymentMethods = customerAdapter.retrievePaymentMethods(c07251);
                if (objRetrievePaymentMethods != coroutine_suspended) {
                    return objRetrievePaymentMethods;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        ResultKt.throwOnFailure(objAwait);
        return CustomerAdapter.Result.INSTANCE.success((List) objAwait);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object attachPaymentMethod(String str, Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objAwait = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (this.overridesAttachPaymentMethod) {
                CompletableDeferred<PaymentMethod> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.attachPaymentMethodCallback = completableDeferredCompletableDeferred$default;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("paymentMethodId", str);
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "also(...)");
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterAttachPaymentMethodCallback(writableMapCreateMap);
                }
                anonymousClass1.label = 1;
                objAwait = completableDeferredCompletableDeferred$default.await(anonymousClass1);
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                anonymousClass1.label = 2;
                Object objAttachPaymentMethod = customerAdapter.attachPaymentMethod(str, anonymousClass1);
                if (objAttachPaymentMethod != coroutine_suspended) {
                    return objAttachPaymentMethod;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        ResultKt.throwOnFailure(objAwait);
        return CustomerAdapter.Result.INSTANCE.success((PaymentMethod) objAwait);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object detachPaymentMethod(String str, Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
        C07241 c07241;
        if (continuation instanceof C07241) {
            c07241 = (C07241) continuation;
            if ((c07241.label & Integer.MIN_VALUE) != 0) {
                c07241.label -= Integer.MIN_VALUE;
            } else {
                c07241 = new C07241(continuation);
            }
        }
        Object objAwait = c07241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07241.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (this.overridesDetachPaymentMethod) {
                CompletableDeferred<PaymentMethod> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.detachPaymentMethodCallback = completableDeferredCompletableDeferred$default;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("paymentMethodId", str);
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "also(...)");
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterDetachPaymentMethodCallback(writableMapCreateMap);
                }
                c07241.label = 1;
                objAwait = completableDeferredCompletableDeferred$default.await(c07241);
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                c07241.label = 2;
                Object objDetachPaymentMethod = customerAdapter.detachPaymentMethod(str, c07241);
                if (objDetachPaymentMethod != coroutine_suspended) {
                    return objDetachPaymentMethod;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        ResultKt.throwOnFailure(objAwait);
        return CustomerAdapter.Result.INSTANCE.success((PaymentMethod) objAwait);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r2.await(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setSelectedPaymentOption(CustomerAdapter.PaymentOption paymentOption, Continuation<? super CustomerAdapter.Result<Unit>> continuation) {
        C07271 c07271;
        if (continuation instanceof C07271) {
            c07271 = (C07271) continuation;
            if ((c07271.label & Integer.MIN_VALUE) != 0) {
                c07271.label -= Integer.MIN_VALUE;
            } else {
                c07271 = new C07271(continuation);
            }
        }
        Object obj = c07271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07271.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.overridesSetSelectedPaymentOption) {
                CompletableDeferred<Unit> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.setSelectedPaymentOptionCallback = completableDeferredCompletableDeferred$default;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("paymentOption", paymentOption != null ? paymentOption.getId() : null);
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "also(...)");
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterSetSelectedPaymentOptionCallback(writableMapCreateMap);
                }
                c07271.label = 1;
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                c07271.label = 2;
                Object selectedPaymentOption = customerAdapter.setSelectedPaymentOption(paymentOption, c07271);
                if (selectedPaymentOption != coroutine_suspended) {
                    return selectedPaymentOption;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        return CustomerAdapter.Result.INSTANCE.success(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveSelectedPaymentOption(Continuation<? super CustomerAdapter.Result<CustomerAdapter.PaymentOption>> continuation) {
        C07261 c07261;
        if (continuation instanceof C07261) {
            c07261 = (C07261) continuation;
            if ((c07261.label & Integer.MIN_VALUE) != 0) {
                c07261.label -= Integer.MIN_VALUE;
            } else {
                c07261 = new C07261(continuation);
            }
        }
        Object objAwait = c07261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07261.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (this.overridesFetchSelectedPaymentOption) {
                CompletableDeferred<String> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.fetchSelectedPaymentOptionCallback = completableDeferredCompletableDeferred$default;
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterFetchSelectedPaymentOptionCallback();
                }
                c07261.label = 1;
                objAwait = completableDeferredCompletableDeferred$default.await(c07261);
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                c07261.label = 2;
                Object objRetrieveSelectedPaymentOption = customerAdapter.retrieveSelectedPaymentOption(c07261);
                if (objRetrieveSelectedPaymentOption != coroutine_suspended) {
                    return objRetrieveSelectedPaymentOption;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        ResultKt.throwOnFailure(objAwait);
        String str = (String) objAwait;
        return CustomerAdapter.Result.INSTANCE.success(str != null ? CustomerAdapter.PaymentOption.INSTANCE.fromId(str) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setupIntentClientSecretForCustomerAttach(Continuation<? super CustomerAdapter.Result<String>> continuation) {
        C07281 c07281;
        if (continuation instanceof C07281) {
            c07281 = (C07281) continuation;
            if ((c07281.label & Integer.MIN_VALUE) != 0) {
                c07281.label -= Integer.MIN_VALUE;
            } else {
                c07281 = new C07281(continuation);
            }
        }
        Object objAwait = c07281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07281.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (this.overridesSetupIntentClientSecretForCustomerAttach) {
                CompletableDeferred<String> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.setupIntentClientSecretForCustomerAttachCallback = completableDeferredCompletableDeferred$default;
                StripeSdkModule stripeSdkModule = this.stripeSdkModule;
                if (stripeSdkModule != null) {
                    stripeSdkModule.emitOnCustomerAdapterSetupIntentClientSecretForCustomerAttachCallback();
                }
                c07281.label = 1;
                objAwait = completableDeferredCompletableDeferred$default.await(c07281);
            } else {
                CustomerAdapter customerAdapter = this.adapter;
                c07281.label = 2;
                Object obj = customerAdapter.setupIntentClientSecretForCustomerAttach(c07281);
                if (obj != coroutine_suspended) {
                    return obj;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        ResultKt.throwOnFailure(objAwait);
        return CustomerAdapter.Result.INSTANCE.success((String) objAwait);
    }
}
