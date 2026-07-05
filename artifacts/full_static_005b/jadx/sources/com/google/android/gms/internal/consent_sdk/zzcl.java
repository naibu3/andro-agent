package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzcl {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzg = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcl zza(JsonReader jsonReader) throws IOException {
        int i;
        int i2;
        char c;
        boolean z;
        char c2;
        int i3;
        zzcl zzclVar = new zzcl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            i = 4;
            i2 = 3;
            c = 0;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    String strNextString = jsonReader.nextString();
                    switch (strNextString.hashCode()) {
                        case -2058725357:
                            if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                c = 65535;
                                break;
                            } else {
                                c = 4;
                                break;
                            }
                        case -1969035850:
                            if (strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1263695752:
                            if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                            }
                            break;
                        case -954325659:
                            if (strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -918677260:
                            if (strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 429411856:
                            if (strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 467888915:
                            if (strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1725474845:
                            if (strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i = 1;
                            zzclVar.zzf = i;
                            break;
                        case 1:
                            i = 2;
                            zzclVar.zzf = i;
                            break;
                        case 2:
                            i = 3;
                            zzclVar.zzf = i;
                            break;
                        case 3:
                            zzclVar.zzf = i;
                            break;
                        case 4:
                            i = 5;
                            zzclVar.zzf = i;
                            break;
                        case 5:
                            i = 6;
                            zzclVar.zzf = i;
                            break;
                        case 6:
                            i = 7;
                            zzclVar.zzf = i;
                            break;
                        case 7:
                            i = 8;
                            zzclVar.zzf = i;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(String.valueOf(strNextString)));
                    }
                case "consent_form_payload":
                    zzclVar.zza = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzclVar.zzb = jsonReader.nextString();
                    break;
                case "error_message":
                    zzclVar.zzc = jsonReader.nextString();
                    break;
                case "request_info_keys":
                    zzclVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzclVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "actions":
                    zzclVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzck zzckVar = new zzck();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                z = (iHashCode == 1583758243 && strNextName.equals("action_type")) ? false : -1;
                            } else if (strNextName.equals("args_json")) {
                                z = true;
                            }
                            if (!z) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 == 64208429) {
                                    if (strNextString2.equals("CLEAR")) {
                                        c2 = 2;
                                    }
                                    if (c2 == 0) {
                                    }
                                    zzckVar.zzb = i3;
                                } else if (iHashCode2 != 82862015) {
                                    c2 = (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) ? (char) 0 : (char) 65535;
                                    if (c2 == 0) {
                                        i3 = 1;
                                    } else if (c2 == 1) {
                                        i3 = 2;
                                    } else {
                                        if (c2 != 2) {
                                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(String.valueOf(strNextString2)));
                                        }
                                        i3 = 3;
                                    }
                                    zzckVar.zzb = i3;
                                } else {
                                    if (strNextString2.equals("WRITE")) {
                                        c2 = 1;
                                    }
                                    if (c2 == 0) {
                                    }
                                    zzckVar.zzb = i3;
                                }
                            } else if (!z) {
                                jsonReader.skipValue();
                            } else {
                                zzckVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzclVar.zze.add(zzckVar);
                    }
                    jsonReader.endArray();
                    break;
                case "privacy_options_required":
                    String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 == -1888946261) {
                        if (strNextString3.equals("NOT_REQUIRED")) {
                            c = 2;
                        }
                        if (c == 0) {
                        }
                        zzclVar.zzg = i2;
                    } else if (iHashCode3 != 389487519) {
                        if (iHashCode3 != 433141802 || !strNextString3.equals("UNKNOWN")) {
                            c = 65535;
                        }
                        if (c == 0) {
                            i2 = 1;
                        } else if (c == 1) {
                            i2 = 2;
                        } else if (c != 2) {
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(String.valueOf(strNextString3)));
                        }
                        zzclVar.zzg = i2;
                        break;
                    } else {
                        if (strNextString3.equals("REQUIRED")) {
                            c = 1;
                        }
                        if (c == 0) {
                        }
                        zzclVar.zzg = i2;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzclVar;
    }
}
