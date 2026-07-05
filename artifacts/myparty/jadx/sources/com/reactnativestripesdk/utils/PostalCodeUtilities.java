package com.reactnativestripesdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.CharsKt;

/* compiled from: PostalCodeUtilities.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/reactnativestripesdk/utils/PostalCodeUtilities;", "", "<init>", "()V", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostalCodeUtilities {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: PostalCodeUtilities.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/reactnativestripesdk/utils/PostalCodeUtilities$Companion;", "", "<init>", "()V", "isValidGlobalPostalCodeCharacter", "", "c", "", "isValidGlobalPostalCodeCharacter$stripe_stripe_react_native_release", "isValidUsPostalCodeCharacter", "isValidUsPostalCodeCharacter$stripe_stripe_react_native_release", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isValidGlobalPostalCodeCharacter$stripe_stripe_react_native_release(char c) {
            return Character.isLetterOrDigit(c) || CharsKt.isWhitespace(c) || c == '-';
        }

        public final boolean isValidUsPostalCodeCharacter$stripe_stripe_react_native_release(char c) {
            return Character.isDigit(c) || CharsKt.isWhitespace(c) || c == '-';
        }
    }
}
