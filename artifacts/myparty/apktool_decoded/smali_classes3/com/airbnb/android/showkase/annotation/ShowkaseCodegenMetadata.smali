.class public interface abstract annotation Lcom/airbnb/android/showkase/annotation/ShowkaseCodegenMetadata;
.super Ljava/lang/Object;
.source "ShowkaseCodegenMetadata.kt"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/airbnb/android/showkase/annotation/ShowkaseCodegenMetadata;
        enclosingClass = {}
        generatedPropertyName = ""
        insideObject = false
        insideWrapperClass = false
        isDefaultStyle = false
        previewParameterClass = {}
        previewParameterName = ""
        showkaseHeightDp = -0x1
        showkaseStyleName = ""
        showkaseWidthDp = -0x1
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0002\u0018\u00002\u00020\u0001B\u00b0\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c0\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0008\u0002\u0010\u0013\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c0\u000b\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003R\u0019\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c0\u000b\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0018R\u000f\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0019R\u000f\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u001aR\u000f\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u001aR\u000f\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u001aR\u000f\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0019R\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0019R\u0019\u0010\u0013\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c0\u000b\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0018R\u000f\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0019R\u000f\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0019R\u000f\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0019R\u000f\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u001bR\u000f\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0019R\u000f\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0019R\u000f\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0019R\u000f\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0019R\u000f\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/airbnb/android/showkase/annotation/ShowkaseCodegenMetadata;",
        "",
        "packageSimpleName",
        "",
        "packageName",
        "showkaseElementName",
        "showkaseName",
        "showkaseGroup",
        "showkaseKDoc",
        "showkaseMetadataType",
        "enclosingClass",
        "",
        "Lkotlin/reflect/KClass;",
        "showkaseWidthDp",
        "",
        "showkaseHeightDp",
        "insideWrapperClass",
        "",
        "insideObject",
        "previewParameterClass",
        "previewParameterName",
        "showkaseStyleName",
        "isDefaultStyle",
        "generatedPropertyName",
        "()[Ljava/lang/Class;",
        "()Ljava/lang/String;",
        "()Z",
        "()I",
        "showkase-annotation"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/annotation/Retention;
    value = .enum Lkotlin/annotation/AnnotationRetention;->BINARY:Lkotlin/annotation/AnnotationRetention;
.end annotation


# virtual methods
.method public abstract enclosingClass()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract generatedPropertyName()Ljava/lang/String;
.end method

.method public abstract insideObject()Z
.end method

.method public abstract insideWrapperClass()Z
.end method

.method public abstract isDefaultStyle()Z
.end method

.method public abstract packageName()Ljava/lang/String;
.end method

.method public abstract packageSimpleName()Ljava/lang/String;
.end method

.method public abstract previewParameterClass()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract previewParameterName()Ljava/lang/String;
.end method

.method public abstract showkaseElementName()Ljava/lang/String;
.end method

.method public abstract showkaseGroup()Ljava/lang/String;
.end method

.method public abstract showkaseHeightDp()I
.end method

.method public abstract showkaseKDoc()Ljava/lang/String;
.end method

.method public abstract showkaseMetadataType()Ljava/lang/String;
.end method

.method public abstract showkaseName()Ljava/lang/String;
.end method

.method public abstract showkaseStyleName()Ljava/lang/String;
.end method

.method public abstract showkaseWidthDp()I
.end method
