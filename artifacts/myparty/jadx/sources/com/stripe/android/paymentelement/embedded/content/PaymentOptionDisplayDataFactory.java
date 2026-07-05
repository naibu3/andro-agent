package com.stripe.android.paymentelement.embedded.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.model.PaymentOptionFactoryKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.FormElement;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionDisplayDataFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;", "", "iconLoader", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;", "context", "Landroid/content/Context;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;Landroid/content/Context;)V", "create", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentOptionDisplayDataFactory {
    public static final int $stable = 8;
    private final Context context;
    private final PaymentSelection.IconLoader iconLoader;

    @Inject
    public PaymentOptionDisplayDataFactory(PaymentSelection.IconLoader iconLoader, Context context) {
        Intrinsics.checkNotNullParameter(iconLoader, "iconLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconLoader = iconLoader;
        this.context = context;
    }

    public final EmbeddedPaymentElement.PaymentOptionDisplayData create(PaymentSelection selection, PaymentMethodMetadata paymentMethodMetadata) {
        ResolvableString resolvableStringMandateTextFromPaymentMethodMetadata;
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        if (selection == null) {
            return null;
        }
        if (selection instanceof PaymentSelection.New) {
            List<FormElement> listFormElementsForCode = paymentMethodMetadata.formElementsForCode(PaymentSelectionKt.getPaymentMethodType(selection), NullUiDefinitionFactoryHelper.INSTANCE.getNullEmbeddedUiDefinitionFactory());
            if (listFormElementsForCode != null) {
                Iterator<T> it = listFormElementsForCode.iterator();
                while (it.hasNext()) {
                    resolvableStringMandateTextFromPaymentMethodMetadata = ((FormElement) it.next()).getMandateText();
                    if (resolvableStringMandateTextFromPaymentMethodMetadata != null) {
                        break;
                    }
                }
                resolvableStringMandateTextFromPaymentMethodMetadata = null;
            } else {
                resolvableStringMandateTextFromPaymentMethodMetadata = null;
            }
        } else if (selection instanceof PaymentSelection.Saved) {
            resolvableStringMandateTextFromPaymentMethodMetadata = PaymentSelectionKt.mandateTextFromPaymentMethodMetadata((PaymentSelection.Saved) selection, paymentMethodMetadata);
        } else {
            if (!(selection instanceof PaymentSelection.CustomPaymentMethod) && !(selection instanceof PaymentSelection.ExternalPaymentMethod) && !(selection instanceof PaymentSelection.GooglePay) && !(selection instanceof PaymentSelection.Link) && !(selection instanceof PaymentSelection.ShopPay)) {
                throw new NoWhenBranchMatchedException();
            }
            resolvableStringMandateTextFromPaymentMethodMetadata = null;
        }
        String strResolve = PaymentSelectionKt.getLabel(selection).resolve(this.context);
        PaymentMethod.BillingDetails billingDetails = PaymentSelectionKt.getBillingDetails(selection);
        return new EmbeddedPaymentElement.PaymentOptionDisplayData(new AnonymousClass1(selection, null), strResolve, billingDetails != null ? PaymentSelectionKt.toPaymentSheetBillingDetails(billingDetails) : null, PaymentSelectionKt.getPaymentMethodType(selection), resolvableStringMandateTextFromPaymentMethodMetadata == null ? null : new AnnotatedString(resolvableStringMandateTextFromPaymentMethodMetadata.resolve(this.context), null, null, 6, null), PaymentOptionFactoryKt.getShippingDetails(selection));
    }

    /* compiled from: PaymentOptionDisplayDataFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.PaymentOptionDisplayDataFactory$create$1", f = "PaymentOptionDisplayDataFactory.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.PaymentOptionDisplayDataFactory$create$1, reason: invalid class name */
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
            return PaymentOptionDisplayDataFactory.this.new AnonymousClass1(this.$selection, continuation);
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
            Object objLoad = PaymentOptionDisplayDataFactory.this.iconLoader.load(PaymentSelectionKt.getDrawableResourceId(this.$selection), PaymentSelectionKt.getLightThemeIconUrl(this.$selection), PaymentSelectionKt.getDarkThemeIconUrl(this.$selection), this);
            return objLoad == coroutine_suspended ? coroutine_suspended : objLoad;
        }
    }
}
