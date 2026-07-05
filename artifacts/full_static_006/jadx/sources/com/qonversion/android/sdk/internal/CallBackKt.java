package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: extensions.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\t\u001a\u00020\u0006H\u0016J$\u0010\u000f\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016R7\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lretrofit2/Callback;", "()V", "onFailure", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "t", "", "getOnFailure", "()Lkotlin/jvm/functions/Function1;", "setOnFailure", "(Lkotlin/jvm/functions/Function1;)V", "onResponse", "Lretrofit2/Response;", "getOnResponse", "setOnResponse", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "response", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CallBackKt<T> implements Callback<T> {
    private Function1<? super Throwable, Unit> onFailure;
    private Function1<? super Response<T>, Unit> onResponse;

    public final Function1<Response<T>, Unit> getOnResponse() {
        return this.onResponse;
    }

    public final void setOnResponse(Function1<? super Response<T>, Unit> function1) {
        this.onResponse = function1;
    }

    public final Function1<Throwable, Unit> getOnFailure() {
        return this.onFailure;
    }

    public final void setOnFailure(Function1<? super Throwable, Unit> function1) {
        this.onFailure = function1;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<T> call, Throwable t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "t");
        Function1<? super Throwable, Unit> function1 = this.onFailure;
        if (function1 != null) {
            function1.invoke(t);
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<T> call, Response<T> response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Function1<? super Response<T>, Unit> function1 = this.onResponse;
        if (function1 != null) {
            function1.invoke(response);
        }
    }
}
