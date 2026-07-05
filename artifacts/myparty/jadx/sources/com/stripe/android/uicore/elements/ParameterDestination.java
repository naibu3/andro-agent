package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentifierSpec.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/ParameterDestination;", "Landroid/os/Parcelable;", "Api", "Local", "Lcom/stripe/android/uicore/elements/ParameterDestination$Api;", "Lcom/stripe/android/uicore/elements/ParameterDestination$Local;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParameterDestination extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdentifierSpec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/uicore/elements/ParameterDestination$Api;", "Lcom/stripe/android/uicore/elements/ParameterDestination;", "", "<init>", "(Ljava/lang/String;I)V", "Params", "Options", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api implements ParameterDestination {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Api[] $VALUES;
        public static final Parcelable.Creator<Api> CREATOR;
        public static final Api Params = new Api("Params", 0);
        public static final Api Options = new Api("Options", 1);

        /* compiled from: IdentifierSpec.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Api> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Api createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Api.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Api[] newArray(int i) {
                return new Api[i];
            }
        }

        private static final /* synthetic */ Api[] $values() {
            return new Api[]{Params, Options};
        }

        public static EnumEntries<Api> getEntries() {
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

        private Api(String str, int i) {
        }

        static {
            Api[] apiArr$values = $values();
            $VALUES = apiArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(apiArr$values);
            CREATOR = new Creator();
        }

        public static Api valueOf(String str) {
            return (Api) Enum.valueOf(Api.class, str);
        }

        public static Api[] values() {
            return (Api[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdentifierSpec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007j\u0002\b\u0005¨\u0006\r"}, d2 = {"Lcom/stripe/android/uicore/elements/ParameterDestination$Local;", "Lcom/stripe/android/uicore/elements/ParameterDestination;", "", "<init>", "(Ljava/lang/String;I)V", "Extras", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Local implements ParameterDestination {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Local[] $VALUES;
        public static final Parcelable.Creator<Local> CREATOR;
        public static final Local Extras = new Local("Extras", 0);

        /* compiled from: IdentifierSpec.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Local> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Local createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Local.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Local[] newArray(int i) {
                return new Local[i];
            }
        }

        private static final /* synthetic */ Local[] $values() {
            return new Local[]{Extras};
        }

        public static EnumEntries<Local> getEntries() {
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

        private Local(String str, int i) {
        }

        static {
            Local[] localArr$values = $values();
            $VALUES = localArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(localArr$values);
            CREATOR = new Creator();
        }

        public static Local valueOf(String str) {
            return (Local) Enum.valueOf(Local.class, str);
        }

        public static Local[] values() {
            return (Local[]) $VALUES.clone();
        }
    }
}
