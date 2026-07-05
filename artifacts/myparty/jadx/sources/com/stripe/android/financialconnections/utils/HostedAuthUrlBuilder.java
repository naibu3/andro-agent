package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.networking.QueryStringFactory;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.model.IncentiveEligibilitySession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HostedAuthUrlBuilder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJD\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/utils/HostedAuthUrlBuilder;", "", "<init>", "()V", "create", "", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "hostedAuthUrl", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "isInstantDebits", "", "linkMode", "Lcom/stripe/android/model/LinkMode;", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "incentiveEligibilitySession", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "makeBillingDetailsQueryParams", "billingAddress", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HostedAuthUrlBuilder {
    public static final HostedAuthUrlBuilder INSTANCE = new HostedAuthUrlBuilder();

    private HostedAuthUrlBuilder() {
    }

    public static /* synthetic */ String create$default(HostedAuthUrlBuilder hostedAuthUrlBuilder, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, String str, ElementsSessionContext.PrefillDetails prefillDetails, int i, Object obj) {
        if ((i & 4) != 0) {
            ElementsSessionContext elementsSessionContext = financialConnectionsSheetActivityArgs.getElementsSessionContext();
            prefillDetails = elementsSessionContext != null ? elementsSessionContext.getPrefillDetails() : null;
        }
        return hostedAuthUrlBuilder.create(financialConnectionsSheetActivityArgs, str, prefillDetails);
    }

    public final String create(FinancialConnectionsSheetActivityArgs args, String hostedAuthUrl, ElementsSessionContext.PrefillDetails prefillDetails) {
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z = FinancialConnectionsSheetActivityArgsKt.getFlowType(args) == FinancialConnectionsSheetFlowType.ForInstantDebits;
        ElementsSessionContext elementsSessionContext = args.getElementsSessionContext();
        LinkMode linkMode = elementsSessionContext != null ? elementsSessionContext.getLinkMode() : null;
        ElementsSessionContext elementsSessionContext2 = args.getElementsSessionContext();
        ElementsSessionContext.BillingDetails billingDetails = elementsSessionContext2 != null ? elementsSessionContext2.getBillingDetails() : null;
        ElementsSessionContext elementsSessionContext3 = args.getElementsSessionContext();
        return create(hostedAuthUrl, z, linkMode, billingDetails, prefillDetails, elementsSessionContext3 != null ? elementsSessionContext3.getIncentiveEligibilitySession() : null);
    }

    private final String create(String hostedAuthUrl, boolean isInstantDebits, LinkMode linkMode, ElementsSessionContext.BillingDetails billingDetails, ElementsSessionContext.PrefillDetails prefillDetails, IncentiveEligibilitySession incentiveEligibilitySession) {
        if (hostedAuthUrl == null) {
            return null;
        }
        List listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(hostedAuthUrl);
        if (isInstantDebits) {
            listMutableListOf.add("return_payment_method=true");
            listMutableListOf.add("expand_payment_method=true");
            listMutableListOf.add("instantDebitsIncentive=" + (incentiveEligibilitySession != null));
            if (linkMode != null) {
                listMutableListOf.add("link_mode=" + linkMode.getValue());
            }
            if (billingDetails != null) {
                listMutableListOf.add(INSTANCE.makeBillingDetailsQueryParams(billingDetails));
            }
            if (incentiveEligibilitySession != null) {
                listMutableListOf.add("incentiveEligibilitySession=" + incentiveEligibilitySession.getId());
            }
        }
        if (prefillDetails != null) {
            String email = prefillDetails.getEmail();
            if (email != null) {
                listMutableListOf.add("email=" + email);
            }
            String phone = prefillDetails.getPhone();
            if (phone != null) {
                listMutableListOf.add("linkMobilePhone=" + phone);
            }
            String phoneCountryCode = prefillDetails.getPhoneCountryCode();
            if (phoneCountryCode != null) {
                listMutableListOf.add("linkMobilePhoneCountry=" + phoneCountryCode);
            }
        }
        listMutableListOf.add("launched_by=android_sdk");
        return kotlin.collections.CollectionsKt.joinToString$default(listMutableListOf, "&", null, null, 0, null, null, 62, null);
    }

    private final String makeBillingDetailsQueryParams(ElementsSessionContext.BillingDetails billingAddress) {
        return QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(MapsKt.mapOf(TuplesKt.to("billingDetails", BillingDetailsExtensionsKt.toApiParams(billingAddress))));
    }
}
