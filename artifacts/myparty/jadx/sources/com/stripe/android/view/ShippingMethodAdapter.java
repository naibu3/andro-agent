package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShippingMethodAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0016J\u0018\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0014H\u0016J\u0015\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0002\b)R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "<init>", "()V", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "", "getOnShippingMethodSelectedCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setOnShippingMethodSelectedCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "shippingMethods", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "", "selectedIndex", "getSelectedIndex$payments_core_release", "()I", "setSelectedIndex$payments_core_release", "(I)V", "selectedShippingMethod", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "getItemCount", "getItemId", "", ViewProps.POSITION, "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", ContextChain.TAG_INFRA, "onBindViewHolder", "holder", "setSelected", "shippingMethod", "setSelected$payments_core_release", "ShippingMethodViewHolder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShippingMethodAdapter extends RecyclerView.Adapter<ShippingMethodViewHolder> {
    public static final int $stable = 8;
    private /* synthetic */ int selectedIndex;
    private Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback = new Function1() { // from class: com.stripe.android.view.ShippingMethodAdapter$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ShippingMethodAdapter.onShippingMethodSelectedCallback$lambda$0((ShippingMethod) obj);
        }
    };
    private List<ShippingMethod> shippingMethods = CollectionsKt.emptyList();

    public ShippingMethodAdapter() {
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShippingMethodSelectedCallback$lambda$0(ShippingMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<ShippingMethod, Unit> getOnShippingMethodSelectedCallback$payments_core_release() {
        return this.onShippingMethodSelectedCallback;
    }

    public final void setOnShippingMethodSelectedCallback$payments_core_release(Function1<? super ShippingMethod, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onShippingMethodSelectedCallback = function1;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setSelectedIndex$payments_core_release(0);
        this.shippingMethods = value;
        notifyDataSetChanged();
    }

    /* renamed from: getSelectedIndex$payments_core_release, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setSelectedIndex$payments_core_release(int i) {
        int i2 = this.selectedIndex;
        if (i2 != i) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
            this.selectedIndex = i;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i));
        }
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return (ShippingMethod) CollectionsKt.getOrNull(this.shippingMethods, this.selectedIndex);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.shippingMethods.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.shippingMethods.get(position).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ShippingMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ShippingMethodViewHolder(new ShippingMethodView(context, null, 0, 6, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ShippingMethodViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setShippingMethod(this.shippingMethods.get(i));
        holder.setSelected(i == this.selectedIndex);
        holder.getShippingMethodView().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.ShippingMethodAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShippingMethodAdapter.onBindViewHolder$lambda$1(this.f$0, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(ShippingMethodAdapter shippingMethodAdapter, ShippingMethodViewHolder shippingMethodViewHolder, View view) {
        shippingMethodAdapter.setSelectedIndex$payments_core_release(shippingMethodViewHolder.getBindingAdapterPosition());
    }

    public final void setSelected$payments_core_release(ShippingMethod shippingMethod) {
        Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
        setSelectedIndex$payments_core_release(this.shippingMethods.indexOf(shippingMethod));
    }

    /* compiled from: ShippingMethodAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "shippingMethodView", "Lcom/stripe/android/view/ShippingMethodView;", "<init>", "(Lcom/stripe/android/view/ShippingMethodView;)V", "getShippingMethodView$payments_core_release", "()Lcom/stripe/android/view/ShippingMethodView;", "setShippingMethod", "", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "setSelected", "selected", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingMethodViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final ShippingMethodView shippingMethodView;

        /* renamed from: getShippingMethodView$payments_core_release, reason: from getter */
        public final ShippingMethodView getShippingMethodView() {
            return this.shippingMethodView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(ShippingMethodView shippingMethodView) {
            super(shippingMethodView);
            Intrinsics.checkNotNullParameter(shippingMethodView, "shippingMethodView");
            this.shippingMethodView = shippingMethodView;
        }

        public final void setShippingMethod(ShippingMethod shippingMethod) {
            Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }

        public final void setSelected(boolean selected) {
            this.shippingMethodView.setSelected(selected);
        }
    }
}
