package K;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0053b;
import androidx.fragment.app.s;
import androidx.fragment.app.v;
import androidx.fragment.app.x;
import androidx.versionedparcelable.ParcelImpl;
import c.C0095a;
import j0.AbstractC0150d;
import java.util.ArrayList;
import k.P;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507a;

    public /* synthetic */ h(int i2) {
        this.f507a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f507a) {
            case 0:
                i iVar = new i(parcel);
                iVar.f508a = parcel.readInt();
                return iVar;
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new C0053b(parcel);
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                return new androidx.fragment.app.c(parcel);
            case 4:
                s sVar = new s();
                sVar.f1074a = parcel.readString();
                sVar.f1075b = parcel.readInt();
                return sVar;
            case 5:
                v vVar = new v();
                vVar.f1111e = null;
                vVar.f1112f = new ArrayList();
                vVar.f1113g = new ArrayList();
                vVar.f1107a = parcel.createStringArrayList();
                vVar.f1108b = parcel.createStringArrayList();
                vVar.f1109c = (C0053b[]) parcel.createTypedArray(C0053b.CREATOR);
                vVar.f1110d = parcel.readInt();
                vVar.f1111e = parcel.readString();
                vVar.f1112f = parcel.createStringArrayList();
                vVar.f1113g = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                vVar.h = parcel.createTypedArrayList(s.CREATOR);
                return vVar;
            case 6:
                return new x(parcel);
            case 7:
                AbstractC0150d.e(parcel, "parcel");
                return new C0095a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            default:
                P p2 = new P(parcel);
                p2.f1821a = parcel.readByte() != 0;
                return p2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f507a) {
            case 0:
                return new i[i2];
            case 1:
                return new ParcelImpl[i2];
            case 2:
                return new C0053b[i2];
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                return new androidx.fragment.app.c[i2];
            case 4:
                return new s[i2];
            case 5:
                return new v[i2];
            case 6:
                return new x[i2];
            case 7:
                return new C0095a[i2];
            default:
                return new P[i2];
        }
    }
}
