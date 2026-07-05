package com.airbnb.android.showkase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;

/* compiled from: ShowkaseMultiPreviewCodegenMetadata.kt */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\bR\u000f\u0010\u0006\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\nR\u000f\u0010\t\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000bR\u000f\u0010\u0005\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/airbnb/android/showkase/annotation/ShowkaseMultiPreviewCodegenMetadata;", "", "previewName", "", "previewGroup", "supportTypeQualifiedName", "packageName", "showkaseWidth", "", "showkaseHeight", "()Ljava/lang/String;", "()I", "showkase-annotation"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface ShowkaseMultiPreviewCodegenMetadata {
    String packageName();

    String previewGroup();

    String previewName();

    int showkaseHeight();

    int showkaseWidth();

    String supportTypeQualifiedName();
}
