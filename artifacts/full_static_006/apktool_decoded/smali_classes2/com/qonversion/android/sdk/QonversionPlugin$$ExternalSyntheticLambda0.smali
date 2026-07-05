.class public final synthetic Lcom/qonversion/android/sdk/QonversionPlugin$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lio/qonversion/sandwich/ActivityProvider;


# instance fields
.field public final synthetic f$0:Lorg/apache/cordova/CordovaInterface;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/cordova/CordovaInterface;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionPlugin$$ExternalSyntheticLambda0;->f$0:Lorg/apache/cordova/CordovaInterface;

    return-void
.end method


# virtual methods
.method public final getCurrentActivity()Landroid/app/Activity;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin$$ExternalSyntheticLambda0;->f$0:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method
