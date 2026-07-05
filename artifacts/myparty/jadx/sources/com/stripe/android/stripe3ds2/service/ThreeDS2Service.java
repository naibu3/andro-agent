package com.stripe.android.stripe3ds2.service;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ThreeDS2Service.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/ThreeDS2Service;", "", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", "warnings", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarnings", "()Ljava/util/List;", "createTransaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "directoryServerID", ChallengeRequestData.FIELD_MESSAGE_VERSION, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ThreeDS2Service {
    Transaction createTransaction(String directoryServerID, String messageVersion) throws SDKRuntimeException, InvalidInputException;

    String getSdkVersion();

    List<Warning> getWarnings();
}
