package H0;

import j0.AbstractC0150d;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public byte f418a;

    /* renamed from: b, reason: collision with root package name */
    public final o f419b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f420c;

    /* renamed from: d, reason: collision with root package name */
    public final k f421d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f422e;

    public j(t tVar) {
        AbstractC0150d.e(tVar, "source");
        o oVar = new o(tVar);
        this.f419b = oVar;
        Inflater inflater = new Inflater(true);
        this.f420c = inflater;
        this.f421d = new k(oVar, inflater);
        this.f422e = new CRC32();
    }

    public static void f(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3)));
        }
    }

    @Override // H0.t
    public final v a() {
        return this.f419b.f433a.a();
    }

    @Override // H0.t
    public final long b(long j2, e eVar) throws DataFormatException, IOException {
        o oVar;
        e eVar2;
        long j3;
        byte b2 = this.f418a;
        CRC32 crc32 = this.f422e;
        o oVar2 = this.f419b;
        if (b2 == 0) {
            oVar2.q(10L);
            e eVar3 = oVar2.f434b;
            byte bH = eVar3.h(3L);
            boolean z2 = ((bH >> 1) & 1) == 1;
            if (z2) {
                h(eVar3, 0L, 10L);
            }
            f("ID1ID2", 8075, oVar2.n());
            oVar2.r(8L);
            if (((bH >> 2) & 1) == 1) {
                oVar2.q(2L);
                if (z2) {
                    h(eVar3, 0L, 2L);
                }
                short sM = eVar3.m();
                long j4 = (short) (((sM & 255) << 8) | ((sM & 65280) >>> 8));
                oVar2.q(j4);
                if (z2) {
                    h(eVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                oVar2.r(j3);
            }
            if (((bH >> 3) & 1) == 1) {
                eVar2 = eVar3;
                long jH = oVar2.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    oVar = oVar2;
                    h(eVar2, 0L, jH + 1);
                } else {
                    oVar = oVar2;
                }
                oVar.r(jH + 1);
            } else {
                oVar = oVar2;
                eVar2 = eVar3;
            }
            if (((bH >> 4) & 1) == 1) {
                long jH2 = oVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    h(eVar2, 0L, jH2 + 1);
                }
                oVar.r(jH2 + 1);
            }
            if (z2) {
                oVar.q(2L);
                short sM2 = eVar2.m();
                f("FHCRC", (short) (((sM2 & 255) << 8) | ((sM2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f418a = (byte) 1;
        } else {
            oVar = oVar2;
        }
        if (this.f418a == 1) {
            long j5 = eVar.f412b;
            long jB = this.f421d.b(8192L, eVar);
            if (jB != -1) {
                h(eVar, j5, jB);
                return jB;
            }
            this.f418a = (byte) 2;
        }
        if (this.f418a != 2) {
            return -1L;
        }
        f("CRC", oVar.m(), (int) crc32.getValue());
        f("ISIZE", oVar.m(), (int) this.f420c.getBytesWritten());
        this.f418a = (byte) 3;
        if (oVar.f()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f421d.close();
    }

    public final void h(e eVar, long j2, long j3) {
        p pVar = eVar.f411a;
        AbstractC0150d.b(pVar);
        while (true) {
            int i2 = pVar.f438c;
            int i3 = pVar.f437b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            pVar = pVar.f441f;
            AbstractC0150d.b(pVar);
        }
        while (j3 > 0) {
            int iMin = (int) Math.min(pVar.f438c - r6, j3);
            this.f422e.update(pVar.f436a, (int) (pVar.f437b + j2), iMin);
            j3 -= iMin;
            pVar = pVar.f441f;
            AbstractC0150d.b(pVar);
            j2 = 0;
        }
    }
}
