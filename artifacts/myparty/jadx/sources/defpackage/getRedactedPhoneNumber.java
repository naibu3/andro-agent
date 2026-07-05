package defpackage;

import androidx.webkit.ProxyConfig;
import com.stripe.android.model.ConsumerSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConsumerSessionExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getRedactedPhoneNumber", "", "Lcom/stripe/android/model/ConsumerSession;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ConsumerSessionExtensionsKt, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class getRedactedPhoneNumber {
    public static final String getRedactedPhoneNumber(ConsumerSession consumerSession) {
        Intrinsics.checkNotNullParameter(consumerSession, "<this>");
        return StringsKt.replace$default(consumerSession.getRedactedFormattedPhoneNumber(), ProxyConfig.MATCH_ALL_SCHEMES, "•", false, 4, (Object) null);
    }
}
