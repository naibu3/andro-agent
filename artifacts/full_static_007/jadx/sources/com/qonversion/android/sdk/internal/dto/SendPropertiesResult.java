package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendPropertiesResult.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "", "savedProperties", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "propertyErrors", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;", "(Ljava/util/List;Ljava/util/List;)V", "getPropertyErrors", "()Ljava/util/List;", "getSavedProperties", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PropertyError", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class SendPropertiesResult {
    private final List<PropertyError> propertyErrors;
    private final List<QUserProperty> savedProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendPropertiesResult copy$default(SendPropertiesResult sendPropertiesResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sendPropertiesResult.savedProperties;
        }
        if ((i & 2) != 0) {
            list2 = sendPropertiesResult.propertyErrors;
        }
        return sendPropertiesResult.copy(list, list2);
    }

    public final List<QUserProperty> component1() {
        return this.savedProperties;
    }

    public final List<PropertyError> component2() {
        return this.propertyErrors;
    }

    public final SendPropertiesResult copy(@Json(name = "savedProperties") List<QUserProperty> savedProperties, @Json(name = "propertyErrors") List<PropertyError> propertyErrors) {
        Intrinsics.checkNotNullParameter(savedProperties, "savedProperties");
        Intrinsics.checkNotNullParameter(propertyErrors, "propertyErrors");
        return new SendPropertiesResult(savedProperties, propertyErrors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendPropertiesResult)) {
            return false;
        }
        SendPropertiesResult sendPropertiesResult = (SendPropertiesResult) other;
        return Intrinsics.areEqual(this.savedProperties, sendPropertiesResult.savedProperties) && Intrinsics.areEqual(this.propertyErrors, sendPropertiesResult.propertyErrors);
    }

    public int hashCode() {
        return (this.savedProperties.hashCode() * 31) + this.propertyErrors.hashCode();
    }

    public String toString() {
        return "SendPropertiesResult(savedProperties=" + this.savedProperties + ", propertyErrors=" + this.propertyErrors + ")";
    }

    public SendPropertiesResult(@Json(name = "savedProperties") List<QUserProperty> savedProperties, @Json(name = "propertyErrors") List<PropertyError> propertyErrors) {
        Intrinsics.checkNotNullParameter(savedProperties, "savedProperties");
        Intrinsics.checkNotNullParameter(propertyErrors, "propertyErrors");
        this.savedProperties = savedProperties;
        this.propertyErrors = propertyErrors;
    }

    public final List<QUserProperty> getSavedProperties() {
        return this.savedProperties;
    }

    public final List<PropertyError> getPropertyErrors() {
        return this.propertyErrors;
    }

    /* compiled from: SendPropertiesResult.kt */
    @JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;", "", "key", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class PropertyError {
        private final String error;
        private final String key;

        public static /* synthetic */ PropertyError copy$default(PropertyError propertyError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = propertyError.key;
            }
            if ((i & 2) != 0) {
                str2 = propertyError.error;
            }
            return propertyError.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final PropertyError copy(@Json(name = "key") String key, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) String error) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(error, "error");
            return new PropertyError(key, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropertyError)) {
                return false;
            }
            PropertyError propertyError = (PropertyError) other;
            return Intrinsics.areEqual(this.key, propertyError.key) && Intrinsics.areEqual(this.error, propertyError.error);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "PropertyError(key=" + this.key + ", error=" + this.error + ")";
        }

        public PropertyError(@Json(name = "key") String key, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) String error) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(error, "error");
            this.key = key;
            this.error = error;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getError() {
            return this.error;
        }
    }
}
