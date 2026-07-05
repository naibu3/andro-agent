.class public interface abstract annotation Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
.super Ljava/lang/Object;
.source "PluginAction.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = ""
        isAutofinish = true
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
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
.method public abstract actionName()Ljava/lang/String;
.end method

.method public abstract isAutofinish()Z
.end method

.method public abstract thread()Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
.end method
