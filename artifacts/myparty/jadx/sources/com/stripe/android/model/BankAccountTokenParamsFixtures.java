package com.stripe.android.model;

import com.stripe.android.model.BankAccountTokenParams;
import kotlin.Metadata;

/* compiled from: BankAccountTokenParamsFixtures.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParamsFixtures;", "", "<init>", "()V", "DEFAULT", "Lcom/stripe/android/model/BankAccountTokenParams;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccountTokenParamsFixtures {
    public static final BankAccountTokenParamsFixtures INSTANCE = new BankAccountTokenParamsFixtures();
    public static final BankAccountTokenParams DEFAULT = new BankAccountTokenParams("US", Source.USD, "000123456789", BankAccountTokenParams.Type.Individual, "Jenny Rosen", "110000000");
    public static final int $stable = 8;

    private BankAccountTokenParamsFixtures() {
    }
}
