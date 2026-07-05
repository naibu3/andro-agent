package com.stripe.android.core.strings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConcatenatedResolvableString.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0001HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0001HÂ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/core/strings/ConcatenatedResolvableString;", "Lcom/stripe/android/core/strings/ResolvableString;", "first", "second", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V", "resolve", "", "context", "Landroid/content/Context;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConcatenatedResolvableString implements ResolvableString {
    public static final Parcelable.Creator<ConcatenatedResolvableString> CREATOR = new Creator();
    private final ResolvableString first;
    private final ResolvableString second;

    /* compiled from: ConcatenatedResolvableString.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConcatenatedResolvableString> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConcatenatedResolvableString createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConcatenatedResolvableString((ResolvableString) parcel.readParcelable(ConcatenatedResolvableString.class.getClassLoader()), (ResolvableString) parcel.readParcelable(ConcatenatedResolvableString.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConcatenatedResolvableString[] newArray(int i) {
            return new ConcatenatedResolvableString[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final ResolvableString getFirst() {
        return this.first;
    }

    /* renamed from: component2, reason: from getter */
    private final ResolvableString getSecond() {
        return this.second;
    }

    public static /* synthetic */ ConcatenatedResolvableString copy$default(ConcatenatedResolvableString concatenatedResolvableString, ResolvableString resolvableString, ResolvableString resolvableString2, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = concatenatedResolvableString.first;
        }
        if ((i & 2) != 0) {
            resolvableString2 = concatenatedResolvableString.second;
        }
        return concatenatedResolvableString.copy(resolvableString, resolvableString2);
    }

    public final ConcatenatedResolvableString copy(ResolvableString first, ResolvableString second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return new ConcatenatedResolvableString(first, second);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConcatenatedResolvableString)) {
            return false;
        }
        ConcatenatedResolvableString concatenatedResolvableString = (ConcatenatedResolvableString) other;
        return Intrinsics.areEqual(this.first, concatenatedResolvableString.first) && Intrinsics.areEqual(this.second, concatenatedResolvableString.second);
    }

    public int hashCode() {
        return (this.first.hashCode() * 31) + this.second.hashCode();
    }

    public String toString() {
        return "ConcatenatedResolvableString(first=" + this.first + ", second=" + this.second + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.first, flags);
        dest.writeParcelable(this.second, flags);
    }

    public ConcatenatedResolvableString(ResolvableString first, ResolvableString second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.first = first;
        this.second = second;
    }

    @Override // com.stripe.android.core.strings.ResolvableString
    public String resolve(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.first.resolve(context) + this.second.resolve(context);
    }
}
