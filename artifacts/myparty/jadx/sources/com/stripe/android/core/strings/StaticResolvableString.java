package com.stripe.android.core.strings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticResolvableString.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0013\u0010\u0004\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\u0016\u0010\u000e\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005HÂ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/core/strings/StaticResolvableString;", "Lcom/stripe/android/core/strings/ResolvableString;", "value", "", CardScanActivity.ARGS, "", "", "Lkotlinx/parcelize/RawValue;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "resolve", "context", "Landroid/content/Context;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StaticResolvableString implements ResolvableString {
    public static final Parcelable.Creator<StaticResolvableString> CREATOR = new Creator();
    private final List<Object> args;
    private final String value;

    /* compiled from: StaticResolvableString.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StaticResolvableString> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticResolvableString createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(StaticResolvableString.class.getClassLoader()));
            }
            return new StaticResolvableString(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticResolvableString[] newArray(int i) {
            return new StaticResolvableString[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getValue() {
        return this.value;
    }

    private final List<Object> component2() {
        return this.args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticResolvableString copy$default(StaticResolvableString staticResolvableString, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = staticResolvableString.value;
        }
        if ((i & 2) != 0) {
            list = staticResolvableString.args;
        }
        return staticResolvableString.copy(str, list);
    }

    public final StaticResolvableString copy(String value, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(args, "args");
        return new StaticResolvableString(value, args);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticResolvableString)) {
            return false;
        }
        StaticResolvableString staticResolvableString = (StaticResolvableString) other;
        return Intrinsics.areEqual(this.value, staticResolvableString.value) && Intrinsics.areEqual(this.args, staticResolvableString.args);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.args.hashCode();
    }

    public String toString() {
        return "StaticResolvableString(value=" + this.value + ", args=" + this.args + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.value);
        List<Object> list = this.args;
        dest.writeInt(list.size());
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            dest.writeValue(it.next());
        }
    }

    public StaticResolvableString(String value, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(args, "args");
        this.value = value;
        this.args = args;
    }

    @Override // com.stripe.android.core.strings.ResolvableString
    public String resolve(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.value;
        Object[] objArrResolveArgs = ResolvableStringUtilsKt.resolveArgs(context, this.args);
        Object[] objArrCopyOf = Arrays.copyOf(objArrResolveArgs, objArrResolveArgs.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
