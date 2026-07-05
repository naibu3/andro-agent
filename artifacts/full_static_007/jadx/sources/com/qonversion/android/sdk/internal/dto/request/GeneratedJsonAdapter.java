package com.qonversion.android.sdk.internal.dto.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.purchase.Inapp;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitRequestJsonAdapter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/InitRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "environmentAdapter", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "longAdapter", "", "nullableListOfInappAdapter", "", "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.internal.dto.request.InitRequestJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<InitRequest> {
    private volatile Constructor<InitRequest> constructorRef;
    private final JsonAdapter<Environment> environmentAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<Inapp>> nullableListOfInappAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("install_date", "device", "version", "access_token", "q_uid", "receipt", "debug_mode", "purchases");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "installDate");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<Environment> jsonAdapterAdapter2 = moshi.adapter(Environment.class, SetsKt.emptySet(), "device");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.environmentAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "version");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "clientUid");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
        JsonAdapter<List<Inapp>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(List.class, Inapp.class), SetsKt.emptySet(), "purchases");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableListOfInappAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(InitRequest)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public InitRequest fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long lFromJson = null;
        int i = -1;
        Environment environmentFromJson = null;
        String strFromJson = null;
        String str2 = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        List<Inapp> listFromJson = null;
        while (true) {
            List<Inapp> list = listFromJson;
            String str3 = strFromJson2;
            String str4 = strFromJson4;
            String str5 = strFromJson3;
            if (reader.hasNext()) {
                String str6 = str2;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 0:
                        lFromJson = this.longAdapter.fromJson(reader);
                        if (lFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("installDate", "install_date", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 1:
                        environmentFromJson = this.environmentAdapter.fromJson(reader);
                        if (environmentFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("device", "device", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 2:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("version", "version", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 3:
                        String strFromJson5 = this.stringAdapter.fromJson(reader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("accessToken", "access_token", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        str2 = strFromJson5;
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                    case 4:
                        strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                        listFromJson = list;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 5:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("receipt", "receipt", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        i &= -33;
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        str2 = str6;
                    case 6:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("debugMode", "debug_mode", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson3 = str5;
                        str2 = str6;
                    case 7:
                        listFromJson = this.nullableListOfInappAdapter.fromJson(reader);
                        i &= -129;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                    default:
                        listFromJson = list;
                        strFromJson2 = str3;
                        strFromJson4 = str4;
                        strFromJson3 = str5;
                        str2 = str6;
                }
            } else {
                String str7 = str2;
                reader.endObject();
                if (i == -161) {
                    if (lFromJson != null) {
                        long jLongValue = lFromJson.longValue();
                        if (environmentFromJson == null) {
                            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("device", "device", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(...)");
                            throw jsonDataExceptionMissingProperty;
                        }
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("version", "version", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "missingProperty(...)");
                            throw jsonDataExceptionMissingProperty2;
                        }
                        if (str7 == null) {
                            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("accessToken", "access_token", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "missingProperty(...)");
                            throw jsonDataExceptionMissingProperty3;
                        }
                        Intrinsics.checkNotNull(str5, "null cannot be cast to non-null type kotlin.String");
                        if (str4 != null) {
                            return new InitRequest(jLongValue, environmentFromJson, strFromJson, str7, str3, str5, str4, list);
                        }
                        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("debugMode", "debug_mode", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty4;
                    }
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("installDate", "install_date", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty5;
                }
                Constructor<InitRequest> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    str = "installDate";
                    declaredConstructor = InitRequest.class.getDeclaredConstructor(Long.TYPE, Environment.class, String.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
                } else {
                    str = "installDate";
                }
                Constructor<InitRequest> constructor = declaredConstructor;
                if (lFromJson != null) {
                    Long lValueOf = Long.valueOf(lFromJson.longValue());
                    if (environmentFromJson == null) {
                        JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("device", "device", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty6;
                    }
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionMissingProperty7 = Util.missingProperty("version", "version", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty7, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty7;
                    }
                    if (str7 == null) {
                        JsonDataException jsonDataExceptionMissingProperty8 = Util.missingProperty("accessToken", "access_token", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty8, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty8;
                    }
                    if (str4 == null) {
                        JsonDataException jsonDataExceptionMissingProperty9 = Util.missingProperty("debugMode", "debug_mode", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty9, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty9;
                    }
                    InitRequest initRequestNewInstance = constructor.newInstance(lValueOf, environmentFromJson, strFromJson, str7, str3, str5, str4, list, Integer.valueOf(i), null);
                    Intrinsics.checkNotNullExpressionValue(initRequestNewInstance, "newInstance(...)");
                    return initRequestNewInstance;
                }
                JsonDataException jsonDataExceptionMissingProperty10 = Util.missingProperty(str, "install_date", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty10, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InitRequest value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("install_date");
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getInstallDate()));
        writer.name("device");
        this.environmentAdapter.toJson(writer, (JsonWriter) value_.getDevice());
        writer.name("version");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getVersion());
        writer.name("access_token");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getAccessToken());
        writer.name("q_uid");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getClientUid());
        writer.name("receipt");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReceipt());
        writer.name("debug_mode");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getDebugMode());
        writer.name("purchases");
        this.nullableListOfInappAdapter.toJson(writer, (JsonWriter) value_.getPurchases());
        writer.endObject();
    }
}
