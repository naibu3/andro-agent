package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeColorUtils.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0007H\u0002J&\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "colorAccent", "", "getColorAccent", "()I", "colorControlNormal", "getColorControlNormal", "textColorPrimary", "getTextColorPrimary", "textColorSecondary", "getTextColorSecondary", "colorPrimary", "getColorPrimary", "getTypedValue", "Landroid/util/TypedValue;", "idRes", "getTintedIconWithAttribute", "Landroid/graphics/drawable/Drawable;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeResource", "iconResourceId", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeColorUtils {
    private final int colorAccent;
    private final int colorControlNormal;
    private final int colorPrimary;
    private final Context context;
    private final int textColorPrimary;
    private final int textColorSecondary;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public StripeColorUtils(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAccent = getTypedValue(R.attr.colorAccent).data;
        this.colorControlNormal = getTypedValue(R.attr.colorControlNormal).data;
        this.textColorPrimary = getTypedValue(R.attr.textColorPrimary).data;
        this.textColorSecondary = getTypedValue(R.attr.textColorSecondary).data;
        this.colorPrimary = getTypedValue(R.attr.colorPrimary).data;
    }

    public final int getColorAccent() {
        return this.colorAccent;
    }

    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final int getColorPrimary() {
        return this.colorPrimary;
    }

    private final TypedValue getTypedValue(int idRes) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(idRes, typedValue, true);
        return typedValue;
    }

    public final Drawable getTintedIconWithAttribute(Resources.Theme theme, int attributeResource, int iconResourceId) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(attributeResource, typedValue, true);
        int i = typedValue.data;
        Drawable drawable = ContextCompat.getDrawable(this.context, iconResourceId);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap.mutate(), i);
        return drawableWrap;
    }

    /* compiled from: StripeColorUtils.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils$Companion;", "", "<init>", "()V", "isColorTransparent", "", "color", "", "isColorDark", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isColorTransparent(int color) {
            return Color.alpha(color) < 16;
        }

        public final boolean isColorDark(int color) {
            return (((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / ((double) 255) <= 0.5d;
        }
    }
}
