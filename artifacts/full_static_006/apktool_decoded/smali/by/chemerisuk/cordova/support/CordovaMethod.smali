.class public interface abstract annotation Lby/chemerisuk/cordova/support/CordovaMethod;
.super Ljava/lang/Object;
.source "CordovaMethod.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lby/chemerisuk/cordova/support/CordovaMethod;
        action = ""
        value = .enum Lby/chemerisuk/cordova/support/ExecutionThread;->MAIN:Lby/chemerisuk/cordova/support/ExecutionThread;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract action()Ljava/lang/String;
.end method

.method public abstract value()Lby/chemerisuk/cordova/support/ExecutionThread;
.end method
