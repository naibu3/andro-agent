package com.stripe.android.financialconnections.navigation;

import androidx.navigation.NavDestination;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DestinationMappers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"paneToDestination", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "Lcom/stripe/android/financialconnections/navigation/Destination;", ShareConstants.DESTINATION, "getDestination", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;", "pane", "Landroidx/navigation/NavDestination;", "getPane", "(Landroidx/navigation/NavDestination;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DestinationMappersKt {
    private static final Map<FinancialConnectionsSessionManifest.Pane, Destination> paneToDestination = MapsKt.mapOf(TuplesKt.to(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, Destination.InstitutionPicker.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.CONSENT, Destination.Consent.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, Destination.PartnerAuth.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER, Destination.PartnerAuthDrawer.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER, Destination.AccountPicker.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.SUCCESS, Destination.Success.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY, Destination.ManualEntry.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT, Destination.AttachLinkedPaymentAccount.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE, Destination.NetworkingLinkSignup.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, Destination.LinkLogin.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP, Destination.NetworkingLinkLoginWarmup.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION, Destination.NetworkingLinkVerification.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION, Destination.NetworkingSaveToLinkVerification.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER, Destination.LinkAccountPicker.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION, Destination.LinkStepUpVerification.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.RESET, Destination.Reset.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR, Destination.Error.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.EXIT, Destination.Exit.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, Destination.BankAuthRepair.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, Destination.ManualEntrySuccess.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.NOTICE, Destination.Notice.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED, Destination.AccountUpdateRequired.INSTANCE), TuplesKt.to(FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT, Destination.IDConsentContent.INSTANCE));

    public static final Destination getDestination(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "<this>");
        Destination destination = paneToDestination.get(pane);
        if (destination != null) {
            return destination;
        }
        throw new IllegalArgumentException("No corresponding destination for " + pane);
    }

    public static final FinancialConnectionsSessionManifest.Pane getPane(NavDestination navDestination) {
        Object next;
        FinancialConnectionsSessionManifest.Pane pane;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        Iterator<T> it = paneToDestination.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Destination) ((Map.Entry) next).getValue()).getFullRoute(), navDestination.getRoute())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (pane = (FinancialConnectionsSessionManifest.Pane) entry.getKey()) == null) {
            throw new IllegalArgumentException("No corresponding destination for " + navDestination);
        }
        return pane;
    }
}
