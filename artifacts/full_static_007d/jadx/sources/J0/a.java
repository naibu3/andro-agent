package J0;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f471a;

    public a() {
        this.f471a = new ArrayList();
    }

    public final void a(Collection collection) {
        ArrayList arrayList = this.f471a;
        arrayList.ensureCapacity(collection.size() + arrayList.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object objM = c.m(it.next());
            c.l(objM);
            arrayList.add(objM);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c b(int i2) {
        Object obj;
        if (i2 >= 0) {
            ArrayList arrayList = this.f471a;
            obj = i2 >= arrayList.size() ? null : arrayList.get(i2);
        }
        if (obj == null) {
            throw new b(A.e.b("JSONArray[", i2, "] not found."));
        }
        if (obj instanceof c) {
            return (c) obj;
        }
        throw new b(A.e.b("JSONArray[", i2, "] is not a JSONObject."), null);
    }

    public final void c(StringWriter stringWriter, int i2) throws IOException {
        ArrayList arrayList = this.f471a;
        try {
            int size = arrayList.size();
            stringWriter.write(91);
            int i3 = 0;
            if (size == 1) {
                try {
                    c.o(stringWriter, arrayList.get(0), i2);
                } catch (Exception e2) {
                    throw new b("Unable to write JSONArray value at index: 0", e2);
                }
            } else if (size != 0) {
                boolean z2 = false;
                while (i3 < size) {
                    if (z2) {
                        stringWriter.write(44);
                    }
                    c.f(stringWriter, i2);
                    try {
                        c.o(stringWriter, arrayList.get(i3), i2);
                        i3++;
                        z2 = true;
                    } catch (Exception e3) {
                        throw new b("Unable to write JSONArray value at index: " + i3, e3);
                    }
                }
                c.f(stringWriter, i2);
            }
            stringWriter.write(93);
        } catch (IOException e4) {
            throw new b(e4.getMessage(), e4);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f471a.iterator();
    }

    public final String toString() {
        String string;
        try {
            StringWriter stringWriter = new StringWriter();
            synchronized (stringWriter.getBuffer()) {
                c(stringWriter, 0);
                string = stringWriter.toString();
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Collection collection) {
        if (collection == null) {
            this.f471a = new ArrayList();
        } else {
            this.f471a = new ArrayList(collection.size());
            a(collection);
        }
    }

    public a(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            boolean zIsArray = obj.getClass().isArray();
            ArrayList arrayList = this.f471a;
            if (zIsArray) {
                int length = Array.getLength(obj);
                arrayList.ensureCapacity(arrayList.size() + length);
                for (int i2 = 0; i2 < length; i2++) {
                    Object objM = c.m(Array.get(obj, i2));
                    c.l(objM);
                    this.f471a.add(objM);
                }
                return;
            }
            if (obj instanceof a) {
                arrayList.addAll(((a) obj).f471a);
                return;
            }
            if (obj instanceof Collection) {
                a((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM2 = c.m(it.next());
                    c.l(objM2);
                    this.f471a.add(objM2);
                }
                return;
            }
            throw new b("JSONArray initial value should be a string or collection or array.");
        }
        throw new b("JSONArray initial value should be a string or collection or array.");
    }
}
