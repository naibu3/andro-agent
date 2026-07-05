package b0;

import j0.AbstractC0150d;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k0.InterfaceC0215a;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080f extends AbstractList implements List, InterfaceC0215a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f1227d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f1228a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1229b = f1227d;

    /* renamed from: c, reason: collision with root package name */
    public int f1230c;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1229b.length;
        while (i2 < length && it.hasNext()) {
            this.f1229b[i2] = it.next();
            i2++;
        }
        int i3 = this.f1228a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f1229b[i4] = it.next();
        }
        this.f1230c = collection.size() + this.f1230c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.f1230c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f1230c + 1);
        int iF = f(this.f1228a + i2);
        int i4 = this.f1230c;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iF == 0) {
                Object[] objArr = this.f1229b;
                AbstractC0150d.e(objArr, "<this>");
                iF = objArr.length;
            }
            int i5 = iF - 1;
            int i6 = this.f1228a;
            if (i6 == 0) {
                Object[] objArr2 = this.f1229b;
                AbstractC0150d.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f1228a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f1229b;
                objArr3[length] = objArr3[i7];
                AbstractC0081g.y(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f1229b;
                AbstractC0081g.y(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f1229b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0081g.y(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f1229b[i5] = obj;
            this.f1228a = length;
        } else {
            int iF2 = f(this.f1228a + i4);
            if (iF < iF2) {
                Object[] objArr6 = this.f1229b;
                AbstractC0081g.y(objArr6, objArr6, iF + 1, iF, iF2);
            } else {
                Object[] objArr7 = this.f1229b;
                AbstractC0081g.y(objArr7, objArr7, 1, 0, iF2);
                Object[] objArr8 = this.f1229b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0081g.y(objArr8, objArr8, iF + 1, iF, objArr8.length - 1);
            }
            this.f1229b[iF] = obj;
        }
        this.f1230c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC0150d.e(collection, "elements");
        int i3 = this.f1230c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.f1230c) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f1230c);
        int iF = f(this.f1228a + this.f1230c);
        int iF2 = f(this.f1228a + i2);
        int size = collection.size();
        if (i2 < ((this.f1230c + 1) >> 1)) {
            int i4 = this.f1228a;
            int length = i4 - size;
            if (iF2 < i4) {
                Object[] objArr = this.f1229b;
                AbstractC0081g.y(objArr, objArr, length, i4, objArr.length);
                if (size >= iF2) {
                    Object[] objArr2 = this.f1229b;
                    AbstractC0081g.y(objArr2, objArr2, objArr2.length - size, 0, iF2);
                } else {
                    Object[] objArr3 = this.f1229b;
                    AbstractC0081g.y(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1229b;
                    AbstractC0081g.y(objArr4, objArr4, 0, size, iF2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f1229b;
                AbstractC0081g.y(objArr5, objArr5, length, i4, iF2);
            } else {
                Object[] objArr6 = this.f1229b;
                length += objArr6.length;
                int i5 = iF2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0081g.y(objArr6, objArr6, length, i4, iF2);
                } else {
                    AbstractC0081g.y(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f1229b;
                    AbstractC0081g.y(objArr7, objArr7, 0, this.f1228a + length2, iF2);
                }
            }
            this.f1228a = length;
            a(d(iF2 - size), collection);
        } else {
            int i6 = iF2 + size;
            if (iF2 < iF) {
                int i7 = size + iF;
                Object[] objArr8 = this.f1229b;
                if (i7 <= objArr8.length) {
                    AbstractC0081g.y(objArr8, objArr8, i6, iF2, iF);
                } else if (i6 >= objArr8.length) {
                    AbstractC0081g.y(objArr8, objArr8, i6 - objArr8.length, iF2, iF);
                } else {
                    int length3 = iF - (i7 - objArr8.length);
                    AbstractC0081g.y(objArr8, objArr8, 0, length3, iF);
                    Object[] objArr9 = this.f1229b;
                    AbstractC0081g.y(objArr9, objArr9, i6, iF2, length3);
                }
            } else {
                Object[] objArr10 = this.f1229b;
                AbstractC0081g.y(objArr10, objArr10, size, 0, iF);
                Object[] objArr11 = this.f1229b;
                if (i6 >= objArr11.length) {
                    AbstractC0081g.y(objArr11, objArr11, i6 - objArr11.length, iF2, objArr11.length);
                } else {
                    AbstractC0081g.y(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1229b;
                    AbstractC0081g.y(objArr12, objArr12, i6, iF2, objArr12.length - size);
                }
            }
            a(iF2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f1230c + 1);
        int length = this.f1228a;
        if (length == 0) {
            Object[] objArr = this.f1229b;
            AbstractC0150d.e(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f1228a = i2;
        this.f1229b[i2] = obj;
        this.f1230c++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f1230c + 1);
        this.f1229b[f(this.f1228a + this.f1230c)] = obj;
        this.f1230c++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1229b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f1227d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f1229b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0081g.y(objArr, objArr2, 0, this.f1228a, objArr.length);
        Object[] objArr3 = this.f1229b;
        int length2 = objArr3.length;
        int i4 = this.f1228a;
        AbstractC0081g.y(objArr3, objArr2, length2 - i4, 0, i4);
        this.f1228a = 0;
        this.f1229b = objArr2;
    }

    public final int c(int i2) {
        AbstractC0150d.e(this.f1229b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f1228a, f(this.f1228a + this.f1230c));
        }
        this.f1228a = 0;
        this.f1230c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.f1229b.length : i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            AbstractC0081g.A(this.f1229b, i2, i3);
            return;
        }
        Object[] objArr = this.f1229b;
        AbstractC0081g.A(objArr, i2, objArr.length);
        AbstractC0081g.A(this.f1229b, 0, i3);
    }

    public final int f(int i2) {
        Object[] objArr = this.f1229b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f1230c;
        if (i2 >= 0 && i2 < i3) {
            return this.f1229b[f(this.f1228a + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iF = f(this.f1228a + this.f1230c);
        int length = this.f1228a;
        if (length < iF) {
            while (length < iF) {
                if (AbstractC0150d.a(obj, this.f1229b[length])) {
                    i2 = this.f1228a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.f1229b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iF; i3++) {
                    if (AbstractC0150d.a(obj, this.f1229b[i3])) {
                        length = i3 + this.f1229b.length;
                        i2 = this.f1228a;
                    }
                }
                return -1;
            }
            if (AbstractC0150d.a(obj, this.f1229b[length])) {
                i2 = this.f1228a;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1230c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iF = f(this.f1228a + this.f1230c);
        int i3 = this.f1228a;
        if (i3 < iF) {
            length = iF - 1;
            if (i3 <= length) {
                while (!AbstractC0150d.a(obj, this.f1229b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f1228a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iF) {
            int i4 = iF - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f1229b;
                    AbstractC0150d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f1228a;
                    if (i5 <= length) {
                        while (!AbstractC0150d.a(obj, this.f1229b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f1228a;
                    }
                } else {
                    if (AbstractC0150d.a(obj, this.f1229b[i4])) {
                        length = i4 + this.f1229b.length;
                        i2 = this.f1228a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f1230c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int iF = f(this.f1228a + i2);
        Object[] objArr = this.f1229b;
        Object obj = objArr[iF];
        if (i2 < (this.f1230c >> 1)) {
            int i4 = this.f1228a;
            if (iF >= i4) {
                AbstractC0081g.y(objArr, objArr, i4 + 1, i4, iF);
            } else {
                AbstractC0081g.y(objArr, objArr, 1, 0, iF);
                Object[] objArr2 = this.f1229b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f1228a;
                AbstractC0081g.y(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1229b;
            int i6 = this.f1228a;
            objArr3[i6] = null;
            this.f1228a = c(i6);
        } else {
            int iF2 = f((size() - 1) + this.f1228a);
            if (iF <= iF2) {
                Object[] objArr4 = this.f1229b;
                AbstractC0081g.y(objArr4, objArr4, iF, iF + 1, iF2 + 1);
            } else {
                Object[] objArr5 = this.f1229b;
                AbstractC0081g.y(objArr5, objArr5, iF, iF + 1, objArr5.length);
                Object[] objArr6 = this.f1229b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0081g.y(objArr6, objArr6, 0, 1, iF2 + 1);
            }
            this.f1229b[iF2] = null;
        }
        this.f1230c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        AbstractC0150d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1229b.length != 0) {
            int iF2 = f(this.f1228a + this.f1230c);
            int i2 = this.f1228a;
            if (i2 < iF2) {
                iF = i2;
                while (i2 < iF2) {
                    Object obj = this.f1229b[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1229b[iF] = obj;
                        iF++;
                    }
                    i2++;
                }
                AbstractC0081g.A(this.f1229b, iF, iF2);
            } else {
                int length = this.f1229b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f1229b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1229b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr2 = this.f1229b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1229b[iF] = obj3;
                        iF = c(iF);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f1230c = d(iF - this.f1228a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f1229b;
        int i2 = this.f1228a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f1228a = c(i2);
        this.f1230c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int iF = f((size() - 1) + this.f1228a);
        Object[] objArr = this.f1229b;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.f1230c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        C0.f.g(i2, i3, this.f1230c);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f1230c) {
            clear();
            return;
        }
        if (i4 == 1) {
            remove(i2);
            return;
        }
        g();
        if (i2 < this.f1230c - i3) {
            int iF = f((i2 - 1) + this.f1228a);
            int iF2 = f((i3 - 1) + this.f1228a);
            while (i2 > 0) {
                int i5 = iF + 1;
                int iMin = Math.min(i2, Math.min(i5, iF2 + 1));
                Object[] objArr = this.f1229b;
                int i6 = iF2 - iMin;
                int i7 = iF - iMin;
                AbstractC0081g.y(objArr, objArr, i6 + 1, i7 + 1, i5);
                iF = d(i7);
                iF2 = d(i6);
                i2 -= iMin;
            }
            int iF3 = f(this.f1228a + i4);
            e(this.f1228a, iF3);
            this.f1228a = iF3;
        } else {
            int iF4 = f(this.f1228a + i3);
            int iF5 = f(this.f1228a + i2);
            int i8 = this.f1230c;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1229b;
                i3 = Math.min(i8, Math.min(objArr2.length - iF4, objArr2.length - iF5));
                Object[] objArr3 = this.f1229b;
                int i9 = iF4 + i3;
                AbstractC0081g.y(objArr3, objArr3, iF5, iF4, i9);
                iF4 = f(i9);
                iF5 = f(iF5 + i3);
            }
            int iF6 = f(this.f1228a + this.f1230c);
            e(d(iF6 - i4), iF6);
        }
        this.f1230c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        AbstractC0150d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1229b.length != 0) {
            int iF2 = f(this.f1228a + this.f1230c);
            int i2 = this.f1228a;
            if (i2 < iF2) {
                iF = i2;
                while (i2 < iF2) {
                    Object obj = this.f1229b[i2];
                    if (collection.contains(obj)) {
                        this.f1229b[iF] = obj;
                        iF++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                AbstractC0081g.A(this.f1229b, iF, iF2);
            } else {
                int length = this.f1229b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f1229b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f1229b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr2 = this.f1229b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f1229b[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f1230c = d(iF - this.f1228a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f1230c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int iF = f(this.f1228a + i2);
        Object[] objArr = this.f1229b;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1230c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f1230c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC0150d.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f1230c;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            AbstractC0150d.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.f1228a + this.f1230c);
        int i3 = this.f1228a;
        if (i3 < iF) {
            AbstractC0081g.z(this.f1229b, objArr, i3, iF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1229b;
            AbstractC0081g.y(objArr2, objArr, 0, this.f1228a, objArr2.length);
            Object[] objArr3 = this.f1229b;
            AbstractC0081g.y(objArr3, objArr, objArr3.length - this.f1228a, 0, iF);
        }
        int i4 = this.f1230c;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0150d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f1230c);
        a(f(this.f1228a + this.f1230c), collection);
        return true;
    }
}
