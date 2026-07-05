package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkMode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"analyticsValue", "", "Lcom/stripe/android/model/LinkMode;", "getAnalyticsValue", "(Lcom/stripe/android/model/LinkMode;)Ljava/lang/String;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkModeKt {

    /* compiled from: LinkMode.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkMode.values().length];
            try {
                iArr[LinkMode.Passthrough.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkMode.LinkPaymentMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkMode.LinkCardBrand.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getAnalyticsValue(LinkMode linkMode) {
        Intrinsics.checkNotNullParameter(linkMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[linkMode.ordinal()];
        if (i == 1) {
            return "passthrough";
        }
        if (i == 2) {
            return "payment_method_mode";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "link_card_brand";
    }
}
