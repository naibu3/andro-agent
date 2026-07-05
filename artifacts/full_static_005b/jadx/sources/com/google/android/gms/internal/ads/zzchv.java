package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzchv extends FrameLayout implements zzchd {
    private final zzchd zza;
    private final zzcdt zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzchv(zzchd zzchdVar) {
        super(zzchdVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzchdVar;
        this.zzb = new zzcdt(zzchdVar.zzE(), this, this);
        addView((View) zzchdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void destroy() {
        final zzehe zzeheVarZzP;
        final zzehg zzehgVarZzQ = zzQ();
        if (zzehgVarZzQ != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcht
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzu.zzA().zzi(zzehgVarZzQ.zza());
                }
            });
            zzchd zzchdVar = this.zza;
            zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
            Objects.requireNonNull(zzchdVar);
            zzfuvVar.postDelayed(new zzchr(zzchdVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfa)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() || (zzeheVarZzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchu
                @Override // java.lang.Runnable
                public final void run() {
                    zzeheVarZzP.zzf(new zzchs(this.zza));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzchd
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzchd
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final void zzC(zzcif zzcifVar) {
        this.zza.zzC(zzcifVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcgu
    public final zzfgt zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcis
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzciq
    public final zzaxd zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzbca zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzbhj zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzciv zzN() {
        return ((zzcic) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcip
    public final zzcix zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzehe zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzehg zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcig
    public final zzfgw zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzfhs zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final ListenableFuture zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzW(zzfgt zzfgtVar, zzfgw zzfgwVar) {
        this.zza.zzW(zzfgtVar, zzfgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(String str) {
        ((zzcic) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaD(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaM)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    final /* synthetic */ void zzaI(boolean z) {
        zzchd zzchdVar = this.zza;
        zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzchdVar);
        zzfuvVar.post(new zzchr(zzchdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2) {
        this.zza.zzaJ(zzcVar, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaK(String str, String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zza.zzaL(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaM(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaN(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzab() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zza()));
        zzcic zzcicVar = (zzcic) this.zza;
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzac.zzb(zzcicVar.getContext())));
        zzcicVar.zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzag(String str, zzblp zzblpVar) {
        this.zza.zzag(str, zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzah() {
        zzehg zzehgVarZzQ;
        zzehe zzeheVarZzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzu.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzy());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && (zzeheVarZzP = zzP()) != null) {
            zzeheVarZzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfb)).booleanValue() && (zzehgVarZzQ = zzQ()) != null && zzehgVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzehgVarZzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaj(zzcix zzcixVar) {
        this.zza.zzaj(zzcixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzak(zzbca zzbcaVar) {
        this.zza.zzak(zzbcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzap(zzbhh zzbhhVar) {
        this.zza.zzap(zzbhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzar(zzbhj zzbhjVar) {
        this.zza.zzar(zzbhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzas(zzehe zzeheVar) {
        this.zza.zzas(zzeheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzat(zzehg zzehgVar) {
        this.zza.zzat(zzehgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaz(String str, zzblp zzblpVar) {
        this.zza.zzaz(str, zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final String zzdi() {
        return this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        this.zza.zzdp(zzbamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdR)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdR)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcee
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final zzbfb zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcic) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final zzbfc zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcee
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final zzcdt zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final zzcfp zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final zzcif zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final void zzt(String str, zzcfp zzcfpVar) {
        this.zza.zzt(str, zzcfpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
