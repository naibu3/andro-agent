.class public final synthetic Lcom/stripe/android/core/storage/SharedPreferencesStorage$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/storage/SharedPreferencesStorage;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/storage/SharedPreferencesStorage$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/core/storage/SharedPreferencesStorage$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/storage/SharedPreferencesStorage;

    invoke-static {v0}, Lcom/stripe/android/core/storage/SharedPreferencesStorage;->$r8$lambda$AJjpU0UDcEcEiFf45HbwzkmB_Uk(Lcom/stripe/android/core/storage/SharedPreferencesStorage;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
