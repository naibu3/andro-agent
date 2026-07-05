package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.view.ActivityStarter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionContract extends ActivityResultContract<Args, PaymentOptionsActivityResult> {
    public static final int $stable = 0;
    public static final String EXTRA_ARGS = "extra_activity_args";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PaymentOptionsActivityResult parseResult(int resultCode, Intent intent) {
        return PaymentOptionsActivityResult.INSTANCE.fromIntent$paymentsheet_release(intent);
    }

    /* compiled from: PaymentOptionContract.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00015BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J[\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u000fHÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", NamedConstantsKt.ENABLE_LOGGING, "", "walletsToShow", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "", "paymentElementCallbackIdentifier", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/link/LinkAccountUpdate$Value;ZLjava/util/List;Ljava/util/Set;Ljava/lang/String;)V", "getState", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "getConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getLinkAccountInfo", "()Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getEnableLogging", "()Z", "getWalletsToShow", "()Ljava/util/List;", "getProductUsage", "()Ljava/util/Set;", "getPaymentElementCallbackIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements ActivityStarter.Args {
        private final PaymentSheet.Configuration configuration;
        private final boolean enableLogging;
        private final LinkAccountUpdate.Value linkAccountInfo;
        private final String paymentElementCallbackIdentifier;
        private final Set<String> productUsage;
        private final PaymentSheetState.Full state;
        private final List<WalletType> walletsToShow;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentOptionContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSheetState.Full fullCreateFromParcel = PaymentSheetState.Full.CREATOR.createFromParcel(parcel);
                PaymentSheet.Configuration configurationCreateFromParcel = PaymentSheet.Configuration.CREATOR.createFromParcel(parcel);
                LinkAccountUpdate.Value valueCreateFromParcel = LinkAccountUpdate.Value.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(WalletType.valueOf(parcel.readString()));
                }
                ArrayList arrayList2 = arrayList;
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(fullCreateFromParcel, configurationCreateFromParcel, valueCreateFromParcel, z, arrayList2, linkedHashSet, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentSheetState.Full full, PaymentSheet.Configuration configuration, LinkAccountUpdate.Value value, boolean z, List list, Set set, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                full = args.state;
            }
            if ((i & 2) != 0) {
                configuration = args.configuration;
            }
            if ((i & 4) != 0) {
                value = args.linkAccountInfo;
            }
            if ((i & 8) != 0) {
                z = args.enableLogging;
            }
            if ((i & 16) != 0) {
                list = args.walletsToShow;
            }
            if ((i & 32) != 0) {
                set = args.productUsage;
            }
            if ((i & 64) != 0) {
                str = args.paymentElementCallbackIdentifier;
            }
            Set set2 = set;
            String str2 = str;
            List list2 = list;
            LinkAccountUpdate.Value value2 = value;
            return args.copy(full, configuration, value2, z, list2, set2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheetState.Full getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final List<WalletType> component5() {
            return this.walletsToShow;
        }

        public final Set<String> component6() {
            return this.productUsage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPaymentElementCallbackIdentifier() {
            return this.paymentElementCallbackIdentifier;
        }

        public final Args copy(PaymentSheetState.Full state, PaymentSheet.Configuration configuration, LinkAccountUpdate.Value linkAccountInfo, boolean enableLogging, List<? extends WalletType> walletsToShow, Set<String> productUsage, String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            Intrinsics.checkNotNullParameter(walletsToShow, "walletsToShow");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            return new Args(state, configuration, linkAccountInfo, enableLogging, walletsToShow, productUsage, paymentElementCallbackIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.state, args.state) && Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.linkAccountInfo, args.linkAccountInfo) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.walletsToShow, args.walletsToShow) && Intrinsics.areEqual(this.productUsage, args.productUsage) && Intrinsics.areEqual(this.paymentElementCallbackIdentifier, args.paymentElementCallbackIdentifier);
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.configuration.hashCode()) * 31) + this.linkAccountInfo.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.walletsToShow.hashCode()) * 31) + this.productUsage.hashCode()) * 31) + this.paymentElementCallbackIdentifier.hashCode();
        }

        public String toString() {
            return "Args(state=" + this.state + ", configuration=" + this.configuration + ", linkAccountInfo=" + this.linkAccountInfo + ", enableLogging=" + this.enableLogging + ", walletsToShow=" + this.walletsToShow + ", productUsage=" + this.productUsage + ", paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.state.writeToParcel(dest, flags);
            this.configuration.writeToParcel(dest, flags);
            this.linkAccountInfo.writeToParcel(dest, flags);
            dest.writeInt(this.enableLogging ? 1 : 0);
            List<WalletType> list = this.walletsToShow;
            dest.writeInt(list.size());
            Iterator<WalletType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            Set<String> set = this.productUsage;
            dest.writeInt(set.size());
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next());
            }
            dest.writeString(this.paymentElementCallbackIdentifier);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(PaymentSheetState.Full state, PaymentSheet.Configuration configuration, LinkAccountUpdate.Value linkAccountInfo, boolean z, List<? extends WalletType> walletsToShow, Set<String> productUsage, String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            Intrinsics.checkNotNullParameter(walletsToShow, "walletsToShow");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            this.state = state;
            this.configuration = configuration;
            this.linkAccountInfo = linkAccountInfo;
            this.enableLogging = z;
            this.walletsToShow = walletsToShow;
            this.productUsage = productUsage;
            this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        }

        public final PaymentSheetState.Full getState() {
            return this.state;
        }

        public final PaymentSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final List<WalletType> getWalletsToShow() {
            return this.walletsToShow;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final String getPaymentElementCallbackIdentifier() {
            return this.paymentElementCallbackIdentifier;
        }

        /* compiled from: PaymentOptionContract.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }
        }
    }
}
