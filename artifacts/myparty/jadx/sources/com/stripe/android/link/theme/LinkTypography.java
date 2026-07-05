package com.stripe.android.link.theme;

import androidx.compose.ui.text.TextStyle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lcom/stripe/android/link/theme/LinkTypography;", "", "title", "Landroidx/compose/ui/text/TextStyle;", "body", "bodyEmphasized", "detail", "detailEmphasized", ShareConstants.FEED_CAPTION_PARAM, "captionEmphasized", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getTitle", "()Landroidx/compose/ui/text/TextStyle;", "getBody", "getBodyEmphasized", "getDetail", "getDetailEmphasized", "getCaption", "getCaptionEmphasized", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkTypography {
    public static final int $stable = 0;
    private final TextStyle body;
    private final TextStyle bodyEmphasized;
    private final TextStyle caption;
    private final TextStyle captionEmphasized;
    private final TextStyle detail;
    private final TextStyle detailEmphasized;
    private final TextStyle title;

    public static /* synthetic */ LinkTypography copy$default(LinkTypography linkTypography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle = linkTypography.title;
        }
        if ((i & 2) != 0) {
            textStyle2 = linkTypography.body;
        }
        if ((i & 4) != 0) {
            textStyle3 = linkTypography.bodyEmphasized;
        }
        if ((i & 8) != 0) {
            textStyle4 = linkTypography.detail;
        }
        if ((i & 16) != 0) {
            textStyle5 = linkTypography.detailEmphasized;
        }
        if ((i & 32) != 0) {
            textStyle6 = linkTypography.caption;
        }
        if ((i & 64) != 0) {
            textStyle7 = linkTypography.captionEmphasized;
        }
        TextStyle textStyle8 = textStyle6;
        TextStyle textStyle9 = textStyle7;
        TextStyle textStyle10 = textStyle5;
        TextStyle textStyle11 = textStyle3;
        return linkTypography.copy(textStyle, textStyle2, textStyle11, textStyle4, textStyle10, textStyle8, textStyle9);
    }

    /* renamed from: component1, reason: from getter */
    public final TextStyle getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextStyle getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyle getBodyEmphasized() {
        return this.bodyEmphasized;
    }

    /* renamed from: component4, reason: from getter */
    public final TextStyle getDetail() {
        return this.detail;
    }

    /* renamed from: component5, reason: from getter */
    public final TextStyle getDetailEmphasized() {
        return this.detailEmphasized;
    }

    /* renamed from: component6, reason: from getter */
    public final TextStyle getCaption() {
        return this.caption;
    }

    /* renamed from: component7, reason: from getter */
    public final TextStyle getCaptionEmphasized() {
        return this.captionEmphasized;
    }

    public final LinkTypography copy(TextStyle title, TextStyle body, TextStyle bodyEmphasized, TextStyle detail, TextStyle detailEmphasized, TextStyle caption, TextStyle captionEmphasized) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(bodyEmphasized, "bodyEmphasized");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(detailEmphasized, "detailEmphasized");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(captionEmphasized, "captionEmphasized");
        return new LinkTypography(title, body, bodyEmphasized, detail, detailEmphasized, caption, captionEmphasized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkTypography)) {
            return false;
        }
        LinkTypography linkTypography = (LinkTypography) other;
        return Intrinsics.areEqual(this.title, linkTypography.title) && Intrinsics.areEqual(this.body, linkTypography.body) && Intrinsics.areEqual(this.bodyEmphasized, linkTypography.bodyEmphasized) && Intrinsics.areEqual(this.detail, linkTypography.detail) && Intrinsics.areEqual(this.detailEmphasized, linkTypography.detailEmphasized) && Intrinsics.areEqual(this.caption, linkTypography.caption) && Intrinsics.areEqual(this.captionEmphasized, linkTypography.captionEmphasized);
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.bodyEmphasized.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.detailEmphasized.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.captionEmphasized.hashCode();
    }

    public String toString() {
        return "LinkTypography(title=" + this.title + ", body=" + this.body + ", bodyEmphasized=" + this.bodyEmphasized + ", detail=" + this.detail + ", detailEmphasized=" + this.detailEmphasized + ", caption=" + this.caption + ", captionEmphasized=" + this.captionEmphasized + ")";
    }

    public LinkTypography(TextStyle title, TextStyle body, TextStyle bodyEmphasized, TextStyle detail, TextStyle detailEmphasized, TextStyle caption, TextStyle captionEmphasized) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(bodyEmphasized, "bodyEmphasized");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(detailEmphasized, "detailEmphasized");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(captionEmphasized, "captionEmphasized");
        this.title = title;
        this.body = body;
        this.bodyEmphasized = bodyEmphasized;
        this.detail = detail;
        this.detailEmphasized = detailEmphasized;
        this.caption = caption;
        this.captionEmphasized = captionEmphasized;
    }

    public final TextStyle getTitle() {
        return this.title;
    }

    public final TextStyle getBody() {
        return this.body;
    }

    public final TextStyle getBodyEmphasized() {
        return this.bodyEmphasized;
    }

    public final TextStyle getDetail() {
        return this.detail;
    }

    public final TextStyle getDetailEmphasized() {
        return this.detailEmphasized;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getCaptionEmphasized() {
        return this.captionEmphasized;
    }
}
