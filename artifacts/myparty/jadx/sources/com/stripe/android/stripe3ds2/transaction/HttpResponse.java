package com.stripe.android.stripe3ds2.transaction;

import com.facebook.common.util.UriUtil;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "", UriUtil.LOCAL_CONTENT_SCHEME, "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "isJsonContentType", "", "()Z", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpResponse {
    private final String content;
    private final boolean isJsonContentType;

    public HttpResponse(String content, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        boolean z = false;
        if (str != null && StringsKt.startsWith$default(str, "application/json", false, 2, (Object) null)) {
            z = true;
        }
        this.isJsonContentType = z;
    }

    public final String getContent() {
        return this.content;
    }

    /* renamed from: isJsonContentType, reason: from getter */
    public final boolean getIsJsonContentType() {
        return this.isJsonContentType;
    }
}
