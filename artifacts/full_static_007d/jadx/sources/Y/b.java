package Y;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.f;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f682d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f685g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f686i;

    /* renamed from: j, reason: collision with root package name */
    public int f687j;

    /* renamed from: k, reason: collision with root package name */
    public int f688k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new f(0), new f(0), new f(0));
    }

    @Override // Y.a
    public final b a() {
        Parcel parcel = this.f683e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f687j;
        if (i2 == this.f684f) {
            i2 = this.f685g;
        }
        return new b(parcel, iDataPosition, i2, this.h + "  ", this.f679a, this.f680b, this.f681c);
    }

    @Override // Y.a
    public final boolean e(int i2) {
        while (this.f687j < this.f685g) {
            int i3 = this.f688k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f687j;
            Parcel parcel = this.f683e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f688k = parcel.readInt();
            this.f687j += i5;
        }
        return this.f688k == i2;
    }

    @Override // Y.a
    public final void h(int i2) {
        int i3 = this.f686i;
        SparseIntArray sparseIntArray = this.f682d;
        Parcel parcel = this.f683e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f686i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f682d = new SparseIntArray();
        this.f686i = -1;
        this.f688k = -1;
        this.f683e = parcel;
        this.f684f = i2;
        this.f685g = i3;
        this.f687j = i2;
        this.h = str;
    }
}
