package com.stripe.android.paymentsheet.addresselement.analytics;

import kotlin.Metadata;

/* compiled from: AddressLauncherEventReporter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J'\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "", "onShow", "", "country", "", "onCompleted", "autocompleteResultSelected", "", "editDistance", "", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressLauncherEventReporter {
    void onCompleted(String country, boolean autocompleteResultSelected, Integer editDistance);

    void onShow(String country);
}
