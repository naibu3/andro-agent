package g;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1478c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f1479d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C c2, D0.h hVar) {
        super(c2);
        this.f1479d = c2;
        this.f1480e = hVar;
    }

    @Override // g.z
    public final IntentFilter d() {
        switch (this.f1478c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // g.z
    public final int e() {
        Location location;
        boolean z2;
        long j2;
        switch (this.f1478c) {
            case 0:
                return t.a((PowerManager) this.f1480e) ? 2 : 1;
            default:
                D0.h hVar = (D0.h) this.f1480e;
                M m2 = (M) hVar.f260d;
                if (m2.f1381b > System.currentTimeMillis()) {
                    z2 = m2.f1380a;
                } else {
                    Context context = (Context) hVar.f258b;
                    int iH = C0.f.h(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) hVar.f259c;
                    if (iH == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (C0.f.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (L.f1376d == null) {
                            L.f1376d = new L();
                        }
                        L l2 = L.f1376d;
                        l2.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        l2.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = l2.f1379c == 1;
                        long j3 = l2.f1378b;
                        long j4 = l2.f1377a;
                        l2.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = l2.f1378b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j4) {
                                j5 = jCurrentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        m2.f1380a = z2;
                        m2.f1381b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // g.z
    public final void g() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f1478c) {
            case 0:
                this.f1479d.o(true, true);
                break;
            default:
                this.f1479d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C c2, Context context) {
        super(c2);
        this.f1479d = c2;
        this.f1480e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
