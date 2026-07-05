package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutSpec.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/ui/core/elements/LayoutSpec;", "", AlertFragment.ARG_ITEMS, "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LayoutSpec {
    private final List<FormItemSpec> items;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutSpec copy$default(LayoutSpec layoutSpec, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = layoutSpec.items;
        }
        return layoutSpec.copy(list);
    }

    public final List<FormItemSpec> component1() {
        return this.items;
    }

    public final LayoutSpec copy(List<? extends FormItemSpec> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new LayoutSpec(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutSpec) && Intrinsics.areEqual(this.items, ((LayoutSpec) other).items);
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "LayoutSpec(items=" + this.items + ")";
    }

    /* compiled from: LayoutSpec.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/stripe/android/ui/core/elements/LayoutSpec$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "item", "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "([Lcom/stripe/android/ui/core/elements/FormItemSpec;)Lcom/stripe/android/ui/core/elements/LayoutSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LayoutSpec create(FormItemSpec... item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new LayoutSpec(ArraysKt.toList(item));
        }

        public final LayoutSpec create() {
            return new LayoutSpec(CollectionsKt.emptyList());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutSpec(List<? extends FormItemSpec> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    public final List<FormItemSpec> getItems() {
        return this.items;
    }
}
