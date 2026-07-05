package com.stripe.android.financialconnections.ui.sdui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.ui.ImageResource;
import com.stripe.android.financialconnections.ui.TextResource;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerDrivenUi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "", "title", "Lcom/stripe/android/financialconnections/ui/TextResource;", UriUtil.LOCAL_CONTENT_SCHEME, "imageResource", "Lcom/stripe/android/financialconnections/ui/ImageResource;", "<init>", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/ImageResource;)V", "getTitle", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "getContent", "getImageResource", "()Lcom/stripe/android/financialconnections/ui/ImageResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BulletUI {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextResource content;
    private final ImageResource imageResource;
    private final TextResource title;

    public static /* synthetic */ BulletUI copy$default(BulletUI bulletUI, TextResource textResource, TextResource textResource2, ImageResource imageResource, int i, Object obj) {
        if ((i & 1) != 0) {
            textResource = bulletUI.title;
        }
        if ((i & 2) != 0) {
            textResource2 = bulletUI.content;
        }
        if ((i & 4) != 0) {
            imageResource = bulletUI.imageResource;
        }
        return bulletUI.copy(textResource, textResource2, imageResource);
    }

    /* renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextResource getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageResource getImageResource() {
        return this.imageResource;
    }

    public final BulletUI copy(TextResource title, TextResource content, ImageResource imageResource) {
        return new BulletUI(title, content, imageResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletUI)) {
            return false;
        }
        BulletUI bulletUI = (BulletUI) other;
        return Intrinsics.areEqual(this.title, bulletUI.title) && Intrinsics.areEqual(this.content, bulletUI.content) && Intrinsics.areEqual(this.imageResource, bulletUI.imageResource);
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.content;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        ImageResource imageResource = this.imageResource;
        return iHashCode2 + (imageResource != null ? imageResource.hashCode() : 0);
    }

    public String toString() {
        return "BulletUI(title=" + this.title + ", content=" + this.content + ", imageResource=" + this.imageResource + ")";
    }

    public BulletUI(TextResource textResource, TextResource textResource2, ImageResource imageResource) {
        this.title = textResource;
        this.content = textResource2;
        this.imageResource = imageResource;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TextResource getContent() {
        return this.content;
    }

    public final ImageResource getImageResource() {
        return this.imageResource;
    }

    /* compiled from: ServerDrivenUi.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;", "", "<init>", "()V", "from", "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "bullet", "Lcom/stripe/android/financialconnections/model/Bullet;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BulletUI from(Bullet bullet) {
            String str;
            Intrinsics.checkNotNullParameter(bullet, "bullet");
            Image icon = bullet.getIcon();
            ImageResource.Network network = (icon == null || (str = icon.getDefault()) == null) ? null : new ImageResource.Network(str);
            String title = bullet.getTitle();
            TextResource.Text text = title != null ? new TextResource.Text(ServerDrivenUiKt.fromHtml(title)) : null;
            String content = bullet.getContent();
            return new BulletUI(text, content != null ? new TextResource.Text(ServerDrivenUiKt.fromHtml(content)) : null, network);
        }

        public final BulletUI from(FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint bullet) {
            String str;
            Intrinsics.checkNotNullParameter(bullet, "bullet");
            Image icon = bullet.getIcon();
            ImageResource.Network network = (icon == null || (str = icon.getDefault()) == null) ? null : new ImageResource.Network(str);
            String title = bullet.getTitle();
            TextResource.Text text = title != null ? new TextResource.Text(ServerDrivenUiKt.fromHtml(title)) : null;
            String content = bullet.getContent();
            return new BulletUI(text, content != null ? new TextResource.Text(ServerDrivenUiKt.fromHtml(content)) : null, network);
        }
    }
}
