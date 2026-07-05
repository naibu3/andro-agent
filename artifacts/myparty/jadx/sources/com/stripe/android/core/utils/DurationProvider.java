package com.stripe.android.core.utils;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.time.Duration;

/* compiled from: DurationProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/utils/DurationProvider;", "", ViewProps.START, "", SDKConstants.PARAM_KEY, "Lcom/stripe/android/core/utils/DurationProvider$Key;", "reset", "", ViewProps.END, "Lkotlin/time/Duration;", "end-LV8wdWc", "Key", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DurationProvider {
    /* renamed from: end-LV8wdWc */
    Duration mo7239endLV8wdWc(Key key);

    void start(Key key, boolean reset);

    /* compiled from: DurationProvider.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void start$default(DurationProvider durationProvider, Key key, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            durationProvider.start(key, z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DurationProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/core/utils/DurationProvider$Key;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", "Checkout", "LinkSignup", "ConfirmButtonClicked", "CardScan", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Key[] $VALUES;
        public static final Key Loading = new Key("Loading", 0);
        public static final Key Checkout = new Key("Checkout", 1);
        public static final Key LinkSignup = new Key("LinkSignup", 2);
        public static final Key ConfirmButtonClicked = new Key("ConfirmButtonClicked", 3);
        public static final Key CardScan = new Key("CardScan", 4);

        private static final /* synthetic */ Key[] $values() {
            return new Key[]{Loading, Checkout, LinkSignup, ConfirmButtonClicked, CardScan};
        }

        public static EnumEntries<Key> getEntries() {
            return $ENTRIES;
        }

        private Key(String str, int i) {
        }

        static {
            Key[] keyArr$values = $values();
            $VALUES = keyArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(keyArr$values);
        }

        public static Key valueOf(String str) {
            return (Key) Enum.valueOf(Key.class, str);
        }

        public static Key[] values() {
            return (Key[]) $VALUES.clone();
        }
    }
}
