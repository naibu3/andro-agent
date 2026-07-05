package com.stripe.android.financialconnections.repository;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistingRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b!\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/repository/PersistingRepository;", ExifInterface.LATITUDE_SOUTH, "Landroid/os/Parcelable;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", SDKConstants.PARAM_KEY, "", "get", "()Landroid/os/Parcelable;", "set", "", ServerProtocol.DIALOG_PARAM_STATE, "(Landroid/os/Parcelable;)V", "clear", "makeKey", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PersistingRepository<S extends Parcelable> {
    public static final int $stable = 8;
    private final String key;
    private final SavedStateHandle savedStateHandle;

    public PersistingRepository(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.key = makeKey();
    }

    public final S get() {
        return (S) this.savedStateHandle.get(this.key);
    }

    public final void set(S state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.savedStateHandle.set(this.key, state);
    }

    public final void clear() {
        this.savedStateHandle.remove(this.key);
    }

    private final String makeKey() {
        return "PersistedState_" + getClass().getName();
    }
}
