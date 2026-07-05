package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"EMAIL_LENGTH", "", "redactEmail", "", "email", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkLoginWarmupViewModelKt {
    private static final int EMAIL_LENGTH = 15;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String redactEmail(String str) {
        String str2 = str;
        String str3 = (String) StringsKt.split$default((CharSequence) str2, new char[]{'@'}, false, 0, 6, (Object) null).get(0);
        if (str3.length() <= 15) {
            return str;
        }
        String str4 = (String) StringsKt.split$default((CharSequence) str2, new char[]{'@'}, false, 0, 6, (Object) null).get(1);
        String strSubstring = str3.substring(0, 15);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "•••@" + str4;
    }
}
