package com.stripe.android.customersheet.data;

import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CustomerSheetSavedSelectionDataSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0007J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "", "retrieveSavedSelection", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "customerSessionElementsSession", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSavedSelection", "", BaseSheetViewModel.SAVE_SELECTION, "shouldSyncDefault", "", "(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetSavedSelectionDataSource {
    Object retrieveSavedSelection(CustomerSessionElementsSession customerSessionElementsSession, Continuation<? super CustomerSheetDataResult<SavedSelection>> continuation);

    Object setSavedSelection(SavedSelection savedSelection, boolean z, Continuation<? super CustomerSheetDataResult<Unit>> continuation);
}
