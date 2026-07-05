package com.stripe.android.link;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: LinkAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkAction;", "", "BackPressed", "LogoutClicked", "Lcom/stripe/android/link/LinkAction$BackPressed;", "Lcom/stripe/android/link/LinkAction$LogoutClicked;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAction {

    /* compiled from: LinkAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkAction$BackPressed;", "Lcom/stripe/android/link/LinkAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BackPressed implements LinkAction {
        public static final int $stable = 0;
        public static final BackPressed INSTANCE = new BackPressed();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackPressed)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1016226302;
        }

        public String toString() {
            return "BackPressed";
        }

        private BackPressed() {
        }
    }

    /* compiled from: LinkAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkAction$LogoutClicked;", "Lcom/stripe/android/link/LinkAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LogoutClicked implements LinkAction {
        public static final int $stable = 0;
        public static final LogoutClicked INSTANCE = new LogoutClicked();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogoutClicked)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1839375168;
        }

        public String toString() {
            return "LogoutClicked";
        }

        private LogoutClicked() {
        }
    }
}
