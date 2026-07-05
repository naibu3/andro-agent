package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedContentHelper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u000bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;", "", "embeddedContent", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;", "getEmbeddedContent", "()Lkotlinx/coroutines/flow/StateFlow;", "walletButtonsContent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "getWalletButtonsContent", "dataLoaded", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "embeddedViewDisplaysMandateText", "", "clearEmbeddedContent", "setSheetLauncher", "sheetLauncher", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;", "clearSheetLauncher", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedContentHelper {
    void clearEmbeddedContent();

    void clearSheetLauncher();

    void dataLoaded(PaymentMethodMetadata paymentMethodMetadata, PaymentSheet.Appearance.Embedded appearance, boolean embeddedViewDisplaysMandateText);

    StateFlow<EmbeddedContent> getEmbeddedContent();

    StateFlow<WalletButtonsContent> getWalletButtonsContent();

    void setSheetLauncher(EmbeddedSheetLauncher sheetLauncher);
}
