package com.stripe.android.link;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.injection.DaggerLinkControllerComponent;
import com.stripe.android.link.injection.LinkControllerPresenterComponent;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LinkController.kt */
@Singleton
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 62\u00020\u0001:\u000f()*+,-./0123456B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J0\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0087@¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/stripe/android/link/LinkController;", "", "interactor", "Lcom/stripe/android/link/LinkControllerInteractor;", "presenterComponentFactory", "Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;", "<init>", "(Lcom/stripe/android/link/LinkControllerInteractor;Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;)V", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/LinkController$State;", "context", "Landroid/content/Context;", "configure", "Lcom/stripe/android/link/LinkController$ConfigureResult;", "configuration", "Lcom/stripe/android/link/LinkController$Configuration;", "(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupConsumer", "Lcom/stripe/android/link/LinkController$LookupConsumerResult;", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPresenter", "Lcom/stripe/android/link/LinkController$Presenter;", "activity", "Landroidx/activity/ComponentActivity;", "presentPaymentMethodsCallback", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;", "authenticationCallback", "Lcom/stripe/android/link/LinkController$AuthenticationCallback;", "registerConsumer", "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;", "phone", "country", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Configuration", "State", "Presenter", "ConfigureResult", "PresentPaymentMethodsResult", "LookupConsumerResult", "CreatePaymentMethodResult", "AuthenticationResult", "RegisterConsumerResult", "PresentPaymentMethodsCallback", "AuthenticationCallback", "LinkAccount", "SessionState", "PaymentMethodPreview", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkController {
    private final LinkControllerInteractor interactor;
    private final LinkControllerPresenterComponent.Factory presenterComponentFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$AuthenticationCallback;", "", "onAuthenticationResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkController$AuthenticationResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AuthenticationCallback {
        void onAuthenticationResult(AuthenticationResult result);
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;", "", "onPresentPaymentMethodsResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PresentPaymentMethodsCallback {
        void onPresentPaymentMethodsResult(PresentPaymentMethodsResult result);
    }

    @JvmStatic
    public static final LinkController create(Application application, SavedStateHandle savedStateHandle) {
        return INSTANCE.create(application, savedStateHandle);
    }

    @Inject
    public LinkController(LinkControllerInteractor interactor, LinkControllerPresenterComponent.Factory presenterComponentFactory) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(presenterComponentFactory, "presenterComponentFactory");
        this.interactor = interactor;
        this.presenterComponentFactory = presenterComponentFactory;
    }

    public final StateFlow<State> state(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.interactor.state(context);
    }

    public final Object configure(Configuration configuration, Continuation<? super ConfigureResult> continuation) {
        return this.interactor.configure(configuration, continuation);
    }

    public final Object createPaymentMethod(Continuation<? super CreatePaymentMethodResult> continuation) {
        return this.interactor.createPaymentMethod(continuation);
    }

    public final Object lookupConsumer(String str, Continuation<? super LookupConsumerResult> continuation) {
        return this.interactor.lookupConsumer(str, continuation);
    }

    public final Presenter createPresenter(ComponentActivity activity, PresentPaymentMethodsCallback presentPaymentMethodsCallback, AuthenticationCallback authenticationCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(presentPaymentMethodsCallback, "presentPaymentMethodsCallback");
        Intrinsics.checkNotNullParameter(authenticationCallback, "authenticationCallback");
        return this.presenterComponentFactory.build(activity, activity, activity, presentPaymentMethodsCallback, authenticationCallback).getPresenter();
    }

    public final Object registerConsumer(String str, String str2, String str3, String str4, Continuation<? super RegisterConsumerResult> continuation) {
        return this.interactor.registerConsumer(str, str2, str3, str4, continuation);
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/stripe/android/link/LinkController$Configuration;", "Landroid/os/Parcelable;", "merchantDisplayName", "", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "allowUserEmailEdits", "", "linkAppearance", "Lcom/stripe/android/link/model/LinkAppearance;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLcom/stripe/android/link/model/LinkAppearance;)V", "getMerchantDisplayName$paymentsheet_release", "()Ljava/lang/String;", "getCardBrandAcceptance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "getDefaultBillingDetails$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getBillingDetailsCollectionConfiguration$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getAllowUserEmailEdits$paymentsheet_release", "()Z", "getLinkAppearance$paymentsheet_release", "()Lcom/stripe/android/link/model/LinkAppearance;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration implements Parcelable {
        public static final int $stable = 0;
        private final boolean allowUserEmailEdits;
        private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
        private final PaymentSheet.BillingDetails defaultBillingDetails;
        private final LinkAppearance linkAppearance;
        private final String merchantDisplayName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();

        /* compiled from: LinkController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration(parcel.readString(), (PaymentSheet.CardBrandAcceptance) parcel.readParcelable(Configuration.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel), PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? LinkAppearance.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.merchantDisplayName, configuration.merchantDisplayName) && Intrinsics.areEqual(this.cardBrandAcceptance, configuration.cardBrandAcceptance) && Intrinsics.areEqual(this.defaultBillingDetails, configuration.defaultBillingDetails) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && this.allowUserEmailEdits == configuration.allowUserEmailEdits && Intrinsics.areEqual(this.linkAppearance, configuration.linkAppearance);
        }

        public int hashCode() {
            int iHashCode = ((this.merchantDisplayName.hashCode() * 31) + this.cardBrandAcceptance.hashCode()) * 31;
            PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
            int iHashCode2 = (((((iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + Boolean.hashCode(this.allowUserEmailEdits)) * 31;
            LinkAppearance linkAppearance = this.linkAppearance;
            return iHashCode2 + (linkAppearance != null ? linkAppearance.hashCode() : 0);
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.merchantDisplayName + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ", defaultBillingDetails=" + this.defaultBillingDetails + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", allowUserEmailEdits=" + this.allowUserEmailEdits + ", linkAppearance=" + this.linkAppearance + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.merchantDisplayName);
            dest.writeParcelable(this.cardBrandAcceptance, flags);
            PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingDetails.writeToParcel(dest, flags);
            }
            this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
            dest.writeInt(this.allowUserEmailEdits ? 1 : 0);
            LinkAppearance linkAppearance = this.linkAppearance;
            if (linkAppearance == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                linkAppearance.writeToParcel(dest, flags);
            }
        }

        public Configuration(String merchantDisplayName, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, PaymentSheet.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, LinkAppearance linkAppearance) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            this.merchantDisplayName = merchantDisplayName;
            this.cardBrandAcceptance = cardBrandAcceptance;
            this.defaultBillingDetails = billingDetails;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.allowUserEmailEdits = z;
            this.linkAppearance = linkAppearance;
        }

        public /* synthetic */ Configuration(String str, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, PaymentSheet.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, LinkAppearance linkAppearance, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cardBrandAcceptance, billingDetails, billingDetailsCollectionConfiguration, z, (i & 32) != 0 ? null : linkAppearance);
        }

        /* renamed from: getMerchantDisplayName$paymentsheet_release, reason: from getter */
        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        /* renamed from: getCardBrandAcceptance$paymentsheet_release, reason: from getter */
        public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        /* renamed from: getDefaultBillingDetails$paymentsheet_release, reason: from getter */
        public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        /* renamed from: getBillingDetailsCollectionConfiguration$paymentsheet_release, reason: from getter */
        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        /* renamed from: getAllowUserEmailEdits$paymentsheet_release, reason: from getter */
        public final boolean getAllowUserEmailEdits() {
            return this.allowUserEmailEdits;
        }

        /* renamed from: getLinkAppearance$paymentsheet_release, reason: from getter */
        public final LinkAppearance getLinkAppearance() {
            return this.linkAppearance;
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/LinkController$Configuration$Builder;", "", "merchantDisplayName", "", "appearance", "Lcom/stripe/android/link/model/LinkAppearance;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;)V", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "allowUserEmailEdits", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/link/LinkController$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowUserEmailEdits;
            private final LinkAppearance appearance;
            private PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
            private PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
            private PaymentSheet.BillingDetails defaultBillingDetails;
            private final String merchantDisplayName;

            public Builder(String merchantDisplayName, LinkAppearance linkAppearance) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.appearance = linkAppearance;
                this.cardBrandAcceptance = ConfigurationDefaults.INSTANCE.getCardBrandAcceptance();
                this.defaultBillingDetails = ConfigurationDefaults.INSTANCE.getBillingDetails();
                this.billingDetailsCollectionConfiguration = ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration();
                this.allowUserEmailEdits = true;
            }

            public /* synthetic */ Builder(String str, LinkAppearance linkAppearance, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : linkAppearance);
            }

            public final Builder cardBrandAcceptance(PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
                Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
                this.cardBrandAcceptance = cardBrandAcceptance;
                return this;
            }

            public final Builder defaultBillingDetails(PaymentSheet.BillingDetails defaultBillingDetails) {
                this.defaultBillingDetails = defaultBillingDetails;
                return this;
            }

            public final Builder billingDetailsCollectionConfiguration(PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
                Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
                return this;
            }

            public final Builder allowUserEmailEdits(boolean allowUserEmailEdits) {
                this.allowUserEmailEdits = allowUserEmailEdits;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.merchantDisplayName, this.cardBrandAcceptance, this.defaultBillingDetails, this.billingDetailsCollectionConfiguration, this.allowUserEmailEdits, this.appearance);
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$Configuration$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/link/LinkController$Configuration;", "context", "Landroid/content/Context;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: default, reason: not valid java name */
            public final Configuration m7682default(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Builder(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, 2, 0 == true ? 1 : 0).build();
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/link/LinkController$State;", "Landroid/os/Parcelable;", "internalLinkAccount", "Lcom/stripe/android/link/LinkController$LinkAccount;", "selectedPaymentMethodPreview", "Lcom/stripe/android/link/LinkController$PaymentMethodPreview;", "createdPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;)V", "getInternalLinkAccount", "()Lcom/stripe/android/link/LinkController$LinkAccount;", "getSelectedPaymentMethodPreview", "()Lcom/stripe/android/link/LinkController$PaymentMethodPreview;", "getCreatedPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "isConsumerVerified", "", "()Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State implements Parcelable {
        private final PaymentMethod createdPaymentMethod;
        private final LinkAccount internalLinkAccount;
        private final PaymentMethodPreview selectedPaymentMethodPreview;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = PaymentMethod.$stable;

        /* compiled from: LinkController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(parcel.readInt() == 0 ? null : LinkAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethodPreview.CREATOR.createFromParcel(parcel) : null, (PaymentMethod) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.internalLinkAccount, state.internalLinkAccount) && Intrinsics.areEqual(this.selectedPaymentMethodPreview, state.selectedPaymentMethodPreview) && Intrinsics.areEqual(this.createdPaymentMethod, state.createdPaymentMethod);
        }

        public int hashCode() {
            LinkAccount linkAccount = this.internalLinkAccount;
            int iHashCode = (linkAccount == null ? 0 : linkAccount.hashCode()) * 31;
            PaymentMethodPreview paymentMethodPreview = this.selectedPaymentMethodPreview;
            int iHashCode2 = (iHashCode + (paymentMethodPreview == null ? 0 : paymentMethodPreview.hashCode())) * 31;
            PaymentMethod paymentMethod = this.createdPaymentMethod;
            return iHashCode2 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        }

        public String toString() {
            return "State(internalLinkAccount=" + this.internalLinkAccount + ", selectedPaymentMethodPreview=" + this.selectedPaymentMethodPreview + ", createdPaymentMethod=" + this.createdPaymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            LinkAccount linkAccount = this.internalLinkAccount;
            if (linkAccount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                linkAccount.writeToParcel(dest, flags);
            }
            PaymentMethodPreview paymentMethodPreview = this.selectedPaymentMethodPreview;
            if (paymentMethodPreview == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                paymentMethodPreview.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.createdPaymentMethod, flags);
        }

        public State(LinkAccount linkAccount, PaymentMethodPreview paymentMethodPreview, PaymentMethod paymentMethod) {
            this.internalLinkAccount = linkAccount;
            this.selectedPaymentMethodPreview = paymentMethodPreview;
            this.createdPaymentMethod = paymentMethod;
        }

        public /* synthetic */ State(LinkAccount linkAccount, PaymentMethodPreview paymentMethodPreview, PaymentMethod paymentMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : linkAccount, (i & 2) != 0 ? null : paymentMethodPreview, (i & 4) != 0 ? null : paymentMethod);
        }

        public final LinkAccount getInternalLinkAccount() {
            return this.internalLinkAccount;
        }

        public final PaymentMethodPreview getSelectedPaymentMethodPreview() {
            return this.selectedPaymentMethodPreview;
        }

        public final PaymentMethod getCreatedPaymentMethod() {
            return this.createdPaymentMethod;
        }

        public final Boolean isConsumerVerified() {
            SessionState sessionState;
            LinkAccount linkAccount = this.internalLinkAccount;
            if (linkAccount == null || (sessionState = linkAccount.getSessionState()) == null) {
                return null;
            }
            return Boolean.valueOf(sessionState == SessionState.LoggedIn);
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/LinkController$Presenter;", "", "coordinator", "Lcom/stripe/android/link/LinkControllerCoordinator;", "interactor", "Lcom/stripe/android/link/LinkControllerInteractor;", "<init>", "(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkControllerInteractor;)V", "paymentSelectionHint", "", "getPaymentSelectionHint", "()Ljava/lang/String;", "setPaymentSelectionHint", "(Ljava/lang/String;)V", "presentPaymentMethods", "", "email", "authenticate", "authenticateExistingConsumer", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Presenter {
        public static final int $stable = 8;
        private final LinkControllerCoordinator coordinator;
        private final LinkControllerInteractor interactor;
        private String paymentSelectionHint;

        @Inject
        public Presenter(LinkControllerCoordinator coordinator, LinkControllerInteractor interactor) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            Intrinsics.checkNotNullParameter(interactor, "interactor");
            this.coordinator = coordinator;
            this.interactor = interactor;
        }

        public final String getPaymentSelectionHint() {
            return this.paymentSelectionHint;
        }

        public final void setPaymentSelectionHint(String str) {
            this.paymentSelectionHint = str;
        }

        public final void presentPaymentMethods(String email) {
            this.interactor.presentPaymentMethods(this.coordinator.getLinkActivityResultLauncher(), email, this.paymentSelectionHint);
        }

        public final void authenticate(String email) {
            this.interactor.authenticate(this.coordinator.getLinkActivityResultLauncher(), email);
        }

        public final void authenticateExistingConsumer(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.interactor.authenticateExistingConsumer(this.coordinator.getLinkActivityResultLauncher(), email);
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$ConfigureResult;", "", "Success", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$ConfigureResult$Failed;", "Lcom/stripe/android/link/LinkController$ConfigureResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConfigureResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$ConfigureResult$Success;", "Lcom/stripe/android/link/LinkController$ConfigureResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements ConfigureResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -614429247;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$ConfigureResult$Failed;", "Lcom/stripe/android/link/LinkController$ConfigureResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements ConfigureResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "", "Success", "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Canceled;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PresentPaymentMethodsResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Success;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements PresentPaymentMethodsResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -761896958;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Canceled;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled implements PresentPaymentMethodsResult {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canceled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -219454342;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements PresentPaymentMethodsResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$LookupConsumerResult;", "", "Success", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$LookupConsumerResult$Failed;", "Lcom/stripe/android/link/LinkController$LookupConsumerResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LookupConsumerResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/LinkController$LookupConsumerResult$Success;", "Lcom/stripe/android/link/LinkController$LookupConsumerResult;", "email", "", "isConsumer", "", "<init>", "(Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success implements LookupConsumerResult {
            public static final int $stable = 0;
            private final String email;
            private final boolean isConsumer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.email, success.email) && this.isConsumer == success.isConsumer;
            }

            public int hashCode() {
                return (this.email.hashCode() * 31) + Boolean.hashCode(this.isConsumer);
            }

            public String toString() {
                return "Success(email=" + this.email + ", isConsumer=" + this.isConsumer + ")";
            }

            public Success(String email, boolean z) {
                Intrinsics.checkNotNullParameter(email, "email");
                this.email = email;
                this.isConsumer = z;
            }

            public final String getEmail() {
                return this.email;
            }

            /* renamed from: isConsumer, reason: from getter */
            public final boolean getIsConsumer() {
                return this.isConsumer;
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$LookupConsumerResult$Failed;", "Lcom/stripe/android/link/LinkController$LookupConsumerResult;", "email", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getEmail", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements LookupConsumerResult {
            public static final int $stable = 8;
            private final String email;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) obj;
                return Intrinsics.areEqual(this.email, failed.email) && Intrinsics.areEqual(this.error, failed.error);
            }

            public int hashCode() {
                return (this.email.hashCode() * 31) + this.error.hashCode();
            }

            public String toString() {
                return "Failed(email=" + this.email + ", error=" + this.error + ")";
            }

            public Failed(String email, Throwable error) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(error, "error");
                this.email = email;
                this.error = error;
            }

            public final String getEmail() {
                return this.email;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;", "", "Success", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Failed;", "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CreatePaymentMethodResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Success;", "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements CreatePaymentMethodResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1170356678;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Failed;", "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements CreatePaymentMethodResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$AuthenticationResult;", "", "Success", "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$AuthenticationResult$Canceled;", "Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;", "Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AuthenticationResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;", "Lcom/stripe/android/link/LinkController$AuthenticationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements AuthenticationResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1823896799;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$AuthenticationResult$Canceled;", "Lcom/stripe/android/link/LinkController$AuthenticationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled implements AuthenticationResult {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canceled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1218288955;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;", "Lcom/stripe/android/link/LinkController$AuthenticationResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements AuthenticationResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkController$RegisterConsumerResult;", "", "Success", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Failed;", "Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RegisterConsumerResult {

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Success;", "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements RegisterConsumerResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2038913822;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: LinkController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Failed;", "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements RegisterConsumerResult {
            public static final int $stable = 8;
            private final Throwable error;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            public Failed(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/LinkController$LinkAccount;", "Landroid/os/Parcelable;", "email", "", "redactedPhoneNumber", "sessionState", "Lcom/stripe/android/link/LinkController$SessionState;", "consumerSessionClientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkController$SessionState;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getRedactedPhoneNumber", "getSessionState", "()Lcom/stripe/android/link/LinkController$SessionState;", "getConsumerSessionClientSecret", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAccount implements Parcelable {
        private final String consumerSessionClientSecret;
        private final String email;
        private final String redactedPhoneNumber;
        private final SessionState sessionState;
        public static final Parcelable.Creator<LinkAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkAccount(parcel.readString(), parcel.readString(), SessionState.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkAccount[] newArray(int i) {
                return new LinkAccount[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAccount)) {
                return false;
            }
            LinkAccount linkAccount = (LinkAccount) obj;
            return Intrinsics.areEqual(this.email, linkAccount.email) && Intrinsics.areEqual(this.redactedPhoneNumber, linkAccount.redactedPhoneNumber) && this.sessionState == linkAccount.sessionState && Intrinsics.areEqual(this.consumerSessionClientSecret, linkAccount.consumerSessionClientSecret);
        }

        public int hashCode() {
            int iHashCode = ((((this.email.hashCode() * 31) + this.redactedPhoneNumber.hashCode()) * 31) + this.sessionState.hashCode()) * 31;
            String str = this.consumerSessionClientSecret;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LinkAccount(email=" + this.email + ", redactedPhoneNumber=" + this.redactedPhoneNumber + ", sessionState=" + this.sessionState + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.email);
            dest.writeString(this.redactedPhoneNumber);
            dest.writeString(this.sessionState.name());
            dest.writeString(this.consumerSessionClientSecret);
        }

        public LinkAccount(String email, String redactedPhoneNumber, SessionState sessionState, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
            Intrinsics.checkNotNullParameter(sessionState, "sessionState");
            this.email = email;
            this.redactedPhoneNumber = redactedPhoneNumber;
            this.sessionState = sessionState;
            this.consumerSessionClientSecret = str;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getRedactedPhoneNumber() {
            return this.redactedPhoneNumber;
        }

        public final SessionState getSessionState() {
            return this.sessionState;
        }

        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/LinkController$SessionState;", "", "<init>", "(Ljava/lang/String;I)V", "LoggedOut", "NeedsVerification", "LoggedIn", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SessionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SessionState[] $VALUES;
        public static final SessionState LoggedOut = new SessionState("LoggedOut", 0);
        public static final SessionState NeedsVerification = new SessionState("NeedsVerification", 1);
        public static final SessionState LoggedIn = new SessionState("LoggedIn", 2);

        private static final /* synthetic */ SessionState[] $values() {
            return new SessionState[]{LoggedOut, NeedsVerification, LoggedIn};
        }

        public static EnumEntries<SessionState> getEntries() {
            return $ENTRIES;
        }

        private SessionState(String str, int i) {
        }

        static {
            SessionState[] sessionStateArr$values = $values();
            $VALUES = sessionStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sessionStateArr$values);
        }

        public static SessionState valueOf(String str) {
            return (SessionState) Enum.valueOf(SessionState.class, str);
        }

        public static SessionState[] values() {
            return (SessionState[]) $VALUES.clone();
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/link/LinkController$PaymentMethodPreview;", "Landroid/os/Parcelable;", "iconRes", "", "label", "", "sublabel", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getIconRes", "()I", "getLabel", "()Ljava/lang/String;", "getSublabel", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodPreview implements Parcelable {
        private final int iconRes;
        private final String label;
        private final String sublabel;
        public static final Parcelable.Creator<PaymentMethodPreview> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodPreview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodPreview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethodPreview(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodPreview[] newArray(int i) {
                return new PaymentMethodPreview[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodPreview)) {
                return false;
            }
            PaymentMethodPreview paymentMethodPreview = (PaymentMethodPreview) obj;
            return this.iconRes == paymentMethodPreview.iconRes && Intrinsics.areEqual(this.label, paymentMethodPreview.label) && Intrinsics.areEqual(this.sublabel, paymentMethodPreview.sublabel);
        }

        public int hashCode() {
            int iHashCode = ((this.iconRes * 31) + this.label.hashCode()) * 31;
            String str = this.sublabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentMethodPreview(iconRes=" + this.iconRes + ", label=" + this.label + ", sublabel=" + this.sublabel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.iconRes);
            dest.writeString(this.label);
            dest.writeString(this.sublabel);
        }

        public PaymentMethodPreview(int i, String label, String str) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.iconRes = i;
            this.label = label;
            this.sublabel = str;
        }

        public final int getIconRes() {
            return this.iconRes;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getSublabel() {
            return this.sublabel;
        }
    }

    /* compiled from: LinkController.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/LinkController$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/link/LinkController;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LinkController create(Application application, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return DaggerLinkControllerComponent.factory().build(application, savedStateHandle, "LinkController").getLinkController();
        }
    }
}
