package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeChatPayNextAction.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/WeChatPayNextAction;", "Lcom/stripe/android/core/model/StripeModel;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "weChat", "Lcom/stripe/android/model/WeChat;", "<init>", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/WeChat;)V", "getPaymentIntent", "()Lcom/stripe/android/model/PaymentIntent;", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "component2", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WeChatPayNextAction implements StripeModel {
    private final PaymentIntent paymentIntent;
    private final WeChat weChat;
    public static final Parcelable.Creator<WeChatPayNextAction> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: WeChatPayNextAction.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WeChatPayNextAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeChatPayNextAction(PaymentIntent.CREATOR.createFromParcel(parcel), WeChat.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction[] newArray(int i) {
            return new WeChatPayNextAction[i];
        }
    }

    public static /* synthetic */ WeChatPayNextAction copy$payments_core_release$default(WeChatPayNextAction weChatPayNextAction, PaymentIntent paymentIntent, WeChat weChat, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentIntent = weChatPayNextAction.paymentIntent;
        }
        if ((i & 2) != 0) {
            weChat = weChatPayNextAction.weChat;
        }
        return weChatPayNextAction.copy$payments_core_release(paymentIntent, weChat);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    /* renamed from: component2, reason: from getter */
    public final WeChat getWeChat() {
        return this.weChat;
    }

    public final WeChatPayNextAction copy$payments_core_release(PaymentIntent paymentIntent, WeChat weChat) {
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        return new WeChatPayNextAction(paymentIntent, weChat);
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
        if (!(other instanceof WeChatPayNextAction)) {
            return false;
        }
        WeChatPayNextAction weChatPayNextAction = (WeChatPayNextAction) other;
        return Intrinsics.areEqual(this.paymentIntent, weChatPayNextAction.paymentIntent) && Intrinsics.areEqual(this.weChat, weChatPayNextAction.weChat);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.paymentIntent.hashCode() * 31) + this.weChat.hashCode();
    }

    public String toString() {
        return "WeChatPayNextAction(paymentIntent=" + this.paymentIntent + ", weChat=" + this.weChat + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.paymentIntent.writeToParcel(dest, flags);
        this.weChat.writeToParcel(dest, flags);
    }

    public WeChatPayNextAction(PaymentIntent paymentIntent, WeChat weChat) {
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        this.paymentIntent = paymentIntent;
        this.weChat = weChat;
    }

    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final WeChat getWeChat() {
        return this.weChat;
    }
}
