package com.stripe.android.customersheet;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginLogger;
import com.stripe.android.customersheet.injection.DaggerStripeCustomerAdapterComponent;
import com.stripe.android.customersheet.injection.StripeCustomerAdapterComponent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fH¦@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0011J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\fH¦@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\fH¦@¢\u0006\u0002\u0010\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter;", "", "canCreateSetupIntents", "", "getCanCreateSetupIntents", "()Z", "paymentMethodTypes", "", "", "getPaymentMethodTypes", "()Ljava/util/List;", "retrievePaymentMethods", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "paymentMethodId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "updatePaymentMethod", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSelectedPaymentOption", "", "paymentOption", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSelectedPaymentOption", "setupIntentClientSecretForCustomerAttach", "Companion", "PaymentOption", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmStatic
    static CustomerAdapter create(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider) {
        return INSTANCE.create(context, customerEphemeralKeyProvider, setupIntentClientSecretProvider);
    }

    @JvmStatic
    static CustomerAdapter create(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> list) {
        return INSTANCE.create(context, customerEphemeralKeyProvider, setupIntentClientSecretProvider, list);
    }

    Object attachPaymentMethod(String str, Continuation<? super Result<PaymentMethod>> continuation);

    Object detachPaymentMethod(String str, Continuation<? super Result<PaymentMethod>> continuation);

    boolean getCanCreateSetupIntents();

    List<String> getPaymentMethodTypes();

    Object retrievePaymentMethods(Continuation<? super Result<List<PaymentMethod>>> continuation);

    Object retrieveSelectedPaymentOption(Continuation<? super Result<PaymentOption>> continuation);

    Object setSelectedPaymentOption(PaymentOption paymentOption, Continuation<? super Result<Unit>> continuation);

    Object setupIntentClientSecretForCustomerAttach(Continuation<? super Result<String>> continuation);

    Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super Result<PaymentMethod>> continuation);

    /* compiled from: CustomerAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/customersheet/CustomerAdapter;", "context", "Landroid/content/Context;", "customerEphemeralKeyProvider", "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;", "setupIntentClientSecretProvider", "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;", "paymentMethodTypes", "", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @JvmStatic
        public final CustomerAdapter create(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(customerEphemeralKeyProvider, "customerEphemeralKeyProvider");
            return create$default(this, context, customerEphemeralKeyProvider, setupIntentClientSecretProvider, null, 8, null);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomerAdapter create$default(Companion companion, Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List list, int i, Object obj) {
            if ((i & 8) != 0) {
                list = null;
            }
            return companion.create(context, customerEphemeralKeyProvider, setupIntentClientSecretProvider, list);
        }

        @JvmStatic
        public final CustomerAdapter create(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> paymentMethodTypes) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(customerEphemeralKeyProvider, "customerEphemeralKeyProvider");
            StripeCustomerAdapterComponent.Builder builder = DaggerStripeCustomerAdapterComponent.builder();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return builder.context(applicationContext).customerEphemeralKeyProvider(customerEphemeralKeyProvider).setupIntentClientSecretProvider(setupIntentClientSecretProvider).paymentMethodTypes(paymentMethodTypes).build().getStripeCustomerAdapter();
        }
    }

    /* compiled from: CustomerAdapter.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\b\u001a\u0004\u0018\u00010\t2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "toPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethodProvider", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "paymentMethodId", "Lcom/stripe/android/model/PaymentMethod;", "toPaymentSelection$paymentsheet_release", "toSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "toSavedSelection$paymentsheet_release", "GooglePay", "Link", "StripeId", "Companion", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PaymentOption {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public /* synthetic */ PaymentOption(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @JvmStatic
        public static final PaymentOption fromId(String str) {
            return INSTANCE.fromId(str);
        }

        private PaymentOption(String str) {
            this.id = str;
        }

        public String getId() {
            return this.id;
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GooglePay extends PaymentOption {
            public static final int $stable = 0;
            public static final GooglePay INSTANCE = new GooglePay();

            private GooglePay() {
                super("google_pay", null);
            }
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Link extends PaymentOption {
            public static final int $stable = 0;
            public static final Link INSTANCE = new Link();

            private Link() {
                super("link", null);
            }
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StripeId extends PaymentOption {
            public static final int $stable = 0;
            private final String id;

            public static /* synthetic */ StripeId copy$default(StripeId stripeId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stripeId.id;
                }
                return stripeId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final StripeId copy(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new StripeId(id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StripeId) && Intrinsics.areEqual(this.id, ((StripeId) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "StripeId(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StripeId(String id) {
                super(id, null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            @Override // com.stripe.android.customersheet.CustomerAdapter.PaymentOption
            public String getId() {
                return this.id;
            }
        }

        public final PaymentSelection toPaymentSelection$paymentsheet_release(Function1<? super String, PaymentMethod> paymentMethodProvider) {
            PaymentSelection.Saved saved;
            Intrinsics.checkNotNullParameter(paymentMethodProvider, "paymentMethodProvider");
            if (this instanceof GooglePay) {
                return PaymentSelection.GooglePay.INSTANCE;
            }
            if (this instanceof Link) {
                return new PaymentSelection.Link(null, null, null, 7, null);
            }
            if (!(this instanceof StripeId)) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentMethod paymentMethodInvoke = paymentMethodProvider.invoke(((StripeId) this).getId());
            if (paymentMethodInvoke != null) {
                saved = new PaymentSelection.Saved(paymentMethodInvoke, null, null, 6, null);
            } else {
                saved = null;
            }
            return saved;
        }

        public final SavedSelection toSavedSelection$paymentsheet_release() {
            if (this instanceof GooglePay) {
                return SavedSelection.GooglePay.INSTANCE;
            }
            if (this instanceof Link) {
                return SavedSelection.Link.INSTANCE;
            }
            if (this instanceof StripeId) {
                return new SavedSelection.PaymentMethod(((StripeId) this).getId());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u000bH\u0000¢\u0006\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;", "", "<init>", "()V", "fromId", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "id", "", "toPaymentOption", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "toPaymentOption$paymentsheet_release", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PaymentOption fromId(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return Intrinsics.areEqual(id, "google_pay") ? GooglePay.INSTANCE : Intrinsics.areEqual(id, "link") ? Link.INSTANCE : new StripeId(id);
            }

            public final PaymentOption toPaymentOption$paymentsheet_release(SavedSelection savedSelection) {
                Intrinsics.checkNotNullParameter(savedSelection, "<this>");
                if (savedSelection instanceof SavedSelection.GooglePay) {
                    return GooglePay.INSTANCE;
                }
                if (savedSelection instanceof SavedSelection.Link) {
                    return Link.INSTANCE;
                }
                if (savedSelection instanceof SavedSelection.None) {
                    return null;
                }
                if (savedSelection instanceof SavedSelection.PaymentMethod) {
                    return new StripeId(((SavedSelection.PaymentMethod) savedSelection).getId());
                }
                throw new NoWhenBranchMatchedException();
            }

            public final PaymentOption toPaymentOption$paymentsheet_release(PaymentSelection paymentSelection) {
                Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
                if (paymentSelection instanceof PaymentSelection.GooglePay) {
                    return GooglePay.INSTANCE;
                }
                if (!(paymentSelection instanceof PaymentSelection.Saved)) {
                    return null;
                }
                String str = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id;
                Intrinsics.checkNotNull(str);
                return new StripeId(str);
            }
        }
    }

    /* compiled from: CustomerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$Result;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Success", "Failure", "Companion", "Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;", "Lcom/stripe/android/customersheet/CustomerAdapter$Result$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Result<T> {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final <T> Result<T> failure(Throwable th, String str) {
            return INSTANCE.failure(th, str);
        }

        @JvmStatic
        public static final <T> Result<T> success(T t) {
            return INSTANCE.success(t);
        }

        private Result() {
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$Result$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success<T> extends Result<T> {
            public static final int $stable = 0;
            private final T value;

            public final T getValue() {
                return this.value;
            }

            public Success(T t) {
                super(null);
                this.value = t;
            }
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "cause", "", "displayMessage", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getDisplayMessage", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failure<T> extends Result<T> {
            public static final int $stable = 8;
            private final Throwable cause;
            private final String displayMessage;

            public /* synthetic */ Failure(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? null : str);
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final String getDisplayMessage() {
                return this.displayMessage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable cause, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
                this.displayMessage = str;
            }
        }

        /* compiled from: CustomerAdapter.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;", "", "<init>", "()V", GraphResponse.SUCCESS_KEY, "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;", LoginLogger.EVENT_EXTRAS_FAILURE, "cause", "", "displayMessage", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final <T> Result<T> success(T value) {
                return new Success(value);
            }

            @JvmStatic
            public final <T> Result<T> failure(Throwable cause, String displayMessage) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new Failure(cause, displayMessage);
            }
        }
    }
}
