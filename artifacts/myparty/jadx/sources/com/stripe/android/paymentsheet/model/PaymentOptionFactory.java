package com.stripe.android.paymentsheet.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "", "iconLoader", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;", "context", "Landroid/content/Context;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;Landroid/content/Context;)V", "create", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionFactory {
    public static final int $stable = 8;
    private final Context context;
    private final PaymentSelection.IconLoader iconLoader;

    @Inject
    public PaymentOptionFactory(PaymentSelection.IconLoader iconLoader, Context context) {
        Intrinsics.checkNotNullParameter(iconLoader, "iconLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconLoader = iconLoader;
        this.context = context;
    }

    public final PaymentOption create(PaymentSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        int drawableResourceId = PaymentSelectionKt.getDrawableResourceId(selection);
        String strResolve = PaymentSelectionKt.getLabel(selection).resolve(this.context);
        String paymentMethodType = PaymentSelectionKt.getPaymentMethodType(selection);
        PaymentOption.Labels labelsCreate = PaymentOptionLabelsFactory.INSTANCE.create(this.context, selection);
        PaymentMethod.BillingDetails billingDetails = PaymentSelectionKt.getBillingDetails(selection);
        return new PaymentOption(drawableResourceId, strResolve, paymentMethodType, billingDetails != null ? PaymentSelectionKt.toPaymentSheetBillingDetails(billingDetails) : null, PaymentOptionFactoryKt.getShippingDetails(selection), labelsCreate, new AnonymousClass1(selection, null));
    }

    /* compiled from: PaymentOptionFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.model.PaymentOptionFactory$create$1", f = "PaymentOptionFactory.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.model.PaymentOptionFactory$create$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Drawable>, Object> {
        final /* synthetic */ PaymentSelection $selection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentSelection paymentSelection, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$selection = paymentSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentOptionFactory.this.new AnonymousClass1(this.$selection, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Drawable> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objLoad = PaymentOptionFactory.this.iconLoader.load(PaymentSelectionKt.getDrawableResourceId(this.$selection), PaymentSelectionKt.getLightThemeIconUrl(this.$selection), PaymentSelectionKt.getDarkThemeIconUrl(this.$selection), this);
            return objLoad == coroutine_suspended ? coroutine_suspended : objLoad;
        }
    }
}
