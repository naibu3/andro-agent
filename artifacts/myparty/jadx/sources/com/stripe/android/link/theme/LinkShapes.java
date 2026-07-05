package com.stripe.android.link.theme;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;

/* compiled from: LinkShapes.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/theme/LinkShapes;", "", "<init>", "()V", "extraSmall", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", Constants.COLLATION_DEFAULT, "getDefault", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkShapes {
    public static final int $stable = 0;
    public static final LinkShapes INSTANCE = new LinkShapes();
    private static final RoundedCornerShape extraSmall = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(4));
    private static final RoundedCornerShape default = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12));

    private LinkShapes() {
    }

    public final RoundedCornerShape getExtraSmall() {
        return extraSmall;
    }

    public final RoundedCornerShape getDefault() {
        return default;
    }
}
