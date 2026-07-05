package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcub extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcub(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcub zza(Context context, View view, zzfgt zzfgtVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcub zzcubVar = new zzcub(context);
        if (!zzfgtVar.zzv.isEmpty() && (resources = zzcubVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfgu zzfguVar = (zzfgu) zzfgtVar.zzv.get(0);
            zzcubVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfguVar.zza * displayMetrics.density), (int) (zzfguVar.zzb * displayMetrics.density)));
        }
        zzcubVar.zzb = view;
        zzcubVar.addView(view);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zzb(zzcubVar, zzcubVar);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzccv.zza(zzcubVar, zzcubVar);
        JSONObject jSONObject = zzfgtVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcubVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcubVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcubVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcubVar.addView(relativeLayout);
        return zzcubVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
