package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhba extends zzhaz {
    zzhba() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final int zza(Map.Entry entry) {
        return ((zzhbl) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final zzhbd zzb(Object obj) {
        return ((zzhbk) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final zzhbd zzc(Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final Object zzd(zzhay zzhayVar, zzhde zzhdeVar, int i) {
        return zzhayVar.zzc(zzhdeVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzf(Object obj) {
        ((zzhbk) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzg(zzhdr zzhdrVar, Object obj, zzhay zzhayVar, zzhbd zzhbdVar) throws IOException {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhbdVar.zzk(zzhbmVar.zzd, zzhdrVar.zzs(zzhbmVar.zzc.getClass(), zzhayVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzh(zzhac zzhacVar, Object obj, zzhay zzhayVar, zzhbd zzhbdVar) throws IOException {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhdd zzhddVarZzcY = zzhbmVar.zzc.zzcY();
        zzham zzhamVarZzl = zzhacVar.zzl();
        zzhddVarZzcY.zzaW(zzhamVarZzl, zzhayVar);
        zzhbdVar.zzk(zzhbmVar.zzd, zzhddVarZzcY.zzbs());
        zzhamVarZzl.zzz(0);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzi(zzhfi zzhfiVar, Map.Entry entry) throws IOException {
        zzhbl zzhblVar = (zzhbl) entry.getKey();
        if (!zzhblVar.zzd) {
            zzhfg zzhfgVar = zzhfg.DOUBLE;
            switch (zzhblVar.zzc) {
                case DOUBLE:
                    zzhfiVar.zzf(zzhblVar.zzb, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzhfiVar.zzo(zzhblVar.zzb, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzhfiVar.zzt(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzhfiVar.zzK(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzhfiVar.zzr(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzhfiVar.zzm(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzhfiVar.zzk(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzhfiVar.zzb(zzhblVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzhfiVar.zzG(zzhblVar.zzb, (String) entry.getValue());
                    break;
                case GROUP:
                    zzhfiVar.zzq(zzhblVar.zzb, entry.getValue(), zzhdo.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzhfiVar.zzv(zzhblVar.zzb, entry.getValue(), zzhdo.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzhfiVar.zzd(zzhblVar.zzb, (zzhac) entry.getValue());
                    break;
                case UINT32:
                    zzhfiVar.zzI(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzhfiVar.zzr(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzhfiVar.zzx(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzhfiVar.zzz(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzhfiVar.zzB(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzhfiVar.zzD(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhfg zzhfgVar2 = zzhfg.DOUBLE;
        switch (zzhblVar.zzc) {
            case DOUBLE:
                zzheb.zzv(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case FLOAT:
                zzheb.zzz(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case INT64:
                zzheb.zzC(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case UINT64:
                zzheb.zzK(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case INT32:
                zzheb.zzB(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case FIXED64:
                zzheb.zzy(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case FIXED32:
                zzheb.zzx(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case BOOL:
                zzheb.zzt(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case STRING:
                zzheb.zzI(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzheb.zzA(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhdo.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzheb.zzD(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhdo.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzheb.zzu(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar);
                break;
            case UINT32:
                zzheb.zzJ(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case ENUM:
                zzheb.zzB(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case SFIXED32:
                zzheb.zzE(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case SFIXED64:
                zzheb.zzF(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case SINT32:
                zzheb.zzG(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
            case SINT64:
                zzheb.zzH(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final boolean zzj(zzhde zzhdeVar) {
        return zzhdeVar instanceof zzhbk;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final Object zze(Object obj, zzhdr zzhdrVar, Object obj2, zzhay zzhayVar, zzhbd zzhbdVar, Object obj3, zzheq zzheqVar) throws IOException {
        Object objValueOf;
        Object objZzf;
        ArrayList arrayList;
        zzhbm zzhbmVar = (zzhbm) obj2;
        zzhbl zzhblVar = zzhbmVar.zzd;
        boolean z = zzhblVar.zzd;
        int i = zzhblVar.zzb;
        if (z && zzhblVar.zze) {
            zzhfg zzhfgVar = zzhfg.DOUBLE;
            switch (zzhbmVar.zzd.zzc) {
                case DOUBLE:
                    arrayList = new ArrayList();
                    zzhdrVar.zzz(arrayList);
                    break;
                case FLOAT:
                    arrayList = new ArrayList();
                    zzhdrVar.zzD(arrayList);
                    break;
                case INT64:
                    arrayList = new ArrayList();
                    zzhdrVar.zzG(arrayList);
                    break;
                case UINT64:
                    arrayList = new ArrayList();
                    zzhdrVar.zzO(arrayList);
                    break;
                case INT32:
                    arrayList = new ArrayList();
                    zzhdrVar.zzF(arrayList);
                    break;
                case FIXED64:
                    arrayList = new ArrayList();
                    zzhdrVar.zzC(arrayList);
                    break;
                case FIXED32:
                    arrayList = new ArrayList();
                    zzhdrVar.zzB(arrayList);
                    break;
                case BOOL:
                    arrayList = new ArrayList();
                    zzhdrVar.zzx(arrayList);
                    break;
                case STRING:
                case GROUP:
                case MESSAGE:
                case BYTES:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(zzhbmVar.zzd.zzc))));
                case UINT32:
                    arrayList = new ArrayList();
                    zzhdrVar.zzN(arrayList);
                    break;
                case ENUM:
                    ArrayList arrayList2 = new ArrayList();
                    zzhdrVar.zzA(arrayList2);
                    zzhbl zzhblVar2 = zzhbmVar.zzd;
                    int i2 = zzheb.zza;
                    zzhbt zzhbtVar = zzhblVar2.zza;
                    if (zzhbtVar != null) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
                            if (zzhbtVar.zza(iIntValue) != null) {
                                if (i4 != i3) {
                                    arrayList2.set(i3, Integer.valueOf(iIntValue));
                                }
                                i3++;
                            } else {
                                obj3 = zzheb.zzp(obj, i, iIntValue, obj3, zzheqVar);
                            }
                        }
                        if (i3 != size) {
                            arrayList2.subList(i3, size).clear();
                        }
                    }
                    arrayList = arrayList2;
                    break;
                case SFIXED32:
                    arrayList = new ArrayList();
                    zzhdrVar.zzI(arrayList);
                    break;
                case SFIXED64:
                    arrayList = new ArrayList();
                    zzhdrVar.zzJ(arrayList);
                    break;
                case SINT32:
                    arrayList = new ArrayList();
                    zzhdrVar.zzK(arrayList);
                    break;
                case SINT64:
                    arrayList = new ArrayList();
                    zzhdrVar.zzL(arrayList);
                    break;
            }
            zzhbdVar.zzk(zzhbmVar.zzd, arrayList);
        } else {
            if (zzhblVar.zzc != zzhfg.ENUM) {
                switch (zzhbmVar.zzd.zzc) {
                    case DOUBLE:
                        objValueOf = Double.valueOf(zzhdrVar.zza());
                        break;
                    case FLOAT:
                        objValueOf = Float.valueOf(zzhdrVar.zzb());
                        break;
                    case INT64:
                        objValueOf = Long.valueOf(zzhdrVar.zzl());
                        break;
                    case UINT64:
                        objValueOf = Long.valueOf(zzhdrVar.zzo());
                        break;
                    case INT32:
                        objValueOf = Integer.valueOf(zzhdrVar.zzg());
                        break;
                    case FIXED64:
                        objValueOf = Long.valueOf(zzhdrVar.zzk());
                        break;
                    case FIXED32:
                        objValueOf = Integer.valueOf(zzhdrVar.zzf());
                        break;
                    case BOOL:
                        objValueOf = Boolean.valueOf(zzhdrVar.zzP());
                        break;
                    case STRING:
                        objValueOf = zzhdrVar.zzt();
                        break;
                    case GROUP:
                        zzhbl zzhblVar3 = zzhbmVar.zzd;
                        if (!zzhblVar3.zzd) {
                            Object objZzf2 = zzhbdVar.zzf(zzhblVar3);
                            if (objZzf2 instanceof zzhbo) {
                                zzhdz zzhdzVarZzb = zzhdo.zza().zzb(objZzf2.getClass());
                                if (!((zzhbo) objZzf2).zzce()) {
                                    Object objZze = zzhdzVarZzb.zze();
                                    zzhdzVarZzb.zzg(objZze, objZzf2);
                                    zzhbdVar.zzk(zzhbmVar.zzd, objZze);
                                    objZzf2 = objZze;
                                }
                                zzhdrVar.zzv(objZzf2, zzhdzVarZzb, zzhayVar);
                                return obj3;
                            }
                        }
                        objValueOf = zzhdrVar.zzr(zzhbmVar.zzc.getClass(), zzhayVar);
                        break;
                    case MESSAGE:
                        zzhbl zzhblVar4 = zzhbmVar.zzd;
                        if (!zzhblVar4.zzd) {
                            Object objZzf3 = zzhbdVar.zzf(zzhblVar4);
                            if (objZzf3 instanceof zzhbo) {
                                zzhdz zzhdzVarZzb2 = zzhdo.zza().zzb(objZzf3.getClass());
                                if (!((zzhbo) objZzf3).zzce()) {
                                    Object objZze2 = zzhdzVarZzb2.zze();
                                    zzhdzVarZzb2.zzg(objZze2, objZzf3);
                                    zzhbdVar.zzk(zzhbmVar.zzd, objZze2);
                                    objZzf3 = objZze2;
                                }
                                zzhdrVar.zzw(objZzf3, zzhdzVarZzb2, zzhayVar);
                                return obj3;
                            }
                        }
                        objValueOf = zzhdrVar.zzs(zzhbmVar.zzc.getClass(), zzhayVar);
                        break;
                    case BYTES:
                        objValueOf = zzhdrVar.zzp();
                        break;
                    case UINT32:
                        objValueOf = Integer.valueOf(zzhdrVar.zzj());
                        break;
                    case ENUM:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case SFIXED32:
                        objValueOf = Integer.valueOf(zzhdrVar.zzh());
                        break;
                    case SFIXED64:
                        objValueOf = Long.valueOf(zzhdrVar.zzm());
                        break;
                    case SINT32:
                        objValueOf = Integer.valueOf(zzhdrVar.zzi());
                        break;
                    case SINT64:
                        objValueOf = Long.valueOf(zzhdrVar.zzn());
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZzg = zzhdrVar.zzg();
                if (zzhbmVar.zzd.zza.zza(iZzg) == null) {
                    return zzheb.zzp(obj, i, iZzg, obj3, zzheqVar);
                }
                objValueOf = Integer.valueOf(iZzg);
            }
            zzhbl zzhblVar5 = zzhbmVar.zzd;
            if (zzhblVar5.zzd) {
                zzhbdVar.zzh(zzhblVar5, objValueOf);
            } else {
                int iOrdinal = zzhblVar5.zzc.ordinal();
                if ((iOrdinal == 9 || iOrdinal == 10) && (objZzf = zzhbdVar.zzf(zzhbmVar.zzd)) != null) {
                    byte[] bArr = zzhcb.zzd;
                    objValueOf = ((zzhde) objZzf).zzcZ().zzaS((zzhde) objValueOf).zzbs();
                }
                zzhbdVar.zzk(zzhbmVar.zzd, objValueOf);
            }
        }
        return obj3;
    }
}
