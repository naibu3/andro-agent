package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.ktx.BuildConfig;
import com.nimbusds.jose.HeaderParameterNames;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.wallets.Wallet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PaymentMethod.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0012WXYZ[\\]^_`abcdefghBý\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+J\b\u00101\u001a\u00020\u0007H\u0007J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00104J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u0016\u00106\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\tHÀ\u0003¢\u0006\u0002\b7J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010&HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010)HÆ\u0003J\u008c\u0002\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020LJ\u0013\u0010M\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020LHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020LR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010,R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0015\u0010%\u001a\u0004\u0018\u00010&8G¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010'\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b'\u0010/R\u0012\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u00100\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b0\u0010/¨\u0006i"}, d2 = {"Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "created", "", "liveMode", "", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "customerId", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "linkPaymentDetails", "Lcom/stripe/android/model/LinkPaymentDetails;", "isLinkPassthroughMode", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V", "Ljava/lang/Long;", "getLinkPaymentDetails", "()Lcom/stripe/android/model/LinkPaymentDetails;", "()Z", "isLinkPaymentMethod", "hasExpectedDetails", "component1", "component2", "()Ljava/lang/Long;", "component3", "component4", "component4$payments_core_release", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethod;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "AfterRedirectAction", "Builder", "BillingDetails", "AllowRedisplay", "TypeData", "Card", "CardPresent", "Ideal", "Fpx", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "Netbanking", "USBankAccount", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethod implements StripeModel {
    public final AllowRedisplay allowRedisplay;
    public final AuBecsDebit auBecsDebit;
    public final BacsDebit bacsDebit;
    public final BillingDetails billingDetails;
    public final Card card;
    public final CardPresent cardPresent;
    public final String code;
    public final Long created;
    public final String customerId;
    public final Fpx fpx;
    public final String id;
    public final Ideal ideal;
    private final boolean isLinkPassthroughMode;
    private final LinkPaymentDetails linkPaymentDetails;
    public final boolean liveMode;
    public final Netbanking netbanking;
    public final SepaDebit sepaDebit;
    public final Sofort sofort;
    public final Type type;
    public final Upi upi;
    public final USBankAccount usBankAccount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentMethod.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Long l;
            Sofort sofortCreateFromParcel;
            Sofort sofort;
            Upi upiCreateFromParcel;
            Upi upi;
            Netbanking netbankingCreateFromParcel;
            Netbanking netbanking;
            USBankAccount uSBankAccountCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            Type typeCreateFromParcel = parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel);
            BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Card cardCreateFromParcel = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            CardPresent cardPresentCreateFromParcel = parcel.readInt() == 0 ? null : CardPresent.CREATOR.createFromParcel(parcel);
            Fpx fpxCreateFromParcel = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            Ideal idealCreateFromParcel = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            SepaDebit sepaDebitCreateFromParcel = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit auBecsDebitCreateFromParcel = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit bacsDebitCreateFromParcel = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                l = lValueOf;
                sofortCreateFromParcel = null;
            } else {
                l = lValueOf;
                sofortCreateFromParcel = Sofort.CREATOR.createFromParcel(parcel);
            }
            Sofort sofort2 = sofortCreateFromParcel;
            if (parcel.readInt() == 0) {
                sofort = sofort2;
                upiCreateFromParcel = null;
            } else {
                sofort = sofort2;
                upiCreateFromParcel = Upi.CREATOR.createFromParcel(parcel);
            }
            Upi upi2 = upiCreateFromParcel;
            if (parcel.readInt() == 0) {
                upi = upi2;
                netbankingCreateFromParcel = null;
            } else {
                upi = upi2;
                netbankingCreateFromParcel = Netbanking.CREATOR.createFromParcel(parcel);
            }
            Netbanking netbanking2 = netbankingCreateFromParcel;
            if (parcel.readInt() == 0) {
                netbanking = netbanking2;
                uSBankAccountCreateFromParcel = null;
            } else {
                netbanking = netbanking2;
                uSBankAccountCreateFromParcel = USBankAccount.CREATOR.createFromParcel(parcel);
            }
            return new PaymentMethod(string, l, z, string2, typeCreateFromParcel, billingDetailsCreateFromParcel, string3, cardCreateFromParcel, cardPresentCreateFromParcel, fpxCreateFromParcel, idealCreateFromParcel, sepaDebitCreateFromParcel, auBecsDebitCreateFromParcel, bacsDebitCreateFromParcel, sofort, upi, netbanking, uSBankAccountCreateFromParcel, (LinkPaymentDetails) parcel.readParcelable(PaymentMethod.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : AllowRedisplay.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.Fpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.Ideal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Type.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Type.USBankAccount.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, LinkPaymentDetails linkPaymentDetails, boolean z2, AllowRedisplay allowRedisplay, int i, Object obj) {
        AllowRedisplay allowRedisplay2;
        boolean z3;
        String str4 = (i & 1) != 0 ? paymentMethod.id : str;
        Long l2 = (i & 2) != 0 ? paymentMethod.created : l;
        boolean z4 = (i & 4) != 0 ? paymentMethod.liveMode : z;
        String str5 = (i & 8) != 0 ? paymentMethod.code : str2;
        Type type2 = (i & 16) != 0 ? paymentMethod.type : type;
        BillingDetails billingDetails2 = (i & 32) != 0 ? paymentMethod.billingDetails : billingDetails;
        String str6 = (i & 64) != 0 ? paymentMethod.customerId : str3;
        Card card2 = (i & 128) != 0 ? paymentMethod.card : card;
        CardPresent cardPresent2 = (i & 256) != 0 ? paymentMethod.cardPresent : cardPresent;
        Fpx fpx2 = (i & 512) != 0 ? paymentMethod.fpx : fpx;
        Ideal ideal2 = (i & 1024) != 0 ? paymentMethod.ideal : ideal;
        SepaDebit sepaDebit2 = (i & 2048) != 0 ? paymentMethod.sepaDebit : sepaDebit;
        AuBecsDebit auBecsDebit2 = (i & 4096) != 0 ? paymentMethod.auBecsDebit : auBecsDebit;
        BacsDebit bacsDebit2 = (i & 8192) != 0 ? paymentMethod.bacsDebit : bacsDebit;
        String str7 = str4;
        Sofort sofort2 = (i & 16384) != 0 ? paymentMethod.sofort : sofort;
        Upi upi2 = (i & 32768) != 0 ? paymentMethod.upi : upi;
        Netbanking netbanking2 = (i & 65536) != 0 ? paymentMethod.netbanking : netbanking;
        USBankAccount uSBankAccount2 = (i & 131072) != 0 ? paymentMethod.usBankAccount : uSBankAccount;
        LinkPaymentDetails linkPaymentDetails2 = (i & 262144) != 0 ? paymentMethod.linkPaymentDetails : linkPaymentDetails;
        boolean z5 = (i & 524288) != 0 ? paymentMethod.isLinkPassthroughMode : z2;
        if ((i & 1048576) != 0) {
            z3 = z5;
            allowRedisplay2 = paymentMethod.allowRedisplay;
        } else {
            allowRedisplay2 = allowRedisplay;
            z3 = z5;
        }
        return paymentMethod.copy(str7, l2, z4, str5, type2, billingDetails2, str6, card2, cardPresent2, fpx2, ideal2, sepaDebit2, auBecsDebit2, bacsDebit2, sofort2, upi2, netbanking2, uSBankAccount2, linkPaymentDetails2, z3, allowRedisplay2);
    }

    @JvmStatic
    public static final PaymentMethod fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Fpx getFpx() {
        return this.fpx;
    }

    /* renamed from: component11, reason: from getter */
    public final Ideal getIdeal() {
        return this.ideal;
    }

    /* renamed from: component12, reason: from getter */
    public final SepaDebit getSepaDebit() {
        return this.sepaDebit;
    }

    /* renamed from: component13, reason: from getter */
    public final AuBecsDebit getAuBecsDebit() {
        return this.auBecsDebit;
    }

    /* renamed from: component14, reason: from getter */
    public final BacsDebit getBacsDebit() {
        return this.bacsDebit;
    }

    /* renamed from: component15, reason: from getter */
    public final Sofort getSofort() {
        return this.sofort;
    }

    /* renamed from: component16, reason: from getter */
    public final Upi getUpi() {
        return this.upi;
    }

    /* renamed from: component17, reason: from getter */
    public final Netbanking getNetbanking() {
        return this.netbanking;
    }

    /* renamed from: component18, reason: from getter */
    public final USBankAccount getUsBankAccount() {
        return this.usBankAccount;
    }

    /* renamed from: component19, reason: from getter */
    public final LinkPaymentDetails getLinkPaymentDetails() {
        return this.linkPaymentDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getCreated() {
        return this.created;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsLinkPassthroughMode() {
        return this.isLinkPassthroughMode;
    }

    /* renamed from: component21, reason: from getter */
    public final AllowRedisplay getAllowRedisplay() {
        return this.allowRedisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLiveMode() {
        return this.liveMode;
    }

    /* renamed from: component4$payments_core_release, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component5, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component8, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* renamed from: component9, reason: from getter */
    public final CardPresent getCardPresent() {
        return this.cardPresent;
    }

    public final PaymentMethod copy(String id, Long created, boolean liveMode, String code, Type type, BillingDetails billingDetails, String customerId, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount usBankAccount, LinkPaymentDetails linkPaymentDetails, boolean isLinkPassthroughMode, AllowRedisplay allowRedisplay) {
        return new PaymentMethod(id, created, liveMode, code, type, billingDetails, customerId, card, cardPresent, fpx, ideal, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, usBankAccount, linkPaymentDetails, isLinkPassthroughMode, allowRedisplay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.id, paymentMethod.id) && Intrinsics.areEqual(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && Intrinsics.areEqual(this.code, paymentMethod.code) && this.type == paymentMethod.type && Intrinsics.areEqual(this.billingDetails, paymentMethod.billingDetails) && Intrinsics.areEqual(this.customerId, paymentMethod.customerId) && Intrinsics.areEqual(this.card, paymentMethod.card) && Intrinsics.areEqual(this.cardPresent, paymentMethod.cardPresent) && Intrinsics.areEqual(this.fpx, paymentMethod.fpx) && Intrinsics.areEqual(this.ideal, paymentMethod.ideal) && Intrinsics.areEqual(this.sepaDebit, paymentMethod.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethod.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethod.bacsDebit) && Intrinsics.areEqual(this.sofort, paymentMethod.sofort) && Intrinsics.areEqual(this.upi, paymentMethod.upi) && Intrinsics.areEqual(this.netbanking, paymentMethod.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethod.usBankAccount) && Intrinsics.areEqual(this.linkPaymentDetails, paymentMethod.linkPaymentDetails) && this.isLinkPassthroughMode == paymentMethod.isLinkPassthroughMode && this.allowRedisplay == paymentMethod.allowRedisplay;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.created;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.liveMode)) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.type;
        int iHashCode4 = (iHashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int iHashCode5 = (iHashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str3 = this.customerId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Card card = this.card;
        int iHashCode7 = (iHashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int iHashCode8 = (iHashCode7 + (cardPresent == null ? 0 : cardPresent.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int iHashCode9 = (iHashCode8 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int iHashCode10 = (iHashCode9 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int iHashCode11 = (iHashCode10 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int iHashCode12 = (iHashCode11 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int iHashCode13 = (iHashCode12 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int iHashCode14 = (iHashCode13 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int iHashCode15 = (iHashCode14 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int iHashCode16 = (iHashCode15 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int iHashCode17 = (iHashCode16 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        LinkPaymentDetails linkPaymentDetails = this.linkPaymentDetails;
        int iHashCode18 = (((iHashCode17 + (linkPaymentDetails == null ? 0 : linkPaymentDetails.hashCode())) * 31) + Boolean.hashCode(this.isLinkPassthroughMode)) * 31;
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        return iHashCode18 + (allowRedisplay != null ? allowRedisplay.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.id + ", created=" + this.created + ", liveMode=" + this.liveMode + ", code=" + this.code + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ", customerId=" + this.customerId + ", card=" + this.card + ", cardPresent=" + this.cardPresent + ", fpx=" + this.fpx + ", ideal=" + this.ideal + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", linkPaymentDetails=" + this.linkPaymentDetails + ", isLinkPassthroughMode=" + this.isLinkPassthroughMode + ", allowRedisplay=" + this.allowRedisplay + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Long l = this.created;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeInt(this.liveMode ? 1 : 0);
        dest.writeString(this.code);
        Type type = this.type;
        if (type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            type.writeToParcel(dest, flags);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billingDetails.writeToParcel(dest, flags);
        }
        dest.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            card.writeToParcel(dest, flags);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardPresent.writeToParcel(dest, flags);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fpx.writeToParcel(dest, flags);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ideal.writeToParcel(dest, flags);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sepaDebit.writeToParcel(dest, flags);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            auBecsDebit.writeToParcel(dest, flags);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bacsDebit.writeToParcel(dest, flags);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sofort.writeToParcel(dest, flags);
        }
        Upi upi = this.upi;
        if (upi == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            upi.writeToParcel(dest, flags);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            netbanking.writeToParcel(dest, flags);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uSBankAccount.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.linkPaymentDetails, flags);
        dest.writeInt(this.isLinkPassthroughMode ? 1 : 0);
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            allowRedisplay.writeToParcel(dest, flags);
        }
    }

    public PaymentMethod(String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, LinkPaymentDetails linkPaymentDetails, boolean z2, AllowRedisplay allowRedisplay) {
        this.id = str;
        this.created = l;
        this.liveMode = z;
        this.code = str2;
        this.type = type;
        this.billingDetails = billingDetails;
        this.customerId = str3;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.linkPaymentDetails = linkPaymentDetails;
        this.isLinkPassthroughMode = z2;
        this.allowRedisplay = allowRedisplay;
    }

    public /* synthetic */ PaymentMethod(String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, LinkPaymentDetails linkPaymentDetails, boolean z2, AllowRedisplay allowRedisplay, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, z, str2, type, (i & 32) != 0 ? null : billingDetails, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : card, (i & 256) != 0 ? null : cardPresent, (i & 512) != 0 ? null : fpx, (i & 1024) != 0 ? null : ideal, (i & 2048) != 0 ? null : sepaDebit, (i & 4096) != 0 ? null : auBecsDebit, (i & 8192) != 0 ? null : bacsDebit, (i & 16384) != 0 ? null : sofort, (32768 & i) != 0 ? null : upi, (65536 & i) != 0 ? null : netbanking, (131072 & i) != 0 ? null : uSBankAccount, (262144 & i) != 0 ? null : linkPaymentDetails, (524288 & i) != 0 ? false : z2, (i & 1048576) != 0 ? null : allowRedisplay);
    }

    public final LinkPaymentDetails getLinkPaymentDetails() {
        return this.linkPaymentDetails;
    }

    public final boolean isLinkPassthroughMode() {
        return this.isLinkPassthroughMode;
    }

    public final boolean isLinkPaymentMethod() {
        return this.linkPaymentDetails != null;
    }

    public final boolean hasExpectedDetails() {
        Type type = this.type;
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                if (this.card != null) {
                }
                break;
            case 2:
                if (this.cardPresent != null) {
                }
                break;
            case 3:
                if (this.fpx != null) {
                }
                break;
            case 4:
                if (this.ideal != null) {
                }
                break;
            case 5:
                if (this.sepaDebit != null) {
                }
                break;
            case 6:
                if (this.auBecsDebit != null) {
                }
                break;
            case 7:
                if (this.bacsDebit != null) {
                }
                break;
            case 8:
                if (this.sofort != null) {
                }
                break;
            case 9:
                if (this.usBankAccount != null) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001DBC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010<\u001a\u00020\u0004H\u0016J\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020>R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006E"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "Landroid/os/Parcelable;", "", "code", "", "isReusable", "", "isVoucher", "requiresMandate", "requiresMandateForPaymentIntent", "hasDelayedSettlement", "afterRedirectAction", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V", "getRequiresMandateForPaymentIntent$payments_core_release", "()Z", "getAfterRedirectAction$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "Link", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "Klarna", "Affirm", "RevolutPay", "Sunbit", "Billie", "Satispay", "Crypto", "AmazonPay", "Alma", "MobilePay", "Multibanco", "Zip", "USBankAccount", "CashAppPay", "Boleto", "Konbini", "Swish", "Twint", "ShopPay", InAppPurchaseConstants.METHOD_TO_STRING, "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Affirm;
        public static final Type AfterpayClearpay;
        public static final Type Alipay;
        public static final Type Alma;
        public static final Type AmazonPay;
        public static final Type AuBecsDebit;
        public static final Type BacsDebit;
        public static final Type Bancontact;
        public static final Type Billie;
        public static final Type Blik;
        public static final Type Boleto;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type Card;
        public static final Type CardPresent;
        public static final Type CashAppPay;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type Crypto;
        public static final Type Eps;
        public static final Type Fpx;
        public static final Type Giropay;
        public static final Type GrabPay;
        public static final Type Ideal;
        public static final Type Klarna;
        public static final Type Konbini;
        public static final Type Link;
        public static final Type MobilePay;
        public static final Type Multibanco;
        public static final Type Netbanking;
        public static final Type Oxxo;
        public static final Type P24;
        public static final Type PayPal;
        public static final Type RevolutPay;
        public static final Type Satispay;
        public static final Type SepaDebit;
        public static final Type ShopPay;
        public static final Type Sofort;
        public static final Type Sunbit;
        public static final Type Swish;
        public static final Type Twint;
        public static final Type USBankAccount;
        public static final Type Upi;
        public static final Type WeChatPay = new Type("WeChatPay", 21, "wechat_pay", false, false, false, false, false, new AfterRedirectAction.Refresh(5));
        public static final Type Zip;
        private final AfterRedirectAction afterRedirectAction;
        public final String code;
        private final boolean hasDelayedSettlement;
        public final boolean isReusable;
        public final boolean isVoucher;
        public final boolean requiresMandate;
        private final boolean requiresMandateForPaymentIntent;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Type> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Link, Card, CardPresent, Fpx, Ideal, SepaDebit, AuBecsDebit, BacsDebit, Sofort, Upi, P24, Bancontact, Giropay, Eps, Oxxo, Alipay, GrabPay, PayPal, AfterpayClearpay, Netbanking, Blik, WeChatPay, Klarna, Affirm, RevolutPay, Sunbit, Billie, Satispay, Crypto, AmazonPay, Alma, MobilePay, Multibanco, Zip, USBankAccount, CashAppPay, Boleto, Konbini, Swish, Twint, ShopPay};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }

        private Type(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AfterRedirectAction afterRedirectAction) {
            this.code = str2;
            this.isReusable = z;
            this.isVoucher = z2;
            this.requiresMandate = z3;
            this.requiresMandateForPaymentIntent = z4;
            this.hasDelayedSettlement = z5;
            this.afterRedirectAction = afterRedirectAction;
        }

        /* renamed from: getRequiresMandateForPaymentIntent$payments_core_release, reason: from getter */
        public final boolean getRequiresMandateForPaymentIntent() {
            return this.requiresMandateForPaymentIntent;
        }

        /* synthetic */ Type(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AfterRedirectAction afterRedirectAction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, z2, z3, z4, z5, (i2 & 64) != 0 ? AfterRedirectAction.None.INSTANCE : afterRedirectAction);
        }

        /* renamed from: getAfterRedirectAction$payments_core_release, reason: from getter */
        public final AfterRedirectAction getAfterRedirectAction() {
            return this.afterRedirectAction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z = false;
            Link = new Type("Link", 0, "link", false, false, true, true, z, null, 64, null);
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Card = new Type("Card", 1, "card", true, z2, z3, z, z4, null, 64, null);
            boolean z5 = false;
            CardPresent = new Type("CardPresent", 2, "card_present", z2, z3, z, z4, z5, null, 64, null);
            boolean z6 = false;
            Fpx = new Type("Fpx", 3, "fpx", z3, z, z4, z5, z6, null, 64, null);
            Ideal = new Type("Ideal", 4, "ideal", z, z4, true, z6, false, null, 64, null);
            boolean z7 = true;
            boolean z8 = true;
            SepaDebit = new Type("SepaDebit", 5, "sepa_debit", z4, false, true, z7, z8, null, 64, null);
            boolean z9 = true;
            AuBecsDebit = new Type("AuBecsDebit", 6, "au_becs_debit", true, false, z7, z8, z9, null, 64, null);
            boolean z10 = false;
            BacsDebit = new Type("BacsDebit", 7, "bacs_debit", true, z10, z8, z9, true, null, 64, null);
            boolean z11 = false;
            Sofort = new Type("Sofort", 8, "sofort", z10, false, z9, z11, true, null, 64, null);
            int i = 0;
            int i2 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z12 = false;
            Upi = new Type("Upi", 9, "upi", false, false, false, false, false, new AfterRedirectAction.Refresh(i, i2, defaultConstructorMarker));
            P24 = new Type("P24", 10, "p24", false, false, false, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            boolean z13 = false;
            Bancontact = new Type("Bancontact", 11, "bancontact", z11, z12, true, true, z13, null, 64, null);
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            Giropay = new Type("Giropay", 12, "giropay", z12, z14, z15, z13, z16, null, 64, null);
            boolean z17 = false;
            Eps = new Type("Eps", 13, "eps", z14, z15, z13, z16, z17, null, 64, null);
            Oxxo = new Type("Oxxo", 14, "oxxo", z15, true, z16, z17, true, null, 64, null);
            boolean z18 = false;
            boolean z19 = false;
            Alipay = new Type("Alipay", 15, "alipay", false, z16, z17, z18, z19, null, 64, null);
            GrabPay = new Type("GrabPay", 16, "grabpay", z16, z17, z18, z19, false, null, 64, null);
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            PayPal = new Type("PayPal", 17, "paypal", false, z20, true, z21, z22, null, 64, null);
            boolean z23 = false;
            boolean z24 = false;
            AfterpayClearpay = new Type("AfterpayClearpay", 18, "afterpay_clearpay", z20, z23, z21, z22, z24, null, 64, null);
            boolean z25 = false;
            Netbanking = new Type("Netbanking", 19, "netbanking", z23, z21, z22, z24, z25, null, 64, null);
            Blik = new Type("Blik", 20, "blik", z21, z22, z24, z25, false, null, 64, null);
            boolean z26 = false;
            Klarna = new Type("Klarna", 22, "klarna", false, false, true, false, false, new AfterRedirectAction.Refresh(i, i2, defaultConstructorMarker));
            boolean z27 = false;
            Affirm = new Type("Affirm", 23, "affirm", z25, false, z26, false, z27, null, 64, null);
            boolean z28 = false;
            RevolutPay = new Type("RevolutPay", 24, "revolut_pay", false, false, true, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            boolean z29 = false;
            boolean z30 = false;
            Sunbit = new Type("Sunbit", 25, "sunbit", z26, z29, z27, z28, z30, 0 == true ? 1 : 0, 64, null);
            boolean z31 = false;
            Billie = new Type("Billie", 26, "billie", z29, z27, z28, z30, z31, null, 64, null);
            boolean z32 = false;
            Satispay = new Type("Satispay", 27, "satispay", z27, z28, z30, z31, z32, null, 64, 0 == true ? 1 : 0);
            int i3 = 64;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            AfterRedirectAction afterRedirectAction = null;
            Crypto = new Type("Crypto", 28, "crypto", z28, z30, z31, z32, false, afterRedirectAction, i3, defaultConstructorMarker2);
            boolean z33 = false;
            boolean z34 = false;
            AmazonPay = new Type("AmazonPay", 29, "amazon_pay", false, false, true, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            boolean z35 = false;
            boolean z36 = false;
            Alma = new Type("Alma", 30, "alma", false, z35, z33, z34, z36, null, 64, null);
            boolean z37 = false;
            MobilePay = new Type("MobilePay", 31, "mobilepay", z35, z33, z34, z36, z37, null, 64, null);
            Multibanco = new Type("Multibanco", 32, "multibanco", z33, true, z36, z37, true, null, 64, null);
            Zip = new Type("Zip", 33, HeaderParameterNames.COMPRESSION_ALGORITHM, false, z36, z37, false, false, null, 64, null);
            boolean z38 = true;
            USBankAccount = new Type("USBankAccount", 34, "us_bank_account", true, z37, true, z38, true, null, 64, null);
            boolean z39 = false;
            CashAppPay = new Type("CashAppPay", 35, "cashapp", false, false, true, false, false, new AfterRedirectAction.Refresh(i, i2, defaultConstructorMarker));
            Boleto = new Type("Boleto", 36, "boleto", false, z38, false, z39, true, 0 == true ? 1 : 0, 64, null);
            boolean z40 = false;
            Konbini = new Type("Konbini", 37, "konbini", false, true, z39, z40, true, null, 64, null);
            Swish = new Type("Swish", 38, "swish", false, false, false, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            Twint = new Type("Twint", 39, "twint", false, false, false, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            ShopPay = new Type("ShopPay", 40, "shop_pay", z40, false, false, false, false, afterRedirectAction, i3, defaultConstructorMarker2);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            INSTANCE = new Companion(defaultConstructorMarker);
            CREATOR = new Creator();
        }

        /* renamed from: hasDelayedSettlement, reason: from getter */
        public final boolean getHasDelayedSettlement() {
            return this.hasDelayedSettlement;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/PaymentMethod$Type;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Type fromCode(String code) {
                Type next;
                Iterator<Type> it = Type.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "Landroid/os/Parcelable;", "shouldRefresh", "", "getShouldRefresh", "()Z", "retryCount", "", "getRetryCount", "()I", "None", "Poll", "Refresh", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AfterRedirectAction extends Parcelable {
        int getRetryCount();

        boolean getShouldRefresh();

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\nJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "<init>", "()V", "shouldRefresh", "", "getShouldRefresh$annotations", "getShouldRefresh", "()Z", "retryCount", "", "getRetryCount$annotations", "getRetryCount", "()I", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class None implements AfterRedirectAction {
            private static final boolean shouldRefresh = false;
            public static final None INSTANCE = new None();
            private static final int retryCount = 5;
            public static final Parcelable.Creator<None> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            public static /* synthetic */ void getRetryCount$annotations() {
            }

            public static /* synthetic */ void getShouldRefresh$annotations() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof None)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private None() {
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return shouldRefresh;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return retryCount;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "retryCount", "", "<init>", "(I)V", "getRetryCount", "()I", "shouldRefresh", "", "getShouldRefresh$annotations", "()V", "getShouldRefresh", "()Z", "component1", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Poll implements AfterRedirectAction {
            private final int retryCount;
            private final boolean shouldRefresh;
            public static final Parcelable.Creator<Poll> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Poll> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Poll createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Poll(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Poll[] newArray(int i) {
                    return new Poll[i];
                }
            }

            public Poll() {
                this(0, 1, null);
            }

            public static /* synthetic */ Poll copy$default(Poll poll, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = poll.retryCount;
                }
                return poll.copy(i);
            }

            public static /* synthetic */ void getShouldRefresh$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getRetryCount() {
                return this.retryCount;
            }

            public final Poll copy(int retryCount) {
                return new Poll(retryCount);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Poll) && this.retryCount == ((Poll) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Poll(retryCount=" + this.retryCount + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.retryCount);
            }

            public Poll(int i) {
                this.retryCount = i;
                this.shouldRefresh = true;
            }

            public /* synthetic */ Poll(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 5 : i);
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "retryCount", "", "<init>", "(I)V", "getRetryCount", "()I", "shouldRefresh", "", "getShouldRefresh$annotations", "()V", "getShouldRefresh", "()Z", "component1", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Refresh implements AfterRedirectAction {
            private final int retryCount;
            private final boolean shouldRefresh;
            public static final Parcelable.Creator<Refresh> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Refresh> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Refresh createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Refresh(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Refresh[] newArray(int i) {
                    return new Refresh[i];
                }
            }

            public Refresh() {
                this(0, 1, null);
            }

            public static /* synthetic */ Refresh copy$default(Refresh refresh, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = refresh.retryCount;
                }
                return refresh.copy(i);
            }

            public static /* synthetic */ void getShouldRefresh$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getRetryCount() {
                return this.retryCount;
            }

            public final Refresh copy(int retryCount) {
                return new Refresh(retryCount);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Refresh) && this.retryCount == ((Refresh) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Refresh(retryCount=" + this.retryCount + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.retryCount);
            }

            public Refresh(int i) {
                this.retryCount = i;
                this.shouldRefresh = true;
            }

            public /* synthetic */ Refresh(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 1 : i);
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0015\u0010-\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u001c\u00100\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014J\u0010\u00101\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u00102\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u00103\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u00104\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u00105\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u00106\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0010\u00107\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u00108\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u00109\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010:\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010;\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010<\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010=\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u0010>\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010?\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010@\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0006\u0010A\u001a\u00020BR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Builder;", "", "<init>", "()V", "id", "", "created", "", "Ljava/lang/Long;", "liveMode", "", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "metadata", "", "customerId", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "setId", "setCreated", "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;", "setLiveMode", "setMetadata", "setType", "setBillingDetails", "setAllowRedisplay", "setCard", "setCardPresent", "setCustomerId", "setIdeal", "setFpx", "setSepaDebit", "setAuBecsDebit", "setBacsDebit", "setSofort", "setNetbanking", "setUSBankAccount", "setUpi", "setCode", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/PaymentMethod;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AllowRedisplay allowRedisplay;
        private AuBecsDebit auBecsDebit;
        private BacsDebit bacsDebit;
        private BillingDetails billingDetails;
        private Card card;
        private CardPresent cardPresent;
        private String code;
        private Long created;
        private String customerId;
        private Fpx fpx;
        private String id;
        private Ideal ideal;
        private boolean liveMode;
        private Map<String, String> metadata;
        private Netbanking netbanking;
        private SepaDebit sepaDebit;
        private Sofort sofort;
        private Type type;
        private Upi upi;
        private USBankAccount usBankAccount;

        public final Builder setId(String id) {
            this.id = id;
            return this;
        }

        public final Builder setCreated(Long created) {
            this.created = created;
            return this;
        }

        public final Builder setLiveMode(boolean liveMode) {
            this.liveMode = liveMode;
            return this;
        }

        public final Builder setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public final Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public final Builder setBillingDetails(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }

        public final Builder setAllowRedisplay(AllowRedisplay allowRedisplay) {
            this.allowRedisplay = allowRedisplay;
            return this;
        }

        public final Builder setCard(Card card) {
            this.card = card;
            return this;
        }

        public final Builder setCardPresent(CardPresent cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public final Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public final Builder setIdeal(Ideal ideal) {
            this.ideal = ideal;
            return this;
        }

        public final Builder setFpx(Fpx fpx) {
            this.fpx = fpx;
            return this;
        }

        public final Builder setSepaDebit(SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
        }

        public final Builder setAuBecsDebit(AuBecsDebit auBecsDebit) {
            this.auBecsDebit = auBecsDebit;
            return this;
        }

        public final Builder setBacsDebit(BacsDebit bacsDebit) {
            this.bacsDebit = bacsDebit;
            return this;
        }

        public final Builder setSofort(Sofort sofort) {
            this.sofort = sofort;
            return this;
        }

        public final Builder setNetbanking(Netbanking netbanking) {
            this.netbanking = netbanking;
            return this;
        }

        public final Builder setUSBankAccount(USBankAccount usBankAccount) {
            this.usBankAccount = usBankAccount;
            return this;
        }

        public final Builder setUpi(Upi upi) {
            this.upi = upi;
            return this;
        }

        public final Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public final PaymentMethod build() {
            String str = this.id;
            Long l = this.created;
            boolean z = this.liveMode;
            Type type = this.type;
            return new PaymentMethod(str, l, z, this.code, type, this.billingDetails, this.customerId, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, null, this.netbanking, this.usBankAccount, null, false, this.allowRedisplay, 819200, null);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B9\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "toParamMap", "", "", "isFilledOut", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingDetails implements StripeModel, StripeParamsModel {
        public static final int $stable = 0;
        public static final String PARAM_ADDRESS = "address";
        public static final String PARAM_EMAIL = "email";
        public static final String PARAM_NAME = "name";
        public static final String PARAM_PHONE = "phone";
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public BillingDetails(Address address) {
            this(address, null, null, null, 14, null);
        }

        public BillingDetails(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        public BillingDetails(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String email, String name, String phone) {
            return new BillingDetails(address, email, name, phone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Address address = this.address;
            if (address == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                address.writeToParcel(dest, flags);
            }
            dest.writeString(this.email);
            dest.writeString(this.name);
            dest.writeString(this.phone);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final Builder toBuilder() {
            return new Builder().setAddress(this.address).setEmail(this.email).setName(this.name).setPhone(this.phone);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            Address address = this.address;
            Map mapMapOf = address != null ? MapsKt.mapOf(TuplesKt.to("address", address.toParamMap())) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str = this.email;
            Map mapMapOf2 = str != null ? MapsKt.mapOf(TuplesKt.to("email", str)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf2);
            String str2 = this.name;
            Map mapMapOf3 = str2 != null ? MapsKt.mapOf(TuplesKt.to("name", str2)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
            String str3 = this.phone;
            Map mapMapOf4 = str3 != null ? MapsKt.mapOf(TuplesKt.to("phone", str3)) : null;
            if (mapMapOf4 == null) {
                mapMapOf4 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus3, mapMapOf4);
        }

        public final boolean isFilledOut() {
            Address address = this.address;
            return ((address == null || !address.isFilledOut$payments_core_release()) && this.email == null && this.name == null && this.phone == null) ? false : true;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "", "<init>", "()V", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "setAddress", "setEmail", "setName", "setPhone", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder setAddress(Address address) {
                this.address = address;
                return this;
            }

            public final Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public final Builder setName(String name) {
                this.name = name;
                return this;
            }

            public final Builder setPhone(String phone) {
                this.phone = phone;
                return this;
            }

            public final BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Companion;", "", "<init>", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "create", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final BillingDetails create(ShippingInformation shippingInformation) {
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), null, shippingInformation.getName(), shippingInformation.getPhone(), 2, null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0003\u001a\u00020\u00048G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "Lcom/stripe/android/core/model/StripeModel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "LIMITED", "ALWAYS", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AllowRedisplay implements StripeModel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AllowRedisplay[] $VALUES;
        public static final Parcelable.Creator<AllowRedisplay> CREATOR;
        private final String value;
        public static final AllowRedisplay UNSPECIFIED = new AllowRedisplay("UNSPECIFIED", 0, BuildConfig.VERSION_NAME);
        public static final AllowRedisplay LIMITED = new AllowRedisplay("LIMITED", 1, "limited");
        public static final AllowRedisplay ALWAYS = new AllowRedisplay("ALWAYS", 2, "always");

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AllowRedisplay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowRedisplay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AllowRedisplay.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowRedisplay[] newArray(int i) {
                return new AllowRedisplay[i];
            }
        }

        private static final /* synthetic */ AllowRedisplay[] $values() {
            return new AllowRedisplay[]{UNSPECIFIED, LIMITED, ALWAYS};
        }

        public static EnumEntries<AllowRedisplay> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }

        private AllowRedisplay(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            AllowRedisplay[] allowRedisplayArr$values = $values();
            $VALUES = allowRedisplayArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(allowRedisplayArr$values);
            CREATOR = new Creator();
        }

        public static AllowRedisplay valueOf(String str) {
            return (AllowRedisplay) Enum.valueOf(AllowRedisplay.class, str);
        }

        public static AllowRedisplay[] values() {
            return (AllowRedisplay[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/core/model/StripeModel;", "<init>", "()V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class TypeData implements StripeModel {
        public static final int $stable = 0;

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Type getType();

        private TypeData() {
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003789B\u0097\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u009c\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\tJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006:"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "brand", "Lcom/stripe/android/model/CardBrand;", "checks", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "country", "", "expiryMonth", "", "expiryYear", BankAccountJsonParser.FIELD_FINGERPRINT, "funding", "last4", "threeDSecureUsage", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "wallet", "Lcom/stripe/android/model/wallets/Wallet;", "networks", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "displayBrand", "<init>", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;)V", "Ljava/lang/Integer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Card;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Checks", "ThreeDSecureUsage", "Networks", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends TypeData {
        public final CardBrand brand;
        public final Checks checks;
        public final String country;
        public final String displayBrand;
        public final Integer expiryMonth;
        public final Integer expiryYear;
        public final String fingerprint;
        public final String funding;
        public final String last4;
        public final Networks networks;
        public final ThreeDSecureUsage threeDSecureUsage;
        public final Wallet wallet;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (Wallet) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        public static /* synthetic */ Card copy$default(Card card, CardBrand cardBrand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                cardBrand = card.brand;
            }
            if ((i & 2) != 0) {
                checks = card.checks;
            }
            if ((i & 4) != 0) {
                str = card.country;
            }
            if ((i & 8) != 0) {
                num = card.expiryMonth;
            }
            if ((i & 16) != 0) {
                num2 = card.expiryYear;
            }
            if ((i & 32) != 0) {
                str2 = card.fingerprint;
            }
            if ((i & 64) != 0) {
                str3 = card.funding;
            }
            if ((i & 128) != 0) {
                str4 = card.last4;
            }
            if ((i & 256) != 0) {
                threeDSecureUsage = card.threeDSecureUsage;
            }
            if ((i & 512) != 0) {
                wallet = card.wallet;
            }
            if ((i & 1024) != 0) {
                networks = card.networks;
            }
            if ((i & 2048) != 0) {
                str5 = card.displayBrand;
            }
            Networks networks2 = networks;
            String str6 = str5;
            ThreeDSecureUsage threeDSecureUsage2 = threeDSecureUsage;
            Wallet wallet2 = wallet;
            String str7 = str3;
            String str8 = str4;
            Integer num3 = num2;
            String str9 = str2;
            return card.copy(cardBrand, checks, str, num, num3, str9, str7, str8, threeDSecureUsage2, wallet2, networks2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component10, reason: from getter */
        public final Wallet getWallet() {
            return this.wallet;
        }

        /* renamed from: component11, reason: from getter */
        public final Networks getNetworks() {
            return this.networks;
        }

        /* renamed from: component12, reason: from getter */
        public final String getDisplayBrand() {
            return this.displayBrand;
        }

        /* renamed from: component2, reason: from getter */
        public final Checks getChecks() {
            return this.checks;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFunding() {
            return this.funding;
        }

        /* renamed from: component8, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component9, reason: from getter */
        public final ThreeDSecureUsage getThreeDSecureUsage() {
            return this.threeDSecureUsage;
        }

        public final Card copy(CardBrand brand, Checks checks, String country, Integer expiryMonth, Integer expiryYear, String fingerprint, String funding, String last4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, String displayBrand) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            return new Card(brand, checks, country, expiryMonth, expiryYear, fingerprint, funding, last4, threeDSecureUsage, wallet, networks, displayBrand);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return this.brand == card.brand && Intrinsics.areEqual(this.checks, card.checks) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.funding, card.funding) && Intrinsics.areEqual(this.last4, card.last4) && Intrinsics.areEqual(this.threeDSecureUsage, card.threeDSecureUsage) && Intrinsics.areEqual(this.wallet, card.wallet) && Intrinsics.areEqual(this.networks, card.networks) && Intrinsics.areEqual(this.displayBrand, card.displayBrand);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int iHashCode2 = (iHashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int iHashCode9 = (iHashCode8 + (threeDSecureUsage == null ? 0 : threeDSecureUsage.hashCode())) * 31;
            Wallet wallet = this.wallet;
            int iHashCode10 = (iHashCode9 + (wallet == null ? 0 : wallet.hashCode())) * 31;
            Networks networks = this.networks;
            int iHashCode11 = (iHashCode10 + (networks == null ? 0 : networks.hashCode())) * 31;
            String str5 = this.displayBrand;
            return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.brand + ", checks=" + this.checks + ", country=" + this.country + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", fingerprint=" + this.fingerprint + ", funding=" + this.funding + ", last4=" + this.last4 + ", threeDSecureUsage=" + this.threeDSecureUsage + ", wallet=" + this.wallet + ", networks=" + this.networks + ", displayBrand=" + this.displayBrand + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                checks.writeToParcel(dest, flags);
            }
            dest.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.fingerprint);
            dest.writeString(this.funding);
            dest.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                threeDSecureUsage.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.wallet, flags);
            Networks networks = this.networks;
            if (networks == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                networks.writeToParcel(dest, flags);
            }
            dest.writeString(this.displayBrand);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Card(com.stripe.android.model.CardBrand r2, com.stripe.android.model.PaymentMethod.Card.Checks r3, java.lang.String r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage r10, com.stripe.android.model.wallets.Wallet r11, com.stripe.android.model.PaymentMethod.Card.Networks r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r1 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                com.stripe.android.model.CardBrand r2 = com.stripe.android.model.CardBrand.Unknown
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r3 = r0
            Lc:
                r15 = r14 & 4
                if (r15 == 0) goto L11
                r4 = r0
            L11:
                r15 = r14 & 8
                if (r15 == 0) goto L16
                r5 = r0
            L16:
                r15 = r14 & 16
                if (r15 == 0) goto L1b
                r6 = r0
            L1b:
                r15 = r14 & 32
                if (r15 == 0) goto L20
                r7 = r0
            L20:
                r15 = r14 & 64
                if (r15 == 0) goto L25
                r8 = r0
            L25:
                r15 = r14 & 128(0x80, float:1.8E-43)
                if (r15 == 0) goto L2a
                r9 = r0
            L2a:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L2f
                r10 = r0
            L2f:
                r15 = r14 & 512(0x200, float:7.17E-43)
                if (r15 == 0) goto L34
                r11 = r0
            L34:
                r15 = r14 & 1024(0x400, float:1.435E-42)
                if (r15 == 0) goto L39
                r12 = r0
            L39:
                r14 = r14 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L4b
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L58
            L4b:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L58:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethod.Card.<init>(com.stripe.android.model.CardBrand, com.stripe.android.model.PaymentMethod$Card$Checks, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.PaymentMethod$Card$ThreeDSecureUsage, com.stripe.android.model.wallets.Wallet, com.stripe.android.model.PaymentMethod$Card$Networks, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.brand = brand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = wallet;
            this.networks = networks;
            this.displayBrand = str5;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Card;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lcom/stripe/android/core/model/StripeModel;", "addressLine1Check", "", "addressPostalCodeCheck", "cvcCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Checks implements StripeModel {
            public final String addressLine1Check;
            public final String addressPostalCodeCheck;
            public final String cvcCheck;
            public static final Parcelable.Creator<Checks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Checks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks[] newArray(int i) {
                    return new Checks[i];
                }
            }

            public static /* synthetic */ Checks copy$default(Checks checks, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checks.addressLine1Check;
                }
                if ((i & 2) != 0) {
                    str2 = checks.addressPostalCodeCheck;
                }
                if ((i & 4) != 0) {
                    str3 = checks.cvcCheck;
                }
                return checks.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAddressLine1Check() {
                return this.addressLine1Check;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAddressPostalCodeCheck() {
                return this.addressPostalCodeCheck;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCvcCheck() {
                return this.cvcCheck;
            }

            public final Checks copy(String addressLine1Check, String addressPostalCodeCheck, String cvcCheck) {
                return new Checks(addressLine1Check, addressPostalCodeCheck, cvcCheck);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checks)) {
                    return false;
                }
                Checks checks = (Checks) other;
                return Intrinsics.areEqual(this.addressLine1Check, checks.addressLine1Check) && Intrinsics.areEqual(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && Intrinsics.areEqual(this.cvcCheck, checks.cvcCheck);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.addressLine1Check;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.addressLine1Check + ", addressPostalCodeCheck=" + this.addressPostalCodeCheck + ", cvcCheck=" + this.cvcCheck + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.addressLine1Check);
                dest.writeString(this.addressPostalCodeCheck);
                dest.writeString(this.cvcCheck);
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/core/model/StripeModel;", "isSupported", "", "<init>", "(Z)V", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ThreeDSecureUsage implements StripeModel {
            public final boolean isSupported;
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ThreeDSecureUsage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage[] newArray(int i) {
                    return new ThreeDSecureUsage[i];
                }
            }

            public static /* synthetic */ ThreeDSecureUsage copy$default(ThreeDSecureUsage threeDSecureUsage, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = threeDSecureUsage.isSupported;
                }
                return threeDSecureUsage.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSupported() {
                return this.isSupported;
            }

            public final ThreeDSecureUsage copy(boolean isSupported) {
                return new ThreeDSecureUsage(isSupported);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) other).isSupported;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return Boolean.hashCode(this.isSupported);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.isSupported + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSupported ? 1 : 0);
            }

            public ThreeDSecureUsage(boolean z) {
                this.isSupported = z;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/core/model/StripeModel;", "available", "", "", "selectionMandatory", "", PaymentMethodCreateParams.Card.Networks.PARAM_PREFERRED, "<init>", "(Ljava/util/Set;ZLjava/lang/String;)V", "getAvailable", "()Ljava/util/Set;", "getSelectionMandatory$annotations", "()V", "getSelectionMandatory", "()Z", "getPreferred", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Networks implements StripeModel {
            private final Set<String> available;
            private final String preferred;
            private final boolean selectionMandatory;
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Networks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            public Networks() {
                this(null, false, null, 7, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Networks copy$default(Networks networks, Set set, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = networks.available;
                }
                if ((i & 2) != 0) {
                    z = networks.selectionMandatory;
                }
                if ((i & 4) != 0) {
                    str = networks.preferred;
                }
                return networks.copy(set, z, str);
            }

            @Deprecated(message = "This field is deprecated and will be removed in a future release.")
            public static /* synthetic */ void getSelectionMandatory$annotations() {
            }

            public final Set<String> component1() {
                return this.available;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getSelectionMandatory() {
                return this.selectionMandatory;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPreferred() {
                return this.preferred;
            }

            public final Networks copy(Set<String> available, boolean selectionMandatory, String preferred) {
                Intrinsics.checkNotNullParameter(available, "available");
                return new Networks(available, selectionMandatory, preferred);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Networks)) {
                    return false;
                }
                Networks networks = (Networks) other;
                return Intrinsics.areEqual(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && Intrinsics.areEqual(this.preferred, networks.preferred);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int iHashCode = ((this.available.hashCode() * 31) + Boolean.hashCode(this.selectionMandatory)) * 31;
                String str = this.preferred;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.available + ", selectionMandatory=" + this.selectionMandatory + ", preferred=" + this.preferred + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Set<String> set = this.available;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
                dest.writeInt(this.selectionMandatory ? 1 : 0);
                dest.writeString(this.preferred);
            }

            public Networks(Set<String> available, boolean z, String str) {
                Intrinsics.checkNotNullParameter(available, "available");
                this.available = available;
                this.selectionMandatory = z;
                this.preferred = str;
            }

            public /* synthetic */ Networks(Set set, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
            }

            public final Set<String> getAvailable() {
                return this.available;
            }

            public final boolean getSelectionMandatory() {
                return this.selectionMandatory;
            }

            public final String getPreferred() {
                return this.preferred;
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0013\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0018\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "ignore", "", "<init>", "(Z)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "copy$payments_core_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardPresent extends TypeData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final /* synthetic */ CardPresent EMPTY;
        private final boolean ignore;
        public static final Parcelable.Creator<CardPresent> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardPresent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPresent(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent[] newArray(int i) {
                return new CardPresent[i];
            }
        }

        public CardPresent() {
            this(false, 1, null);
        }

        /* renamed from: component1, reason: from getter */
        private final boolean getIgnore() {
            return this.ignore;
        }

        public static /* synthetic */ CardPresent copy$payments_core_release$default(CardPresent cardPresent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cardPresent.ignore;
            }
            return cardPresent.copy$payments_core_release(z);
        }

        public final CardPresent copy$payments_core_release(boolean ignore) {
            return new CardPresent(ignore);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardPresent) && this.ignore == ((CardPresent) other).ignore;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return Boolean.hashCode(this.ignore);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.ignore + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.ignore ? 1 : 0);
        }

        public /* synthetic */ CardPresent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public CardPresent(boolean z) {
            super(null);
            this.ignore = z;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.CardPresent;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "getEMPTY$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CardPresent getEMPTY$payments_core_release() {
                return CardPresent.EMPTY;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            INSTANCE = new Companion(defaultConstructorMarker);
            EMPTY = new CardPresent(false, 1, defaultConstructorMarker);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "bankIdentifierCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ideal extends TypeData {
        public final String bank;
        public final String bankIdentifierCode;
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ideal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        public static /* synthetic */ Ideal copy$payments_core_release$default(Ideal ideal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideal.bank;
            }
            if ((i & 2) != 0) {
                str2 = ideal.bankIdentifierCode;
            }
            return ideal.copy$payments_core_release(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBank() {
            return this.bank;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBankIdentifierCode() {
            return this.bankIdentifierCode;
        }

        public final Ideal copy$payments_core_release(String bank, String bankIdentifierCode) {
            return new Ideal(bank, bankIdentifierCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ideal)) {
                return false;
            }
            Ideal ideal = (Ideal) other;
            return Intrinsics.areEqual(this.bank, ideal.bank) && Intrinsics.areEqual(this.bankIdentifierCode, ideal.bankIdentifierCode);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.bank + ", bankIdentifierCode=" + this.bankIdentifierCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bank);
            dest.writeString(this.bankIdentifierCode);
        }

        public Ideal(String str, String str2) {
            super(null);
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Ideal;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "accountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fpx extends TypeData {
        public final String accountHolderType;
        public final String bank;
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Fpx> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        public static /* synthetic */ Fpx copy$payments_core_release$default(Fpx fpx, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fpx.bank;
            }
            if ((i & 2) != 0) {
                str2 = fpx.accountHolderType;
            }
            return fpx.copy$payments_core_release(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBank() {
            return this.bank;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountHolderType() {
            return this.accountHolderType;
        }

        public final Fpx copy$payments_core_release(String bank, String accountHolderType) {
            return new Fpx(bank, accountHolderType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fpx)) {
                return false;
            }
            Fpx fpx = (Fpx) other;
            return Intrinsics.areEqual(this.bank, fpx.bank) && Intrinsics.areEqual(this.accountHolderType, fpx.accountHolderType);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.bank + ", accountHolderType=" + this.accountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bank);
            dest.writeString(this.accountHolderType);
        }

        public Fpx(String str, String str2) {
            super(null);
            this.bank = str;
            this.accountHolderType = str2;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Fpx;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bankCode", "", "branchCode", "country", BankAccountJsonParser.FIELD_FINGERPRINT, "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SepaDebit extends TypeData {
        public final String bankCode;
        public final String branchCode;
        public final String country;
        public final String fingerprint;
        public final String last4;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerprint;
            }
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            String str6 = str5;
            String str7 = str3;
            return sepaDebit.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBranchCode() {
            return this.branchCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public final SepaDebit copy(String bankCode, String branchCode, String country, String fingerprint, String last4) {
            return new SepaDebit(bankCode, branchCode, country, fingerprint, last4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) other;
            return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerprint, sepaDebit.fingerprint) && Intrinsics.areEqual(this.last4, sepaDebit.last4);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.bankCode + ", branchCode=" + this.branchCode + ", country=" + this.country + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bankCode);
            dest.writeString(this.branchCode);
            dest.writeString(this.country);
            dest.writeString(this.fingerprint);
            dest.writeString(this.last4);
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.SepaDebit;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bsbNumber", "", BankAccountJsonParser.FIELD_FINGERPRINT, "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuBecsDebit extends TypeData {
        public final String bsbNumber;
        public final String fingerprint;
        public final String last4;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i & 2) != 0) {
                str2 = auBecsDebit.fingerprint;
            }
            if ((i & 4) != 0) {
                str3 = auBecsDebit.last4;
            }
            return auBecsDebit.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBsbNumber() {
            return this.bsbNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public final AuBecsDebit copy(String bsbNumber, String fingerprint, String last4) {
            return new AuBecsDebit(bsbNumber, fingerprint, last4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) other;
            return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.fingerprint, auBecsDebit.fingerprint) && Intrinsics.areEqual(this.last4, auBecsDebit.last4);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bsbNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bsbNumber);
            dest.writeString(this.fingerprint);
            dest.writeString(this.last4);
        }

        public AuBecsDebit(String str, String str2, String str3) {
            super(null);
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.AuBecsDebit;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", BankAccountJsonParser.FIELD_FINGERPRINT, "", "last4", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BacsDebit extends TypeData {
        public final String fingerprint;
        public final String last4;
        public final String sortCode;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bacsDebit.fingerprint;
            }
            if ((i & 2) != 0) {
                str2 = bacsDebit.last4;
            }
            if ((i & 4) != 0) {
                str3 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        public final BacsDebit copy(String fingerprint, String last4, String sortCode) {
            return new BacsDebit(fingerprint, last4, sortCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) other;
            return Intrinsics.areEqual(this.fingerprint, bacsDebit.fingerprint) && Intrinsics.areEqual(this.last4, bacsDebit.last4) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.fingerprint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", sortCode=" + this.sortCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fingerprint);
            dest.writeString(this.last4);
            dest.writeString(this.sortCode);
        }

        public BacsDebit(String str, String str2, String str3) {
            super(null);
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.BacsDebit;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "country", "", "<init>", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Sofort extends TypeData {
        public final String country;
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Sofort> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i) {
                return new Sofort[i];
            }
        }

        public static /* synthetic */ Sofort copy$payments_core_release$default(Sofort sofort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy$payments_core_release(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final Sofort copy$payments_core_release(String country) {
            return new Sofort(country);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sofort) && Intrinsics.areEqual(this.country, ((Sofort) other).country);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.country);
        }

        public Sofort(String str) {
            super(null);
            this.country = str;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Sofort;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "vpa", "", "<init>", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Upi extends TypeData {
        public final String vpa;
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Upi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i) {
                return new Upi[i];
            }
        }

        public static /* synthetic */ Upi copy$payments_core_release$default(Upi upi, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy$payments_core_release(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVpa() {
            return this.vpa;
        }

        public final Upi copy$payments_core_release(String vpa) {
            return new Upi(vpa);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Upi) && Intrinsics.areEqual(this.vpa, ((Upi) other).vpa);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.vpa + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.vpa);
        }

        public Upi(String str) {
            super(null);
            this.vpa = str;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Upi;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "<init>", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Netbanking extends TypeData {
        public final String bank;
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
            }
        }

        public static /* synthetic */ Netbanking copy$payments_core_release$default(Netbanking netbanking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy$payments_core_release(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBank() {
            return this.bank;
        }

        public final Netbanking copy$payments_core_release(String bank) {
            return new Netbanking(bank);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) other).bank);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bank);
        }

        public Netbanking(String str) {
            super(null);
            this.bank = str;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Netbanking;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,BU\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003Je\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "accountHolderType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "accountType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "bankName", "", BankAccountJsonParser.FIELD_FINGERPRINT, "last4", "financialConnectionsAccount", "networks", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "routingNumber", "<init>", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "USBankAccountHolderType", "USBankAccountType", "USBankNetworks", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccount extends TypeData {
        public final USBankAccountHolderType accountHolderType;
        public final USBankAccountType accountType;
        public final String bankName;
        public final String financialConnectionsAccount;
        public final String fingerprint;
        public final String last4;
        public final USBankNetworks networks;
        public final String routingNumber;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(USBankAccountHolderType.CREATOR.createFromParcel(parcel), USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, USBankAccountHolderType uSBankAccountHolderType, USBankAccountType uSBankAccountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                uSBankAccountHolderType = uSBankAccount.accountHolderType;
            }
            if ((i & 2) != 0) {
                uSBankAccountType = uSBankAccount.accountType;
            }
            if ((i & 4) != 0) {
                str = uSBankAccount.bankName;
            }
            if ((i & 8) != 0) {
                str2 = uSBankAccount.fingerprint;
            }
            if ((i & 16) != 0) {
                str3 = uSBankAccount.last4;
            }
            if ((i & 32) != 0) {
                str4 = uSBankAccount.financialConnectionsAccount;
            }
            if ((i & 64) != 0) {
                uSBankNetworks = uSBankAccount.networks;
            }
            if ((i & 128) != 0) {
                str5 = uSBankAccount.routingNumber;
            }
            USBankNetworks uSBankNetworks2 = uSBankNetworks;
            String str6 = str5;
            String str7 = str3;
            String str8 = str4;
            return uSBankAccount.copy(uSBankAccountHolderType, uSBankAccountType, str, str2, str7, str8, uSBankNetworks2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final USBankAccountHolderType getAccountHolderType() {
            return this.accountHolderType;
        }

        /* renamed from: component2, reason: from getter */
        public final USBankAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFinancialConnectionsAccount() {
            return this.financialConnectionsAccount;
        }

        /* renamed from: component7, reason: from getter */
        public final USBankNetworks getNetworks() {
            return this.networks;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final USBankAccount copy(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String bankName, String fingerprint, String last4, String financialConnectionsAccount, USBankNetworks networks, String routingNumber) {
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new USBankAccount(accountHolderType, accountType, bankName, fingerprint, last4, financialConnectionsAccount, networks, routingNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && Intrinsics.areEqual(this.bankName, uSBankAccount.bankName) && Intrinsics.areEqual(this.fingerprint, uSBankAccount.fingerprint) && Intrinsics.areEqual(this.last4, uSBankAccount.last4) && Intrinsics.areEqual(this.financialConnectionsAccount, uSBankAccount.financialConnectionsAccount) && Intrinsics.areEqual(this.networks, uSBankAccount.networks) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = ((this.accountHolderType.hashCode() * 31) + this.accountType.hashCode()) * 31;
            String str = this.bankName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.financialConnectionsAccount;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int iHashCode6 = (iHashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.accountHolderType + ", accountType=" + this.accountType + ", bankName=" + this.bankName + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", financialConnectionsAccount=" + this.financialConnectionsAccount + ", networks=" + this.networks + ", routingNumber=" + this.routingNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.accountHolderType.writeToParcel(dest, flags);
            this.accountType.writeToParcel(dest, flags);
            dest.writeString(this.bankName);
            dest.writeString(this.fingerprint);
            dest.writeString(this.last4);
            dest.writeString(this.financialConnectionsAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uSBankNetworks.writeToParcel(dest, flags);
            }
            dest.writeString(this.routingNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountHolderType = accountHolderType;
            this.accountType = accountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.financialConnectionsAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.USBankAccount;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "Lcom/stripe/android/core/model/StripeModel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "INDIVIDUAL", "COMPANY", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class USBankAccountHolderType implements StripeModel {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ USBankAccountHolderType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountHolderType> CREATOR;
            private final String value;
            public static final USBankAccountHolderType UNKNOWN = new USBankAccountHolderType("UNKNOWN", 0, "unknown");
            public static final USBankAccountHolderType INDIVIDUAL = new USBankAccountHolderType("INDIVIDUAL", 1, "individual");
            public static final USBankAccountHolderType COMPANY = new USBankAccountHolderType("COMPANY", 2, "company");

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankAccountHolderType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountHolderType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType[] newArray(int i) {
                    return new USBankAccountHolderType[i];
                }
            }

            private static final /* synthetic */ USBankAccountHolderType[] $values() {
                return new USBankAccountHolderType[]{UNKNOWN, INDIVIDUAL, COMPANY};
            }

            public static EnumEntries<USBankAccountHolderType> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }

            private USBankAccountHolderType(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                USBankAccountHolderType[] uSBankAccountHolderTypeArr$values = $values();
                $VALUES = uSBankAccountHolderTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(uSBankAccountHolderTypeArr$values);
                CREATOR = new Creator();
            }

            public static USBankAccountHolderType valueOf(String str) {
                return (USBankAccountHolderType) Enum.valueOf(USBankAccountHolderType.class, str);
            }

            public static USBankAccountHolderType[] values() {
                return (USBankAccountHolderType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "Lcom/stripe/android/core/model/StripeModel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "CHECKING", "SAVINGS", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class USBankAccountType implements StripeModel {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ USBankAccountType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountType> CREATOR;
            private final String value;
            public static final USBankAccountType UNKNOWN = new USBankAccountType("UNKNOWN", 0, "unknown");
            public static final USBankAccountType CHECKING = new USBankAccountType("CHECKING", 1, "checking");
            public static final USBankAccountType SAVINGS = new USBankAccountType("SAVINGS", 2, "savings");

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankAccountType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType[] newArray(int i) {
                    return new USBankAccountType[i];
                }
            }

            private static final /* synthetic */ USBankAccountType[] $values() {
                return new USBankAccountType[]{UNKNOWN, CHECKING, SAVINGS};
            }

            public static EnumEntries<USBankAccountType> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }

            private USBankAccountType(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                USBankAccountType[] uSBankAccountTypeArr$values = $values();
                $VALUES = uSBankAccountTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(uSBankAccountTypeArr$values);
                CREATOR = new Creator();
            }

            public static USBankAccountType valueOf(String str) {
                return (USBankAccountType) Enum.valueOf(USBankAccountType.class, str);
            }

            public static USBankAccountType[] values() {
                return (USBankAccountType[]) $VALUES.clone();
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "Lcom/stripe/android/core/model/StripeModel;", PaymentMethodCreateParams.Card.Networks.PARAM_PREFERRED, "", "supported", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPreferred", "()Ljava/lang/String;", "getSupported", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class USBankNetworks implements StripeModel {
            private final String preferred;
            private final List<String> supported;
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethod.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankNetworks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks[] newArray(int i) {
                    return new USBankNetworks[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ USBankNetworks copy$default(USBankNetworks uSBankNetworks, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = uSBankNetworks.preferred;
                }
                if ((i & 2) != 0) {
                    list = uSBankNetworks.supported;
                }
                return uSBankNetworks.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPreferred() {
                return this.preferred;
            }

            public final List<String> component2() {
                return this.supported;
            }

            public final USBankNetworks copy(String preferred, List<String> supported) {
                Intrinsics.checkNotNullParameter(supported, "supported");
                return new USBankNetworks(preferred, supported);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof USBankNetworks)) {
                    return false;
                }
                USBankNetworks uSBankNetworks = (USBankNetworks) other;
                return Intrinsics.areEqual(this.preferred, uSBankNetworks.preferred) && Intrinsics.areEqual(this.supported, uSBankNetworks.supported);
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.preferred;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.supported.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.preferred + ", supported=" + this.supported + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.preferred);
                dest.writeStringList(this.supported);
            }

            public USBankNetworks(String str, List<String> supported) {
                Intrinsics.checkNotNullParameter(supported, "supported");
                this.preferred = str;
                this.supported = supported;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final List<String> getSupported() {
                return this.supported;
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Companion;", "", "<init>", "()V", "fromJson", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lorg/json/JSONObject;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentMethod fromJson(JSONObject paymentMethod) {
            if (paymentMethod != null) {
                return new PaymentMethodJsonParser().parse(paymentMethod);
            }
            return null;
        }
    }
}
