package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzegk extends zzbuy {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdvc zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzefz zze;
    private String zzf;
    private String zzg;

    public zzegk(Context context, zzefz zzefzVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdvc zzdvcVar) {
        this.zzb = context;
        this.zzc = zzdvcVar;
        this.zzd = zzrVar;
        this.zze = zzefzVar;
    }

    public static void zzc(Context context, zzdvc zzdvcVar, zzefz zzefzVar, String str, String str2, Map map) {
        String strZze;
        String str3 = true != com.google.android.gms.ads.internal.zzu.zzo().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdvcVar != null) {
            zzdvb zzdvbVarZza = zzdvcVar.zza();
            zzdvbVarZza.zzb("gqi", str);
            zzdvbVarZza.zzb("action", str2);
            zzdvbVarZza.zzb("device_connectivity", str3);
            zzdvbVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdvbVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdvbVarZza.zze();
        } else {
            strZze = "";
        }
        zzefzVar.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, strZze, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfvl.zzb(context, 0, intent, zzfvl.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfvl.zza(context, 0, intent, 201326592);
    }

    private final String zzr() {
        zzefr zzefrVar = (zzefr) this.zza.get(this.zzf);
        return zzefrVar == null ? "" : zzefrVar.zzb();
    }

    private static String zzs(int i, String str) {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        return resourcesZze == null ? str : resourcesZze.getString(i);
    }

    private final void zzt(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzu() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        boolean zZzg;
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzbt zzbtVarZzz = com.google.android.gms.ads.internal.util.zzt.zzz(this.zzb);
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzefr zzefrVar = (zzefr) this.zza.get(str2);
            zZzg = zzbtVarZzz.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzefrVar == null ? "" : zzefrVar.zzc()));
            if (!zZzg) {
                try {
                    zZzg = zzbtVarZzz.zzf(ObjectWrapper.wrap(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to schedule offline notification poster.", e);
                    if (zZzg) {
                    }
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZzg) {
            this.zze.zzc(this.zzf);
            zzt(this.zzf, "offline_notification_worker_not_scheduled", zzgbf.zzd());
        }
    }

    private final void zzv(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzu();
            zzw(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzt(this.zzf, "asnpdi", zzgbf.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
            builderZzK.setTitle(zzs(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzs(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.zzd(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzs(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzege
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzk(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegf
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzl(zzmVar, dialogInterface);
                }
            });
            builderZzK.create().show();
            zzt(this.zzf, "rtsdi", zzgbf.zzd());
        }
    }

    private final void zzw(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogCreate;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i = R.layout.offline_ads_dialog;
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        XmlResourceParser layout = resourcesZze == null ? null : resourcesZze.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(zzs(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzr = zzr();
            if (!strZzr.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzr);
            }
            zzefr zzefrVar = (zzefr) this.zza.get(this.zzf);
            Drawable drawableZza = zzefrVar != null ? zzefrVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new zzegj(this, alertDialogCreate, timer, zzmVar), 3000L);
    }

    final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzt(this.zzf, "rtsdc", map);
        activity.startActivity(com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzu();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzA = com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zzb);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzt(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzefz.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzegm zzegmVar = (zzegm) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzegmVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzegmVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzu();
                    zzw(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzt(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzg(IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzegm zzegmVar = (zzegm) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzegmVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzegmVar.zzb();
        this.zzf = zzegmVar.zzc();
        this.zzg = zzegmVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziA)).booleanValue()) {
            zzv(activityZza, zzmVarZzb);
            return;
        }
        zzt(this.zzf, "dialog_impression", zzgbf.zzd());
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(activityZza);
        builderZzK.setTitle(zzs(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzs(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzs(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzm(activityZza, zzmVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzs(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzn(zzmVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzo(zzmVarZzb, dialogInterface);
            }
        });
        builderZzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) throws Exception {
                zzefz.zzb(zzrVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzr = zzr();
        com.google.android.gms.ads.internal.zzu.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzq = zzq(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzq2 = zzq(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (strZzr.isEmpty()) {
            builder.setContentTitle(zzs(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzs(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzr));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentZzq2).setContentIntent(pendingIntentZzq).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziB)).intValue());
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziD)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzt(str3, str, map);
    }

    final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzm(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzt(this.zzf, "dialog_click", map);
        zzv(activity, zzmVar);
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzp(String str, zzdlt zzdltVar) {
        String string = "";
        String strZzx = !TextUtils.isEmpty(zzdltVar.zzx()) ? zzdltVar.zzx() : zzdltVar.zzB() != null ? zzdltVar.zzB() : "";
        zzbhv zzbhvVarZzm = zzdltVar.zzm();
        if (zzbhvVarZzm != null) {
            try {
                string = zzbhvVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbhv zzbhvVarZzn = zzdltVar.zzn();
        Drawable drawable = null;
        if (zzbhvVarZzn != null) {
            try {
                IObjectWrapper iObjectWrapperZzf = zzbhvVarZzn.zzf();
                if (iObjectWrapperZzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzefn(strZzx, string, drawable));
    }
}
