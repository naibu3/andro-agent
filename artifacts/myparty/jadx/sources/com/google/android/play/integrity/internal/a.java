package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f309a;
    private final String b;

    protected a(IBinder iBinder, String str) {
        this.f309a = iBinder;
        this.b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f309a;
    }

    protected final void b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f309a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
