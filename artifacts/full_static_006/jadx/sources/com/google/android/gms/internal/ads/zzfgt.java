package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfgt {
    public final String zzA;
    public final zzcac zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfhr zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbvm zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final boolean zzas;
    public final int zzat;
    public final String zzau;
    public final List zzav;
    public final boolean zzaw;
    public final Map zzax;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbyt zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfgy zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Removed duplicated region for block: B:243:0x0670 A[PHI: r22 r26
      0x0670: PHI (r22v83 java.util.List) = 
      (r22v5 java.util.List)
      (r22v6 java.util.List)
      (r22v7 java.util.List)
      (r22v8 java.util.List)
      (r22v9 java.util.List)
      (r22v10 java.util.List)
      (r22v11 java.util.List)
      (r22v12 java.util.List)
      (r22v13 java.util.List)
      (r22v14 java.util.List)
      (r22v15 java.util.List)
      (r22v16 java.util.List)
      (r22v17 java.util.List)
      (r22v18 java.util.List)
      (r22v19 java.util.List)
      (r22v20 java.util.List)
      (r22v21 java.util.List)
      (r22v22 java.util.List)
      (r22v23 java.util.List)
      (r22v24 java.util.List)
      (r22v25 java.util.List)
      (r22v26 java.util.List)
      (r22v27 java.util.List)
      (r22v28 java.util.List)
      (r22v29 java.util.List)
      (r22v30 java.util.List)
      (r22v31 java.util.List)
      (r22v32 java.util.List)
      (r22v33 java.util.List)
      (r22v34 java.util.List)
      (r22v35 java.util.List)
      (r22v36 java.util.List)
      (r22v37 java.util.List)
      (r22v38 java.util.List)
      (r22v39 java.util.List)
      (r22v40 java.util.List)
      (r22v41 java.util.List)
      (r22v42 java.util.List)
      (r22v43 java.util.List)
      (r22v44 java.util.List)
      (r22v45 java.util.List)
      (r22v46 java.util.List)
      (r22v47 java.util.List)
      (r22v48 java.util.List)
      (r22v49 java.util.List)
      (r22v50 java.util.List)
      (r22v51 java.util.List)
      (r22v52 java.util.List)
      (r22v53 java.util.List)
      (r22v54 java.util.List)
      (r22v55 java.util.List)
      (r22v56 java.util.List)
      (r22v57 java.util.List)
      (r22v58 java.util.List)
      (r22v59 java.util.List)
      (r22v60 java.util.List)
      (r22v61 java.util.List)
      (r22v62 java.util.List)
      (r22v63 java.util.List)
      (r22v64 java.util.List)
      (r22v65 java.util.List)
      (r22v66 java.util.List)
      (r22v67 java.util.List)
      (r22v68 java.util.List)
      (r22v69 java.util.List)
      (r22v70 java.util.List)
      (r22v71 java.util.List)
      (r22v72 java.util.List)
      (r22v73 java.util.List)
      (r22v74 java.util.List)
      (r22v75 java.util.List)
      (r22v76 java.util.List)
      (r22v77 java.util.List)
      (r22v78 java.util.List)
      (r22v79 java.util.List)
      (r22v80 java.util.List)
      (r22v81 java.util.List)
      (r22v84 java.util.List)
     binds: [B:241:0x066b, B:238:0x065a, B:235:0x0649, B:232:0x0638, B:229:0x0627, B:226:0x0616, B:223:0x0604, B:220:0x05f2, B:217:0x05e0, B:214:0x05ce, B:211:0x05bc, B:208:0x05aa, B:205:0x0598, B:202:0x0586, B:199:0x0574, B:196:0x0562, B:193:0x0550, B:190:0x053e, B:187:0x052c, B:184:0x051a, B:181:0x0508, B:178:0x04f6, B:175:0x04e4, B:172:0x04d2, B:169:0x04c1, B:166:0x04af, B:163:0x049d, B:160:0x048b, B:157:0x0479, B:154:0x0467, B:151:0x0455, B:148:0x0443, B:145:0x0432, B:142:0x0420, B:139:0x040e, B:136:0x03fd, B:133:0x03eb, B:130:0x03d9, B:127:0x03c7, B:124:0x03b5, B:121:0x03a3, B:118:0x0391, B:115:0x037f, B:112:0x036d, B:109:0x035b, B:106:0x0349, B:103:0x0337, B:100:0x0325, B:97:0x0313, B:94:0x0301, B:91:0x02ef, B:88:0x02dd, B:85:0x02cc, B:82:0x02ba, B:79:0x02a8, B:76:0x0296, B:73:0x0284, B:70:0x0272, B:67:0x0261, B:64:0x024f, B:61:0x023d, B:58:0x022b, B:55:0x0219, B:52:0x0207, B:49:0x01f5, B:46:0x01e3, B:43:0x01d1, B:40:0x01bf, B:37:0x01ae, B:34:0x019c, B:31:0x018b, B:28:0x0179, B:25:0x0167, B:22:0x0155, B:19:0x0143, B:16:0x0131, B:13:0x011f, B:11:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0670: PHI (r26v80 java.util.List) = 
      (r26v2 java.util.List)
      (r26v3 java.util.List)
      (r26v4 java.util.List)
      (r26v5 java.util.List)
      (r26v6 java.util.List)
      (r26v7 java.util.List)
      (r26v8 java.util.List)
      (r26v9 java.util.List)
      (r26v10 java.util.List)
      (r26v11 java.util.List)
      (r26v12 java.util.List)
      (r26v13 java.util.List)
      (r26v14 java.util.List)
      (r26v15 java.util.List)
      (r26v16 java.util.List)
      (r26v17 java.util.List)
      (r26v18 java.util.List)
      (r26v19 java.util.List)
      (r26v20 java.util.List)
      (r26v21 java.util.List)
      (r26v22 java.util.List)
      (r26v23 java.util.List)
      (r26v24 java.util.List)
      (r26v25 java.util.List)
      (r26v26 java.util.List)
      (r26v27 java.util.List)
      (r26v28 java.util.List)
      (r26v29 java.util.List)
      (r26v30 java.util.List)
      (r26v31 java.util.List)
      (r26v32 java.util.List)
      (r26v33 java.util.List)
      (r26v34 java.util.List)
      (r26v35 java.util.List)
      (r26v36 java.util.List)
      (r26v37 java.util.List)
      (r26v38 java.util.List)
      (r26v39 java.util.List)
      (r26v40 java.util.List)
      (r26v41 java.util.List)
      (r26v42 java.util.List)
      (r26v43 java.util.List)
      (r26v44 java.util.List)
      (r26v45 java.util.List)
      (r26v46 java.util.List)
      (r26v47 java.util.List)
      (r26v48 java.util.List)
      (r26v49 java.util.List)
      (r26v50 java.util.List)
      (r26v51 java.util.List)
      (r26v52 java.util.List)
      (r26v53 java.util.List)
      (r26v54 java.util.List)
      (r26v55 java.util.List)
      (r26v56 java.util.List)
      (r26v57 java.util.List)
      (r26v58 java.util.List)
      (r26v59 java.util.List)
      (r26v60 java.util.List)
      (r26v61 java.util.List)
      (r26v62 java.util.List)
      (r26v63 java.util.List)
      (r26v64 java.util.List)
      (r26v65 java.util.List)
      (r26v66 java.util.List)
      (r26v67 java.util.List)
      (r26v68 java.util.List)
      (r26v69 java.util.List)
      (r26v70 java.util.List)
      (r26v71 java.util.List)
      (r26v72 java.util.List)
      (r26v73 java.util.List)
      (r26v74 java.util.List)
      (r26v75 java.util.List)
      (r26v76 java.util.List)
      (r26v77 java.util.List)
      (r26v78 java.util.List)
      (r26v81 java.util.List)
     binds: [B:241:0x066b, B:238:0x065a, B:235:0x0649, B:232:0x0638, B:229:0x0627, B:226:0x0616, B:223:0x0604, B:220:0x05f2, B:217:0x05e0, B:214:0x05ce, B:211:0x05bc, B:208:0x05aa, B:205:0x0598, B:202:0x0586, B:199:0x0574, B:196:0x0562, B:193:0x0550, B:190:0x053e, B:187:0x052c, B:184:0x051a, B:181:0x0508, B:178:0x04f6, B:175:0x04e4, B:172:0x04d2, B:169:0x04c1, B:166:0x04af, B:163:0x049d, B:160:0x048b, B:157:0x0479, B:154:0x0467, B:151:0x0455, B:148:0x0443, B:145:0x0432, B:142:0x0420, B:139:0x040e, B:136:0x03fd, B:133:0x03eb, B:130:0x03d9, B:127:0x03c7, B:124:0x03b5, B:121:0x03a3, B:118:0x0391, B:115:0x037f, B:112:0x036d, B:109:0x035b, B:106:0x0349, B:103:0x0337, B:100:0x0325, B:97:0x0313, B:94:0x0301, B:91:0x02ef, B:88:0x02dd, B:85:0x02cc, B:82:0x02ba, B:79:0x02a8, B:76:0x0296, B:73:0x0284, B:70:0x0272, B:67:0x0261, B:64:0x024f, B:61:0x023d, B:58:0x022b, B:55:0x0219, B:52:0x0207, B:49:0x01f5, B:46:0x01e3, B:43:0x01d1, B:40:0x01bf, B:37:0x01ae, B:34:0x019c, B:31:0x018b, B:28:0x0179, B:25:0x0167, B:22:0x0155, B:19:0x0143, B:16:0x0131, B:13:0x011f, B:11:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzfgt(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        char c;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgbc zzgbcVarZzm = zzgbc.zzm();
        zzgbc zzgbcVarZzm2 = zzgbc.zzm();
        HashMap map = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObjectZzi = jSONObject2;
        JSONObject jSONObjectZzi2 = jSONObject3;
        JSONObject jSONObjectZzi3 = jSONObject4;
        JSONObject jSONObjectZzi4 = jSONObject5;
        JSONObject jSONObjectZzi5 = jSONObject6;
        List listZzd = zzgbcVarZzm;
        List listZzd2 = zzgbcVarZzm2;
        Map mapZze = map;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean19 = false;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String string = strNextString3;
        String strNextString4 = string;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        zzfgy zzfgyVar = null;
        zzcac zzcacVarZza = null;
        zzbvm zzbvmVarZza = null;
        com.google.android.gms.ads.internal.client.zzs zzsVarZza = null;
        String strNextString18 = null;
        int iZzd = -1;
        int iNextInt5 = -1;
        List listZzd3 = listEmptyList11;
        List listZza = listEmptyList12;
        List listZzd4 = listEmptyList13;
        List listZza2 = listEmptyList14;
        JSONObject jSONObjectZzi6 = jSONObject;
        int iZzb = 0;
        int iZzc = 0;
        String strNextString19 = strNextString17;
        String strNextString20 = strNextString19;
        zzbyt zzbytVarZza = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_name")) {
                        c = 65535;
                        break;
                    } else {
                        c = ';';
                        break;
                    }
                case -1980587809:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    break;
                case -1871425831:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("recursive_server_response_data")) {
                        c = 'E';
                        break;
                    }
                    break;
                case -1843156475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_consent")) {
                        c = 'G';
                        break;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    break;
                case -1785028569:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("parallel_key")) {
                        c = 'I';
                        break;
                    }
                    break;
                case -1776946669:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_source_name")) {
                        c = '9';
                        break;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    break;
                case -1550155393:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("nofill_urls")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'C';
                        break;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("test_mode_enabled")) {
                        c = Typography.quote;
                        break;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("extras")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -972056451:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_source_instance_id")) {
                        c = Typography.less;
                        break;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    break;
                case -570101180:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("late_load_urls")) {
                        c = 'J';
                        break;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("rtb_native_required_assets")) {
                        c = Typography.greater;
                        break;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("render_timeout_ms")) {
                        c = Typography.amp;
                        break;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("content_url")) {
                        c = '@';
                        break;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        c = 'A';
                        break;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("native_required_asset_viewability")) {
                        c = '?';
                        break;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_offline_ad")) {
                        c = '=';
                        break;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 3107:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad")) {
                        c = 18;
                        break;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("id")) {
                        c = 23;
                        break;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        c = 22;
                        break;
                    }
                    break;
                case 37109963:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("request_id")) {
                        c = 'D';
                        break;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_closable_area_disabled")) {
                        c = Typography.dollar;
                        break;
                    }
                    break;
                case 542250332:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("consent_form_action_identifier")) {
                        c = 'H';
                        break;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    break;
                case 805095541:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        c = 'L';
                        break;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("transaction_id")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1141602460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("adapter_response_info_key")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("cache_hit_urls")) {
                        c = 'B';
                        break;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1422388341:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_collapsible")) {
                        c = 'F';
                        break;
                    }
                    break;
                case 1437255331:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_source_id")) {
                        c = ':';
                        break;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    break;
                case 2072888499:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (str.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    break;
                case 2075506442:
                    list2 = listEmptyList10;
                    list = listEmptyList9;
                    if (str.equals("render_serially")) {
                        c = 'K';
                        break;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzb = zzb(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZzc = zzc(jsonReader.nextInt());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 7:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\b':
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\t':
                    strNextString20 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\n':
                    strNextString19 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 11:
                    zzbytVarZza = zzbyt.zza(com.google.android.gms.ads.internal.util.zzbw.zzf(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\f':
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\r':
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    break;
                case 14:
                    listEmptyList10 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 15:
                    listZzd3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza = zzfgu.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzfgyVar = new zzfgy(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza2 = zzfgu.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzd4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzi6 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader).toString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzcacVarZza = zzcac.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    jSONObjectZzi2 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ' ':
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '!':
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\"':
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '#':
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '$':
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '%':
                    iZzd = zzd(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '&':
                    iNextInt2 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '\'':
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '(':
                    strNextString5 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ')':
                    jSONObjectZzi3 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '*':
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '+':
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ',':
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '-':
                    iNextInt5 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '.':
                    strNextString6 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '/':
                    strNextString7 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzbvmVarZza = zzbvm.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    zzsVarZza = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    jSONObjectZzi4 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '8':
                    strNextString16 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '9':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        strNextString10 = jsonReader.nextString();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                    }
                case ':':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        strNextString11 = jsonReader.nextString();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                    }
                case ';':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        strNextString12 = jsonReader.nextString();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        strNextString13 = jsonReader.nextString();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '>':
                    jSONObjectZzi5 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case '@':
                    strNextString18 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    listZzd = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'D':
                    strNextString14 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'E':
                    strNextString15 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'F':
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'G':
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'H':
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'I':
                    strNextString17 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'J':
                    listZzd2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 'K':
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Base64.mimeLineLength /* 76 */:
                    if (((Boolean) zzbep.zzZ.zzl()).booleanValue()) {
                        mapZze = com.google.android.gms.ads.internal.util.zzbw.zze(jsonReader);
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listEmptyList10 = list2;
                        listEmptyList9 = list;
                    }
                default:
                    jsonReader.skipValue();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzb;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzg = listEmptyList4;
        this.zzf = iZzc;
        this.zzh = listEmptyList5;
        this.zzi = listEmptyList6;
        this.zzj = listEmptyList7;
        this.zzk = strNextString20;
        this.zzl = strNextString19;
        this.zzm = zzbytVarZza;
        this.zzn = listEmptyList8;
        this.zzo = listEmptyList9;
        this.zzp = listEmptyList10;
        this.zzq = listZzd3;
        this.zzr = iNextInt;
        this.zzs = listZza;
        this.zzt = zzfgyVar;
        this.zzu = listZzd4;
        this.zzv = listZza2;
        this.zzx = strNextString;
        this.zzw = jSONObjectZzi6;
        this.zzy = strNextString2;
        this.zzz = strNextString3;
        this.zzA = string;
        this.zzB = zzcacVarZza;
        this.zzC = strNextString4;
        this.zzD = jSONObjectZzi;
        this.zzE = jSONObjectZzi2;
        this.zzK = zNextBoolean;
        this.zzL = zNextBoolean2;
        this.zzM = zNextBoolean3;
        this.zzN = zNextBoolean4;
        this.zzO = zNextBoolean5;
        this.zzP = zNextBoolean6;
        this.zzQ = zNextBoolean7;
        this.zzR = iZzd;
        this.zzS = iNextInt2;
        this.zzU = zNextBoolean8;
        this.zzV = strNextString5;
        this.zzW = new zzfhr(jSONObjectZzi3);
        this.zzX = zNextBoolean9;
        this.zzY = zNextBoolean10;
        this.zzZ = iNextInt3;
        this.zzaa = strNextString6;
        this.zzab = iNextInt5;
        this.zzac = strNextString7;
        this.zzad = zNextBoolean11;
        this.zzae = zzbvmVarZza;
        this.zzaf = zzsVarZza;
        this.zzag = strNextString8;
        this.zzah = zNextBoolean12;
        this.zzai = jSONObjectZzi4;
        this.zzF = strNextString9;
        this.zzG = strNextString10;
        this.zzH = strNextString11;
        this.zzI = strNextString12;
        this.zzJ = strNextString13;
        this.zzaj = zNextBoolean13;
        this.zzak = jSONObjectZzi5;
        this.zzal = zNextBoolean14;
        this.zzam = strNextString18;
        this.zzan = zNextBoolean15;
        this.zze = listZzd;
        this.zzT = zNextBoolean16;
        this.zzao = strNextString14;
        this.zzap = strNextString15;
        this.zzaq = strNextString16;
        this.zzar = zNextBoolean17;
        this.zzas = zNextBoolean18;
        this.zzat = iNextInt4;
        this.zzav = listZzd2;
        this.zzau = strNextString17;
        this.zzaw = zNextBoolean19;
        this.zzax = mapZze;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
