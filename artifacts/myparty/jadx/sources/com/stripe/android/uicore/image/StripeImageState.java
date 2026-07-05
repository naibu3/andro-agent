package com.stripe.android.uicore.image;

import androidx.compose.ui.graphics.painter.Painter;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeImage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/stripe/android/uicore/image/StripeImageState$Error;", "Lcom/stripe/android/uicore/image/StripeImageState$Loading;", "Lcom/stripe/android/uicore/image/StripeImageState$Success;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class StripeImageState {
    public /* synthetic */ StripeImageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: StripeImage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Loading;", "Lcom/stripe/android/uicore/image/StripeImageState;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading extends StripeImageState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private StripeImageState() {
    }

    /* compiled from: StripeImage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Success;", "Lcom/stripe/android/uicore/image/StripeImageState;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends StripeImageState {
        public static final int $stable = 8;
        private final Painter painter;

        public static /* synthetic */ Success copy$default(Success success, Painter painter, int i, Object obj) {
            if ((i & 1) != 0) {
                painter = success.painter;
            }
            return success.copy(painter);
        }

        /* renamed from: component1, reason: from getter */
        public final Painter getPainter() {
            return this.painter;
        }

        public final Success copy(Painter painter) {
            Intrinsics.checkNotNullParameter(painter, "painter");
            return new Success(painter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.painter, ((Success) other).painter);
        }

        public int hashCode() {
            return this.painter.hashCode();
        }

        public String toString() {
            return "Success(painter=" + this.painter + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Painter painter) {
            super(null);
            Intrinsics.checkNotNullParameter(painter, "painter");
            this.painter = painter;
        }

        public final Painter getPainter() {
            return this.painter;
        }
    }

    /* compiled from: StripeImage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageState$Error;", "Lcom/stripe/android/uicore/image/StripeImageState;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends StripeImageState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
