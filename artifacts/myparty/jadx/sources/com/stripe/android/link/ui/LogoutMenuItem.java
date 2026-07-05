package com.stripe.android.link.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.menu.LinkMenuItem;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;

/* compiled from: LinkAppBarMenu.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/link/ui/LogoutMenuItem;", "Lcom/stripe/android/link/ui/menu/LinkMenuItem;", "<init>", "()V", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "isDestructive", "", "()Z", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogoutMenuItem implements LinkMenuItem {
    public static final LogoutMenuItem INSTANCE = new LogoutMenuItem();
    private static final ResolvableString text = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_log_out);
    private static final String testTag = LinkAppBarMenuKt.LOGOUT_MENU_ROW_TAG;
    private static final boolean isDestructive = true;
    public static final int $stable = 8;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutMenuItem)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1597127691;
    }

    public String toString() {
        return "LogoutMenuItem";
    }

    private LogoutMenuItem() {
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public ResolvableString getText() {
        return text;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public String getTestTag() {
        return testTag;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public boolean isDestructive() {
        return isDestructive;
    }
}
