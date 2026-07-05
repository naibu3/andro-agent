package com.stripe.android.core.strings;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.transformations.TransformOperation;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentifierResolvableString.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0013\u0010\u0007\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u0016\u0010\u0012\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\t0\u0005HÂ\u0003J:\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\t0\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/core/strings/IdentifierResolvableString;", "Lcom/stripe/android/core/strings/ResolvableString;", "id", "", "transformations", "", "Lcom/stripe/android/core/strings/transformations/TransformOperation;", CardScanActivity.ARGS, "", "Lkotlinx/parcelize/RawValue;", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "resolve", "", "context", "Landroid/content/Context;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IdentifierResolvableString implements ResolvableString {
    public static final Parcelable.Creator<IdentifierResolvableString> CREATOR = new Creator();
    private final List<Object> args;
    private final int id;
    private final List<TransformOperation> transformations;

    /* compiled from: IdentifierResolvableString.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdentifierResolvableString> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierResolvableString createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(IdentifierResolvableString.class.getClassLoader()));
            }
            ArrayList arrayList2 = arrayList;
            int i4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList3.add(parcel.readValue(IdentifierResolvableString.class.getClassLoader()));
            }
            return new IdentifierResolvableString(i, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierResolvableString[] newArray(int i) {
            return new IdentifierResolvableString[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final int getId() {
        return this.id;
    }

    private final List<TransformOperation> component2() {
        return this.transformations;
    }

    private final List<Object> component3() {
        return this.args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdentifierResolvableString copy$default(IdentifierResolvableString identifierResolvableString, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = identifierResolvableString.id;
        }
        if ((i2 & 2) != 0) {
            list = identifierResolvableString.transformations;
        }
        if ((i2 & 4) != 0) {
            list2 = identifierResolvableString.args;
        }
        return identifierResolvableString.copy(i, list, list2);
    }

    public final IdentifierResolvableString copy(int id, List<? extends TransformOperation> transformations, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(args, "args");
        return new IdentifierResolvableString(id, transformations, args);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierResolvableString)) {
            return false;
        }
        IdentifierResolvableString identifierResolvableString = (IdentifierResolvableString) other;
        return this.id == identifierResolvableString.id && Intrinsics.areEqual(this.transformations, identifierResolvableString.transformations) && Intrinsics.areEqual(this.args, identifierResolvableString.args);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.transformations.hashCode()) * 31) + this.args.hashCode();
    }

    public String toString() {
        return "IdentifierResolvableString(id=" + this.id + ", transformations=" + this.transformations + ", args=" + this.args + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        List<TransformOperation> list = this.transformations;
        dest.writeInt(list.size());
        Iterator<TransformOperation> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<Object> list2 = this.args;
        dest.writeInt(list2.size());
        Iterator<Object> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeValue(it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentifierResolvableString(int i, List<? extends TransformOperation> transformations, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(args, "args");
        this.id = i;
        this.transformations = transformations;
        this.args = args;
    }

    public /* synthetic */ IdentifierResolvableString(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, list2);
    }

    @Override // com.stripe.android.core.strings.ResolvableString
    public String resolve(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<TransformOperation> list = this.transformations;
        int i = this.id;
        Object[] objArrResolveArgs = ResolvableStringUtilsKt.resolveArgs(context, this.args);
        String string = context.getString(i, Arrays.copyOf(objArrResolveArgs, objArrResolveArgs.length));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            string = ((TransformOperation) it.next()).transform(string);
        }
        return string;
    }
}
