package com.stripe.android.core.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StripeFilePurpose.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/model/StripeFilePurpose;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "BusinessIcon", "BusinessLogo", "CustomerSignature", "DisputeEvidence", "IdentityDocument", "PciDocument", "TaxDocumentUserUpload", "IdentityPrivate", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeFilePurpose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StripeFilePurpose[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    public static final StripeFilePurpose BusinessIcon = new StripeFilePurpose("BusinessIcon", 0, "business_icon");
    public static final StripeFilePurpose BusinessLogo = new StripeFilePurpose("BusinessLogo", 1, "business_logo");
    public static final StripeFilePurpose CustomerSignature = new StripeFilePurpose("CustomerSignature", 2, "customer_signature");
    public static final StripeFilePurpose DisputeEvidence = new StripeFilePurpose("DisputeEvidence", 3, "dispute_evidence");
    public static final StripeFilePurpose IdentityDocument = new StripeFilePurpose("IdentityDocument", 4, "identity_document");
    public static final StripeFilePurpose PciDocument = new StripeFilePurpose("PciDocument", 5, "pci_document");
    public static final StripeFilePurpose TaxDocumentUserUpload = new StripeFilePurpose("TaxDocumentUserUpload", 6, "tax_document_user_upload");
    public static final StripeFilePurpose IdentityPrivate = new StripeFilePurpose("IdentityPrivate", 7, "identity_private");

    private static final /* synthetic */ StripeFilePurpose[] $values() {
        return new StripeFilePurpose[]{BusinessIcon, BusinessLogo, CustomerSignature, DisputeEvidence, IdentityDocument, PciDocument, TaxDocumentUserUpload, IdentityPrivate};
    }

    public static EnumEntries<StripeFilePurpose> getEntries() {
        return $ENTRIES;
    }

    private StripeFilePurpose(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        StripeFilePurpose[] stripeFilePurposeArr$values = $values();
        $VALUES = stripeFilePurposeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(stripeFilePurposeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: StripeFilePurpose.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/model/StripeFilePurpose$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/core/model/StripeFilePurpose;", "code", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StripeFilePurpose fromCode(String code) {
            StripeFilePurpose next;
            Iterator<StripeFilePurpose> it = StripeFilePurpose.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getCode(), code)) {
                    break;
                }
            }
            return next;
        }
    }

    public static StripeFilePurpose valueOf(String str) {
        return (StripeFilePurpose) Enum.valueOf(StripeFilePurpose.class, str);
    }

    public static StripeFilePurpose[] values() {
        return (StripeFilePurpose[]) $VALUES.clone();
    }
}
