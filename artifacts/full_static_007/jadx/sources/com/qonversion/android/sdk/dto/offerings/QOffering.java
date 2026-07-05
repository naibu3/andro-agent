package com.qonversion.android.sdk.dto.offerings;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QOffering.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "", "offeringID", "", "tag", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "products", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V", "getOfferingID", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "getTag", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "equals", "", "other", "hashCode", "", "productForID", "id", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QOffering {
    private final String offeringID;
    private final List<QProduct> products;
    private final QOfferingTag tag;

    public QOffering(@Json(name = "id") String offeringID, @Json(name = "tag") QOfferingTag tag, @Json(name = "products") List<QProduct> products) {
        Intrinsics.checkNotNullParameter(offeringID, "offeringID");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(products, "products");
        this.offeringID = offeringID;
        this.tag = tag;
        this.products = products;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final QOfferingTag getTag() {
        return this.tag;
    }

    public /* synthetic */ QOffering(String str, QOfferingTag qOfferingTag, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qOfferingTag, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<QProduct> getProducts() {
        return this.products;
    }

    public final QProduct productForID(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.products.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((QProduct) next).getQonversionID(), id)) {
                break;
            }
        }
        return (QProduct) next;
    }

    public int hashCode() {
        return this.offeringID.hashCode();
    }

    public boolean equals(Object other) {
        if (other instanceof QOffering) {
            QOffering qOffering = (QOffering) other;
            if (Intrinsics.areEqual(qOffering.offeringID, this.offeringID) && qOffering.tag == this.tag && ExtensionsKt.equalsIgnoreOrder(qOffering.products, this.products)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "QOffering(offeringID=" + this.offeringID + ", tag=" + this.tag + ", products=" + this.products + ")";
    }
}
