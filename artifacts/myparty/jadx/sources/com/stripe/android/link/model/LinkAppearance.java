package com.stripe.android.link.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.facebook.hermes.intl.Constants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.link.theme.LinkThemeConfig;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

/* compiled from: LinkAppearance.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance;", "Landroid/os/Parcelable;", "lightColors", "Lcom/stripe/android/link/model/LinkAppearance$Colors;", "darkColors", "style", "Lcom/stripe/android/link/model/LinkAppearance$Style;", PaymentSheetAppearanceKeys.PRIMARY_BUTTON, "Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;", "<init>", "(Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Colors;Lcom/stripe/android/link/model/LinkAppearance$Style;Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;)V", "getLightColors", "()Lcom/stripe/android/link/model/LinkAppearance$Colors;", "getDarkColors", "getStyle", "()Lcom/stripe/android/link/model/LinkAppearance$Style;", "getPrimaryButton", "()Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Colors", "Style", "PrimaryButton", "ColorParceler", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAppearance implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LinkAppearance> CREATOR = new Creator();
    private final Colors darkColors;
    private final Colors lightColors;
    private final PrimaryButton primaryButton;
    private final Style style;

    /* compiled from: LinkAppearance.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAppearance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkAppearance(Colors.CREATOR.createFromParcel(parcel), Colors.CREATOR.createFromParcel(parcel), Style.CREATOR.createFromParcel(parcel), PrimaryButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAppearance[] newArray(int i) {
            return new LinkAppearance[i];
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
        if (!(obj instanceof LinkAppearance)) {
            return false;
        }
        LinkAppearance linkAppearance = (LinkAppearance) obj;
        return Intrinsics.areEqual(this.lightColors, linkAppearance.lightColors) && Intrinsics.areEqual(this.darkColors, linkAppearance.darkColors) && this.style == linkAppearance.style && Intrinsics.areEqual(this.primaryButton, linkAppearance.primaryButton);
    }

    public int hashCode() {
        return (((((this.lightColors.hashCode() * 31) + this.darkColors.hashCode()) * 31) + this.style.hashCode()) * 31) + this.primaryButton.hashCode();
    }

    public String toString() {
        return "LinkAppearance(lightColors=" + this.lightColors + ", darkColors=" + this.darkColors + ", style=" + this.style + ", primaryButton=" + this.primaryButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.lightColors.writeToParcel(dest, flags);
        this.darkColors.writeToParcel(dest, flags);
        this.style.writeToParcel(dest, flags);
        this.primaryButton.writeToParcel(dest, flags);
    }

    public LinkAppearance(Colors lightColors, Colors darkColors, Style style, PrimaryButton primaryButton) {
        Intrinsics.checkNotNullParameter(lightColors, "lightColors");
        Intrinsics.checkNotNullParameter(darkColors, "darkColors");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.lightColors = lightColors;
        this.darkColors = darkColors;
        this.style = style;
        this.primaryButton = primaryButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ LinkAppearance(Colors colors, Colors colors2, Style style, PrimaryButton primaryButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Colors.INSTANCE.m7746default(false) : colors, (i & 2) != 0 ? Colors.INSTANCE.m7746default(true) : colors2, style, (i & 8) != 0 ? new PrimaryButton(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : primaryButton);
    }

    public final Colors getLightColors() {
        return this.lightColors;
    }

    public final Colors getDarkColors() {
        return this.darkColors;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* compiled from: LinkAppearance.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance$Colors;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.PRIMARY, "Landroidx/compose/ui/graphics/Color;", "borderSelected", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPrimary-0d7_KjU", "()J", "J", "getBorderSelected-0d7_KjU", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Colors implements Parcelable {
        private final long borderSelected;
        private final long primary;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Colors> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkAppearance.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Colors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Colors(ColorParceler.INSTANCE.m7742createvNxB06k(parcel), ColorParceler.INSTANCE.m7742createvNxB06k(parcel), null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors[] newArray(int i) {
                return new Colors[i];
            }
        }

        public /* synthetic */ Colors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) obj;
            return Color.m3658equalsimpl0(this.primary, colors.primary) && Color.m3658equalsimpl0(this.borderSelected, colors.borderSelected);
        }

        public int hashCode() {
            return (Color.m3664hashCodeimpl(this.primary) * 31) + Color.m3664hashCodeimpl(this.borderSelected);
        }

        public String toString() {
            return "Colors(primary=" + Color.m3665toStringimpl(this.primary) + ", borderSelected=" + Color.m3665toStringimpl(this.borderSelected) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ColorParceler.INSTANCE.m7743writeek8zF_U(this.primary, dest, flags);
            ColorParceler.INSTANCE.m7743writeek8zF_U(this.borderSelected, dest, flags);
        }

        private Colors(long j, long j2) {
            this.primary = j;
            this.borderSelected = j2;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: getBorderSelected-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorderSelected() {
            return this.borderSelected;
        }

        /* compiled from: LinkAppearance.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance$Colors$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/link/model/LinkAppearance$Colors;", "isDark", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: default, reason: not valid java name */
            public final Colors m7746default(boolean isDark) {
                return new Colors(LinkThemeConfig.INSTANCE.colors(isDark).m7796getButtonPrimary0d7_KjU(), LinkThemeConfig.INSTANCE.colors(isDark).m7793getBorderSelected0d7_KjU(), null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkAppearance.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance$Style;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "ALWAYS_LIGHT", "ALWAYS_DARK", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Style implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Parcelable.Creator<Style> CREATOR;
        public static final Style AUTOMATIC = new Style("AUTOMATIC", 0);
        public static final Style ALWAYS_LIGHT = new Style("ALWAYS_LIGHT", 1);
        public static final Style ALWAYS_DARK = new Style("ALWAYS_DARK", 2);

        /* compiled from: LinkAppearance.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Style> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Style.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i) {
                return new Style[i];
            }
        }

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{AUTOMATIC, ALWAYS_LIGHT, ALWAYS_DARK};
        }

        public static EnumEntries<Style> getEntries() {
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

        private Style(String str, int i) {
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(styleArr$values);
            CREATOR = new Creator();
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* compiled from: LinkAppearance.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance$PrimaryButton;", "Landroid/os/Parcelable;", "cornerRadiusDp", "", "heightDp", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getCornerRadiusDp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeightDp", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryButton implements Parcelable {
        private final Float cornerRadiusDp;
        private final Float heightDp;
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkAppearance.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButton(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton[] newArray(int i) {
                return new PrimaryButton[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryButton() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) obj;
            return Intrinsics.areEqual((Object) this.cornerRadiusDp, (Object) primaryButton.cornerRadiusDp) && Intrinsics.areEqual((Object) this.heightDp, (Object) primaryButton.heightDp);
        }

        public int hashCode() {
            Float f = this.cornerRadiusDp;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.heightDp;
            return iHashCode + (f2 != null ? f2.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButton(cornerRadiusDp=" + this.cornerRadiusDp + ", heightDp=" + this.heightDp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Float f = this.cornerRadiusDp;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            Float f2 = this.heightDp;
            if (f2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f2.floatValue());
            }
        }

        public PrimaryButton(Float f, Float f2) {
            this.cornerRadiusDp = f;
            this.heightDp = f2;
        }

        public /* synthetic */ PrimaryButton(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
        }

        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public final Float getHeightDp() {
            return this.heightDp;
        }
    }

    /* compiled from: LinkAppearance.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/model/LinkAppearance$ColorParceler;", "Lkotlinx/parcelize/Parceler;", "Landroidx/compose/ui/graphics/Color;", "<init>", "()V", "create", "parcel", "Landroid/os/Parcel;", "create-vNxB06k", "(Landroid/os/Parcel;)J", "write", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "write-ek8zF_U", "(JLandroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ColorParceler implements Parceler<Color> {
        public static final ColorParceler INSTANCE = new ColorParceler();

        private ColorParceler() {
        }

        @Override // kotlinx.parcelize.Parceler
        public /* bridge */ /* synthetic */ Color create(Parcel parcel) {
            return Color.m3647boximpl(m7742createvNxB06k(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public Color[] newArray(int i) {
            return (Color[]) Parceler.DefaultImpls.newArray(this, i);
        }

        @Override // kotlinx.parcelize.Parceler
        public /* bridge */ /* synthetic */ void write(Color color, Parcel parcel, int i) {
            m7743writeek8zF_U(color.m3667unboximpl(), parcel, i);
        }

        /* renamed from: create-vNxB06k, reason: not valid java name */
        public long m7742createvNxB06k(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ColorKt.Color(parcel.readInt());
        }

        /* renamed from: write-ek8zF_U, reason: not valid java name */
        public void m7743writeek8zF_U(long j, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(ColorKt.m3711toArgb8_81llA(j));
        }
    }
}
