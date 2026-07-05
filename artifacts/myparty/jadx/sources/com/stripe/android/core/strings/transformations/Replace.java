package com.stripe.android.core.strings.transformations;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Replace.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/core/strings/transformations/Replace;", "Lcom/stripe/android/core/strings/transformations/TransformOperation;", "original", "", "replacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ViewProps.TRANSFORM, "value", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Replace implements TransformOperation {
    public static final Parcelable.Creator<Replace> CREATOR = new Creator();
    private final String original;
    private final String replacement;

    /* compiled from: Replace.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Replace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Replace createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Replace(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Replace[] newArray(int i) {
            return new Replace[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getOriginal() {
        return this.original;
    }

    /* renamed from: component2, reason: from getter */
    private final String getReplacement() {
        return this.replacement;
    }

    public static /* synthetic */ Replace copy$default(Replace replace, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replace.original;
        }
        if ((i & 2) != 0) {
            str2 = replace.replacement;
        }
        return replace.copy(str, str2);
    }

    public final Replace copy(String original, String replacement) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return new Replace(original, replacement);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Replace)) {
            return false;
        }
        Replace replace = (Replace) other;
        return Intrinsics.areEqual(this.original, replace.original) && Intrinsics.areEqual(this.replacement, replace.replacement);
    }

    public int hashCode() {
        return (this.original.hashCode() * 31) + this.replacement.hashCode();
    }

    public String toString() {
        return "Replace(original=" + this.original + ", replacement=" + this.replacement + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.original);
        dest.writeString(this.replacement);
    }

    public Replace(String original, String replacement) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        this.original = original;
        this.replacement = replacement;
    }

    @Override // com.stripe.android.core.strings.transformations.TransformOperation
    public String transform(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.replace$default(value, this.original, this.replacement, false, 4, (Object) null);
    }
}
