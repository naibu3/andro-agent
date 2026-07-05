package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HyperlinkedText.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/ui/core/elements/LinkAnnotation;", "", "url", "", ViewProps.START, "", ViewProps.END, "<init>", "(Ljava/lang/String;II)V", "getUrl", "()Ljava/lang/String;", "getStart", "()I", "getEnd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class LinkAnnotation {
    private final int end;
    private final int start;
    private final String url;

    public static /* synthetic */ LinkAnnotation copy$default(LinkAnnotation linkAnnotation, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = linkAnnotation.url;
        }
        if ((i3 & 2) != 0) {
            i = linkAnnotation.start;
        }
        if ((i3 & 4) != 0) {
            i2 = linkAnnotation.end;
        }
        return linkAnnotation.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    public final LinkAnnotation copy(String url, int start, int end) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new LinkAnnotation(url, start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAnnotation)) {
            return false;
        }
        LinkAnnotation linkAnnotation = (LinkAnnotation) other;
        return Intrinsics.areEqual(this.url, linkAnnotation.url) && this.start == linkAnnotation.start && this.end == linkAnnotation.end;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end);
    }

    public String toString() {
        return "LinkAnnotation(url=" + this.url + ", start=" + this.start + ", end=" + this.end + ")";
    }

    public LinkAnnotation(String url, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.start = i;
        this.end = i2;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getEnd() {
        return this.end;
    }
}
