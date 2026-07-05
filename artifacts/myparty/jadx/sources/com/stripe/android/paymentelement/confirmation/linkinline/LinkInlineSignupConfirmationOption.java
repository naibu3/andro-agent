package com.stripe.android.paymentelement.confirmation.linkinline;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkInlineSignupConfirmationOption.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00011B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JI\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "extraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "saveOption", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;)V", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "getSaveOption", "()Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "getUserInput", "()Lcom/stripe/android/link/ui/inline/UserInput;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "PaymentMethodSaveOption", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkInlineSignupConfirmationOption implements ConfirmationHandler.Option {
    private final PaymentMethodCreateParams createParams;
    private final PaymentMethodExtraParams extraParams;
    private final LinkConfiguration linkConfiguration;
    private final PaymentMethodOptionsParams optionsParams;
    private final PaymentMethodSaveOption saveOption;
    private final UserInput userInput;
    public static final Parcelable.Creator<LinkInlineSignupConfirmationOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkInlineSignupConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkInlineSignupConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInlineSignupConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkInlineSignupConfirmationOption((PaymentMethodCreateParams) parcel.readParcelable(LinkInlineSignupConfirmationOption.class.getClassLoader()), (PaymentMethodOptionsParams) parcel.readParcelable(LinkInlineSignupConfirmationOption.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(LinkInlineSignupConfirmationOption.class.getClassLoader()), PaymentMethodSaveOption.valueOf(parcel.readString()), LinkConfiguration.CREATOR.createFromParcel(parcel), (UserInput) parcel.readParcelable(LinkInlineSignupConfirmationOption.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInlineSignupConfirmationOption[] newArray(int i) {
            return new LinkInlineSignupConfirmationOption[i];
        }
    }

    public static /* synthetic */ LinkInlineSignupConfirmationOption copy$default(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, PaymentMethodSaveOption paymentMethodSaveOption, LinkConfiguration linkConfiguration, UserInput userInput, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodCreateParams = linkInlineSignupConfirmationOption.createParams;
        }
        if ((i & 2) != 0) {
            paymentMethodOptionsParams = linkInlineSignupConfirmationOption.optionsParams;
        }
        if ((i & 4) != 0) {
            paymentMethodExtraParams = linkInlineSignupConfirmationOption.extraParams;
        }
        if ((i & 8) != 0) {
            paymentMethodSaveOption = linkInlineSignupConfirmationOption.saveOption;
        }
        if ((i & 16) != 0) {
            linkConfiguration = linkInlineSignupConfirmationOption.linkConfiguration;
        }
        if ((i & 32) != 0) {
            userInput = linkInlineSignupConfirmationOption.userInput;
        }
        LinkConfiguration linkConfiguration2 = linkConfiguration;
        UserInput userInput2 = userInput;
        return linkInlineSignupConfirmationOption.copy(paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams, paymentMethodSaveOption, linkConfiguration2, userInput2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodCreateParams getCreateParams() {
        return this.createParams;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodOptionsParams getOptionsParams() {
        return this.optionsParams;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodExtraParams getExtraParams() {
        return this.extraParams;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodSaveOption getSaveOption() {
        return this.saveOption;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    /* renamed from: component6, reason: from getter */
    public final UserInput getUserInput() {
        return this.userInput;
    }

    public final LinkInlineSignupConfirmationOption copy(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams, PaymentMethodSaveOption saveOption, LinkConfiguration linkConfiguration, UserInput userInput) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        Intrinsics.checkNotNullParameter(saveOption, "saveOption");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        return new LinkInlineSignupConfirmationOption(createParams, optionsParams, extraParams, saveOption, linkConfiguration, userInput);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkInlineSignupConfirmationOption)) {
            return false;
        }
        LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption = (LinkInlineSignupConfirmationOption) other;
        return Intrinsics.areEqual(this.createParams, linkInlineSignupConfirmationOption.createParams) && Intrinsics.areEqual(this.optionsParams, linkInlineSignupConfirmationOption.optionsParams) && Intrinsics.areEqual(this.extraParams, linkInlineSignupConfirmationOption.extraParams) && this.saveOption == linkInlineSignupConfirmationOption.saveOption && Intrinsics.areEqual(this.linkConfiguration, linkInlineSignupConfirmationOption.linkConfiguration) && Intrinsics.areEqual(this.userInput, linkInlineSignupConfirmationOption.userInput);
    }

    public int hashCode() {
        int iHashCode = this.createParams.hashCode() * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.optionsParams;
        int iHashCode2 = (iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
        PaymentMethodExtraParams paymentMethodExtraParams = this.extraParams;
        return ((((((iHashCode2 + (paymentMethodExtraParams != null ? paymentMethodExtraParams.hashCode() : 0)) * 31) + this.saveOption.hashCode()) * 31) + this.linkConfiguration.hashCode()) * 31) + this.userInput.hashCode();
    }

    public String toString() {
        return "LinkInlineSignupConfirmationOption(createParams=" + this.createParams + ", optionsParams=" + this.optionsParams + ", extraParams=" + this.extraParams + ", saveOption=" + this.saveOption + ", linkConfiguration=" + this.linkConfiguration + ", userInput=" + this.userInput + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.createParams, flags);
        dest.writeParcelable(this.optionsParams, flags);
        dest.writeParcelable(this.extraParams, flags);
        dest.writeString(this.saveOption.name());
        this.linkConfiguration.writeToParcel(dest, flags);
        dest.writeParcelable(this.userInput, flags);
    }

    public LinkInlineSignupConfirmationOption(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, PaymentMethodSaveOption saveOption, LinkConfiguration linkConfiguration, UserInput userInput) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        Intrinsics.checkNotNullParameter(saveOption, "saveOption");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        this.createParams = createParams;
        this.optionsParams = paymentMethodOptionsParams;
        this.extraParams = paymentMethodExtraParams;
        this.saveOption = saveOption;
        this.linkConfiguration = linkConfiguration;
        this.userInput = userInput;
    }

    public final PaymentMethodCreateParams getCreateParams() {
        return this.createParams;
    }

    public final PaymentMethodOptionsParams getOptionsParams() {
        return this.optionsParams;
    }

    public final PaymentMethodExtraParams getExtraParams() {
        return this.extraParams;
    }

    public final PaymentMethodSaveOption getSaveOption() {
        return this.saveOption;
    }

    public final LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    public final UserInput getUserInput() {
        return this.userInput;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkInlineSignupConfirmationOption.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;", "", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "<init>", "(Ljava/lang/String;ILcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "RequestedReuse", "RequestedNoReuse", "NoRequest", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodSaveOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentMethodSaveOption[] $VALUES;
        private final ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        public static final PaymentMethodSaveOption RequestedReuse = new PaymentMethodSaveOption("RequestedReuse", 0, ConfirmPaymentIntentParams.SetupFutureUsage.OffSession);
        public static final PaymentMethodSaveOption RequestedNoReuse = new PaymentMethodSaveOption("RequestedNoReuse", 1, ConfirmPaymentIntentParams.SetupFutureUsage.Blank);
        public static final PaymentMethodSaveOption NoRequest = new PaymentMethodSaveOption("NoRequest", 2, null);

        private static final /* synthetic */ PaymentMethodSaveOption[] $values() {
            return new PaymentMethodSaveOption[]{RequestedReuse, RequestedNoReuse, NoRequest};
        }

        public static EnumEntries<PaymentMethodSaveOption> getEntries() {
            return $ENTRIES;
        }

        private PaymentMethodSaveOption(String str, int i, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        static {
            PaymentMethodSaveOption[] paymentMethodSaveOptionArr$values = $values();
            $VALUES = paymentMethodSaveOptionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(paymentMethodSaveOptionArr$values);
        }

        public static PaymentMethodSaveOption valueOf(String str) {
            return (PaymentMethodSaveOption) Enum.valueOf(PaymentMethodSaveOption.class, str);
        }

        public static PaymentMethodSaveOption[] values() {
            return (PaymentMethodSaveOption[]) $VALUES.clone();
        }
    }
}
