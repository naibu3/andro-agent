package com.stripe.android.uicore.text;

import androidx.compose.ui.graphics.ColorFilter;
import com.bumptech.glide.Registry;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage;", "", "<init>", "()V", "Drawable", Registry.BUCKET_BITMAP, "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EmbeddableImage {
    public static final int $stable = 0;

    public /* synthetic */ EmbeddableImage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmbeddableImage() {
    }

    /* compiled from: Html.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "id", "", "contentDescription", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "<init>", "(IILandroidx/compose/ui/graphics/ColorFilter;)V", "getId", "()I", "getContentDescription", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Drawable extends EmbeddableImage {
        public static final int $stable = 0;
        private final ColorFilter colorFilter;
        private final int contentDescription;
        private final int id;

        public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, int i2, ColorFilter colorFilter, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = drawable.id;
            }
            if ((i3 & 2) != 0) {
                i2 = drawable.contentDescription;
            }
            if ((i3 & 4) != 0) {
                colorFilter = drawable.colorFilter;
            }
            return drawable.copy(i, i2, colorFilter);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorFilter getColorFilter() {
            return this.colorFilter;
        }

        public final Drawable copy(int id, int contentDescription, ColorFilter colorFilter) {
            return new Drawable(id, contentDescription, colorFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drawable)) {
                return false;
            }
            Drawable drawable = (Drawable) other;
            return this.id == drawable.id && this.contentDescription == drawable.contentDescription && Intrinsics.areEqual(this.colorFilter, drawable.colorFilter);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.contentDescription)) * 31;
            ColorFilter colorFilter = this.colorFilter;
            return iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
        }

        public String toString() {
            return "Drawable(id=" + this.id + ", contentDescription=" + this.contentDescription + ", colorFilter=" + this.colorFilter + ")";
        }

        public /* synthetic */ Drawable(int i, int i2, ColorFilter colorFilter, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : colorFilter);
        }

        public final int getId() {
            return this.id;
        }

        public final int getContentDescription() {
            return this.contentDescription;
        }

        public final ColorFilter getColorFilter() {
            return this.colorFilter;
        }

        public Drawable(int i, int i2, ColorFilter colorFilter) {
            super(null);
            this.id = i;
            this.contentDescription = i2;
            this.colorFilter = colorFilter;
        }
    }

    /* compiled from: Html.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Bitmap extends EmbeddableImage {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        public static /* synthetic */ Bitmap copy$default(Bitmap bitmap, android.graphics.Bitmap bitmap2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap2 = bitmap.bitmap;
            }
            return bitmap.copy(bitmap2);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Bitmap copy(android.graphics.Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new Bitmap(bitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bitmap) && Intrinsics.areEqual(this.bitmap, ((Bitmap) other).bitmap);
        }

        public int hashCode() {
            return this.bitmap.hashCode();
        }

        public String toString() {
            return "Bitmap(bitmap=" + this.bitmap + ")";
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bitmap(android.graphics.Bitmap bitmap) {
            super(null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
        }
    }
}
