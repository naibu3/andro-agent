package com.stripe.android.financialconnections.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: TextResource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\n\u000b\fJ\r\u0010\u0002\u001a\u00020\u0003H\u0017¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u0003*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource;", "Landroid/os/Parcelable;", "toText", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;", "buildText", "", CardScanActivity.ARGS, "", "", "Text", "StringId", "PluralId", "Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;", "Lcom/stripe/android/financialconnections/ui/TextResource$StringId;", "Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TextResource extends Parcelable {
    CharSequence toText(Composer composer, int i);

    /* compiled from: TextResource.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "Lcom/stripe/android/financialconnections/ui/TextResource;", "value", "", "<init>", "(Ljava/lang/CharSequence;)V", "getValue", "()Ljava/lang/CharSequence;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text implements TextResource {
        private final CharSequence value;
        public static final Parcelable.Creator<Text> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: TextResource.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i) {
                return new Text[i];
            }
        }

        public static /* synthetic */ Text copy$default(Text text, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = text.value;
            }
            return text.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getValue() {
            return this.value;
        }

        public final Text copy(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Text(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.value, ((Text) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Text(value=" + ((Object) this.value) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TextUtils.writeToParcel(this.value, dest, flags);
        }

        @Override // com.stripe.android.financialconnections.ui.TextResource
        public CharSequence toText(Composer composer, int i) {
            return DefaultImpls.toText(this, composer, i);
        }

        public Text(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final CharSequence getValue() {
            return this.value;
        }
    }

    /* compiled from: TextResource.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource$StringId;", "Lcom/stripe/android/financialconnections/ui/TextResource;", "value", "", CardScanActivity.ARGS, "", "", "<init>", "(ILjava/util/List;)V", "getValue", "()I", "getArgs", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StringId implements TextResource {
        private final List<String> args;
        private final int value;
        public static final Parcelable.Creator<StringId> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: TextResource.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StringId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringId(parcel.readInt(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringId[] newArray(int i) {
                return new StringId[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringId copy$default(StringId stringId, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringId.value;
            }
            if ((i2 & 2) != 0) {
                list = stringId.args;
            }
            return stringId.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final List<String> component2() {
            return this.args;
        }

        public final StringId copy(int value, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StringId(value, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringId)) {
                return false;
            }
            StringId stringId = (StringId) other;
            return this.value == stringId.value && Intrinsics.areEqual(this.args, stringId.args);
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "StringId(value=" + this.value + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.value);
            dest.writeStringList(this.args);
        }

        @Override // com.stripe.android.financialconnections.ui.TextResource
        public CharSequence toText(Composer composer, int i) {
            return DefaultImpls.toText(this, composer, i);
        }

        public StringId(int i, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.value = i;
            this.args = args;
        }

        public final int getValue() {
            return this.value;
        }

        public /* synthetic */ StringId(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<String> getArgs() {
            return this.args;
        }
    }

    /* compiled from: TextResource.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;", "Lcom/stripe/android/financialconnections/ui/TextResource;", "singular", "", "plural", NewHtcHomeBadger.COUNT, CardScanActivity.ARGS, "", "", "<init>", "(IIILjava/util/List;)V", "getSingular", "()I", "getPlural", "getCount", "getArgs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PluralId implements TextResource {
        private final List<String> args;
        private final int count;
        private final int plural;
        private final int singular;
        public static final Parcelable.Creator<PluralId> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: TextResource.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PluralId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PluralId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PluralId(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PluralId[] newArray(int i) {
                return new PluralId[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PluralId copy$default(PluralId pluralId, int i, int i2, int i3, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = pluralId.singular;
            }
            if ((i4 & 2) != 0) {
                i2 = pluralId.plural;
            }
            if ((i4 & 4) != 0) {
                i3 = pluralId.count;
            }
            if ((i4 & 8) != 0) {
                list = pluralId.args;
            }
            return pluralId.copy(i, i2, i3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSingular() {
            return this.singular;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPlural() {
            return this.plural;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final List<String> component4() {
            return this.args;
        }

        public final PluralId copy(int singular, int plural, int count, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new PluralId(singular, plural, count, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PluralId)) {
                return false;
            }
            PluralId pluralId = (PluralId) other;
            return this.singular == pluralId.singular && this.plural == pluralId.plural && this.count == pluralId.count && Intrinsics.areEqual(this.args, pluralId.args);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.singular) * 31) + Integer.hashCode(this.plural)) * 31) + Integer.hashCode(this.count)) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "PluralId(singular=" + this.singular + ", plural=" + this.plural + ", count=" + this.count + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.singular);
            dest.writeInt(this.plural);
            dest.writeInt(this.count);
            dest.writeStringList(this.args);
        }

        @Override // com.stripe.android.financialconnections.ui.TextResource
        public CharSequence toText(Composer composer, int i) {
            return DefaultImpls.toText(this, composer, i);
        }

        public PluralId(int i, int i2, int i3, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.singular = i;
            this.plural = i2;
            this.count = i3;
            this.args = args;
        }

        public final int getSingular() {
            return this.singular;
        }

        public final int getPlural() {
            return this.plural;
        }

        public final int getCount() {
            return this.count;
        }

        public /* synthetic */ PluralId(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<String> getArgs() {
            return this.args;
        }
    }

    /* compiled from: TextResource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static CharSequence toText(TextResource textResource, Composer composer, int i) throws Resources.NotFoundException {
            CharSequence charSequenceBuildText;
            composer.startReplaceGroup(2059343640);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2059343640, i, -1, "com.stripe.android.financialconnections.ui.TextResource.toText (TextResource.kt:38)");
            }
            if (textResource instanceof Text) {
                composer.startReplaceGroup(-1250499307);
                composer.endReplaceGroup();
                charSequenceBuildText = ((Text) textResource).getValue();
            } else if (textResource instanceof StringId) {
                composer.startReplaceGroup(-1250498017);
                StringId stringId = (StringId) textResource;
                charSequenceBuildText = buildText(textResource, stringId.getValue(), stringId.getArgs(), composer, (i << 6) & 896);
                composer.endReplaceGroup();
            } else {
                if (!(textResource instanceof PluralId)) {
                    composer.startReplaceGroup(-1250500244);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-110685927);
                PluralId pluralId = (PluralId) textResource;
                if (pluralId.getCount() == 1) {
                    composer.startReplaceGroup(-1250495169);
                    charSequenceBuildText = buildText(textResource, pluralId.getSingular(), pluralId.getArgs(), composer, (i << 6) & 896);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1250493665);
                    charSequenceBuildText = buildText(textResource, pluralId.getPlural(), pluralId.getArgs(), composer, (i << 6) & 896);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return charSequenceBuildText;
        }

        private static CharSequence buildText(TextResource textResource, int i, List<String> list, Composer composer, int i2) throws Resources.NotFoundException {
            composer.startReplaceGroup(-581618786);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581618786, i2, -1, "com.stripe.android.financialconnections.ui.TextResource.buildText (TextResource.kt:57)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            CharSequence text = ((Context) objConsume).getResources().getText(i);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                text = TextUtils.replace(text, new String[]{"%" + i4 + "$s"}, new String[]{(String) obj});
                Intrinsics.checkNotNullExpressionValue(text, "replace(...)");
                i3 = i4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return text;
        }
    }
}
